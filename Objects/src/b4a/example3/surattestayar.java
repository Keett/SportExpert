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

public class surattestayar extends Activity implements B4AActivity{
	public static surattestayar mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.surattestayar");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (surattestayar).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.surattestayar");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.surattestayar", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (surattestayar) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (surattestayar) Resume **");
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
		return surattestayar.class;
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
        BA.LogInfo("** Activity (surattestayar) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            surattestayar mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (surattestayar) Resume **");
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
public static String _secilenmode = "";
public static int _gate = 0;
public static int _set = 0;
public static int _result = 0;
public static int _degerdakika = 0;
public static int _degersaniye = 0;
public static int _restdegerbul = 0;
public anywheresoftware.b4a.objects.LabelWrapper _labelmode = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnermode = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelgate = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelset = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonok = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnergate = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerset = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye = null;
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
RDebugUtils.currentModule="surattestayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Activity.LoadLayout(\"SuratTestAyarPage\")";
mostCurrent._activity.LoadLayout("SuratTestAyarPage",mostCurrent.activityBA);
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="SpinnerMode.DropdownBackgroundColor = Colors.Whit";
mostCurrent._spinnermode.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821190;
 //BA.debugLineNum = 25821190;BA.debugLine="SpinnerMode.DropdownTextColor = Color.koyuMavi";
mostCurrent._spinnermode.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="SpinnerMode.TextColor= Colors.White";
mostCurrent._spinnermode.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821192;
 //BA.debugLineNum = 25821192;BA.debugLine="SpinnerMode.TextSize = 20";
mostCurrent._spinnermode.setTextSize((float) (20));
RDebugUtils.currentLine=25821194;
 //BA.debugLineNum = 25821194;BA.debugLine="SpinnerGate.DropdownBackgroundColor= Colors.White";
mostCurrent._spinnergate.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821195;
 //BA.debugLineNum = 25821195;BA.debugLine="SpinnerGate.DropdownTextColor= Color.koyuMavi";
mostCurrent._spinnergate.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="SpinnerGate.TextColor= Colors.White";
mostCurrent._spinnergate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821197;
 //BA.debugLineNum = 25821197;BA.debugLine="SpinnerGate.TextSize = 20";
mostCurrent._spinnergate.setTextSize((float) (20));
RDebugUtils.currentLine=25821199;
 //BA.debugLineNum = 25821199;BA.debugLine="SpinnerSet.DropdownBackgroundColor= Colors.White";
mostCurrent._spinnerset.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821200;
 //BA.debugLineNum = 25821200;BA.debugLine="SpinnerSet.DropdownTextColor= Color.koyuMavi";
mostCurrent._spinnerset.setDropdownTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=25821201;
 //BA.debugLineNum = 25821201;BA.debugLine="SpinnerSet.TextColor= Colors.White";
mostCurrent._spinnerset.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821202;
 //BA.debugLineNum = 25821202;BA.debugLine="SpinnerSet.TextSize = 20";
mostCurrent._spinnerset.setTextSize((float) (20));
RDebugUtils.currentLine=25821204;
 //BA.debugLineNum = 25821204;BA.debugLine="LabelMode.TextColor = Colors.White";
mostCurrent._labelmode.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821205;
 //BA.debugLineNum = 25821205;BA.debugLine="LabelMode.TextSize = 20";
mostCurrent._labelmode.setTextSize((float) (20));
RDebugUtils.currentLine=25821206;
 //BA.debugLineNum = 25821206;BA.debugLine="LabelMode.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelmode.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=25821208;
 //BA.debugLineNum = 25821208;BA.debugLine="LabelGate.TextColor = Colors.White";
mostCurrent._labelgate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821209;
 //BA.debugLineNum = 25821209;BA.debugLine="LabelGate.TextSize = 20";
mostCurrent._labelgate.setTextSize((float) (20));
RDebugUtils.currentLine=25821210;
 //BA.debugLineNum = 25821210;BA.debugLine="LabelGate.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelgate.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=25821212;
 //BA.debugLineNum = 25821212;BA.debugLine="LabelSet.TextColor = Colors.White";
mostCurrent._labelset.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821213;
 //BA.debugLineNum = 25821213;BA.debugLine="LabelSet.TextSize = 20";
mostCurrent._labelset.setTextSize((float) (20));
RDebugUtils.currentLine=25821214;
 //BA.debugLineNum = 25821214;BA.debugLine="LabelSet.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelset.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=25821216;
 //BA.debugLineNum = 25821216;BA.debugLine="LabelDakika.TextColor = Colors.White";
mostCurrent._labeldakika.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821217;
 //BA.debugLineNum = 25821217;BA.debugLine="LabelDakika.TextSize = 20";
mostCurrent._labeldakika.setTextSize((float) (20));
RDebugUtils.currentLine=25821218;
 //BA.debugLineNum = 25821218;BA.debugLine="LabelDakika.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=25821220;
 //BA.debugLineNum = 25821220;BA.debugLine="LabelSaniye.TextColor = Colors.White";
mostCurrent._labelsaniye.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821221;
 //BA.debugLineNum = 25821221;BA.debugLine="LabelSaniye.TextSize = 20";
mostCurrent._labelsaniye.setTextSize((float) (20));
RDebugUtils.currentLine=25821222;
 //BA.debugLineNum = 25821222;BA.debugLine="LabelSaniye.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=25821224;
 //BA.debugLineNum = 25821224;BA.debugLine="EditTextDakika.TextSize = 20";
mostCurrent._edittextdakika.setTextSize((float) (20));
RDebugUtils.currentLine=25821225;
 //BA.debugLineNum = 25821225;BA.debugLine="EditTextDakika.TextColor = Colors.White";
mostCurrent._edittextdakika.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821226;
 //BA.debugLineNum = 25821226;BA.debugLine="EditTextDakika.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=25821227;
 //BA.debugLineNum = 25821227;BA.debugLine="EditTextDakika.Text = 0";
mostCurrent._edittextdakika.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=25821229;
 //BA.debugLineNum = 25821229;BA.debugLine="EditTextSaniye.TextSize = 20";
mostCurrent._edittextsaniye.setTextSize((float) (20));
RDebugUtils.currentLine=25821230;
 //BA.debugLineNum = 25821230;BA.debugLine="EditTextSaniye.TextColor = Colors.White";
mostCurrent._edittextsaniye.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=25821231;
 //BA.debugLineNum = 25821231;BA.debugLine="EditTextSaniye.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=25821232;
 //BA.debugLineNum = 25821232;BA.debugLine="EditTextSaniye.Text = 5";
mostCurrent._edittextsaniye.setText(BA.ObjectToCharSequence(5));
RDebugUtils.currentLine=25821236;
 //BA.debugLineNum = 25821236;BA.debugLine="SpinnerMode.AddAll(Array As String(\"Lap Mode\",\"Sp";
mostCurrent._spinnermode.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Lap Mode","Split Mode","Rest Mode"}));
RDebugUtils.currentLine=25821237;
 //BA.debugLineNum = 25821237;BA.debugLine="SpinnerGate.AddAll(Array As Int(0,2,3,4,5,6,7,8,9";
mostCurrent._spinnergate.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (0),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12),(int) (13),(int) (14),(int) (15),(int) (16),(int) (17),(int) (18),(int) (19),(int) (20)}));
RDebugUtils.currentLine=25821239;
 //BA.debugLineNum = 25821239;BA.debugLine="SpinnerSet.Visible = False";
mostCurrent._spinnerset.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25821240;
 //BA.debugLineNum = 25821240;BA.debugLine="LabelSet.Visible = False";
mostCurrent._labelset.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25821241;
 //BA.debugLineNum = 25821241;BA.debugLine="set = 1";
_set = (int) (1);
RDebugUtils.currentLine=25821243;
 //BA.debugLineNum = 25821243;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="surattestayar";
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="surattestayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="End Sub";
return "";
}
public static String  _buttonok_click() throws Exception{
RDebugUtils.currentModule="surattestayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonok_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonok_click", null));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Sub ButtonOK_Click";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="If gate == 0 Then";
if (_gate==0) { 
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="Msgbox(\"Gate Sayısı boş bırakılamaz\",\"Bildirim M";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Gate Sayısı boş bırakılamaz"),BA.ObjectToCharSequence("Bildirim Mesajı"),mostCurrent.activityBA);
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=26083333;
 //BA.debugLineNum = 26083333;BA.debugLine="If set == 0 Then";
if (_set==0) { 
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="Msgbox(\"Set sayısı boş bırakılamaz\",\"Bildirim Me";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Set sayısı boş bırakılamaz"),BA.ObjectToCharSequence("Bildirim Mesajı"),mostCurrent.activityBA);
RDebugUtils.currentLine=26083335;
 //BA.debugLineNum = 26083335;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=26083337;
 //BA.debugLineNum = 26083337;BA.debugLine="If set <> 0 And gate <> 0 Then";
if (_set!=0 && _gate!=0) { 
RDebugUtils.currentLine=26083338;
 //BA.debugLineNum = 26083338;BA.debugLine="result = set * (gate -1)";
_result = (int) (_set*(_gate-1));
RDebugUtils.currentLine=26083339;
 //BA.debugLineNum = 26083339;BA.debugLine="Log(\"result :\" &result)";
anywheresoftware.b4a.keywords.Common.LogImpl("226083339","result :"+BA.NumberToString(_result),0);
RDebugUtils.currentLine=26083340;
 //BA.debugLineNum = 26083340;BA.debugLine="restDegerBul = result/set";
_restdegerbul = (int) (_result/(double)_set);
RDebugUtils.currentLine=26083341;
 //BA.debugLineNum = 26083341;BA.debugLine="Log(\"restDeger Bul:\" &restDegerBul)";
anywheresoftware.b4a.keywords.Common.LogImpl("226083341","restDeger Bul:"+BA.NumberToString(_restdegerbul),0);
RDebugUtils.currentLine=26083343;
 //BA.debugLineNum = 26083343;BA.debugLine="If EditTextDakika.Text > 59 Then";
if ((double)(Double.parseDouble(mostCurrent._edittextdakika.getText()))>59) { 
RDebugUtils.currentLine=26083344;
 //BA.debugLineNum = 26083344;BA.debugLine="ToastMessageShow(\"Dakika değerini en fazla 59 y";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Dakika değerini en fazla 59 yapınız"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26083345;
 //BA.debugLineNum = 26083345;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=26083347;
 //BA.debugLineNum = 26083347;BA.debugLine="Log(\"burada\")";
anywheresoftware.b4a.keywords.Common.LogImpl("226083347","burada",0);
RDebugUtils.currentLine=26083348;
 //BA.debugLineNum = 26083348;BA.debugLine="degerDakika = EditTextDakika.Text";
_degerdakika = (int)(Double.parseDouble(mostCurrent._edittextdakika.getText()));
RDebugUtils.currentLine=26083349;
 //BA.debugLineNum = 26083349;BA.debugLine="degerSaniye = EditTextSaniye.Text";
_degersaniye = (int)(Double.parseDouble(mostCurrent._edittextsaniye.getText()));
 };
RDebugUtils.currentLine=26083352;
 //BA.debugLineNum = 26083352;BA.debugLine="StartActivity(SuratTestEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._surattestekle.getObject()));
RDebugUtils.currentLine=26083353;
 //BA.debugLineNum = 26083353;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=26083355;
 //BA.debugLineNum = 26083355;BA.debugLine="End Sub";
return "";
}
public static String  _spinnergate_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="surattestayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnergate_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnergate_itemclick", new Object[] {_position,_value}));}
int[] _setdizi = null;
int _i = 0;
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Sub SpinnerGate_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="gate = Value";
_gate = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="If gate == 0 Then";
if (_gate==0) { 
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="ToastMessageShow(\"Varsayılan gate sayısı 2 olara";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Varsayılan gate sayısı 2 olarak ayarlandı"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="gate = 2";
_gate = (int) (2);
 };
RDebugUtils.currentLine=26148872;
 //BA.debugLineNum = 26148872;BA.debugLine="If gate== 20 Or gate==19 Or gate==18 Then";
if (_gate==20 || _gate==19 || _gate==18) { 
RDebugUtils.currentLine=26148873;
 //BA.debugLineNum = 26148873;BA.debugLine="Dim setDizi(6) As Int";
_setdizi = new int[(int) (6)];
;
RDebugUtils.currentLine=26148874;
 //BA.debugLineNum = 26148874;BA.debugLine="For i=1 To 5";
{
final int step8 = 1;
final int limit8 = (int) (5);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=26148875;
 //BA.debugLineNum = 26148875;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148877;
 //BA.debugLineNum = 26148877;BA.debugLine="Else If gate== 16 Or gate ==17 Then";
if (_gate==16 || _gate==17) { 
RDebugUtils.currentLine=26148878;
 //BA.debugLineNum = 26148878;BA.debugLine="Dim setDizi(7) As Int";
_setdizi = new int[(int) (7)];
;
RDebugUtils.currentLine=26148879;
 //BA.debugLineNum = 26148879;BA.debugLine="For i=1 To 6";
{
final int step13 = 1;
final int limit13 = (int) (6);
_i = (int) (1) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=26148880;
 //BA.debugLineNum = 26148880;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148882;
 //BA.debugLineNum = 26148882;BA.debugLine="Else if gate== 14 Or gate== 15 Then";
if (_gate==14 || _gate==15) { 
RDebugUtils.currentLine=26148883;
 //BA.debugLineNum = 26148883;BA.debugLine="Dim setDizi(8) As Int";
_setdizi = new int[(int) (8)];
;
RDebugUtils.currentLine=26148884;
 //BA.debugLineNum = 26148884;BA.debugLine="For i=1 To 7";
{
final int step18 = 1;
final int limit18 = (int) (7);
_i = (int) (1) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=26148885;
 //BA.debugLineNum = 26148885;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148887;
 //BA.debugLineNum = 26148887;BA.debugLine="Else if gate == 13 Then";
if (_gate==13) { 
RDebugUtils.currentLine=26148888;
 //BA.debugLineNum = 26148888;BA.debugLine="Dim setDizi(9) As Int";
_setdizi = new int[(int) (9)];
;
RDebugUtils.currentLine=26148889;
 //BA.debugLineNum = 26148889;BA.debugLine="For i=1 To 8";
{
final int step23 = 1;
final int limit23 = (int) (8);
_i = (int) (1) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=26148890;
 //BA.debugLineNum = 26148890;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148892;
 //BA.debugLineNum = 26148892;BA.debugLine="Else if gate == 12 Then";
if (_gate==12) { 
RDebugUtils.currentLine=26148893;
 //BA.debugLineNum = 26148893;BA.debugLine="Dim setDizi(10) As Int";
_setdizi = new int[(int) (10)];
;
RDebugUtils.currentLine=26148894;
 //BA.debugLineNum = 26148894;BA.debugLine="For i=1 To 9";
{
final int step28 = 1;
final int limit28 = (int) (9);
_i = (int) (1) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=26148895;
 //BA.debugLineNum = 26148895;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148897;
 //BA.debugLineNum = 26148897;BA.debugLine="else if gate== 11 Then";
if (_gate==11) { 
RDebugUtils.currentLine=26148898;
 //BA.debugLineNum = 26148898;BA.debugLine="Dim setDizi(11) As Int";
_setdizi = new int[(int) (11)];
;
RDebugUtils.currentLine=26148899;
 //BA.debugLineNum = 26148899;BA.debugLine="For i=1 To 10";
{
final int step33 = 1;
final int limit33 = (int) (10);
_i = (int) (1) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=26148900;
 //BA.debugLineNum = 26148900;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148902;
 //BA.debugLineNum = 26148902;BA.debugLine="Else if gate==10 Then";
if (_gate==10) { 
RDebugUtils.currentLine=26148903;
 //BA.debugLineNum = 26148903;BA.debugLine="Dim setDizi(12) As Int";
_setdizi = new int[(int) (12)];
;
RDebugUtils.currentLine=26148904;
 //BA.debugLineNum = 26148904;BA.debugLine="For i=1 To 11";
{
final int step38 = 1;
final int limit38 = (int) (11);
_i = (int) (1) ;
for (;_i <= limit38 ;_i = _i + step38 ) {
RDebugUtils.currentLine=26148905;
 //BA.debugLineNum = 26148905;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148907;
 //BA.debugLineNum = 26148907;BA.debugLine="Else If gate== 9 Then";
if (_gate==9) { 
RDebugUtils.currentLine=26148908;
 //BA.debugLineNum = 26148908;BA.debugLine="Dim setDizi(13) As Int";
_setdizi = new int[(int) (13)];
;
RDebugUtils.currentLine=26148909;
 //BA.debugLineNum = 26148909;BA.debugLine="For i=1 To 12";
{
final int step43 = 1;
final int limit43 = (int) (12);
_i = (int) (1) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=26148910;
 //BA.debugLineNum = 26148910;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148912;
 //BA.debugLineNum = 26148912;BA.debugLine="Else if gate == 8 Then";
if (_gate==8) { 
RDebugUtils.currentLine=26148913;
 //BA.debugLineNum = 26148913;BA.debugLine="Dim setDizi(15) As Int";
_setdizi = new int[(int) (15)];
;
RDebugUtils.currentLine=26148914;
 //BA.debugLineNum = 26148914;BA.debugLine="For i=1 To 14";
{
final int step48 = 1;
final int limit48 = (int) (14);
_i = (int) (1) ;
for (;_i <= limit48 ;_i = _i + step48 ) {
RDebugUtils.currentLine=26148915;
 //BA.debugLineNum = 26148915;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148917;
 //BA.debugLineNum = 26148917;BA.debugLine="Else if gate == 7 Then";
if (_gate==7) { 
RDebugUtils.currentLine=26148918;
 //BA.debugLineNum = 26148918;BA.debugLine="Dim setDizi(17) As Int";
_setdizi = new int[(int) (17)];
;
RDebugUtils.currentLine=26148919;
 //BA.debugLineNum = 26148919;BA.debugLine="For i=1 To 16";
{
final int step53 = 1;
final int limit53 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit53 ;_i = _i + step53 ) {
RDebugUtils.currentLine=26148920;
 //BA.debugLineNum = 26148920;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148922;
 //BA.debugLineNum = 26148922;BA.debugLine="Else if gate == 6 Then";
if (_gate==6) { 
RDebugUtils.currentLine=26148923;
 //BA.debugLineNum = 26148923;BA.debugLine="Dim setDizi(21) As Int";
_setdizi = new int[(int) (21)];
;
RDebugUtils.currentLine=26148924;
 //BA.debugLineNum = 26148924;BA.debugLine="For i=1 To 20";
{
final int step58 = 1;
final int limit58 = (int) (20);
_i = (int) (1) ;
for (;_i <= limit58 ;_i = _i + step58 ) {
RDebugUtils.currentLine=26148925;
 //BA.debugLineNum = 26148925;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148927;
 //BA.debugLineNum = 26148927;BA.debugLine="Else if gate== 5 Then";
if (_gate==5) { 
RDebugUtils.currentLine=26148928;
 //BA.debugLineNum = 26148928;BA.debugLine="Dim setDizi(26) As Int";
_setdizi = new int[(int) (26)];
;
RDebugUtils.currentLine=26148929;
 //BA.debugLineNum = 26148929;BA.debugLine="For i=1 To 25";
{
final int step63 = 1;
final int limit63 = (int) (25);
_i = (int) (1) ;
for (;_i <= limit63 ;_i = _i + step63 ) {
RDebugUtils.currentLine=26148930;
 //BA.debugLineNum = 26148930;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148932;
 //BA.debugLineNum = 26148932;BA.debugLine="Else If gate==4 Then";
if (_gate==4) { 
RDebugUtils.currentLine=26148933;
 //BA.debugLineNum = 26148933;BA.debugLine="Dim setDizi(34) As Int";
_setdizi = new int[(int) (34)];
;
RDebugUtils.currentLine=26148934;
 //BA.debugLineNum = 26148934;BA.debugLine="For i=1 To 33";
{
final int step68 = 1;
final int limit68 = (int) (33);
_i = (int) (1) ;
for (;_i <= limit68 ;_i = _i + step68 ) {
RDebugUtils.currentLine=26148935;
 //BA.debugLineNum = 26148935;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148937;
 //BA.debugLineNum = 26148937;BA.debugLine="Else if gate==3 Then";
if (_gate==3) { 
RDebugUtils.currentLine=26148938;
 //BA.debugLineNum = 26148938;BA.debugLine="Dim setDizi(51) As Int";
_setdizi = new int[(int) (51)];
;
RDebugUtils.currentLine=26148939;
 //BA.debugLineNum = 26148939;BA.debugLine="For i=1 To 50";
{
final int step73 = 1;
final int limit73 = (int) (50);
_i = (int) (1) ;
for (;_i <= limit73 ;_i = _i + step73 ) {
RDebugUtils.currentLine=26148940;
 //BA.debugLineNum = 26148940;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else 
{RDebugUtils.currentLine=26148942;
 //BA.debugLineNum = 26148942;BA.debugLine="Else if gate == 2 Then";
if (_gate==2) { 
RDebugUtils.currentLine=26148943;
 //BA.debugLineNum = 26148943;BA.debugLine="Dim setDizi(101) As Int";
_setdizi = new int[(int) (101)];
;
RDebugUtils.currentLine=26148944;
 //BA.debugLineNum = 26148944;BA.debugLine="For i=1 To 100";
{
final int step78 = 1;
final int limit78 = (int) (100);
_i = (int) (1) ;
for (;_i <= limit78 ;_i = _i + step78 ) {
RDebugUtils.currentLine=26148945;
 //BA.debugLineNum = 26148945;BA.debugLine="setDizi(i) = i";
_setdizi[_i] = _i;
 }
};
 }else {
RDebugUtils.currentLine=26148948;
 //BA.debugLineNum = 26148948;BA.debugLine="ToastMessageShow(\"gate seçilmedi\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("gate seçilmedi"),anywheresoftware.b4a.keywords.Common.True);
 }}}}}}}}}}}}}}}
;
RDebugUtils.currentLine=26148952;
 //BA.debugLineNum = 26148952;BA.debugLine="SpinnerSet.Clear";
mostCurrent._spinnerset.Clear();
RDebugUtils.currentLine=26148953;
 //BA.debugLineNum = 26148953;BA.debugLine="SpinnerSet.AddAll(setDizi)";
mostCurrent._spinnerset.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(_setdizi));
RDebugUtils.currentLine=26148954;
 //BA.debugLineNum = 26148954;BA.debugLine="End Sub";
return "";
}
public static String  _spinnermode_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="surattestayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnermode_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnermode_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub SpinnerMode_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="secilenMode = Value";
_secilenmode = BA.ObjectToString(_value);
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="If secilenMode = \"Rest Mode\" Then";
if ((_secilenmode).equals("Rest Mode")) { 
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="SpinnerSet.Visible = True";
mostCurrent._spinnerset.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="LabelSet.Visible = True";
mostCurrent._labelset.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="SpinnerSet.Visible = False";
mostCurrent._spinnerset.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="LabelSet.Visible = False";
mostCurrent._labelset.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="set = 1";
_set = (int) (1);
 };
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="End Sub";
return "";
}
public static String  _spinnerset_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="surattestayar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnerset_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnerset_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Sub SpinnerSet_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="set = Value";
_set = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="End Sub";
return "";
}
}