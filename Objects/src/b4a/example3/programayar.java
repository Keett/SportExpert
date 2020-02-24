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

public class programayar extends Activity implements B4AActivity{
	public static programayar mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.programayar");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (programayar).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.programayar");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.programayar", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (programayar) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (programayar) Resume **");
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
		return programayar.class;
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
        BA.LogInfo("** Activity (programayar) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            programayar mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (programayar) Resume **");
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
public static int _secilenlevel = 0;
public static String _secilentestturu = "";
public static String _programadi = "";
public anywheresoftware.b4a.objects.LabelWrapper _labellevel = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerlevel = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltestturu = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnertestturu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttongec = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprogramadi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextprogramadi = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
public b4a.example3.antranorgorussil _antranorgorussil = null;
public b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
public b4a.example3.dayanikliliktestlistele _dayanikliliktestlistele = null;
public b4a.example3.dayanikliliktestsil _dayanikliliktestsil = null;
public b4a.example3.dayanikliliktestekle _dayanikliliktestekle = null;
public b4a.example3.gelismistestdenekara _gelismistestdenekara = null;
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
RDebugUtils.currentModule="programayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Activity.LoadLayout(\"ProgramAyarPage\")";
mostCurrent._activity.LoadLayout("ProgramAyarPage",mostCurrent.activityBA);
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="SpinnerLevel.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spinnerlevel.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="SpinnerLevel.DropdownTextColor = Color.koyuMavi";
mostCurrent._spinnerlevel.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="SpinnerLevel.TextColor = Colors.White";
mostCurrent._spinnerlevel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="SpinnerLevel.TextSize = 20";
mostCurrent._spinnerlevel.setTextSize((float) (20));
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="LabelLevel.TextColor = Colors.White";
mostCurrent._labellevel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="LabelLevel.Text = \"LEVEL\"";
mostCurrent._labellevel.setText(BA.ObjectToCharSequence("LEVEL"));
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="LabelLevel.TextSize = 20";
mostCurrent._labellevel.setTextSize((float) (20));
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="LabelLevel.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labellevel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="LabelTestTuru.TextColor = Colors.White";
mostCurrent._labeltestturu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="LabelTestTuru.Text = \"LEVEL\"";
mostCurrent._labeltestturu.setText(BA.ObjectToCharSequence("LEVEL"));
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="LabelTestTuru.TextSize = 20";
mostCurrent._labeltestturu.setTextSize((float) (20));
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="LabelTestTuru.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeltestturu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="SpinnerTestTuru.DropdownBackgroundColor = Colors.";
mostCurrent._spinnertestturu.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="SpinnerTestTuru.DropdownTextColor = Color.koyuMav";
mostCurrent._spinnertestturu.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="SpinnerTestTuru.TextColor = Colors.White";
mostCurrent._spinnertestturu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="SpinnerTestTuru.TextSize = 20";
mostCurrent._spinnertestturu.setTextSize((float) (20));
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="LabelProgramAdi.TextColor = Colors.White";
mostCurrent._labelprogramadi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="LabelProgramAdi.Text = \"PROGRAM ADI\"";
mostCurrent._labelprogramadi.setText(BA.ObjectToCharSequence("PROGRAM ADI"));
RDebugUtils.currentLine=7143451;
 //BA.debugLineNum = 7143451;BA.debugLine="LabelProgramAdi.TextSize = 20";
mostCurrent._labelprogramadi.setTextSize((float) (20));
RDebugUtils.currentLine=7143452;
 //BA.debugLineNum = 7143452;BA.debugLine="LabelProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelprogramadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7143454;
 //BA.debugLineNum = 7143454;BA.debugLine="EditTextProgramAdi.TextColor = Colors.White";
mostCurrent._edittextprogramadi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7143455;
 //BA.debugLineNum = 7143455;BA.debugLine="EditTextProgramAdi.Hint = \"Program adını buraya y";
mostCurrent._edittextprogramadi.setHint("Program adını buraya yazmalısınız..");
RDebugUtils.currentLine=7143456;
 //BA.debugLineNum = 7143456;BA.debugLine="EditTextProgramAdi.HintColor = Color.hintColor";
mostCurrent._edittextprogramadi.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=7143457;
 //BA.debugLineNum = 7143457;BA.debugLine="EditTextProgramAdi.TextSize = 20";
mostCurrent._edittextprogramadi.setTextSize((float) (20));
RDebugUtils.currentLine=7143458;
 //BA.debugLineNum = 7143458;BA.debugLine="EditTextProgramAdi.Typeface = Typeface.DEFAULT";
mostCurrent._edittextprogramadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=7143462;
 //BA.debugLineNum = 7143462;BA.debugLine="SpinnerLevel.AddAll(Array As Int(1,2,3,4,5,6,7,8,";
mostCurrent._spinnerlevel.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12),(int) (13),(int) (14),(int) (15),(int) (16),(int) (17),(int) (18),(int) (19),(int) (20),(int) (21),(int) (22),(int) (23),(int) (24),(int) (25)}));
RDebugUtils.currentLine=7143463;
 //BA.debugLineNum = 7143463;BA.debugLine="SpinnerTestTuru.AddAll(Array As String(\"Shuttle R";
mostCurrent._spinnertestturu.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Shuttle Run","Conconi"}));
RDebugUtils.currentLine=7143465;
 //BA.debugLineNum = 7143465;BA.debugLine="secilenLevel = 1";
_secilenlevel = (int) (1);
RDebugUtils.currentLine=7143466;
 //BA.debugLineNum = 7143466;BA.debugLine="secilenTestTuru = \"Shuttle Run\"";
_secilentestturu = "Shuttle Run";
RDebugUtils.currentLine=7143467;
 //BA.debugLineNum = 7143467;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="programayar";
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="programayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public static String  _buttongec_click() throws Exception{
RDebugUtils.currentModule="programayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttongec_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttongec_click", null));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub ButtonGec_Click";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="If EditTextProgramAdi.Text.Length == 0 Then";
if (mostCurrent._edittextprogramadi.getText().length()==0) { 
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="ToastMessageShow(\"Program adını girmelisiniz\", T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Program adını girmelisiniz"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="Dim rs As ResultSet = Main.sql.ExecQuery(\"SELECT";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram  WHERE program_adi  = '"+mostCurrent._edittextprogramadi.getText()+"' ")));
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="If rs.RowCount >0 Then";
if (_rs.getRowCount()>0) { 
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="Msgbox(\"Bu program adı kaydedildi\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Bu program adı kaydedildi"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="programAdi = EditTextProgramAdi.Text";
_programadi = mostCurrent._edittextprogramadi.getText();
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="StartActivity(ProgramVeri)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programveri.getObject()));
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="End Sub";
return "";
}
public static String  _spinnerlevel_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="programayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnerlevel_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnerlevel_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub SpinnerLevel_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="secilenLevel= Value";
_secilenlevel = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
return "";
}
public static String  _spinnertestturu_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="programayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnertestturu_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnertestturu_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub SpinnerTestTuru_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="secilenTestTuru = Value";
_secilentestturu = BA.ObjectToString(_value);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
}