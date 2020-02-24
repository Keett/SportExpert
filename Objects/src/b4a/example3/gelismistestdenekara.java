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

public class gelismistestdenekara extends Activity implements B4AActivity{
	public static gelismistestdenekara mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.gelismistestdenekara");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (gelismistestdenekara).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.gelismistestdenekara");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.gelismistestdenekara", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (gelismistestdenekara) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (gelismistestdenekara) Resume **");
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
		return gelismistestdenekara.class;
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
        BA.LogInfo("** Activity (gelismistestdenekara) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            gelismistestdenekara mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (gelismistestdenekara) Resume **");
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
public static anywheresoftware.b4a.objects.collections.List _checkedidlist = null;
public static anywheresoftware.b4a.objects.collections.List _checkedtclist = null;
public static anywheresoftware.b4a.objects.collections.List _checkedisimlist = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkimlikno = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelisim = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcinsiyet = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldogumtarihi = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldogumyeri = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelbabaadi = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelengel = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextengeldurumu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextbabaadi = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerdogumyeri = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumtarihi = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnercinsiyet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextisim = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkimlikno = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltakimokul = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelbranssinif = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmevki = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexttakimokul = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextbranssinif = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextmevki = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonok = null;
public b4a.example3.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelid = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldenekisim = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldenektc = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkboxsecim = null;
public static int _id = 0;
public static String _isim = "";
public static String _tc = "";
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelgun = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelay = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelyil = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarihayar = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnergun = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinneray = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinneryil = null;
public static String _aracinsiyet = "";
public static String _aradogumyeri = "";
public static String _aradogumtarihi = "";
public static String _araay = "";
public static int _aragun = 0;
public static int _arayil = 0;
public static String _aratc = "";
public static String _araisim = "";
public static String _arababaadi = "";
public static String _araengeldurumu = "";
public static String _aratakimokul = "";
public static String _arabranssinif = "";
public static String _aramevki = "";
public anywheresoftware.b4a.objects.collections.List _silinenliste = null;
public anywheresoftware.b4a.objects.collections.List _list = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi7 = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
public b4a.example3.antranorgorussil _antranorgorussil = null;
public b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
public b4a.example3.dayanikliliktestlistele _dayanikliliktestlistele = null;
public b4a.example3.dayanikliliktestsil _dayanikliliktestsil = null;
public b4a.example3.dayanikliliktestekle _dayanikliliktestekle = null;
public b4a.example3.programayar _programayar = null;
public b4a.example3.surattestlistele _surattestlistele = null;
public b4a.example3.deneklistele _deneklistele = null;
public b4a.example3.dbutils _dbutils = null;
public b4a.example3.antranorgorusekle _antranorgorusekle = null;
public b4a.example3.programveri _programveri = null;
public b4a.example3.testdenekara _testdenekara = null;
public b4a.example3.denekekleguncelle _denekekleguncelle = null;
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
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Activity.LoadLayout(\"GelismisTestDenekAraPage\")";
mostCurrent._activity.LoadLayout("GelismisTestDenekAraPage",mostCurrent.activityBA);
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="ScrollView1.Panel.LoadLayout(\"GelismisTestDenekAr";
mostCurrent._scrollview1.getPanel().LoadLayout("GelismisTestDenekAraScrollVeriPage",mostCurrent.activityBA);
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="ScrollView1.Panel.Width = 2000dip";
mostCurrent._scrollview1.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2000)));
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="ScrollView1.Panel.Height = 1000dip";
mostCurrent._scrollview1.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1000)));
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Panel2.Visible= False";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="KisimGoster";
_kisimgoster();
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="LabelCarpi1.Visible = False";
mostCurrent._labelcarpi1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="LabelCarpi2.Visible = False";
mostCurrent._labelcarpi2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="LabelCarpi3.Visible = False";
mostCurrent._labelcarpi3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="LabelCarpi4.Visible = False";
mostCurrent._labelcarpi4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="LabelCarpi5.Visible = False";
mostCurrent._labelcarpi5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="LabelCarpi6.Visible = False";
mostCurrent._labelcarpi6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="LabelCarpi7.Visible = False";
mostCurrent._labelcarpi7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="SpinnerCinsiyet.DropdownBackgroundColor= Colors.W";
mostCurrent._spinnercinsiyet.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="SpinnerCinsiyet.DropdownTextColor= Color.koyuMavi";
mostCurrent._spinnercinsiyet.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="SpinnerCinsiyet.TextColor= Colors.White";
mostCurrent._spinnercinsiyet.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784151;
 //BA.debugLineNum = 4784151;BA.debugLine="SpinnerCinsiyet.TextSize = 20";
mostCurrent._spinnercinsiyet.setTextSize((float) (20));
RDebugUtils.currentLine=4784153;
 //BA.debugLineNum = 4784153;BA.debugLine="SpinnerDogumYeri.DropdownBackgroundColor= Colors.";
mostCurrent._spinnerdogumyeri.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784154;
 //BA.debugLineNum = 4784154;BA.debugLine="SpinnerDogumYeri.DropdownTextColor= Color.koyuMav";
mostCurrent._spinnerdogumyeri.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784155;
 //BA.debugLineNum = 4784155;BA.debugLine="SpinnerDogumYeri.TextColor= Colors.White";
mostCurrent._spinnerdogumyeri.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784156;
 //BA.debugLineNum = 4784156;BA.debugLine="SpinnerDogumYeri.TextSize = 20";
mostCurrent._spinnerdogumyeri.setTextSize((float) (20));
RDebugUtils.currentLine=4784158;
 //BA.debugLineNum = 4784158;BA.debugLine="EditTextKimlikNo.HintColor = Color.hintColor";
mostCurrent._edittextkimlikno.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=4784159;
 //BA.debugLineNum = 4784159;BA.debugLine="EditTextKimlikNo.Hint = \"TCKN'i eksiksiz giriniz.";
mostCurrent._edittextkimlikno.setHint("TCKN'i eksiksiz giriniz..");
RDebugUtils.currentLine=4784160;
 //BA.debugLineNum = 4784160;BA.debugLine="EditTextKimlikNo.TextSize = 20";
mostCurrent._edittextkimlikno.setTextSize((float) (20));
RDebugUtils.currentLine=4784161;
 //BA.debugLineNum = 4784161;BA.debugLine="EditTextKimlikNo.TextColor = Colors.White";
mostCurrent._edittextkimlikno.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784162;
 //BA.debugLineNum = 4784162;BA.debugLine="EditTextKimlikNo.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkimlikno.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784163;
 //BA.debugLineNum = 4784163;BA.debugLine="EditTextKimlikNo.SingleLine = True";
mostCurrent._edittextkimlikno.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4784165;
 //BA.debugLineNum = 4784165;BA.debugLine="EditTextIsim.HintColor = Color.hintColor";
mostCurrent._edittextisim.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=4784166;
 //BA.debugLineNum = 4784166;BA.debugLine="EditTextIsim.Hint = \"Denek ismini giriniz..\"";
mostCurrent._edittextisim.setHint("Denek ismini giriniz..");
RDebugUtils.currentLine=4784167;
 //BA.debugLineNum = 4784167;BA.debugLine="EditTextIsim.TextSize = 20";
mostCurrent._edittextisim.setTextSize((float) (20));
RDebugUtils.currentLine=4784168;
 //BA.debugLineNum = 4784168;BA.debugLine="EditTextIsim.TextColor = Colors.White";
mostCurrent._edittextisim.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784169;
 //BA.debugLineNum = 4784169;BA.debugLine="EditTextIsim.Typeface = Typeface.DEFAULT";
mostCurrent._edittextisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784171;
 //BA.debugLineNum = 4784171;BA.debugLine="EditTextBabaAdi.HintColor = Color.hintColor";
mostCurrent._edittextbabaadi.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=4784172;
 //BA.debugLineNum = 4784172;BA.debugLine="EditTextBabaAdi.Hint = \"Denek baba adını giriniz.";
mostCurrent._edittextbabaadi.setHint("Denek baba adını giriniz..");
RDebugUtils.currentLine=4784173;
 //BA.debugLineNum = 4784173;BA.debugLine="EditTextBabaAdi.TextSize = 20";
mostCurrent._edittextbabaadi.setTextSize((float) (20));
RDebugUtils.currentLine=4784174;
 //BA.debugLineNum = 4784174;BA.debugLine="EditTextBabaAdi.TextColor = Colors.White";
mostCurrent._edittextbabaadi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784175;
 //BA.debugLineNum = 4784175;BA.debugLine="EditTextBabaAdi.Typeface = Typeface.DEFAULT";
mostCurrent._edittextbabaadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784177;
 //BA.debugLineNum = 4784177;BA.debugLine="EditTextEngelDurumu.HintColor = Color.hintColor";
mostCurrent._edittextengeldurumu.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=4784178;
 //BA.debugLineNum = 4784178;BA.debugLine="EditTextEngelDurumu.Hint = \"Engel durumu varsa lü";
mostCurrent._edittextengeldurumu.setHint("Engel durumu varsa lütfen doldurunuz..");
RDebugUtils.currentLine=4784179;
 //BA.debugLineNum = 4784179;BA.debugLine="EditTextEngelDurumu.TextSize = 20";
mostCurrent._edittextengeldurumu.setTextSize((float) (20));
RDebugUtils.currentLine=4784180;
 //BA.debugLineNum = 4784180;BA.debugLine="EditTextEngelDurumu.TextColor = Colors.White";
mostCurrent._edittextengeldurumu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784181;
 //BA.debugLineNum = 4784181;BA.debugLine="EditTextEngelDurumu.Typeface = Typeface.DEFAULT";
mostCurrent._edittextengeldurumu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784183;
 //BA.debugLineNum = 4784183;BA.debugLine="EditTextTakimOkul.HintColor = Color.hintColor";
mostCurrent._edittexttakimokul.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=4784184;
 //BA.debugLineNum = 4784184;BA.debugLine="EditTextTakimOkul.Hint = \"Bağlı olduğu Takım/Okul";
mostCurrent._edittexttakimokul.setHint("Bağlı olduğu Takım/Okul değerini giriniz...");
RDebugUtils.currentLine=4784185;
 //BA.debugLineNum = 4784185;BA.debugLine="EditTextTakimOkul.TextSize = 20";
mostCurrent._edittexttakimokul.setTextSize((float) (20));
RDebugUtils.currentLine=4784186;
 //BA.debugLineNum = 4784186;BA.debugLine="EditTextTakimOkul.TextColor = Colors.White";
mostCurrent._edittexttakimokul.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784187;
 //BA.debugLineNum = 4784187;BA.debugLine="EditTextTakimOkul.Typeface = Typeface.DEFAULT";
mostCurrent._edittexttakimokul.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784189;
 //BA.debugLineNum = 4784189;BA.debugLine="EditTextBransSinif.HintColor = Color.hintColor";
mostCurrent._edittextbranssinif.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=4784190;
 //BA.debugLineNum = 4784190;BA.debugLine="EditTextBransSinif.Hint = \"Bağlı olduğu Branş/Sın";
mostCurrent._edittextbranssinif.setHint("Bağlı olduğu Branş/Sınıf değerini giriniz...");
RDebugUtils.currentLine=4784191;
 //BA.debugLineNum = 4784191;BA.debugLine="EditTextBransSinif.TextSize = 20";
mostCurrent._edittextbranssinif.setTextSize((float) (20));
RDebugUtils.currentLine=4784192;
 //BA.debugLineNum = 4784192;BA.debugLine="EditTextBransSinif.TextColor = Colors.White";
mostCurrent._edittextbranssinif.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784193;
 //BA.debugLineNum = 4784193;BA.debugLine="EditTextBransSinif.Typeface = Typeface.DEFAULT";
mostCurrent._edittextbranssinif.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784195;
 //BA.debugLineNum = 4784195;BA.debugLine="EditTextMevki.HintColor = Color.hintColor";
mostCurrent._edittextmevki.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=4784196;
 //BA.debugLineNum = 4784196;BA.debugLine="EditTextMevki.Hint = \"Bulunduğu mevki değerini gi";
mostCurrent._edittextmevki.setHint("Bulunduğu mevki değerini giriniz...");
RDebugUtils.currentLine=4784197;
 //BA.debugLineNum = 4784197;BA.debugLine="EditTextMevki.TextSize = 20";
mostCurrent._edittextmevki.setTextSize((float) (20));
RDebugUtils.currentLine=4784198;
 //BA.debugLineNum = 4784198;BA.debugLine="EditTextMevki.TextColor = Colors.White";
mostCurrent._edittextmevki.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784199;
 //BA.debugLineNum = 4784199;BA.debugLine="EditTextMevki.Typeface = Typeface.DEFAULT";
mostCurrent._edittextmevki.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784201;
 //BA.debugLineNum = 4784201;BA.debugLine="ButtonDogumTarihi.Text = \"Doğum Tarihi\"";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence("Doğum Tarihi"));
RDebugUtils.currentLine=4784202;
 //BA.debugLineNum = 4784202;BA.debugLine="ButtonDogumTarihi.TextColor = Colors.White";
mostCurrent._buttondogumtarihi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784203;
 //BA.debugLineNum = 4784203;BA.debugLine="ButtonDogumTarihi.TextSize = 20";
mostCurrent._buttondogumtarihi.setTextSize((float) (20));
RDebugUtils.currentLine=4784204;
 //BA.debugLineNum = 4784204;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT";
mostCurrent._buttondogumtarihi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784205;
 //BA.debugLineNum = 4784205;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
mostCurrent._buttondogumtarihi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4784207;
 //BA.debugLineNum = 4784207;BA.debugLine="SpinnerGun.DropdownBackgroundColor = Color.acikMa";
mostCurrent._spinnergun.setDropdownBackgroundColor(mostCurrent._color._acikmavi /*int*/ );
RDebugUtils.currentLine=4784208;
 //BA.debugLineNum = 4784208;BA.debugLine="SpinnerGun.DropdownTextColor = Colors.White";
mostCurrent._spinnergun.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784209;
 //BA.debugLineNum = 4784209;BA.debugLine="SpinnerGun.TextColor = Color.koyuMavi";
mostCurrent._spinnergun.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784210;
 //BA.debugLineNum = 4784210;BA.debugLine="SpinnerGun.TextSize = 20";
mostCurrent._spinnergun.setTextSize((float) (20));
RDebugUtils.currentLine=4784212;
 //BA.debugLineNum = 4784212;BA.debugLine="SpinnerAy.DropdownBackgroundColor = Color.acikMav";
mostCurrent._spinneray.setDropdownBackgroundColor(mostCurrent._color._acikmavi /*int*/ );
RDebugUtils.currentLine=4784213;
 //BA.debugLineNum = 4784213;BA.debugLine="SpinnerAy.DropdownTextColor = Colors.White";
mostCurrent._spinneray.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784214;
 //BA.debugLineNum = 4784214;BA.debugLine="SpinnerAy.TextColor = Color.koyuMavi";
mostCurrent._spinneray.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784215;
 //BA.debugLineNum = 4784215;BA.debugLine="SpinnerAy.TextSize = 20";
mostCurrent._spinneray.setTextSize((float) (20));
RDebugUtils.currentLine=4784217;
 //BA.debugLineNum = 4784217;BA.debugLine="SpinnerYil.DropdownBackgroundColor = Color.acikMa";
mostCurrent._spinneryil.setDropdownBackgroundColor(mostCurrent._color._acikmavi /*int*/ );
RDebugUtils.currentLine=4784218;
 //BA.debugLineNum = 4784218;BA.debugLine="SpinnerYil.DropdownTextColor = Colors.White";
mostCurrent._spinneryil.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4784219;
 //BA.debugLineNum = 4784219;BA.debugLine="SpinnerYil.TextColor = Color.koyuMavi";
mostCurrent._spinneryil.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784220;
 //BA.debugLineNum = 4784220;BA.debugLine="SpinnerYil.TextSize = 20";
mostCurrent._spinneryil.setTextSize((float) (20));
RDebugUtils.currentLine=4784222;
 //BA.debugLineNum = 4784222;BA.debugLine="LabelGun.TextColor = Color.koyuMavi";
mostCurrent._labelgun.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784223;
 //BA.debugLineNum = 4784223;BA.debugLine="LabelGun.TextSize = 20";
mostCurrent._labelgun.setTextSize((float) (20));
RDebugUtils.currentLine=4784224;
 //BA.debugLineNum = 4784224;BA.debugLine="LabelGun.Typeface = Typeface.DEFAULT";
mostCurrent._labelgun.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784226;
 //BA.debugLineNum = 4784226;BA.debugLine="LabelAy.TextColor = Color.koyuMavi";
mostCurrent._labelay.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784227;
 //BA.debugLineNum = 4784227;BA.debugLine="LabelAy.TextSize = 20";
mostCurrent._labelay.setTextSize((float) (20));
RDebugUtils.currentLine=4784228;
 //BA.debugLineNum = 4784228;BA.debugLine="LabelAy.Typeface = Typeface.DEFAULT";
mostCurrent._labelay.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784230;
 //BA.debugLineNum = 4784230;BA.debugLine="LabelYil.TextColor = Color.koyuMavi";
mostCurrent._labelyil.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=4784231;
 //BA.debugLineNum = 4784231;BA.debugLine="LabelYil.TextSize = 20";
mostCurrent._labelyil.setTextSize((float) (20));
RDebugUtils.currentLine=4784232;
 //BA.debugLineNum = 4784232;BA.debugLine="LabelYil.Typeface = Typeface.DEFAULT";
mostCurrent._labelyil.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=4784236;
 //BA.debugLineNum = 4784236;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT cinsiyet";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT cinsiyet_adi FROM Cinsiyet",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnercinsiyet);
RDebugUtils.currentLine=4784237;
 //BA.debugLineNum = 4784237;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerCinsiyet.GetIt";
_spinnercinsiyet_itemclick((int) (0),(Object)(mostCurrent._spinnercinsiyet.GetItem((int) (0))));
RDebugUtils.currentLine=4784238;
 //BA.debugLineNum = 4784238;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT il_adi F";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT il_adi FROM Iller",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnerdogumyeri);
RDebugUtils.currentLine=4784239;
 //BA.debugLineNum = 4784239;BA.debugLine="spinnerCinsiyet_ItemClick(0,SpinnerDogumYeri.GetI";
_spinnercinsiyet_itemclick((int) (0),(Object)(mostCurrent._spinnerdogumyeri.GetItem((int) (0))));
RDebugUtils.currentLine=4784240;
 //BA.debugLineNum = 4784240;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql ,\"SELECT gun FROM";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT gun FROM Gun",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinnergun);
RDebugUtils.currentLine=4784241;
 //BA.debugLineNum = 4784241;BA.debugLine="SpinnerGun_ItemClick(0,SpinnerGun.GetItem(0))";
_spinnergun_itemclick((int) (0),(Object)(mostCurrent._spinnergun.GetItem((int) (0))));
RDebugUtils.currentLine=4784242;
 //BA.debugLineNum = 4784242;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT ay FROM";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT ay FROM Ay",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinneray);
RDebugUtils.currentLine=4784243;
 //BA.debugLineNum = 4784243;BA.debugLine="SpinnerAy_ItemClick(0,SpinnerAy.GetItem(0))";
_spinneray_itemclick((int) (0),(Object)(mostCurrent._spinneray.GetItem((int) (0))));
RDebugUtils.currentLine=4784244;
 //BA.debugLineNum = 4784244;BA.debugLine="DBUtils.ExecuteSpinner(Main.sql, \"SELECT yil FROM";
mostCurrent._dbutils._executespinner /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT yil FROM Yil",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),mostCurrent._spinneryil);
RDebugUtils.currentLine=4784245;
 //BA.debugLineNum = 4784245;BA.debugLine="SpinnerYil_ItemClick(0,SpinnerYil.GetItem(0))";
_spinneryil_itemclick((int) (0),(Object)(mostCurrent._spinneryil.GetItem((int) (0))));
RDebugUtils.currentLine=4784247;
 //BA.debugLineNum = 4784247;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=4784248;
 //BA.debugLineNum = 4784248;BA.debugLine="list.Initialize";
mostCurrent._list.Initialize();
RDebugUtils.currentLine=4784249;
 //BA.debugLineNum = 4784249;BA.debugLine="End Sub";
return "";
}
public static String  _kisimgoster() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kisimgoster", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "kisimgoster", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub KisimGoster";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="LabelDogumYeri.Visible = True";
mostCurrent._labeldogumyeri.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="LabelDogumYeri.Enabled = True";
mostCurrent._labeldogumyeri.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="LabelBabaAdi.Visible = True";
mostCurrent._labelbabaadi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="LabelBabaAdi.Enabled = True";
mostCurrent._labelbabaadi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="LabelEngel.Visible = True";
mostCurrent._labelengel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="LabelEngel.Enabled = True";
mostCurrent._labelengel.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="SpinnerDogumYeri.Visible = True";
mostCurrent._spinnerdogumyeri.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="SpinnerDogumYeri.Enabled = True";
mostCurrent._spinnerdogumyeri.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="EditTextBabaAdi.Visible = True";
mostCurrent._edittextbabaadi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="EditTextBabaAdi.Enabled = True";
mostCurrent._edittextbabaadi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="EditTextEngelDurumu.Visible = True";
mostCurrent._edittextengeldurumu.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="EditTextEngelDurumu.Enabled = True";
mostCurrent._edittextengeldurumu.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="End Sub";
return "";
}
public static String  _spinnercinsiyet_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnercinsiyet_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnercinsiyet_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub spinnerCinsiyet_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Try";
try {RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="araCinsiyet= Value";
mostCurrent._aracinsiyet = BA.ObjectToString(_value);
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Ara";
_ara();
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("26094853",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="End Sub";
return "";
}
public static String  _spinnergun_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnergun_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnergun_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub SpinnerGun_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Try";
try {RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="araGun = Value";
_aragun = (int)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="araGun = 28";
_aragun = (int) (28);
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("26225925",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="End Sub";
return "";
}
public static String  _spinneray_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinneray_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinneray_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub SpinnerAy_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Try";
try {RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="If Value == \"Ocak\" Then";
if ((_value).equals((Object)("Ocak"))) { 
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="araAy = 1";
mostCurrent._araay = BA.NumberToString(1);
 }else 
{RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Else if Value == \"Şubat\" Then";
if ((_value).equals((Object)("Şubat"))) { 
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="araAy = 2";
mostCurrent._araay = BA.NumberToString(2);
 }else 
{RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="Else if Value == \"Mart\" Then";
if ((_value).equals((Object)("Mart"))) { 
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="araAy = 3";
mostCurrent._araay = BA.NumberToString(3);
 }else 
{RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="Else if Value == \"Nisan\" Then";
if ((_value).equals((Object)("Nisan"))) { 
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="araAy = 4";
mostCurrent._araay = BA.NumberToString(4);
 }else 
{RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="Else if Value == \"Mayıs\" Then";
if ((_value).equals((Object)("Mayıs"))) { 
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="araAy = 5";
mostCurrent._araay = BA.NumberToString(5);
 }else 
{RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="Else if Value == \"Haziran\" Then";
if ((_value).equals((Object)("Haziran"))) { 
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="araAy = 6";
mostCurrent._araay = BA.NumberToString(6);
 }else 
{RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="Else if Value == \"Temmuz\" Then";
if ((_value).equals((Object)("Temmuz"))) { 
RDebugUtils.currentLine=6291471;
 //BA.debugLineNum = 6291471;BA.debugLine="araAy = 7";
mostCurrent._araay = BA.NumberToString(7);
 }else 
{RDebugUtils.currentLine=6291472;
 //BA.debugLineNum = 6291472;BA.debugLine="Else if Value == \"Ağustos\" Then";
if ((_value).equals((Object)("Ağustos"))) { 
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="araAy = 8";
mostCurrent._araay = BA.NumberToString(8);
 }else 
{RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="Else if Value == \"Eylül\" Then";
if ((_value).equals((Object)("Eylül"))) { 
RDebugUtils.currentLine=6291475;
 //BA.debugLineNum = 6291475;BA.debugLine="araAy = 9";
mostCurrent._araay = BA.NumberToString(9);
 }else 
{RDebugUtils.currentLine=6291476;
 //BA.debugLineNum = 6291476;BA.debugLine="Else if Value == \"Ekim\" Then";
if ((_value).equals((Object)("Ekim"))) { 
RDebugUtils.currentLine=6291477;
 //BA.debugLineNum = 6291477;BA.debugLine="araAy = 10";
mostCurrent._araay = BA.NumberToString(10);
 }else 
{RDebugUtils.currentLine=6291478;
 //BA.debugLineNum = 6291478;BA.debugLine="Else if Value == \"Kasım\" Then";
if ((_value).equals((Object)("Kasım"))) { 
RDebugUtils.currentLine=6291479;
 //BA.debugLineNum = 6291479;BA.debugLine="araAy = 11";
mostCurrent._araay = BA.NumberToString(11);
 }else 
{RDebugUtils.currentLine=6291480;
 //BA.debugLineNum = 6291480;BA.debugLine="Else if Value == \"Aralık\" Then";
if ((_value).equals((Object)("Aralık"))) { 
RDebugUtils.currentLine=6291481;
 //BA.debugLineNum = 6291481;BA.debugLine="araAy = 12";
mostCurrent._araay = BA.NumberToString(12);
 }}}}}}}}}}}}
;
 } 
       catch (Exception e28) {
			processBA.setLastException(e28);RDebugUtils.currentLine=6291484;
 //BA.debugLineNum = 6291484;BA.debugLine="araAy = 6";
mostCurrent._araay = BA.NumberToString(6);
RDebugUtils.currentLine=6291485;
 //BA.debugLineNum = 6291485;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("26291485",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=6291487;
 //BA.debugLineNum = 6291487;BA.debugLine="End Sub";
return "";
}
public static String  _spinneryil_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinneryil_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinneryil_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub SpinnerYil_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Try";
try {RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="araYil = Value";
_arayil = (int)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="araYil = 1996";
_arayil = (int) (1996);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("26356997",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="CustomListView1.Clear";
mostCurrent._customlistview1._clear();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek ORDE";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek ORDER BY denek_id DESC")));
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="For i = 0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="CustomListView1.Add(CreateListItem(tc,isim,id,Cu";
mostCurrent._customlistview1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitem(mostCurrent._tc,mostCurrent._isim,_id,mostCurrent._customlistview1._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))).getObject())),(Object)(_id));
 }
};
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return "";
}
public static String  _ara() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ara", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ara", null));}
int _i = 0;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub Ara";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Log(\"BURADA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25570561","BURADA",0);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="CustomListView1.Clear";
mostCurrent._customlistview1._clear();
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Denek WHE";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_tc LIKE '%"+mostCurrent._aratc+"%' AND denek_isim LIKE '%"+mostCurrent._araisim+"%' AND cinsiyet_adi LIKE '%"+mostCurrent._aracinsiyet+"%' AND il_adi LIKE '%"+mostCurrent._aradogumyeri+"%' AND denek_babaAdi LIKE '%"+mostCurrent._arababaadi+"%' AND denek_engelDurumu LIKE '%"+mostCurrent._araengeldurumu+"%' AND denek_takimOkul LIKE '%"+mostCurrent._aratakimokul+"%' AND denek_bransSinif LIKE '%"+mostCurrent._arabranssinif+"%' AND denek_mevki LIKE '%"+mostCurrent._aramevki+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="CustomListView1.Add(CreateListItem(tc,isim,id,Cu";
mostCurrent._customlistview1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitem(mostCurrent._tc,mostCurrent._isim,_id,mostCurrent._customlistview1._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))).getObject())),(Object)(_id));
 }
};
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="If list.Size == 0 Then";
if (mostCurrent._list.getSize()==0) { 
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="Log(\"liste boş seçili checkbox yok\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25570571","liste boş seçili checkbox yok",0);
 }else 
{RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="Else if list.Size > 0 Then";
if (mostCurrent._list.getSize()>0) { 
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="CheckAt";
_checkat();
 }}
;
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub VeriAl";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="id = rs.GetInt(\"denek_id\")";
_id = mostCurrent._rs.GetInt("denek_id");
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
mostCurrent._tc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
mostCurrent._isim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(String _texttc,String _textisim,int _textid,int _width,int _height) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitem", new Object[] {_texttc,_textisim,_textid,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _panel = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub CreateListItem(TextTC As String, TextIsim As S";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim panel As Panel";
_panel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="panel.Initialize(\"\")";
_panel.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="panel.SetLayout(0,0,Width,Height)";
_panel.SetLayout((int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="panel.LoadLayout(\"GelismisTestDenekAraCustomLvVer";
_panel.LoadLayout("GelismisTestDenekAraCustomLvVeriPage",mostCurrent.activityBA);
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="LabelId.Visible = False";
mostCurrent._labelid.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="LabelDenekTc.Text = TextTC";
mostCurrent._labeldenektc.setText(BA.ObjectToCharSequence(_texttc));
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="LabelDenekIsim.Text = TextIsim";
mostCurrent._labeldenekisim.setText(BA.ObjectToCharSequence(_textisim));
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="LabelId.Text = TextID";
mostCurrent._labelid.setText(BA.ObjectToCharSequence(_textid));
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="Return panel";
if (true) return _panel;
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="End Sub";
return null;
}
public static String  _checkat() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkat", null));}
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _chk = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub CheckAt";
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Log(\"BURADA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25373967","BURADA",0);
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="For i=0 To list.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="For j=0 To CustomListView1.Size -1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._customlistview1._getsize()-1);
_j = (int) (0) ;
for (;_j <= limit3 ;_j = _j + step3 ) {
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="Dim pnl As B4XView = CustomListView1.GetPanel(j";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._customlistview1._getpanel(_j);
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="Dim chk As B4XView = pnl.GetView(0)";
_chk = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chk = _pnl.GetView((int) (0));
RDebugUtils.currentLine=5373972;
 //BA.debugLineNum = 5373972;BA.debugLine="If list.Size > i Then";
if (mostCurrent._list.getSize()>_i) { 
RDebugUtils.currentLine=5373973;
 //BA.debugLineNum = 5373973;BA.debugLine="Log(list)";
anywheresoftware.b4a.keywords.Common.LogImpl("25373973",BA.ObjectToString(mostCurrent._list),0);
RDebugUtils.currentLine=5373974;
 //BA.debugLineNum = 5373974;BA.debugLine="If list.Get(i) == CustomListView1.GetValue(j)";
if ((mostCurrent._list.Get(_i)).equals(mostCurrent._customlistview1._getvalue(_j))) { 
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="Log(\"listenin \"&i&\"  .elemanı   \"&list.Get(i)";
anywheresoftware.b4a.keywords.Common.LogImpl("25373975","listenin "+BA.NumberToString(_i)+"  .elemanı   "+BA.ObjectToString(mostCurrent._list.Get(_i))+"== eşit "+BA.NumberToString(_j)+"  .elemanındaki değere   "+BA.ObjectToString(mostCurrent._customlistview1._getvalue(_j)),0);
RDebugUtils.currentLine=5373976;
 //BA.debugLineNum = 5373976;BA.debugLine="chk.Checked = True";
_chk.setChecked(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 }
};
 }
};
RDebugUtils.currentLine=5373982;
 //BA.debugLineNum = 5373982;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumtarihi_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumtarihi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumtarihi_click", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub ButtonDogumTarihi_Click";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Panel2.Visible = True";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="KisimGizle";
_kisimgizle();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="End Sub";
return "";
}
public static String  _kisimgizle() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kisimgizle", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "kisimgizle", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub KisimGizle";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="LabelDogumYeri.Visible = False";
mostCurrent._labeldogumyeri.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="LabelDogumYeri.Enabled = False";
mostCurrent._labeldogumyeri.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="LabelBabaAdi.Visible = False";
mostCurrent._labelbabaadi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="LabelBabaAdi.Enabled = False";
mostCurrent._labelbabaadi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="LabelEngel.Visible = False";
mostCurrent._labelengel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="LabelEngel.Enabled = False";
mostCurrent._labelengel.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="SpinnerDogumYeri.Visible = False";
mostCurrent._spinnerdogumyeri.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="SpinnerDogumYeri.Enabled = False";
mostCurrent._spinnerdogumyeri.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="EditTextBabaAdi.Visible = False";
mostCurrent._edittextbabaadi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="EditTextBabaAdi.Enabled = False";
mostCurrent._edittextbabaadi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="EditTextEngelDurumu.Visible = False";
mostCurrent._edittextengeldurumu.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="EditTextEngelDurumu.Enabled = False";
mostCurrent._edittextengeldurumu.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="End Sub";
return "";
}
public static String  _buttonok_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonok_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonok_click", null));}
int _i = 0;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub ButtonOK_Click";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="For i=0 To checkedIdList.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (_checkedidlist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Log(checkedIdList.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("25505026",BA.NumberToString(_checkedidlist.getSize()),0);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Log(i &\"   :   \"&\" : \" &checkedIdList.Get(i) )";
anywheresoftware.b4a.keywords.Common.LogImpl("25505027",BA.NumberToString(_i)+"   :   "+" : "+BA.ObjectToString(_checkedidlist.Get(_i)),0);
 }
};
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="StartActivity(ProgramSec)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programsec.getObject()));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarihayar_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarihayar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarihayar_click", null));}
anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog _dd = null;
int[] _yilsubathesabi = null;
int _i = 0;
String _secilen = "";
int _result = 0;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub ButtonTarihAyar_Click";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Panel2.Visible = False";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="If araYil == 1950 Or araYil == 1951 Then";
if (_arayil==1950 || _arayil==1951) { 
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="If araAy == 2 Then";
if ((mostCurrent._araay).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="If araGun == 29 Or araGun == 30 Or araGun == 31";
if (_aragun==29 || _aragun==30 || _aragun==31) { 
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="ToastMessageShow($\" Şubat ayı ${araYil} yılınd";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" Şubat ayı "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_arayil))+" yılında 28 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="araGun = 28";
_aragun = (int) (28);
 };
 }else 
{RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="Else if araAy == 4 Or araAy == 6 Or araAy == 9 O";
if ((mostCurrent._araay).equals(BA.NumberToString(4)) || (mostCurrent._araay).equals(BA.NumberToString(6)) || (mostCurrent._araay).equals(BA.NumberToString(9)) || (mostCurrent._araay).equals(BA.NumberToString(11))) { 
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="If araGun == 31 Then";
if (_aragun==31) { 
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="ToastMessageShow($\"${araYil} yılında ${araAy}.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_arayil))+" yılında "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._araay))+". ay 30 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="araGun = 30";
_aragun = (int) (30);
 };
 }}
;
 };
RDebugUtils.currentLine=6488090;
 //BA.debugLineNum = 6488090;BA.debugLine="Dim yilSubatHesabi() As Int = Array As Int(1952,1";
_yilsubathesabi = new int[]{(int) (1952),(int) (1953),(int) (1954),(int) (1955),(int) (1956),(int) (1957),(int) (1958),(int) (1959),(int) (1960),(int) (1961),(int) (1962),(int) (1963),(int) (1964),(int) (1965),(int) (1966),(int) (1967),(int) (1968),(int) (1969),(int) (1970),(int) (1971),(int) (1972),(int) (1973),(int) (1974),(int) (1975),(int) (1976),(int) (1977),(int) (1978),(int) (1979),(int) (1980),(int) (1981),(int) (1982),(int) (1983),(int) (1984),(int) (1985),(int) (1986),(int) (1987),(int) (1988),(int) (1989),(int) (1990),(int) (1991),(int) (1992),(int) (1993),(int) (1994),(int) (1995),(int) (1996),(int) (1997),(int) (1998),(int) (1999),(int) (2000),(int) (2001),(int) (2002),(int) (2003),(int) (2004),(int) (2005),(int) (2006),(int) (2007),(int) (2008),(int) (2009),(int) (2010),(int) (2011),(int) (2012),(int) (2013),(int) (2014),(int) (2015),(int) (2016),(int) (2017),(int) (2018),(int) (2019),(int) (2020),(int) (2021),(int) (2022),(int) (2023),(int) (2024),(int) (2025),(int) (2026),(int) (2027),(int) (2028),(int) (2029)};
RDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="For i=0 To yilSubatHesabi.Length-1";
{
final int step17 = 1;
final int limit17 = (int) (_yilsubathesabi.length-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=6488092;
 //BA.debugLineNum = 6488092;BA.debugLine="If araYil == yilSubatHesabi(i) Then";
if (_arayil==_yilsubathesabi[_i]) { 
RDebugUtils.currentLine=6488093;
 //BA.debugLineNum = 6488093;BA.debugLine="If araAy == 2 Then";
if ((mostCurrent._araay).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=6488094;
 //BA.debugLineNum = 6488094;BA.debugLine="If i Mod 4 == 0 Then";
if (_i%4==0) { 
RDebugUtils.currentLine=6488095;
 //BA.debugLineNum = 6488095;BA.debugLine="If araGun == 30 Or araGun == 31 Then";
if (_aragun==30 || _aragun==31) { 
RDebugUtils.currentLine=6488096;
 //BA.debugLineNum = 6488096;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" Şubat ayı "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yilsubathesabi[_i]))+" yılında 29 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488097;
 //BA.debugLineNum = 6488097;BA.debugLine="araGun = 29";
_aragun = (int) (29);
 };
 }else {
RDebugUtils.currentLine=6488100;
 //BA.debugLineNum = 6488100;BA.debugLine="If araGun == 29 Or araGun == 30 Or araGun ==";
if (_aragun==29 || _aragun==30 || _aragun==31) { 
RDebugUtils.currentLine=6488101;
 //BA.debugLineNum = 6488101;BA.debugLine="ToastMessageShow($\" Şubat ayı ${yilSubatHesa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" Şubat ayı "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yilsubathesabi[_i]))+" yılında 28 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488102;
 //BA.debugLineNum = 6488102;BA.debugLine="araGun = 28";
_aragun = (int) (28);
 };
 };
 }else 
{RDebugUtils.currentLine=6488105;
 //BA.debugLineNum = 6488105;BA.debugLine="Else if araAy == 4 Or araAy == 6 Or araAy == 9";
if ((mostCurrent._araay).equals(BA.NumberToString(4)) || (mostCurrent._araay).equals(BA.NumberToString(6)) || (mostCurrent._araay).equals(BA.NumberToString(9)) || (mostCurrent._araay).equals(BA.NumberToString(11))) { 
RDebugUtils.currentLine=6488106;
 //BA.debugLineNum = 6488106;BA.debugLine="If araGun == 31 Then";
if (_aragun==31) { 
RDebugUtils.currentLine=6488107;
 //BA.debugLineNum = 6488107;BA.debugLine="ToastMessageShow($\" ${yilSubatHesabi(i)} yılı";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yilsubathesabi[_i]))+" yılında "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._araay))+". ay 30 gündür")),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488108;
 //BA.debugLineNum = 6488108;BA.debugLine="araGun = 30";
_aragun = (int) (30);
 };
 }}
;
 };
 }
};
RDebugUtils.currentLine=6488114;
 //BA.debugLineNum = 6488114;BA.debugLine="Dim secilen As String = $\"${araAy}/${araGun}/${ar";
_secilen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._araay))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_aragun))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_arayil))+"");
RDebugUtils.currentLine=6488115;
 //BA.debugLineNum = 6488115;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.DateParse(sec";
_dd.setYear(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_secilen)));
RDebugUtils.currentLine=6488116;
 //BA.debugLineNum = 6488116;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.DateParse(s";
_dd.setMonth(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_secilen)));
RDebugUtils.currentLine=6488117;
 //BA.debugLineNum = 6488117;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.D";
_dd.setDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_secilen)));
RDebugUtils.currentLine=6488119;
 //BA.debugLineNum = 6488119;BA.debugLine="Dim result As Int = Dd.Show(\"Tarih seçiniz\", \"SPO";
_result = _dd.Show("Tarih seçiniz","SPORT EXPERT TARİH SEÇİM PANELİ","Evet","İptal","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6488120;
 //BA.debugLineNum = 6488120;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=6488121;
 //BA.debugLineNum = 6488121;BA.debugLine="araDogumTarihi = Dd.DayOfMonth & \"/\" & Dd.Month";
mostCurrent._aradogumtarihi = BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())+"/"+BA.NumberToString(_dd.getYear());
RDebugUtils.currentLine=6488122;
 //BA.debugLineNum = 6488122;BA.debugLine="ButtonDogumTarihi.Text = araDogumTarihi";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence(mostCurrent._aradogumtarihi));
RDebugUtils.currentLine=6488123;
 //BA.debugLineNum = 6488123;BA.debugLine="Ara";
_ara();
 }else 
{RDebugUtils.currentLine=6488124;
 //BA.debugLineNum = 6488124;BA.debugLine="Else If result = DialogResponse.CANCEL Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
RDebugUtils.currentLine=6488125;
 //BA.debugLineNum = 6488125;BA.debugLine="ButtonDogumTarihi.Text = \"\"";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6488126;
 //BA.debugLineNum = 6488126;BA.debugLine="ToastMessageShow(\"Seçim yapılmadı\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Seçim yapılmadı"),anywheresoftware.b4a.keywords.Common.True);
 }}
;
RDebugUtils.currentLine=6488129;
 //BA.debugLineNum = 6488129;BA.debugLine="KisimGoster";
_kisimgoster();
RDebugUtils.currentLine=6488131;
 //BA.debugLineNum = 6488131;BA.debugLine="End Sub";
return "";
}
public static String  _checkboxsecim_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkboxsecim_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkboxsecim_checkedchange", new Object[] {_checked}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _chk = null;
anywheresoftware.b4a.objects.B4XViewWrapper _tclabel = null;
anywheresoftware.b4a.objects.B4XViewWrapper _isimlabel = null;
int _j = 0;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub CheckBoxSecim_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="checkedIdList.Initialize";
_checkedidlist.Initialize();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="checkedTcList.Initialize";
_checkedtclist.Initialize();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="checkedIsimList.Initialize";
_checkedisimlist.Initialize();
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="silinenListe.Initialize";
mostCurrent._silinenliste.Initialize();
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Log(\"BURADA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25308422","BURADA",0);
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="For i=0 To CustomListView1.GetSize - 1";
{
final int step6 = 1;
final int limit6 = (int) (mostCurrent._customlistview1._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Dim pnl As B4XView = CustomListView1.GetPanel(i)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._customlistview1._getpanel(_i);
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="Dim chk As B4XView = pnl.GetView(0)";
_chk = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chk = _pnl.GetView((int) (0));
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="Dim tclabel As B4XView = pnl.GetView(1)";
_tclabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tclabel = _pnl.GetView((int) (1));
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="Dim isimLabel As B4XView = pnl.GetView(2)";
_isimlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_isimlabel = _pnl.GetView((int) (2));
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="If chk.Checked Then";
if (_chk.getChecked()) { 
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="checkedIdList.Add(CustomListView1.GetValue(i))";
_checkedidlist.Add(mostCurrent._customlistview1._getvalue(_i));
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="checkedTcList.Add(tclabel.Text)";
_checkedtclist.Add((Object)(_tclabel.getText()));
RDebugUtils.currentLine=5308431;
 //BA.debugLineNum = 5308431;BA.debugLine="checkedIsimList.Add(isimLabel.Text)";
_checkedisimlist.Add((Object)(_isimlabel.getText()));
 }else 
{RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="Else If chk.Checked = False Then";
if (_chk.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="silinenListe.Add(CustomListView1.GetValue(i))";
mostCurrent._silinenliste.Add(mostCurrent._customlistview1._getvalue(_i));
 }}
;
 }
};
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="Log(\"BURADA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25308438","BURADA",0);
RDebugUtils.currentLine=5308440;
 //BA.debugLineNum = 5308440;BA.debugLine="If checkedIdList.Size<>0 Then";
if (_checkedidlist.getSize()!=0) { 
RDebugUtils.currentLine=5308441;
 //BA.debugLineNum = 5308441;BA.debugLine="list.AddAll(checkedIdList)";
mostCurrent._list.AddAll(_checkedidlist);
RDebugUtils.currentLine=5308442;
 //BA.debugLineNum = 5308442;BA.debugLine="If  list.Size > 1 Then";
if (mostCurrent._list.getSize()>1) { 
RDebugUtils.currentLine=5308444;
 //BA.debugLineNum = 5308444;BA.debugLine="For i=0 To list.Size-1";
{
final int step23 = 1;
final int limit23 = (int) (mostCurrent._list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=5308445;
 //BA.debugLineNum = 5308445;BA.debugLine="For j=1 To list.Size-1";
{
final int step24 = 1;
final int limit24 = (int) (mostCurrent._list.getSize()-1);
_j = (int) (1) ;
for (;_j <= limit24 ;_j = _j + step24 ) {
RDebugUtils.currentLine=5308446;
 //BA.debugLineNum = 5308446;BA.debugLine="If list.Size>j And list.Size>i And i<>j Then";
if (mostCurrent._list.getSize()>_j && mostCurrent._list.getSize()>_i && _i!=_j) { 
RDebugUtils.currentLine=5308447;
 //BA.debugLineNum = 5308447;BA.debugLine="If list.Get(i) == list.Get(j) Then";
if ((mostCurrent._list.Get(_i)).equals(mostCurrent._list.Get(_j))) { 
RDebugUtils.currentLine=5308448;
 //BA.debugLineNum = 5308448;BA.debugLine="list.RemoveAt(j)";
mostCurrent._list.RemoveAt(_j);
RDebugUtils.currentLine=5308449;
 //BA.debugLineNum = 5308449;BA.debugLine="Log(list&\"  listenin uzunluğu \"&list.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("25308449",BA.ObjectToString(mostCurrent._list)+"  listenin uzunluğu "+BA.NumberToString(mostCurrent._list.getSize()),0);
 };
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=5308455;
 //BA.debugLineNum = 5308455;BA.debugLine="Log(\"BURADA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25308455","BURADA",0);
 };
RDebugUtils.currentLine=5308478;
 //BA.debugLineNum = 5308478;BA.debugLine="End Sub";
return "";
}
public static String  _customlistview1_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "customlistview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub CustomListView1_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Log(Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("25439489",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="End Sub";
return "";
}
public static String  _edittextbabaadi_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextbabaadi_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextbabaadi_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub editTextBabaAdi_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="araBabaAdi = EditTextBabaAdi.Text";
mostCurrent._arababaadi = mostCurrent._edittextbabaadi.getText();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Ara";
_ara();
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="If EditTextBabaAdi.Text == \"\" Then";
if ((mostCurrent._edittextbabaadi.getText()).equals("")) { 
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="LabelCarpi3.Visible = False";
mostCurrent._labelcarpi3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="End Sub";
return "";
}
public static String  _edittextbranssinif_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextbranssinif_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextbranssinif_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub editTextBransSinif_TextChanged (Old As String,";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="araBransSinif = EditTextBransSinif.Text";
mostCurrent._arabranssinif = mostCurrent._edittextbranssinif.getText();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Ara";
_ara();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="If EditTextBransSinif.Text == \"\" Then";
if ((mostCurrent._edittextbranssinif.getText()).equals("")) { 
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="LabelCarpi6.Visible = False";
mostCurrent._labelcarpi6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="End Sub";
return "";
}
public static String  _edittextengeldurumu_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextengeldurumu_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextengeldurumu_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub editTextEngelDurumu_TextChanged (Old As String";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="araEngelDurumu = EditTextEngelDurumu.Text";
mostCurrent._araengeldurumu = mostCurrent._edittextengeldurumu.getText();
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Ara";
_ara();
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="If EditTextEngelDurumu.Text == \"\" Then";
if ((mostCurrent._edittextengeldurumu.getText()).equals("")) { 
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="LabelCarpi4.Visible = False";
mostCurrent._labelcarpi4.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="End Sub";
return "";
}
public static String  _edittextisim_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextisim_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextisim_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub editTextIsim_TextChanged (Old As String, New A";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="LabelCarpi2.Visible = True";
mostCurrent._labelcarpi2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="araIsim = EditTextIsim.Text";
mostCurrent._araisim = mostCurrent._edittextisim.getText();
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Ara";
_ara();
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="If EditTextIsim.Text == \"\" Then";
if ((mostCurrent._edittextisim.getText()).equals("")) { 
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="LabelCarpi2.Visible = False";
mostCurrent._labelcarpi2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkimlikno_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkimlikno_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkimlikno_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub editTextKimlikNo_TextChanged (Old As String, N";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Log(\"BURADA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("25636097","BURADA",0);
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="LabelCarpi1.Visible = True";
mostCurrent._labelcarpi1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="araTc = EditTextKimlikNo.Text";
mostCurrent._aratc = mostCurrent._edittextkimlikno.getText();
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Ara";
_ara();
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="If EditTextKimlikNo.Text == \"\" Then";
if ((mostCurrent._edittextkimlikno.getText()).equals("")) { 
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="LabelCarpi1.Visible = False";
mostCurrent._labelcarpi1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="End Sub";
return "";
}
public static String  _edittextmevki_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextmevki_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextmevki_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub editTextMevki_TextChanged (Old As String, New";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="araMevki = EditTextMevki.Text";
mostCurrent._aramevki = mostCurrent._edittextmevki.getText();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Ara";
_ara();
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="If EditTextMevki.Text == \"\" Then";
if ((mostCurrent._edittextmevki.getText()).equals("")) { 
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="LabelCarpi7.Visible = False";
mostCurrent._labelcarpi7.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="End Sub";
return "";
}
public static String  _edittexttakimokul_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexttakimokul_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexttakimokul_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub EditTextTakimOkul_TextChanged (Old As String,";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="araTakimOkul = EditTextTakimOkul.Text";
mostCurrent._aratakimokul = mostCurrent._edittexttakimokul.getText();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Ara";
_ara();
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="If EditTextTakimOkul.Text == \"\" Then";
if ((mostCurrent._edittexttakimokul.getText()).equals("")) { 
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="LabelCarpi5.Visible = False";
mostCurrent._labelcarpi5.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi1_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi1_click", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub LabelCarpi1_Click";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="EditTextKimlikNo.SelectAll";
mostCurrent._edittextkimlikno.SelectAll();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="EditTextKimlikNo.Text = \"\"";
mostCurrent._edittextkimlikno.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi2_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi2_click", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub LabelCarpi2_Click";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="EditTextIsim.SelectAll";
mostCurrent._edittextisim.SelectAll();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="EditTextIsim.Text = \"\"";
mostCurrent._edittextisim.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi3_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi3_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi3_click", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub LabelCarpi3_Click";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="EditTextBabaAdi.SelectAll";
mostCurrent._edittextbabaadi.SelectAll();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="EditTextBabaAdi.Text = \"\"";
mostCurrent._edittextbabaadi.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi4_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi4_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi4_click", null));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub LabelCarpi4_Click";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="EditTextEngelDurumu.SelectAll";
mostCurrent._edittextengeldurumu.SelectAll();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="EditTextEngelDurumu.Text = \"\"";
mostCurrent._edittextengeldurumu.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi5_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi5_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi5_click", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub LabelCarpi5_Click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="EditTextTakimOkul.SelectAll";
mostCurrent._edittexttakimokul.SelectAll();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="EditTextTakimOkul.Text = \"\"";
mostCurrent._edittexttakimokul.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi6_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi6_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi6_click", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub LabelCarpi6_Click";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="EditTextBransSinif.SelectAll";
mostCurrent._edittextbranssinif.SelectAll();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="EditTextBransSinif.Text = \"\"";
mostCurrent._edittextbranssinif.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi7_click() throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi7_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi7_click", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub LabelCarpi7_Click";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="EditTextMevki.SelectAll";
mostCurrent._edittextmevki.SelectAll();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="EditTextMevki.Text = \"\"";
mostCurrent._edittextmevki.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="End Sub";
return "";
}
public static String  _spinnerdogumyeri_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="gelismistestdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnerdogumyeri_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnerdogumyeri_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub spinnerDogumYeri_ItemClick (Position As Int, V";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Try";
try {RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="araDogumYeri= Value";
mostCurrent._aradogumyeri = BA.ObjectToString(_value);
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Ara";
_ara();
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("26160389",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="End Sub";
return "";
}
}