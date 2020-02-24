package b4a.example3;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class denekekleguncelle extends Activity implements B4AActivity{
	public static denekekleguncelle mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.denekekleguncelle");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (denekekleguncelle).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.denekekleguncelle");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.denekekleguncelle", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (denekekleguncelle) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (denekekleguncelle) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return denekekleguncelle.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (denekekleguncelle) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            denekekleguncelle mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (denekekleguncelle) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static Object _ion = null;
public static String _tempimagefile = "";
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _lastpicture = null;
public static anywheresoftware.b4a.phone.Phone.ContentChooser _imagechooser = null;
public static byte[] _buffer = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkimlikno = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextisim = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnercinsiyet = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerdogumyeri = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextbabaadi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextengeldurumu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexttakimokul = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextbranssinif = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextmevki = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public static int _result = 0;
public static String _denekid = "";
public static String _secilencinsiyet = "";
public static String _secilendogumyeri = "";
public static String _secilendogumtarihi = "";
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondenekok = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumtarihi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonyukle = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfotocek = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkimlikno = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelisim = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcinsiyet = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldogumtarihi = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldogumyeri = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelbabaadi = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkboxengeldurumu = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltakimokul = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelbranssinif = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmevki = null;
public static String _kayittürü = "";
public anywheresoftware.b4a.objects.ButtonWrapper _buttonfotocek = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelgun = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelay = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelyil = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnergun = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinneray = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinneryil = null;
public static int _secilengun = 0;
public static String _secilenay = "";
public static int _secilenyil = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarihayar = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
public b4a.example3.antranorgorussil _antranorgorussil = null;
public b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
public b4a.example3.dayanikliliktestlistele _dayanikliliktestlistele = null;
public b4a.example3.dayanikliliktestsil _dayanikliliktestsil = null;
public b4a.example3.dayanikliliktestekle _dayanikliliktestekle = null;
public b4a.example3.gelismistestdenekara _gelismistestdenekara = null;
public b4a.example3.programayar _programayar = null;
public b4a.example3.surattestlistele _surattestlistele = null;
public b4a.example3.deneklistele _deneklistele = null;
public b4a.example3.dbutils _dbutils = null;
public b4a.example3.antranorgorusekle _antranorgorusekle = null;
public b4a.example3.programveri _programveri = null;
public b4a.example3.testdenekara _testdenekara = null;
public b4a.example3.dayanikliliktestmenu _dayanikliliktestmenu = null;
public b4a.example3.programlistele _programlistele = null;
public b4a.example3.programsil _programsil = null;
public b4a.example3.surattestayar _surattestayar = null;
public b4a.example3.surattestekle _surattestekle = null;
public b4a.example3.surattestsil _surattestsil = null;
public b4a.example3.sesservice _sesservice = null;
public b4a.example3.denekduzenlesil _denekduzenlesil = null;
public b4a.example3.antropometriklistele _antropometriklistele = null;
public b4a.example3.saglikbilgilerisil _saglikbilgilerisil = null;
public b4a.example3.testmenu _testmenu = null;
public b4a.example3.motorozellikmenu _motorozellikmenu = null;
public b4a.example3.saglikbilgilerilistele _saglikbilgilerilistele = null;
public b4a.example3.biyokimyasalekle _biyokimyasalekle = null;
public b4a.example3.antropometrikekle _antropometrikekle = null;
public b4a.example3.color _color = null;
public b4a.example3.anamenu _anamenu = null;
public b4a.example3.insertveriler _insertveriler = null;
public b4a.example3.biyokimyasallistele _biyokimyasallistele = null;
public b4a.example3.biyokimyasalsil _biyokimyasalsil = null;
public b4a.example3.psikolojiksil _psikolojiksil = null;
public b4a.example3.psikolojiklistele _psikolojiklistele = null;
public b4a.example3.antropometriksil _antropometriksil = null;
public b4a.example3.psikolojikekle _psikolojikekle = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public b4a.example3.programsec _programsec = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Activity.LoadLayout(\"DenekEklePage\")";
mostCurrent._activity.LoadLayout("DenekEklePage",mostCurrent.activityBA);
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="Panel2.Visible= False";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20709386;
 //BA.debugLineNum = 20709386;BA.debugLine="SpinnerCinsiyet.DropdownBackgroundColor= Colors.W";
mostCurrent._spinnercinsiyet.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709387;
 //BA.debugLineNum = 20709387;BA.debugLine="SpinnerCinsiyet.DropdownTextColor= Color.koyuMavi";
mostCurrent._spinnercinsiyet.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709388;
 //BA.debugLineNum = 20709388;BA.debugLine="SpinnerCinsiyet.TextColor= Colors.White";
mostCurrent._spinnercinsiyet.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709389;
 //BA.debugLineNum = 20709389;BA.debugLine="SpinnerCinsiyet.TextSize = 20";
mostCurrent._spinnercinsiyet.setTextSize((float) (20));
RDebugUtils.currentLine=20709391;
 //BA.debugLineNum = 20709391;BA.debugLine="SpinnerDogumYeri.DropdownBackgroundColor= Colors.";
mostCurrent._spinnerdogumyeri.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709392;
 //BA.debugLineNum = 20709392;BA.debugLine="SpinnerDogumYeri.DropdownTextColor= Color.koyuMav";
mostCurrent._spinnerdogumyeri.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709393;
 //BA.debugLineNum = 20709393;BA.debugLine="SpinnerDogumYeri.TextColor= Colors.White";
mostCurrent._spinnerdogumyeri.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709394;
 //BA.debugLineNum = 20709394;BA.debugLine="SpinnerDogumYeri.TextSize = 20";
mostCurrent._spinnerdogumyeri.setTextSize((float) (20));
RDebugUtils.currentLine=20709396;
 //BA.debugLineNum = 20709396;BA.debugLine="SpinnerGun.DropdownBackgroundColor = Color.acikMa";
mostCurrent._spinnergun.setDropdownBackgroundColor(mostCurrent._color._acikmavi /*int*/ );
RDebugUtils.currentLine=20709397;
 //BA.debugLineNum = 20709397;BA.debugLine="SpinnerGun.DropdownTextColor = Colors.White";
mostCurrent._spinnergun.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709398;
 //BA.debugLineNum = 20709398;BA.debugLine="SpinnerGun.TextColor = Color.koyuMavi";
mostCurrent._spinnergun.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709399;
 //BA.debugLineNum = 20709399;BA.debugLine="SpinnerGun.TextSize = 20";
mostCurrent._spinnergun.setTextSize((float) (20));
RDebugUtils.currentLine=20709401;
 //BA.debugLineNum = 20709401;BA.debugLine="SpinnerAy.DropdownBackgroundColor = Color.acikMav";
mostCurrent._spinneray.setDropdownBackgroundColor(mostCurrent._color._acikmavi /*int*/ );
RDebugUtils.currentLine=20709402;
 //BA.debugLineNum = 20709402;BA.debugLine="SpinnerAy.DropdownTextColor = Colors.White";
mostCurrent._spinneray.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709403;
 //BA.debugLineNum = 20709403;BA.debugLine="SpinnerAy.TextColor = Color.koyuMavi";
mostCurrent._spinneray.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709404;
 //BA.debugLineNum = 20709404;BA.debugLine="SpinnerAy.TextSize = 20";
mostCurrent._spinneray.setTextSize((float) (20));
RDebugUtils.currentLine=20709406;
 //BA.debugLineNum = 20709406;BA.debugLine="SpinnerYil.DropdownBackgroundColor = Color.acikMa";
mostCurrent._spinneryil.setDropdownBackgroundColor(mostCurrent._color._acikmavi /*int*/ );
RDebugUtils.currentLine=20709407;
 //BA.debugLineNum = 20709407;BA.debugLine="SpinnerYil.DropdownTextColor = Colors.White";
mostCurrent._spinneryil.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709408;
 //BA.debugLineNum = 20709408;BA.debugLine="SpinnerYil.TextColor = Color.koyuMavi";
mostCurrent._spinneryil.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709409;
 //BA.debugLineNum = 20709409;BA.debugLine="SpinnerYil.TextSize = 20";
mostCurrent._spinneryil.setTextSize((float) (20));
RDebugUtils.currentLine=20709411;
 //BA.debugLineNum = 20709411;BA.debugLine="LabelGun.TextColor = Color.koyuMavi";
mostCurrent._labelgun.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709412;
 //BA.debugLineNum = 20709412;BA.debugLine="LabelGun.TextSize = 20";
mostCurrent._labelgun.setTextSize((float) (20));
RDebugUtils.currentLine=20709413;
 //BA.debugLineNum = 20709413;BA.debugLine="LabelGun.Typeface = Typeface.DEFAULT";
mostCurrent._labelgun.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709415;
 //BA.debugLineNum = 20709415;BA.debugLine="LabelAy.TextColor = Color.koyuMavi";
mostCurrent._labelay.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709416;
 //BA.debugLineNum = 20709416;BA.debugLine="LabelAy.TextSize = 20";
mostCurrent._labelay.setTextSize((float) (20));
RDebugUtils.currentLine=20709417;
 //BA.debugLineNum = 20709417;BA.debugLine="LabelAy.Typeface = Typeface.DEFAULT";
mostCurrent._labelay.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709419;
 //BA.debugLineNum = 20709419;BA.debugLine="LabelYil.TextColor = Color.koyuMavi";
mostCurrent._labelyil.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=20709420;
 //BA.debugLineNum = 20709420;BA.debugLine="LabelYil.TextSize = 20";
mostCurrent._labelyil.setTextSize((float) (20));
RDebugUtils.currentLine=20709421;
 //BA.debugLineNum = 20709421;BA.debugLine="LabelYil.Typeface = Typeface.DEFAULT";
mostCurrent._labelyil.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709423;
 //BA.debugLineNum = 20709423;BA.debugLine="LabelKimlikNo.TextColor = Colors.White";
mostCurrent._labelkimlikno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709424;
 //BA.debugLineNum = 20709424;BA.debugLine="LabelKimlikNo.TextSize = 20";
mostCurrent._labelkimlikno.setTextSize((float) (20));
RDebugUtils.currentLine=20709425;
 //BA.debugLineNum = 20709425;BA.debugLine="LabelKimlikNo.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelkimlikno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709427;
 //BA.debugLineNum = 20709427;BA.debugLine="Labelisim.TextColor = Colors.White";
mostCurrent._labelisim.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709428;
 //BA.debugLineNum = 20709428;BA.debugLine="Labelisim.TextSize = 20";
mostCurrent._labelisim.setTextSize((float) (20));
RDebugUtils.currentLine=20709429;
 //BA.debugLineNum = 20709429;BA.debugLine="Labelisim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709431;
 //BA.debugLineNum = 20709431;BA.debugLine="LabelCinsiyet.TextColor = Colors.White";
mostCurrent._labelcinsiyet.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709432;
 //BA.debugLineNum = 20709432;BA.debugLine="LabelCinsiyet.TextSize = 20";
mostCurrent._labelcinsiyet.setTextSize((float) (20));
RDebugUtils.currentLine=20709433;
 //BA.debugLineNum = 20709433;BA.debugLine="LabelCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelcinsiyet.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709435;
 //BA.debugLineNum = 20709435;BA.debugLine="LabelDogumTarihi.TextColor = Colors.White";
mostCurrent._labeldogumtarihi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709436;
 //BA.debugLineNum = 20709436;BA.debugLine="LabelDogumTarihi.TextSize = 20";
mostCurrent._labeldogumtarihi.setTextSize((float) (20));
RDebugUtils.currentLine=20709437;
 //BA.debugLineNum = 20709437;BA.debugLine="LabelDogumTarihi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldogumtarihi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709439;
 //BA.debugLineNum = 20709439;BA.debugLine="LabelDogumYeri.TextColor = Colors.White";
mostCurrent._labeldogumyeri.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709440;
 //BA.debugLineNum = 20709440;BA.debugLine="LabelDogumYeri.TextSize = 20";
mostCurrent._labeldogumyeri.setTextSize((float) (20));
RDebugUtils.currentLine=20709441;
 //BA.debugLineNum = 20709441;BA.debugLine="LabelDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldogumyeri.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709443;
 //BA.debugLineNum = 20709443;BA.debugLine="LabelBabaAdi.TextColor = Colors.White";
mostCurrent._labelbabaadi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709444;
 //BA.debugLineNum = 20709444;BA.debugLine="LabelBabaAdi.TextSize = 20";
mostCurrent._labelbabaadi.setTextSize((float) (20));
RDebugUtils.currentLine=20709445;
 //BA.debugLineNum = 20709445;BA.debugLine="LabelBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelbabaadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709447;
 //BA.debugLineNum = 20709447;BA.debugLine="CheckBoxEngelDurumu.TextColor = Colors.White";
mostCurrent._checkboxengeldurumu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709448;
 //BA.debugLineNum = 20709448;BA.debugLine="CheckBoxEngelDurumu.TextSize = 20";
mostCurrent._checkboxengeldurumu.setTextSize((float) (20));
RDebugUtils.currentLine=20709449;
 //BA.debugLineNum = 20709449;BA.debugLine="CheckBoxEngelDurumu.Typeface = Typeface.DEFAULT_B";
mostCurrent._checkboxengeldurumu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709451;
 //BA.debugLineNum = 20709451;BA.debugLine="LabelTakimOkul.TextColor = Colors.White";
mostCurrent._labeltakimokul.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709452;
 //BA.debugLineNum = 20709452;BA.debugLine="LabelTakimOkul.TextSize = 20";
mostCurrent._labeltakimokul.setTextSize((float) (20));
RDebugUtils.currentLine=20709453;
 //BA.debugLineNum = 20709453;BA.debugLine="LabelTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeltakimokul.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709455;
 //BA.debugLineNum = 20709455;BA.debugLine="LabelBransSinif.TextColor = Colors.White";
mostCurrent._labelbranssinif.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709456;
 //BA.debugLineNum = 20709456;BA.debugLine="LabelBransSinif.TextSize = 20";
mostCurrent._labelbranssinif.setTextSize((float) (20));
RDebugUtils.currentLine=20709457;
 //BA.debugLineNum = 20709457;BA.debugLine="LabelBransSinif.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelbranssinif.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709459;
 //BA.debugLineNum = 20709459;BA.debugLine="LabelMevki.TextColor = Colors.White";
mostCurrent._labelmevki.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709460;
 //BA.debugLineNum = 20709460;BA.debugLine="LabelMevki.TextSize = 20";
mostCurrent._labelmevki.setTextSize((float) (20));
RDebugUtils.currentLine=20709461;
 //BA.debugLineNum = 20709461;BA.debugLine="LabelMevki.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelmevki.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=20709463;
 //BA.debugLineNum = 20709463;BA.debugLine="EditTextKimlikNo.HintColor = Color.hintColor";
mostCurrent._edittextkimlikno.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=20709464;
 //BA.debugLineNum = 20709464;BA.debugLine="EditTextKimlikNo.Hint = \"TCKN'i eksiksiz giriniz.";
mostCurrent._edittextkimlikno.setHint("TCKN'i eksiksiz giriniz..");
RDebugUtils.currentLine=20709465;
 //BA.debugLineNum = 20709465;BA.debugLine="EditTextKimlikNo.TextSize = 20";
mostCurrent._edittextkimlikno.setTextSize((float) (20));
RDebugUtils.currentLine=20709466;
 //BA.debugLineNum = 20709466;BA.debugLine="EditTextKimlikNo.TextColor = Colors.White";
mostCurrent._edittextkimlikno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709467;
 //BA.debugLineNum = 20709467;BA.debugLine="EditTextKimlikNo.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkimlikno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709468;
 //BA.debugLineNum = 20709468;BA.debugLine="EditTextKimlikNo.SingleLine = True";
mostCurrent._edittextkimlikno.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709470;
 //BA.debugLineNum = 20709470;BA.debugLine="EditTextIsim.HintColor = Color.hintColor";
mostCurrent._edittextisim.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=20709471;
 //BA.debugLineNum = 20709471;BA.debugLine="EditTextIsim.Hint = \"Denek ismini giriniz..\"";
mostCurrent._edittextisim.setHint("Denek ismini giriniz..");
RDebugUtils.currentLine=20709472;
 //BA.debugLineNum = 20709472;BA.debugLine="EditTextIsim.TextSize = 20";
mostCurrent._edittextisim.setTextSize((float) (20));
RDebugUtils.currentLine=20709473;
 //BA.debugLineNum = 20709473;BA.debugLine="EditTextIsim.TextColor = Colors.White";
mostCurrent._edittextisim.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709474;
 //BA.debugLineNum = 20709474;BA.debugLine="EditTextIsim.Typeface = Typeface.DEFAULT";
mostCurrent._edittextisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709476;
 //BA.debugLineNum = 20709476;BA.debugLine="EditTextBabaAdi.HintColor = Color.hintColor";
mostCurrent._edittextbabaadi.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=20709477;
 //BA.debugLineNum = 20709477;BA.debugLine="EditTextBabaAdi.Hint = \"Denek baba adını giriniz.";
mostCurrent._edittextbabaadi.setHint("Denek baba adını giriniz..");
RDebugUtils.currentLine=20709478;
 //BA.debugLineNum = 20709478;BA.debugLine="EditTextBabaAdi.TextSize = 20";
mostCurrent._edittextbabaadi.setTextSize((float) (20));
RDebugUtils.currentLine=20709479;
 //BA.debugLineNum = 20709479;BA.debugLine="EditTextBabaAdi.TextColor = Colors.White";
mostCurrent._edittextbabaadi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709480;
 //BA.debugLineNum = 20709480;BA.debugLine="EditTextBabaAdi.Typeface = Typeface.DEFAULT";
mostCurrent._edittextbabaadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709482;
 //BA.debugLineNum = 20709482;BA.debugLine="EditTextEngelDurumu.HintColor = Color.hintColor";
mostCurrent._edittextengeldurumu.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=20709483;
 //BA.debugLineNum = 20709483;BA.debugLine="EditTextEngelDurumu.Hint = \"Engel durumu varsa lü";
mostCurrent._edittextengeldurumu.setHint("Engel durumu varsa lütfen doldurunuz..");
RDebugUtils.currentLine=20709484;
 //BA.debugLineNum = 20709484;BA.debugLine="EditTextEngelDurumu.TextSize = 20";
mostCurrent._edittextengeldurumu.setTextSize((float) (20));
RDebugUtils.currentLine=20709485;
 //BA.debugLineNum = 20709485;BA.debugLine="EditTextEngelDurumu.TextColor = Colors.White";
mostCurrent._edittextengeldurumu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709486;
 //BA.debugLineNum = 20709486;BA.debugLine="EditTextEngelDurumu.Typeface = Typeface.DEFAULT";
mostCurrent._edittextengeldurumu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709488;
 //BA.debugLineNum = 20709488;BA.debugLine="EditTextTakimOkul.HintColor = Color.hintColor";
mostCurrent._edittexttakimokul.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=20709489;
 //BA.debugLineNum = 20709489;BA.debugLine="EditTextTakimOkul.Hint = \"Bağlı olduğu Takım/Okul";
mostCurrent._edittexttakimokul.setHint("Bağlı olduğu Takım/Okul değerini giriniz...");
RDebugUtils.currentLine=20709490;
 //BA.debugLineNum = 20709490;BA.debugLine="EditTextTakimOkul.TextSize = 20";
mostCurrent._edittexttakimokul.setTextSize((float) (20));
RDebugUtils.currentLine=20709491;
 //BA.debugLineNum = 20709491;BA.debugLine="EditTextTakimOkul.TextColor = Colors.White";
mostCurrent._edittexttakimokul.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709492;
 //BA.debugLineNum = 20709492;BA.debugLine="EditTextTakimOkul.Typeface = Typeface.DEFAULT";
mostCurrent._edittexttakimokul.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709494;
 //BA.debugLineNum = 20709494;BA.debugLine="EditTextBransSinif.HintColor = Color.hintColor";
mostCurrent._edittextbranssinif.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=20709495;
 //BA.debugLineNum = 20709495;BA.debugLine="EditTextBransSinif.Hint = \"Bağlı olduğu Branş/Sın";
mostCurrent._edittextbranssinif.setHint("Bağlı olduğu Branş/Sınıf değerini giriniz...");
RDebugUtils.currentLine=20709496;
 //BA.debugLineNum = 20709496;BA.debugLine="EditTextBransSinif.TextSize = 20";
mostCurrent._edittextbranssinif.setTextSize((float) (20));
RDebugUtils.currentLine=20709497;
 //BA.debugLineNum = 20709497;BA.debugLine="EditTextBransSinif.TextColor = Colors.White";
mostCurrent._edittextbranssinif.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709498;
 //BA.debugLineNum = 20709498;BA.debugLine="EditTextBransSinif.Typeface = Typeface.DEFAULT";
mostCurrent._edittextbranssinif.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709500;
 //BA.debugLineNum = 20709500;BA.debugLine="EditTextMevki.HintColor = Color.hintColor";
mostCurrent._edittextmevki.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=20709501;
 //BA.debugLineNum = 20709501;BA.debugLine="EditTextMevki.Hint = \"Bulunduğu mevki değerini gi";
mostCurrent._edittextmevki.setHint("Bulunduğu mevki değerini giriniz...");
RDebugUtils.currentLine=20709502;
 //BA.debugLineNum = 20709502;BA.debugLine="EditTextMevki.TextSize = 20";
mostCurrent._edittextmevki.setTextSize((float) (20));
RDebugUtils.currentLine=20709503;
 //BA.debugLineNum = 20709503;BA.debugLine="EditTextMevki.TextColor = Colors.White";
mostCurrent._edittextmevki.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709504;
 //BA.debugLineNum = 20709504;BA.debugLine="EditTextMevki.Typeface = Typeface.DEFAULT";
mostCurrent._edittextmevki.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709506;
 //BA.debugLineNum = 20709506;BA.debugLine="ButtonDogumTarihi.Text = \"Doğum Tarihi\"";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence("Doğum Tarihi"));
RDebugUtils.currentLine=20709507;
 //BA.debugLineNum = 20709507;BA.debugLine="ButtonDogumTarihi.TextColor = Colors.White";
mostCurrent._buttondogumtarihi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=20709508;
 //BA.debugLineNum = 20709508;BA.debugLine="ButtonDogumTarihi.TextSize = 20";
mostCurrent._buttondogumtarihi.setTextSize((float) (20));
RDebugUtils.currentLine=20709509;
 //BA.debugLineNum = 20709509;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT";
mostCurrent._buttondogumtarihi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=20709510;
 //BA.debugLineNum = 20709510;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
mostCurrent._buttondogumtarihi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709512;
 //BA.debugLineNum = 20709512;BA.debugLine="ButtonYukle.Visible = False";
mostCurrent._buttonyukle.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20709513;
 //BA.debugLineNum = 20709513;BA.debugLine="ButtonFotoCek.Visible = False";
mostCurrent._buttonfotocek.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20709514;
 //BA.debugLineNum = 20709514;BA.debugLine="If Main.Status = \"S\" Then";
if ((mostCurrent._main._status /*String*/ ).equals("S")) { 
RDebugUtils.currentLine=20709515;
 //BA.debugLineNum = 20709515;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=20709517;
 //BA.debugLineNum = 20709517;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=20709519;
 //BA.debugLineNum = 20709519;BA.debugLine="EditTextEngelDurumu.Visible = False";
mostCurrent._edittextengeldurumu.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20709521;
 //BA.debugLineNum = 20709521;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT cinsiyet";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT cinsiyet_adi FROM Cinsiyet",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnercinsiyet);
RDebugUtils.currentLine=20709522;
 //BA.debugLineNum = 20709522;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerCinsiyet.GetIt";
_spinnercinsiyet_itemclick((int) (0),(Object)(mostCurrent._spinnercinsiyet.GetItem((int) (0))));
RDebugUtils.currentLine=20709523;
 //BA.debugLineNum = 20709523;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT il_adi F";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT il_adi FROM Iller",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnerdogumyeri);
RDebugUtils.currentLine=20709524;
 //BA.debugLineNum = 20709524;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerDogumYeri.GetI";
_spinnercinsiyet_itemclick((int) (0),(Object)(mostCurrent._spinnerdogumyeri.GetItem((int) (0))));
RDebugUtils.currentLine=20709525;
 //BA.debugLineNum = 20709525;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql ,\"SELECT gun FROM";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT gun FROM Gun",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnergun);
RDebugUtils.currentLine=20709526;
 //BA.debugLineNum = 20709526;BA.debugLine="SpinnerGun_ItemClick(0,SpinnerGun.GetItem(0))";
_spinnergun_itemclick((int) (0),(Object)(mostCurrent._spinnergun.GetItem((int) (0))));
RDebugUtils.currentLine=20709527;
 //BA.debugLineNum = 20709527;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT ay FROM";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT ay FROM Ay",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinneray);
RDebugUtils.currentLine=20709528;
 //BA.debugLineNum = 20709528;BA.debugLine="SpinnerAy_ItemClick(0,SpinnerAy.GetItem(0))";
_spinneray_itemclick((int) (0),(Object)(mostCurrent._spinneray.GetItem((int) (0))));
RDebugUtils.currentLine=20709529;
 //BA.debugLineNum = 20709529;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT yil FROM";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT yil FROM Yil",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinneryil);
RDebugUtils.currentLine=20709530;
 //BA.debugLineNum = 20709530;BA.debugLine="SpinnerYil_ItemClick(0,SpinnerYil.GetItem(0))";
_spinneryil_itemclick((int) (0),(Object)(mostCurrent._spinneryil.GetItem((int) (0))));
RDebugUtils.currentLine=20709535;
 //BA.debugLineNum = 20709535;BA.debugLine="If Main.Status=\"U\" Then";
if ((mostCurrent._main._status /*String*/ ).equals("U")) { 
RDebugUtils.currentLine=20709536;
 //BA.debugLineNum = 20709536;BA.debugLine="DenekID = DenekDuzenleSil.id";
mostCurrent._denekid = mostCurrent._denekduzenlesil._id /*String*/ ;
RDebugUtils.currentLine=20709537;
 //BA.debugLineNum = 20709537;BA.debugLine="EditTextKimlikNo.Text = DenekDuzenleSil.tc";
mostCurrent._edittextkimlikno.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._tc /*String*/ ));
RDebugUtils.currentLine=20709538;
 //BA.debugLineNum = 20709538;BA.debugLine="EditTextIsim.Text = DenekDuzenleSil.isim";
mostCurrent._edittextisim.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._isim /*String*/ ));
RDebugUtils.currentLine=20709539;
 //BA.debugLineNum = 20709539;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql,\"SELECT cinsiyet";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT cinsiyet_adi FROM Cinsiyet ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnercinsiyet);
RDebugUtils.currentLine=20709540;
 //BA.debugLineNum = 20709540;BA.debugLine="ButtonDogumTarihi.Text = DenekDuzenleSil.dogum_t";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._dogum_tarihi /*String*/ ));
RDebugUtils.currentLine=20709541;
 //BA.debugLineNum = 20709541;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql,\"SELECT il_adi F";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT il_adi FROM Iller ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnerdogumyeri);
RDebugUtils.currentLine=20709542;
 //BA.debugLineNum = 20709542;BA.debugLine="EditTextBabaAdi.Text = DenekDuzenleSil.baba_adi";
mostCurrent._edittextbabaadi.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._baba_adi /*String*/ ));
RDebugUtils.currentLine=20709543;
 //BA.debugLineNum = 20709543;BA.debugLine="EditTextEngelDurumu.Text = DenekDuzenleSil.engel";
mostCurrent._edittextengeldurumu.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._engel_durumu /*String*/ ));
RDebugUtils.currentLine=20709544;
 //BA.debugLineNum = 20709544;BA.debugLine="EditTextTakimOkul.Text = DenekDuzenleSil.takim_o";
mostCurrent._edittexttakimokul.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._takim_okul /*String*/ ));
RDebugUtils.currentLine=20709545;
 //BA.debugLineNum = 20709545;BA.debugLine="EditTextBransSinif.Text = DenekDuzenleSil.brans_";
mostCurrent._edittextbranssinif.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._brans_sinif /*String*/ ));
RDebugUtils.currentLine=20709546;
 //BA.debugLineNum = 20709546;BA.debugLine="EditTextMevki.Text = DenekDuzenleSil.mevki";
mostCurrent._edittextmevki.setText(BA.ObjectToCharSequence(mostCurrent._denekduzenlesil._mevki /*String*/ ));
RDebugUtils.currentLine=20709547;
 //BA.debugLineNum = 20709547;BA.debugLine="Buffer = DenekDuzenleSil.resim";
_buffer = mostCurrent._denekduzenlesil._resim /*byte[]*/ ;
RDebugUtils.currentLine=20709548;
 //BA.debugLineNum = 20709548;BA.debugLine="Try";
try {RDebugUtils.currentLine=20709549;
 //BA.debugLineNum = 20709549;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=20709550;
 //BA.debugLineNum = 20709550;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=20709551;
 //BA.debugLineNum = 20709551;BA.debugLine="inputStream.InitializeFromBytesArray(Buffer, 0,";
_inputstream.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=20709552;
 //BA.debugLineNum = 20709552;BA.debugLine="bmp.Initialize2(inputStream)";
_bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=20709553;
 //BA.debugLineNum = 20709553;BA.debugLine="inputStream.Close";
_inputstream.Close();
RDebugUtils.currentLine=20709554;
 //BA.debugLineNum = 20709554;BA.debugLine="ImageView1.SetBackgroundImage(bmp)";
mostCurrent._imageview1.SetBackgroundImageNew((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=20709555;
 //BA.debugLineNum = 20709555;BA.debugLine="Log(\"try\")";
anywheresoftware.b4a.keywords.Common.LogImpl("220709555","try",0);
 } 
       catch (Exception e143) {
			processBA.setLastException(e143);RDebugUtils.currentLine=20709557;
 //BA.debugLineNum = 20709557;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets,";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png").getObject()));
RDebugUtils.currentLine=20709558;
 //BA.debugLineNum = 20709558;BA.debugLine="Log(\"catch\")";
anywheresoftware.b4a.keywords.Common.LogImpl("220709558","catch",0);
 };
 };
RDebugUtils.currentLine=20709563;
 //BA.debugLineNum = 20709563;BA.debugLine="End Sub";
return "";
}
public static String  _spinnercinsiyet_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnercinsiyet_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnercinsiyet_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub spinnerCinsiyet_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Try";
try {RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="secilenCinsiyet= Value";
mostCurrent._secilencinsiyet = BA.ObjectToString(_value);
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("221364740",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="End Sub";
return "";
}
public static String  _spinnergun_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnergun_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnergun_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub SpinnerGun_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Try";
try {RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="secilenGun = Value";
_secilengun = (int)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("221954564",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="End Sub";
return "";
}
public static String  _spinneray_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinneray_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinneray_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Sub SpinnerAy_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Try";
try {RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="If Value == \"Ocak\" Then";
if ((_value).equals((Object)("Ocak"))) { 
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="secilenAy = 1";
mostCurrent._secilenay = BA.NumberToString(1);
 }else 
{RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Else if Value == \"Şubat\" Then";
if ((_value).equals((Object)("Şubat"))) { 
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="secilenAy = 2";
mostCurrent._secilenay = BA.NumberToString(2);
 }else 
{RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="Else if Value == \"Mart\" Then";
if ((_value).equals((Object)("Mart"))) { 
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="secilenAy = 3";
mostCurrent._secilenay = BA.NumberToString(3);
 }else 
{RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="Else if Value == \"Nisan\" Then";
if ((_value).equals((Object)("Nisan"))) { 
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="secilenAy = 4";
mostCurrent._secilenay = BA.NumberToString(4);
 }else 
{RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="Else if Value == \"Mayıs\" Then";
if ((_value).equals((Object)("Mayıs"))) { 
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="secilenAy = 5";
mostCurrent._secilenay = BA.NumberToString(5);
 }else 
{RDebugUtils.currentLine=22020108;
 //BA.debugLineNum = 22020108;BA.debugLine="Else if Value == \"Haziran\" Then";
if ((_value).equals((Object)("Haziran"))) { 
RDebugUtils.currentLine=22020109;
 //BA.debugLineNum = 22020109;BA.debugLine="secilenAy = 6";
mostCurrent._secilenay = BA.NumberToString(6);
 }else 
{RDebugUtils.currentLine=22020110;
 //BA.debugLineNum = 22020110;BA.debugLine="Else if Value == \"Temmuz\" Then";
if ((_value).equals((Object)("Temmuz"))) { 
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="secilenAy = 7";
mostCurrent._secilenay = BA.NumberToString(7);
 }else 
{RDebugUtils.currentLine=22020112;
 //BA.debugLineNum = 22020112;BA.debugLine="Else if Value == \"Ağustos\" Then";
if ((_value).equals((Object)("Ağustos"))) { 
RDebugUtils.currentLine=22020113;
 //BA.debugLineNum = 22020113;BA.debugLine="secilenAy = 8";
mostCurrent._secilenay = BA.NumberToString(8);
 }else 
{RDebugUtils.currentLine=22020114;
 //BA.debugLineNum = 22020114;BA.debugLine="Else if Value == \"Eylül\" Then";
if ((_value).equals((Object)("Eylül"))) { 
RDebugUtils.currentLine=22020115;
 //BA.debugLineNum = 22020115;BA.debugLine="secilenAy = 9";
mostCurrent._secilenay = BA.NumberToString(9);
 }else 
{RDebugUtils.currentLine=22020116;
 //BA.debugLineNum = 22020116;BA.debugLine="Else if Value == \"Ekim\" Then";
if ((_value).equals((Object)("Ekim"))) { 
RDebugUtils.currentLine=22020117;
 //BA.debugLineNum = 22020117;BA.debugLine="secilenAy = 10";
mostCurrent._secilenay = BA.NumberToString(10);
 }else 
{RDebugUtils.currentLine=22020118;
 //BA.debugLineNum = 22020118;BA.debugLine="Else if Value == \"Kasım\" Then";
if ((_value).equals((Object)("Kasım"))) { 
RDebugUtils.currentLine=22020119;
 //BA.debugLineNum = 22020119;BA.debugLine="secilenAy = 11";
mostCurrent._secilenay = BA.NumberToString(11);
 }else 
{RDebugUtils.currentLine=22020120;
 //BA.debugLineNum = 22020120;BA.debugLine="Else if Value == \"Aralık\" Then";
if ((_value).equals((Object)("Aralık"))) { 
RDebugUtils.currentLine=22020121;
 //BA.debugLineNum = 22020121;BA.debugLine="secilenAy = 12";
mostCurrent._secilenay = BA.NumberToString(12);
 }}}}}}}}}}}}
;
 } 
       catch (Exception e28) {
			processBA.setLastException(e28);RDebugUtils.currentLine=22020124;
 //BA.debugLineNum = 22020124;BA.debugLine="secilenAy = 6";
mostCurrent._secilenay = BA.NumberToString(6);
RDebugUtils.currentLine=22020125;
 //BA.debugLineNum = 22020125;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222020125",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=22020127;
 //BA.debugLineNum = 22020127;BA.debugLine="End Sub";
return "";
}
public static String  _spinneryil_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinneryil_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinneryil_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Sub SpinnerYil_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Try";
try {RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="secilenYil = Value";
_secilenyil = (int)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222085636",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return "";
}
public static String  _buttondenekok_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondenekok_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondenekok_click", null));}
long _sayi = 0L;
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub ButtonDenekOk_Click";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="If EditTextKimlikNo.Text=\"\" Then";
if ((mostCurrent._edittextkimlikno.getText()).equals("")) { 
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Msgbox(\"TC Kimlik numarası boş bırakılamaz\",\"Bil";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("TC Kimlik numarası boş bırakılamaz"),BA.ObjectToCharSequence("Bildirim Mesajı"),mostCurrent.activityBA);
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="If ImageView1.Bitmap = Null Then";
if (mostCurrent._imageview1.getBitmap()== null) { 
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="Msgbox(\"Denek Fotoğrafı çekiniz\",\"Bildirim Mesaj";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Denek Fotoğrafı çekiniz"),BA.ObjectToCharSequence("Bildirim Mesajı"),mostCurrent.activityBA);
RDebugUtils.currentLine=21299208;
 //BA.debugLineNum = 21299208;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="Dim sayi As Long = EditTextKimlikNo.Text";
_sayi = (long)(Double.parseDouble(mostCurrent._edittextkimlikno.getText()));
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="If sayi > 99999999999 Or sayi < 10000000000 Then";
if (_sayi>99999999999L || _sayi<10000000000L) { 
RDebugUtils.currentLine=21299213;
 //BA.debugLineNum = 21299213;BA.debugLine="Log(sayi)";
anywheresoftware.b4a.keywords.Common.LogImpl("221299213",BA.NumberToString(_sayi),0);
RDebugUtils.currentLine=21299214;
 //BA.debugLineNum = 21299214;BA.debugLine="Msgbox(\"Geçerli bir TC giriniz..\",\"Bildirim Mesa";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Geçerli bir TC giriniz.."),BA.ObjectToCharSequence("Bildirim Mesajı"),mostCurrent.activityBA);
RDebugUtils.currentLine=21299215;
 //BA.debugLineNum = 21299215;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21299218;
 //BA.debugLineNum = 21299218;BA.debugLine="If Main.Status = \"S\" Then";
if ((mostCurrent._main._status /*String*/ ).equals("S")) { 
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="Dim rs As ResultSet = Main.sql.ExecQuery(\"SELECT";
mostCurrent._rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_tc ='"+mostCurrent._edittextkimlikno.getText()+"'")));
RDebugUtils.currentLine=21299221;
 //BA.debugLineNum = 21299221;BA.debugLine="If rs.RowCount >0 Then";
if (mostCurrent._rs.getRowCount()>0) { 
RDebugUtils.currentLine=21299222;
 //BA.debugLineNum = 21299222;BA.debugLine="Msgbox(\"Bu TC kimlik numarasına sahip denek ekl";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Bu TC kimlik numarasına sahip denek eklendi"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=21299223;
 //BA.debugLineNum = 21299223;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=21299225;
 //BA.debugLineNum = 21299225;BA.debugLine="result = Msgbox2(\"Aşağıda ismi ve soy ismi yazı";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Aşağıda ismi ve soy ismi yazılı kişiyi denek olarak eklemek istiyor musunuz?:"+mostCurrent._edittextisim.getText()),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=21299226;
 //BA.debugLineNum = 21299226;BA.debugLine="If result= DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=21299227;
 //BA.debugLineNum = 21299227;BA.debugLine="ID";
_id();
RDebugUtils.currentLine=21299228;
 //BA.debugLineNum = 21299228;BA.debugLine="If kayitTürü = \"FotoCek\" Then";
if ((mostCurrent._kayittürü).equals("FotoCek")) { 
RDebugUtils.currentLine=21299229;
 //BA.debugLineNum = 21299229;BA.debugLine="InsertBlob";
_insertblob();
RDebugUtils.currentLine=21299230;
 //BA.debugLineNum = 21299230;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Denek VAL";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO Denek VALUES(?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._denekid),(Object)(mostCurrent._edittextkimlikno.getText()),(Object)(mostCurrent._edittextisim.getText()),(Object)(mostCurrent._secilencinsiyet),(Object)(mostCurrent._secilendogumtarihi),(Object)(mostCurrent._secilendogumyeri),(Object)(mostCurrent._edittextbabaadi.getText()),(Object)(mostCurrent._edittextengeldurumu.getText()),(Object)(mostCurrent._edittexttakimokul.getText()),(Object)(mostCurrent._edittextbranssinif.getText()),(Object)(mostCurrent._edittextmevki.getText()),(Object)(_buffer)}));
 }else {
RDebugUtils.currentLine=21299232;
 //BA.debugLineNum = 21299232;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Denek VAL";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO Denek VALUES(?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._denekid),(Object)(mostCurrent._edittextkimlikno.getText()),(Object)(mostCurrent._edittextisim.getText()),(Object)(mostCurrent._secilencinsiyet),(Object)(mostCurrent._secilendogumtarihi),(Object)(mostCurrent._secilendogumyeri),(Object)(mostCurrent._edittextbabaadi.getText()),(Object)(mostCurrent._edittextengeldurumu.getText()),(Object)(mostCurrent._edittexttakimokul.getText()),(Object)(mostCurrent._edittextbranssinif.getText()),(Object)(mostCurrent._edittextmevki.getText()),(Object)(_buffer)}));
 };
RDebugUtils.currentLine=21299234;
 //BA.debugLineNum = 21299234;BA.debugLine="Log(\"tc eklendi: \"&EditTextKimlikNo.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("221299234","tc eklendi: "+mostCurrent._edittextkimlikno.getText(),0);
 }else 
{RDebugUtils.currentLine=21299235;
 //BA.debugLineNum = 21299235;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=21299236;
 //BA.debugLineNum = 21299236;BA.debugLine="ToastMessageShow(\"Denek ekleme sayfasına yönle";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Denek ekleme sayfasına yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21299237;
 //BA.debugLineNum = 21299237;BA.debugLine="Return";
if (true) return "";
 }}
;
 };
RDebugUtils.currentLine=21299240;
 //BA.debugLineNum = 21299240;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
 }else 
{RDebugUtils.currentLine=21299241;
 //BA.debugLineNum = 21299241;BA.debugLine="Else if Main.Status = \"U\" Then";
if ((mostCurrent._main._status /*String*/ ).equals("U")) { 
RDebugUtils.currentLine=21299243;
 //BA.debugLineNum = 21299243;BA.debugLine="result = Msgbox2(\"Aşağıda ismi ve soy ismi yazıl";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Aşağıda ismi ve soy ismi yazılı kişiyi güncellemek istiyor musunuz?:"+mostCurrent._edittextisim.getText()),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=21299244;
 //BA.debugLineNum = 21299244;BA.debugLine="If result= DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=21299245;
 //BA.debugLineNum = 21299245;BA.debugLine="If kayitTürü = \"FotoCek\" Then";
if ((mostCurrent._kayittürü).equals("FotoCek")) { 
RDebugUtils.currentLine=21299246;
 //BA.debugLineNum = 21299246;BA.debugLine="InsertBlob";
_insertblob();
RDebugUtils.currentLine=21299247;
 //BA.debugLineNum = 21299247;BA.debugLine="Main.sql.ExecNonQuery2(\"UPDATE Denek SET denek";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE Denek SET denek_tc = ?, denek_isim = ? ,cinsiyet_adi =?, denek_dogumTarihi=?, il_adi=?, denek_babaAdi=?, denek_engelDurumu=?, denek_takimOkul=?, denek_bransSinif=?, denek_mevki=?, denek_image=? WHERE denek_id ="+mostCurrent._denekid,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._edittextkimlikno.getText()),(Object)(mostCurrent._edittextisim.getText()),(Object)(mostCurrent._secilencinsiyet),(Object)(mostCurrent._secilendogumtarihi),(Object)(mostCurrent._secilendogumyeri),(Object)(mostCurrent._edittextbabaadi.getText()),(Object)(mostCurrent._edittextengeldurumu.getText()),(Object)(mostCurrent._edittexttakimokul.getText()),(Object)(mostCurrent._edittextbranssinif.getText()),(Object)(mostCurrent._edittextmevki.getText()),(Object)(_buffer)}));
 }else {
RDebugUtils.currentLine=21299249;
 //BA.debugLineNum = 21299249;BA.debugLine="Main.sql.ExecNonQuery2(\"UPDATE Denek SET denek";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE Denek SET denek_tc = ?, denek_isim = ? ,cinsiyet_adi =?, denek_dogumTarihi=?, il_adi=?, denek_babaAdi=?, denek_engelDurumu=?, denek_takimOkul=?, denek_bransSinif=?, denek_mevki=?, denek_image=? WHERE denek_id ="+mostCurrent._denekid,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._edittextkimlikno.getText()),(Object)(mostCurrent._edittextisim.getText()),(Object)(mostCurrent._secilencinsiyet),(Object)(mostCurrent._secilendogumtarihi),(Object)(mostCurrent._secilendogumyeri),(Object)(mostCurrent._edittextbabaadi.getText()),(Object)(mostCurrent._edittextengeldurumu.getText()),(Object)(mostCurrent._edittexttakimokul.getText()),(Object)(mostCurrent._edittextbranssinif.getText()),(Object)(mostCurrent._edittextmevki.getText()),(Object)(_buffer)}));
 };
 }else 
{RDebugUtils.currentLine=21299251;
 //BA.debugLineNum = 21299251;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=21299252;
 //BA.debugLineNum = 21299252;BA.debugLine="ToastMessageShow(\"Denek güncelleme sayfasına yö";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Denek güncelleme sayfasına yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21299253;
 //BA.debugLineNum = 21299253;BA.debugLine="Return";
if (true) return "";
 }}
;
 }else {
RDebugUtils.currentLine=21299256;
 //BA.debugLineNum = 21299256;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("221299256",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 }}
;
RDebugUtils.currentLine=21299259;
 //BA.debugLineNum = 21299259;BA.debugLine="ToastMessageShow(\"Denek Listesine Yönlendiriliyor";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Denek Listesine Yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21299260;
 //BA.debugLineNum = 21299260;BA.debugLine="StartActivity(DenekListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._deneklistele.getObject()));
RDebugUtils.currentLine=21299261;
 //BA.debugLineNum = 21299261;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=21299263;
 //BA.debugLineNum = 21299263;BA.debugLine="End Sub";
return "";
}
public static String  _id() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "id", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "id", null));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub ID";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="sf.initialize";
_sf._initialize(processBA);
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek ORDE";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek ORDER BY denek_id DESC")));
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="If rs.RowCount>0 Then";
if (mostCurrent._rs.getRowCount()>0) { 
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="rs.Position = 0";
mostCurrent._rs.setPosition((int) (0));
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="DenekID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.Right";
mostCurrent._denekid = _sf._vvvvv7("00"+_sf._vvvvvvv4(BA.NumberToString(_sf._vvvvvvv6(_sf._vvvvv7(mostCurrent._rs.GetString("denek_id"),(long) (3)))+1)),(long) (3));
 }else {
RDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="DenekID=\"001\"";
mostCurrent._denekid = "001";
 };
RDebugUtils.currentLine=21233676;
 //BA.debugLineNum = 21233676;BA.debugLine="End Sub";
return "";
}
public static String  _insertblob() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "insertblob", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "insertblob", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Sub InsertBlob 'görünüyü veritabanına kaydeder.";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Dim outputStream As OutputStream";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="inputStream= File.OpenInput(Starter.provider.Shar";
_inputstream = anywheresoftware.b4a.keywords.Common.File.OpenInput(mostCurrent._starter._provider /*b4a.example3.fileprovider*/ ._sharedfolder /*String*/ ,_tempimagefile);
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="outputStream.InitializeToBytesArray(1000)";
_outputstream.InitializeToBytesArray((int) (1000));
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="File.Copy2(inputStream, outputStream)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_inputstream.getObject()),(java.io.OutputStream)(_outputstream.getObject()));
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="Buffer= outputStream.ToBytesArray";
_buffer = _outputstream.ToBytesArray();
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumtarihi_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumtarihi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumtarihi_click", null));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub ButtonDogumTarihi_Click";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Panel2.Visible = True";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="End Sub";
return "";
}
public static String  _buttonfotocek_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonfotocek_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonfotocek_click", null));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub ButtonFotoCek_Click";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="kayitTürü =\"FotoCek\"";
mostCurrent._kayittürü = "FotoCek";
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="TakePicture";
_takepicture();
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="End Sub";
return "";
}
public static String  _takepicture() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "takepicture", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "takepicture", null));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
Object _u = null;
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Sub TakePicture";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
_i.Initialize("android.media.action.IMAGE_CAPTURE","");
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="File.Delete(Starter.provider.SharedFolder, tempIm";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._provider /*b4a.example3.fileprovider*/ ._sharedfolder /*String*/ ,_tempimagefile);
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="Dim u As Object = Starter.provider.GetFileUri(tem";
_u = mostCurrent._starter._provider /*b4a.example3.fileprovider*/ ._getfileuri /*Object*/ (null,_tempimagefile);
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="i.PutExtra(\"output\", u) 'görüntü bu yola kaydedil";
_i.PutExtra("output",_u);
RDebugUtils.currentLine=20840455;
 //BA.debugLineNum = 20840455;BA.debugLine="Try";
try {RDebugUtils.currentLine=20840456;
 //BA.debugLineNum = 20840456;BA.debugLine="Log(\"take picture try kısmı\")";
anywheresoftware.b4a.keywords.Common.LogImpl("220840456","take picture try kısmı",0);
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="StartActivityForResult(i)";
_startactivityforresult(_i);
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=20840459;
 //BA.debugLineNum = 20840459;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Camera is not available."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840460;
 //BA.debugLineNum = 20840460;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("220840460",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=20840462;
 //BA.debugLineNum = 20840462;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarihayar_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarihayar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarihayar_click", null));}
anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog _dd = null;
int[] _yilsubathesabi = null;
int _i = 0;
String _secilen = "";
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub ButtonTarihAyar_Click";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Panel2.Visible = False";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="If secilenYil == 1950 Or secilenYil == 1951 Then";
if (_secilenyil==1950 || _secilenyil==1951) { 
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="If secilenAy == 2 Then";
if ((mostCurrent._secilenay).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="If secilenGun == 29 Or secilenGun == 30 Or seci";
if (_secilengun==29 || _secilengun==30 || _secilengun==31) { 
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="ToastMessageShow($\" Şubat ayı ${secilenYil} yı";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" Şubat ayı "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_secilenyil))+" yılında 28 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22151178;
 //BA.debugLineNum = 22151178;BA.debugLine="secilenGun = 28";
_secilengun = (int) (28);
 };
 }else 
{RDebugUtils.currentLine=22151180;
 //BA.debugLineNum = 22151180;BA.debugLine="Else if secilenAy == 4 Or secilenAy == 6 Or seci";
if ((mostCurrent._secilenay).equals(BA.NumberToString(4)) || (mostCurrent._secilenay).equals(BA.NumberToString(6)) || (mostCurrent._secilenay).equals(BA.NumberToString(9)) || (mostCurrent._secilenay).equals(BA.NumberToString(11))) { 
RDebugUtils.currentLine=22151181;
 //BA.debugLineNum = 22151181;BA.debugLine="If secilenGun == 31 Then";
if (_secilengun==31) { 
RDebugUtils.currentLine=22151182;
 //BA.debugLineNum = 22151182;BA.debugLine="ToastMessageShow($\"${secilenYil} yılında ${sec";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_secilenyil))+" yılında "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._secilenay))+". ay 30 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22151183;
 //BA.debugLineNum = 22151183;BA.debugLine="secilenGun = 30";
_secilengun = (int) (30);
 };
 }}
;
 };
RDebugUtils.currentLine=22151189;
 //BA.debugLineNum = 22151189;BA.debugLine="Dim yilSubatHesabi() As Int = Array As Int(1952,1";
_yilsubathesabi = new int[]{(int) (1952),(int) (1953),(int) (1954),(int) (1955),(int) (1956),(int) (1957),(int) (1958),(int) (1959),(int) (1960),(int) (1961),(int) (1962),(int) (1963),(int) (1964),(int) (1965),(int) (1966),(int) (1967),(int) (1968),(int) (1969),(int) (1970),(int) (1971),(int) (1972),(int) (1973),(int) (1974),(int) (1975),(int) (1976),(int) (1977),(int) (1978),(int) (1979),(int) (1980),(int) (1981),(int) (1982),(int) (1983),(int) (1984),(int) (1985),(int) (1986),(int) (1987),(int) (1988),(int) (1989),(int) (1990),(int) (1991),(int) (1992),(int) (1993),(int) (1994),(int) (1995),(int) (1996),(int) (1997),(int) (1998),(int) (1999),(int) (2000),(int) (2001),(int) (2002),(int) (2003),(int) (2004),(int) (2005),(int) (2006),(int) (2007),(int) (2008),(int) (2009),(int) (2010),(int) (2011),(int) (2012),(int) (2013),(int) (2014),(int) (2015),(int) (2016),(int) (2017),(int) (2018),(int) (2019),(int) (2020),(int) (2021),(int) (2022),(int) (2023),(int) (2024),(int) (2025),(int) (2026),(int) (2027),(int) (2028),(int) (2029)};
RDebugUtils.currentLine=22151190;
 //BA.debugLineNum = 22151190;BA.debugLine="For i=0 To yilSubatHesabi.Length-1";
{
final int step17 = 1;
final int limit17 = (int) (_yilsubathesabi.length-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=22151191;
 //BA.debugLineNum = 22151191;BA.debugLine="If secilenYil == yilSubatHesabi(i) Then";
if (_secilenyil==_yilsubathesabi[_i]) { 
RDebugUtils.currentLine=22151192;
 //BA.debugLineNum = 22151192;BA.debugLine="If secilenAy == 2 Then";
if ((mostCurrent._secilenay).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=22151193;
 //BA.debugLineNum = 22151193;BA.debugLine="If i Mod 4 == 0 Then";
if (_i%4==0) { 
RDebugUtils.currentLine=22151194;
 //BA.debugLineNum = 22151194;BA.debugLine="If secilenGun == 30 Or secilenGun == 31 Then";
if (_secilengun==30 || _secilengun==31) { 
RDebugUtils.currentLine=22151195;
 //BA.debugLineNum = 22151195;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" Şubat ayı "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yilsubathesabi[_i]))+" yılında 29 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22151196;
 //BA.debugLineNum = 22151196;BA.debugLine="secilenGun = 29";
_secilengun = (int) (29);
 };
 }else {
RDebugUtils.currentLine=22151199;
 //BA.debugLineNum = 22151199;BA.debugLine="If secilenGun == 29 Or secilenGun == 30 Or se";
if (_secilengun==29 || _secilengun==30 || _secilengun==31) { 
RDebugUtils.currentLine=22151200;
 //BA.debugLineNum = 22151200;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" Şubat ayı "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yilsubathesabi[_i]))+" yılında 28 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22151201;
 //BA.debugLineNum = 22151201;BA.debugLine="secilenGun = 28";
_secilengun = (int) (28);
 };
 };
 }else 
{RDebugUtils.currentLine=22151204;
 //BA.debugLineNum = 22151204;BA.debugLine="Else if secilenAy == 4 Or secilenAy == 6 Or sec";
if ((mostCurrent._secilenay).equals(BA.NumberToString(4)) || (mostCurrent._secilenay).equals(BA.NumberToString(6)) || (mostCurrent._secilenay).equals(BA.NumberToString(9)) || (mostCurrent._secilenay).equals(BA.NumberToString(11))) { 
RDebugUtils.currentLine=22151205;
 //BA.debugLineNum = 22151205;BA.debugLine="If secilenGun == 31 Then";
if (_secilengun==31) { 
RDebugUtils.currentLine=22151206;
 //BA.debugLineNum = 22151206;BA.debugLine="ToastMessageShow($\" ${yilSubatHesabi(i)} yılı";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yilsubathesabi[_i]))+" yılında "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._secilenay))+". ay 30 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22151207;
 //BA.debugLineNum = 22151207;BA.debugLine="secilenGun = 30";
_secilengun = (int) (30);
 };
 }}
;
 };
 }
};
RDebugUtils.currentLine=22151213;
 //BA.debugLineNum = 22151213;BA.debugLine="Dim secilen As String = $\"${secilenAy}/${secilenG";
_secilen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._secilenay))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_secilengun))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_secilenyil))+"");
RDebugUtils.currentLine=22151214;
 //BA.debugLineNum = 22151214;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.DateParse(sec";
_dd.setYear(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_secilen)));
RDebugUtils.currentLine=22151215;
 //BA.debugLineNum = 22151215;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.DateParse(s";
_dd.setMonth(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_secilen)));
RDebugUtils.currentLine=22151216;
 //BA.debugLineNum = 22151216;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.D";
_dd.setDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_secilen)));
RDebugUtils.currentLine=22151218;
 //BA.debugLineNum = 22151218;BA.debugLine="Dim result As Int = Dd.Show(\"Tarih seçiniz\", \"SPO";
_result = _dd.Show("Tarih seçiniz","SPORT EXPERT TARİH SEÇİM PANELİ","Evet","İptal","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=22151219;
 //BA.debugLineNum = 22151219;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=22151220;
 //BA.debugLineNum = 22151220;BA.debugLine="secilenDogumTarihi = Dd.DayOfMonth & \"/\" & Dd.Mo";
mostCurrent._secilendogumtarihi = BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())+"/"+BA.NumberToString(_dd.getYear());
RDebugUtils.currentLine=22151221;
 //BA.debugLineNum = 22151221;BA.debugLine="ButtonDogumTarihi.Text = secilenDogumTarihi";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence(mostCurrent._secilendogumtarihi));
 }else 
{RDebugUtils.currentLine=22151222;
 //BA.debugLineNum = 22151222;BA.debugLine="Else If result = DialogResponse.CANCEL Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
RDebugUtils.currentLine=22151223;
 //BA.debugLineNum = 22151223;BA.debugLine="ButtonDogumTarihi.Text = \"\"";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=22151224;
 //BA.debugLineNum = 22151224;BA.debugLine="ToastMessageShow(\"Seçim yapılmadı\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Seçim yapılmadı"),anywheresoftware.b4a.keywords.Common.True);
 }}
;
RDebugUtils.currentLine=22151226;
 //BA.debugLineNum = 22151226;BA.debugLine="End Sub";
return "";
}
public static String  _buttonyukle_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonyukle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonyukle_click", null));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub ButtonYukle_Click";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="kayitTürü = \"ResimSec\"";
mostCurrent._kayittürü = "ResimSec";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
_imagechooser.Initialize("imgChooser");
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="ImageChooser.Show(\"image/*\",\"Choose Image\")";
_imagechooser.Show(processBA,"image/*","Choose Image");
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="End Sub";
return "";
}
public static String  _checkboxengeldurumu_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkboxengeldurumu_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkboxengeldurumu_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub checkBoxEngelDurumu_CheckedChange(Checked As B";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="If CheckBoxEngelDurumu.Checked Then";
if (mostCurrent._checkboxengeldurumu.getChecked()) { 
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="EditTextEngelDurumu.Visible = True";
mostCurrent._edittextengeldurumu.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="EditTextEngelDurumu.Visible = False";
mostCurrent._edittextengeldurumu.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="End Sub";
return "";
}
public static Object  _getba() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getba", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _cls = "";
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub GetBA As Object";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Log(\"GetBA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("221037057","GetBA",0);
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Dim cls As String = Me";
_cls = BA.ObjectToString(denekekleguncelle.getObject());
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="cls = cls.SubString(\"class \".Length)";
_cls = _cls.substring("class ".length());
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="jo.InitializeStatic(cls)";
_jo.InitializeStatic(_cls);
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="End Sub";
return null;
}
public static String  _imageview1_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imageview1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imageview1_click", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub ImageView1_Click";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="result = Msgbox2(\"Fotoğraf Yükleyin veya çekin\",";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Fotoğraf Yükleyin veya çekin"),BA.ObjectToCharSequence("Fotoğraf"),"Fotoğraf Çek","","Fotoğraf Yükle",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="ButtonFotoCek_Click";
_buttonfotocek_click();
 }else 
{RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="Else if result = DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="ButtonYukle_Click";
_buttonyukle_click();
 }}
;
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="End Sub";
return "";
}
public static String  _imgchooser_result(boolean _success,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgchooser_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgchooser_result", new Object[] {_success,_dir,_filename}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub imgChooser_Result(Success As Boolean, Dir As S";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Log(\"img_Chooser_Result Succcess \")";
anywheresoftware.b4a.keywords.Common.LogImpl("221692418","img_Chooser_Result Succcess ",0);
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="bmp.Initialize(Dir,FileName)";
_bmp.Initialize(_dir,_filename);
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="lastPicture = bmp";
_lastpicture = _bmp;
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="ImageView1.Bitmap = lastPicture";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(_lastpicture.getObject()));
RDebugUtils.currentLine=21692425;
 //BA.debugLineNum = 21692425;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=21692426;
 //BA.debugLineNum = 21692426;BA.debugLine="inputStream = File.OpenInput(Dir,FileName)";
_inputstream = anywheresoftware.b4a.keywords.Common.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="Dim outputStream As OutputStream";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="outputStream.InitializeToBytesArray(1000)";
_outputstream.InitializeToBytesArray((int) (1000));
RDebugUtils.currentLine=21692429;
 //BA.debugLineNum = 21692429;BA.debugLine="File.Copy2(inputStream,outputStream)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_inputstream.getObject()),(java.io.OutputStream)(_outputstream.getObject()));
RDebugUtils.currentLine=21692430;
 //BA.debugLineNum = 21692430;BA.debugLine="Buffer = outputStream.ToBytesArray";
_buffer = _outputstream.ToBytesArray();
 }else {
RDebugUtils.currentLine=21692433;
 //BA.debugLineNum = 21692433;BA.debugLine="ToastMessageShow(\"Resim Seçilmedi\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Resim Seçilmedi"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=21692435;
 //BA.debugLineNum = 21692435;BA.debugLine="End Sub";
return "";
}
public static Object  _ion_event(String _methodname,Object[] _args) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ion_event", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "ion_event", new Object[] {_methodname,_args}));}
anywheresoftware.b4a.objects.IntentWrapper _in = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub ion_Event (MethodName As String, Args() As Obj";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="If Args(0) = -1 Then";
if ((_args[(int) (0)]).equals((Object)(-1))) { 
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Log(\"ion_Event args(0) = -1 if bloğu \")";
anywheresoftware.b4a.keywords.Common.LogImpl("220905986","ion_Event args(0) = -1 if bloğu ",0);
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="Try";
try {RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="Dim in As Intent = Args(1)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in.setObject((android.content.Intent)(_args[(int) (1)]));
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="If File.Exists(Starter.provider.SharedFolder, t";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._provider /*b4a.example3.fileprovider*/ ._sharedfolder /*String*/ ,_tempimagefile)) { 
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="Log(\"ion_event File.Exists(Starter.provider.Sh";
anywheresoftware.b4a.keywords.Common.LogImpl("220905990","ion_event File.Exists(Starter.provider.SharedFolder, tempImageFile)",0);
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="lastPicture = LoadBitmapSample(Starter.provide";
_lastpicture = anywheresoftware.b4a.keywords.Common.LoadBitmapSample(mostCurrent._starter._provider /*b4a.example3.fileprovider*/ ._sharedfolder /*String*/ ,_tempimagefile,mostCurrent._imageview1.getWidth(),mostCurrent._imageview1.getHeight());
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="ImageView1.Bitmap = lastPicture";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(_lastpicture.getObject()));
 }else 
{RDebugUtils.currentLine=20905993;
 //BA.debugLineNum = 20905993;BA.debugLine="Else If in.HasExtra(\"data\") Then 'bunun yerine";
if (_in.HasExtra("data")) { 
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="Log(\"in.HasExtra(data)\")";
anywheresoftware.b4a.keywords.Common.LogImpl("220905994","in.HasExtra(data)",0);
RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="Dim jo As JavaObject = in";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_in.getObject()));
RDebugUtils.currentLine=20905996;
 //BA.debugLineNum = 20905996;BA.debugLine="lastPicture = jo.RunMethodJO(\"getExtras\", Null";
_lastpicture.setObject((android.graphics.Bitmap)(_jo.RunMethodJO("getExtras",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("get",new Object[]{(Object)("data")})));
 }}
;
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=20905999;
 //BA.debugLineNum = 20905999;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("220905999",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 };
RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="If lastPicture.IsInitialized Then";
if (_lastpicture.IsInitialized()) { 
RDebugUtils.currentLine=20906003;
 //BA.debugLineNum = 20906003;BA.debugLine="ImageView1.Bitmap = lastPicture";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(_lastpicture.getObject()));
RDebugUtils.currentLine=20906004;
 //BA.debugLineNum = 20906004;BA.debugLine="Log(\"ion_event lastPicture.IsInitialized if bloğ";
anywheresoftware.b4a.keywords.Common.LogImpl("220906004","ion_event lastPicture.IsInitialized if bloğu ",0);
 };
RDebugUtils.currentLine=20906006;
 //BA.debugLineNum = 20906006;BA.debugLine="Return Null";
if (true) return anywheresoftware.b4a.keywords.Common.Null;
RDebugUtils.currentLine=20906007;
 //BA.debugLineNum = 20906007;BA.debugLine="End Sub";
return null;
}
public static String  _panel1_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panel1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panel1_click", null));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub Panel1_Click";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="ImageView1_Click";
_imageview1_click();
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="End Sub";
return "";
}
public static String  _panelfotocek_click() throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelfotocek_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelfotocek_click", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub PanelFotoCek_Click";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="ImageView1_Click";
_imageview1_click();
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="End Sub";
return "";
}
public static String  _spinnerdogumyeri_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnerdogumyeri_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnerdogumyeri_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub spinnerDogumYeri_ItemClick (Position As Int, V";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Try";
try {RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="secilenDogumYeri= Value";
mostCurrent._secilendogumyeri = BA.ObjectToString(_value);
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("221430276",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="End Sub";
return "";
}
public static String  _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper _ii) throws Exception{
RDebugUtils.currentModule="denekekleguncelle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startactivityforresult", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startactivityforresult", new Object[] {_ii}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub StartActivityForResult(ii As Intent)";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Log(\"StartActivityForResult\")";
anywheresoftware.b4a.keywords.Common.LogImpl("220971521","StartActivityForResult",0);
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_getba()));
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
_ion = _jo.CreateEvent(processBA,"anywheresoftware.b4a.IOnActivityResult","ion",anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{_ion,(Object)(_ii.getObject())});
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="End Sub";
return "";
}
}