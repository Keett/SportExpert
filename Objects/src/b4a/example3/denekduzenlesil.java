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

public class denekduzenlesil extends Activity implements B4AActivity{
	public static denekduzenlesil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.denekduzenlesil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (denekduzenlesil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.denekduzenlesil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.denekduzenlesil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (denekduzenlesil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (denekduzenlesil) Resume **");
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
		return denekduzenlesil.class;
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
        BA.LogInfo("** Activity (denekduzenlesil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            denekduzenlesil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (denekduzenlesil) Resume **");
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
public static String _id = "";
public static String _tc = "";
public static String _isim = "";
public static String _cinsiyet = "";
public static String _dogum_tarihi = "";
public static String _il = "";
public static String _baba_adi = "";
public static String _engel_durumu = "";
public static String _takim_okul = "";
public static String _brans_sinif = "";
public static String _mevki = "";
public static byte[] _resim = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoncinsiyet = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumtarihi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumyeri = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbabaadi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonengeldurumu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontakimokul = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbranssinif = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmevki = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondenektabloveri = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondenekekle = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonanasayfa = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
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
public b4a.example3.denekekleguncelle _denekekleguncelle = null;
public b4a.example3.dayanikliliktestmenu _dayanikliliktestmenu = null;
public b4a.example3.programlistele _programlistele = null;
public b4a.example3.programsil _programsil = null;
public b4a.example3.surattestayar _surattestayar = null;
public b4a.example3.surattestekle _surattestekle = null;
public b4a.example3.surattestsil _surattestsil = null;
public b4a.example3.sesservice _sesservice = null;
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
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="Activity.LoadLayout(\"DenekDuzenleSilPage\")";
mostCurrent._activity.LoadLayout("DenekDuzenleSilPage",mostCurrent.activityBA);
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29622278;
 //BA.debugLineNum = 29622278;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29622279;
 //BA.debugLineNum = 29622279;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622280;
 //BA.debugLineNum = 29622280;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=29622281;
 //BA.debugLineNum = 29622281;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=29622283;
 //BA.debugLineNum = 29622283;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=29622285;
 //BA.debugLineNum = 29622285;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=29622286;
 //BA.debugLineNum = 29622286;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=29622287;
 //BA.debugLineNum = 29622287;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622289;
 //BA.debugLineNum = 29622289;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622290;
 //BA.debugLineNum = 29622290;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622291;
 //BA.debugLineNum = 29622291;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622292;
 //BA.debugLineNum = 29622292;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=29622293;
 //BA.debugLineNum = 29622293;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=29622295;
 //BA.debugLineNum = 29622295;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622296;
 //BA.debugLineNum = 29622296;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622297;
 //BA.debugLineNum = 29622297;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622298;
 //BA.debugLineNum = 29622298;BA.debugLine="ButtonIsim.Text =\"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=29622299;
 //BA.debugLineNum = 29622299;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=29622301;
 //BA.debugLineNum = 29622301;BA.debugLine="ButtonCinsiyet.TextColor = Color.koyuMavi";
mostCurrent._buttoncinsiyet.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622302;
 //BA.debugLineNum = 29622302;BA.debugLine="ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttoncinsiyet.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622303;
 //BA.debugLineNum = 29622303;BA.debugLine="ButtonCinsiyet.SingleLine = True";
mostCurrent._buttoncinsiyet.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622304;
 //BA.debugLineNum = 29622304;BA.debugLine="ButtonCinsiyet.Text = \"CİNSİYET\"";
mostCurrent._buttoncinsiyet.setText(BA.ObjectToCharSequence("CİNSİYET"));
RDebugUtils.currentLine=29622305;
 //BA.debugLineNum = 29622305;BA.debugLine="ButtonCinsiyet.TextSize = 14";
mostCurrent._buttoncinsiyet.setTextSize((float) (14));
RDebugUtils.currentLine=29622307;
 //BA.debugLineNum = 29622307;BA.debugLine="ButtonDogumTarihi.TextColor = Color.koyuMavi";
mostCurrent._buttondogumtarihi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622308;
 //BA.debugLineNum = 29622308;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._buttondogumtarihi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622309;
 //BA.debugLineNum = 29622309;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
mostCurrent._buttondogumtarihi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622310;
 //BA.debugLineNum = 29622310;BA.debugLine="ButtonDogumTarihi.Text = \"DOĞUM TARİHİ\"";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence("DOĞUM TARİHİ"));
RDebugUtils.currentLine=29622311;
 //BA.debugLineNum = 29622311;BA.debugLine="ButtonDogumTarihi.TextSize = 14";
mostCurrent._buttondogumtarihi.setTextSize((float) (14));
RDebugUtils.currentLine=29622313;
 //BA.debugLineNum = 29622313;BA.debugLine="ButtonDogumYeri.TextColor = Color.koyuMavi";
mostCurrent._buttondogumyeri.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622314;
 //BA.debugLineNum = 29622314;BA.debugLine="ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttondogumyeri.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622315;
 //BA.debugLineNum = 29622315;BA.debugLine="ButtonDogumYeri.SingleLine = True";
mostCurrent._buttondogumyeri.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622316;
 //BA.debugLineNum = 29622316;BA.debugLine="ButtonDogumYeri.Text = \"DOĞUM YERİ\"";
mostCurrent._buttondogumyeri.setText(BA.ObjectToCharSequence("DOĞUM YERİ"));
RDebugUtils.currentLine=29622317;
 //BA.debugLineNum = 29622317;BA.debugLine="ButtonDogumYeri.TextSize = 14";
mostCurrent._buttondogumyeri.setTextSize((float) (14));
RDebugUtils.currentLine=29622319;
 //BA.debugLineNum = 29622319;BA.debugLine="ButtonBabaAdi.TextColor = Color.koyuMavi";
mostCurrent._buttonbabaadi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622320;
 //BA.debugLineNum = 29622320;BA.debugLine="ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonbabaadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622321;
 //BA.debugLineNum = 29622321;BA.debugLine="ButtonBabaAdi.SingleLine = True";
mostCurrent._buttonbabaadi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622322;
 //BA.debugLineNum = 29622322;BA.debugLine="ButtonBabaAdi.Text = \"BABA ADI\"";
mostCurrent._buttonbabaadi.setText(BA.ObjectToCharSequence("BABA ADI"));
RDebugUtils.currentLine=29622323;
 //BA.debugLineNum = 29622323;BA.debugLine="ButtonBabaAdi.TextSize = 14";
mostCurrent._buttonbabaadi.setTextSize((float) (14));
RDebugUtils.currentLine=29622325;
 //BA.debugLineNum = 29622325;BA.debugLine="ButtonEngelDurumu.TextColor= Color.koyuMavi";
mostCurrent._buttonengeldurumu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622326;
 //BA.debugLineNum = 29622326;BA.debugLine="ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD";
mostCurrent._buttonengeldurumu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622327;
 //BA.debugLineNum = 29622327;BA.debugLine="ButtonEngelDurumu.SingleLine= True";
mostCurrent._buttonengeldurumu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622328;
 //BA.debugLineNum = 29622328;BA.debugLine="ButtonEngelDurumu.Text= \"ENGEL DURUMU\"";
mostCurrent._buttonengeldurumu.setText(BA.ObjectToCharSequence("ENGEL DURUMU"));
RDebugUtils.currentLine=29622329;
 //BA.debugLineNum = 29622329;BA.debugLine="ButtonEngelDurumu.TextSize= 14";
mostCurrent._buttonengeldurumu.setTextSize((float) (14));
RDebugUtils.currentLine=29622331;
 //BA.debugLineNum = 29622331;BA.debugLine="ButtonTakimOkul.TextColor = Color.koyuMavi";
mostCurrent._buttontakimokul.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622332;
 //BA.debugLineNum = 29622332;BA.debugLine="ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontakimokul.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622333;
 //BA.debugLineNum = 29622333;BA.debugLine="ButtonTakimOkul.SingleLine = True";
mostCurrent._buttontakimokul.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622334;
 //BA.debugLineNum = 29622334;BA.debugLine="ButtonTakimOkul.Text = \"TAKIM/OKUL\"";
mostCurrent._buttontakimokul.setText(BA.ObjectToCharSequence("TAKIM/OKUL"));
RDebugUtils.currentLine=29622335;
 //BA.debugLineNum = 29622335;BA.debugLine="ButtonTakimOkul.TextSize = 14";
mostCurrent._buttontakimokul.setTextSize((float) (14));
RDebugUtils.currentLine=29622337;
 //BA.debugLineNum = 29622337;BA.debugLine="ButtonBransSinif.TextColor = Color.koyuMavi";
mostCurrent._buttonbranssinif.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622338;
 //BA.debugLineNum = 29622338;BA.debugLine="ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonbranssinif.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622339;
 //BA.debugLineNum = 29622339;BA.debugLine="ButtonBransSinif.SingleLine = True";
mostCurrent._buttonbranssinif.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622340;
 //BA.debugLineNum = 29622340;BA.debugLine="ButtonBransSinif.Text = \"BRANŞ/SINIF\"";
mostCurrent._buttonbranssinif.setText(BA.ObjectToCharSequence("BRANŞ/SINIF"));
RDebugUtils.currentLine=29622341;
 //BA.debugLineNum = 29622341;BA.debugLine="ButtonBransSinif.TextSize = 14";
mostCurrent._buttonbranssinif.setTextSize((float) (14));
RDebugUtils.currentLine=29622343;
 //BA.debugLineNum = 29622343;BA.debugLine="ButtonMevki.TextColor = Color.koyuMavi";
mostCurrent._buttonmevki.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=29622344;
 //BA.debugLineNum = 29622344;BA.debugLine="ButtonMevki.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonmevki.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=29622345;
 //BA.debugLineNum = 29622345;BA.debugLine="ButtonMevki.SingleLine = True";
mostCurrent._buttonmevki.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29622346;
 //BA.debugLineNum = 29622346;BA.debugLine="ButtonMevki.Text = \"MEVKİ\"";
mostCurrent._buttonmevki.setText(BA.ObjectToCharSequence("MEVKİ"));
RDebugUtils.currentLine=29622347;
 //BA.debugLineNum = 29622347;BA.debugLine="ButtonMevki.TextSize = 14";
mostCurrent._buttonmevki.setTextSize((float) (14));
RDebugUtils.currentLine=29622352;
 //BA.debugLineNum = 29622352;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=29622354;
 //BA.debugLineNum = 29622354;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=30932997;
 //BA.debugLineNum = 30932997;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=30932998;
 //BA.debugLineNum = 30932998;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=30932999;
 //BA.debugLineNum = 30932999;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek ORDE";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek ORDER BY denek_id DESC")));
RDebugUtils.currentLine=29884420;
 //BA.debugLineNum = 29884420;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=29884421;
 //BA.debugLineNum = 29884421;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=29884422;
 //BA.debugLineNum = 29884422;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=29884423;
 //BA.debugLineNum = 29884423;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_isim))+" // Cinsiyet: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cinsiyet))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=29884425;
 //BA.debugLineNum = 29884425;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=29884426;
 //BA.debugLineNum = 29884426;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbabaadi_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbabaadi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbabaadi_click", null));}
int _i = 0;
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Sub ButtonBabaAdi_Click";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_babaAdi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30343172;
 //BA.debugLineNum = 30343172;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30343174;
 //BA.debugLineNum = 30343174;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Baba Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_baba_adi))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30343177;
 //BA.debugLineNum = 30343177;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30343178;
 //BA.debugLineNum = 30343178;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub VeriAl";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="id = rs.GetString(\"denek_id\")";
_id = mostCurrent._rs.GetString("denek_id");
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
_tc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
_isim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="cinsiyet= rs.GetString(\"cinsiyet_adi\")";
_cinsiyet = mostCurrent._rs.GetString("cinsiyet_adi");
RDebugUtils.currentLine=29818885;
 //BA.debugLineNum = 29818885;BA.debugLine="dogum_tarihi = rs.GetString(\"denek_dogumTarihi\")";
_dogum_tarihi = mostCurrent._rs.GetString("denek_dogumTarihi");
RDebugUtils.currentLine=29818886;
 //BA.debugLineNum = 29818886;BA.debugLine="il = rs.GetString(\"il_adi\")";
_il = mostCurrent._rs.GetString("il_adi");
RDebugUtils.currentLine=29818887;
 //BA.debugLineNum = 29818887;BA.debugLine="baba_adi = rs.GetString(\"denek_babaAdi\")";
_baba_adi = mostCurrent._rs.GetString("denek_babaAdi");
RDebugUtils.currentLine=29818888;
 //BA.debugLineNum = 29818888;BA.debugLine="engel_durumu = rs.GetString(\"denek_engelDurumu\")";
_engel_durumu = mostCurrent._rs.GetString("denek_engelDurumu");
RDebugUtils.currentLine=29818889;
 //BA.debugLineNum = 29818889;BA.debugLine="takim_okul = rs.GetString(\"denek_takimOkul\")";
_takim_okul = mostCurrent._rs.GetString("denek_takimOkul");
RDebugUtils.currentLine=29818890;
 //BA.debugLineNum = 29818890;BA.debugLine="brans_sinif = rs.GetString(\"denek_bransSinif\")";
_brans_sinif = mostCurrent._rs.GetString("denek_bransSinif");
RDebugUtils.currentLine=29818891;
 //BA.debugLineNum = 29818891;BA.debugLine="mevki = rs.GetString(\"denek_mevki\")";
_mevki = mostCurrent._rs.GetString("denek_mevki");
RDebugUtils.currentLine=29818892;
 //BA.debugLineNum = 29818892;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
_resim = mostCurrent._rs.GetBlob("denek_image");
RDebugUtils.currentLine=29818893;
 //BA.debugLineNum = 29818893;BA.debugLine="Try";
try {RDebugUtils.currentLine=29818894;
 //BA.debugLineNum = 29818894;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=29818895;
 //BA.debugLineNum = 29818895;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
_inputstream.InitializeFromBytesArray(_resim,(int) (0),_resim.length);
RDebugUtils.currentLine=29818896;
 //BA.debugLineNum = 29818896;BA.debugLine="bmp.Initialize2(inputStream)";
_bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=29818897;
 //BA.debugLineNum = 29818897;BA.debugLine="inputStream.Close";
_inputstream.Close();
RDebugUtils.currentLine=29818898;
 //BA.debugLineNum = 29818898;BA.debugLine="Log(\"try\")";
anywheresoftware.b4a.keywords.Common.LogImpl("229818898","try",0);
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=29818900;
 //BA.debugLineNum = 29818900;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
_bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png");
RDebugUtils.currentLine=29818901;
 //BA.debugLineNum = 29818901;BA.debugLine="Log(\"catch\")";
anywheresoftware.b4a.keywords.Common.LogImpl("229818901","catch",0);
 };
RDebugUtils.currentLine=29818903;
 //BA.debugLineNum = 29818903;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbranssinif_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbranssinif_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbranssinif_click", null));}
int _i = 0;
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Sub ButtonBransSinif_Click";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_bransSinif LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30539782;
 //BA.debugLineNum = 30539782;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Doğum Tarihi: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dogum_tarihi))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30539785;
 //BA.debugLineNum = 30539785;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30539786;
 //BA.debugLineNum = 30539786;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncinsiyet_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttoncinsiyet_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttoncinsiyet_click", null));}
int _i = 0;
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Sub ButtonCinsiyet_Click";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE cinsiyet_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC ")));
RDebugUtils.currentLine=30146564;
 //BA.debugLineNum = 30146564;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30146566;
 //BA.debugLineNum = 30146566;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30146567;
 //BA.debugLineNum = 30146567;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Cinsiyet: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cinsiyet))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30146569;
 //BA.debugLineNum = 30146569;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30146570;
 //BA.debugLineNum = 30146570;BA.debugLine="End Sub";
return "";
}
public static String  _buttondenekekle_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondenekekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondenekekle_click", null));}
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Sub ButtonDenekEkle_Click";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="StartActivity(DenekEkleGuncelle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._denekekleguncelle.getObject()));
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="End Sub";
return "";
}
public static String  _buttondenektabloveri_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondenektabloveri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondenektabloveri_click", null));}
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Sub ButtonDenekTabloVeri_Click";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="StartActivity(DenekListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._deneklistele.getObject()));
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumtarihi_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumtarihi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumtarihi_click", null));}
int _i = 0;
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Sub ButtonDogumTarihi_Click";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_dogumTarihi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Doğum Tarihi: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dogum_tarihi))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30212105;
 //BA.debugLineNum = 30212105;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30212106;
 //BA.debugLineNum = 30212106;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumyeri_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumyeri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumyeri_click", null));}
int _i = 0;
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Sub ButtonDogumYeri_Click";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE il_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30277636;
 //BA.debugLineNum = 30277636;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30277637;
 //BA.debugLineNum = 30277637;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30277638;
 //BA.debugLineNum = 30277638;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30277639;
 //BA.debugLineNum = 30277639;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Doğum Yeri: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_il))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30277641;
 //BA.debugLineNum = 30277641;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30277642;
 //BA.debugLineNum = 30277642;BA.debugLine="End Sub";
return "";
}
public static String  _buttonengeldurumu_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonengeldurumu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonengeldurumu_click", null));}
int _i = 0;
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Sub ButtonEngelDurumu_Click";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_engelDurumu LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30408708;
 //BA.debugLineNum = 30408708;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30408709;
 //BA.debugLineNum = 30408709;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30408710;
 //BA.debugLineNum = 30408710;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30408711;
 //BA.debugLineNum = 30408711;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Engel Durumu: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_engel_durumu))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30408713;
 //BA.debugLineNum = 30408713;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30408714;
 //BA.debugLineNum = 30408714;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
int _i = 0;
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30081028;
 //BA.debugLineNum = 30081028;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30081029;
 //BA.debugLineNum = 30081029;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30081030;
 //BA.debugLineNum = 30081030;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30081031;
 //BA.debugLineNum = 30081031;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_isim))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30081033;
 //BA.debugLineNum = 30081033;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30081034;
 //BA.debugLineNum = 30081034;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmevki_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonmevki_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonmevki_click", null));}
int _i = 0;
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Sub ButtonMevki_Click";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_mevki LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30605318;
 //BA.debugLineNum = 30605318;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Mevki: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mevki))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30605321;
 //BA.debugLineNum = 30605321;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30605322;
 //BA.debugLineNum = 30605322;BA.debugLine="End Sub";
return "";
}
public static String  _buttontakimokul_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontakimokul_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontakimokul_click", null));}
int _i = 0;
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Sub ButtonTakimOkul_Click";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_takimOkul LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=30474244;
 //BA.debugLineNum = 30474244;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30474245;
 //BA.debugLineNum = 30474245;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30474246;
 //BA.debugLineNum = 30474246;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30474247;
 //BA.debugLineNum = 30474247;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}, /";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+", // Takım/Okul: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_takim_okul))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30474249;
 //BA.debugLineNum = 30474249;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30474250;
 //BA.debugLineNum = 30474250;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
int _i = 0;
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC ")));
RDebugUtils.currentLine=30015492;
 //BA.debugLineNum = 30015492;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30015493;
 //BA.debugLineNum = 30015493;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30015494;
 //BA.debugLineNum = 30015494;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=30015495;
 //BA.debugLineNum = 30015495;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc}\"$,";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=30015497;
 //BA.debugLineNum = 30015497;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30015498;
 //BA.debugLineNum = 30015498;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=29949955;
 //BA.debugLineNum = 29949955;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Denek WHE";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR cinsiyet_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_dogumTarihi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR il_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_babaAdi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_engelDurumu LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_takimOkul LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_bransSinif LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_mevki LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC ")));
RDebugUtils.currentLine=29949956;
 //BA.debugLineNum = 29949956;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=29949957;
 //BA.debugLineNum = 29949957;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=29949958;
 //BA.debugLineNum = 29949958;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=29949959;
 //BA.debugLineNum = 29949959;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_isim))+" // Cinsiyet: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cinsiyet))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=29949961;
 //BA.debugLineNum = 29949961;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=29949962;
 //BA.debugLineNum = 29949962;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=29949963;
 //BA.debugLineNum = 29949963;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=29949965;
 //BA.debugLineNum = 29949965;BA.debugLine="End Sub";
return "";
}
public static String  _label1_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label1_click", null));}
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Sub Label1_Click";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
int _i = 0;
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Main.Status= \"U\"";
mostCurrent._main._status /*String*/  = "U";
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=30801924;
 //BA.debugLineNum = 30801924;BA.debugLine="For i=0 To rs.RowCount -1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30801925;
 //BA.debugLineNum = 30801925;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30801926;
 //BA.debugLineNum = 30801926;BA.debugLine="Try";
try {RDebugUtils.currentLine=30801927;
 //BA.debugLineNum = 30801927;BA.debugLine="VeriAl";
_verial();
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=30801929;
 //BA.debugLineNum = 30801929;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("230801929",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }
};
RDebugUtils.currentLine=30801932;
 //BA.debugLineNum = 30801932;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30801933;
 //BA.debugLineNum = 30801933;BA.debugLine="StartActivity(DenekEkleGuncelle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._denekekleguncelle.getObject()));
RDebugUtils.currentLine=30801934;
 //BA.debugLineNum = 30801934;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=30801935;
 //BA.debugLineNum = 30801935;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="denekduzenlesil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT denek_id FROM Den";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT denek_id FROM Denek WHERE denek_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=30867460;
 //BA.debugLineNum = 30867460;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=30867461;
 //BA.debugLineNum = 30867461;BA.debugLine="id=rs.GetString(\"denek_id\")";
_id = mostCurrent._rs.GetString("denek_id");
 }
};
RDebugUtils.currentLine=30867463;
 //BA.debugLineNum = 30867463;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=30867465;
 //BA.debugLineNum = 30867465;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=30867466;
 //BA.debugLineNum = 30867466;BA.debugLine="result = Msgbox2(\"Kişiyi silme istediğinizden emi";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Kişiyi silme istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=30867467;
 //BA.debugLineNum = 30867467;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=30867468;
 //BA.debugLineNum = 30867468;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM Denek WHERE d";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM Denek WHERE denek_id = '"+_id+"' ");
RDebugUtils.currentLine=30867469;
 //BA.debugLineNum = 30867469;BA.debugLine="ToastMessageShow(\"Denek silindi...\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Denek silindi..."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=30867472;
 //BA.debugLineNum = 30867472;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=30867473;
 //BA.debugLineNum = 30867473;BA.debugLine="End Sub";
return "";
}
}