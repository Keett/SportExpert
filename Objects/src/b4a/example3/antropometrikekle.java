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

public class antropometrikekle extends Activity implements B4AActivity{
	public static antropometrikekle mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.antropometrikekle");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (antropometrikekle).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.antropometrikekle");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.antropometrikekle", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (antropometrikekle) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (antropometrikekle) Resume **");
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
		return antropometrikekle.class;
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
        BA.LogInfo("** Activity (antropometrikekle) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            antropometrikekle mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (antropometrikekle) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttonok = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextantropometrikboy = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextantropometrikkilo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexteluzunlugu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkulacuzunlugu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextoturmayuksekligi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextayakuzunlugu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext5derikivrimkalinligi = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelantropometrikboy = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelantropometrikkilo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeleluzunlugu = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkulacuzunlugu = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeloturmayuksekligi = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelayakuzunlugu = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelderikivrimkalinligi = null;
public static int _antropometrikid = 0;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static String _secilentarih = "";
public static String _secilensaat = "";
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
public b4a.example3.denekduzenlesil _denekduzenlesil = null;
public b4a.example3.antropometriklistele _antropometriklistele = null;
public b4a.example3.saglikbilgilerisil _saglikbilgilerisil = null;
public b4a.example3.testmenu _testmenu = null;
public b4a.example3.motorozellikmenu _motorozellikmenu = null;
public b4a.example3.saglikbilgilerilistele _saglikbilgilerilistele = null;
public b4a.example3.biyokimyasalekle _biyokimyasalekle = null;
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
RDebugUtils.currentModule="antropometrikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="Activity.LoadLayout(\"AntropometrikEklePage\")";
mostCurrent._activity.LoadLayout("AntropometrikEklePage",mostCurrent.activityBA);
RDebugUtils.currentLine=37093382;
 //BA.debugLineNum = 37093382;BA.debugLine="LabelAntropometrikBoy.TextColor = Colors.White";
mostCurrent._labelantropometrikboy.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="LabelAntropometrikBoy.TextSize = 20";
mostCurrent._labelantropometrikboy.setTextSize((float) (20));
RDebugUtils.currentLine=37093384;
 //BA.debugLineNum = 37093384;BA.debugLine="LabelAntropometrikBoy.Typeface = Typeface.DEFAULT";
mostCurrent._labelantropometrikboy.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37093386;
 //BA.debugLineNum = 37093386;BA.debugLine="LabelAntropometrikKilo.TextColor = Colors.White";
mostCurrent._labelantropometrikkilo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093387;
 //BA.debugLineNum = 37093387;BA.debugLine="LabelAntropometrikKilo.TextSize = 20";
mostCurrent._labelantropometrikkilo.setTextSize((float) (20));
RDebugUtils.currentLine=37093388;
 //BA.debugLineNum = 37093388;BA.debugLine="LabelAntropometrikKilo.Typeface = Typeface.DEFAUL";
mostCurrent._labelantropometrikkilo.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37093390;
 //BA.debugLineNum = 37093390;BA.debugLine="LabelElUzunlugu.TextColor = Colors.White";
mostCurrent._labeleluzunlugu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093391;
 //BA.debugLineNum = 37093391;BA.debugLine="LabelElUzunlugu.TextSize = 20";
mostCurrent._labeleluzunlugu.setTextSize((float) (20));
RDebugUtils.currentLine=37093392;
 //BA.debugLineNum = 37093392;BA.debugLine="LabelElUzunlugu.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeleluzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37093394;
 //BA.debugLineNum = 37093394;BA.debugLine="LabelKulacUzunlugu.TextColor = Colors.White";
mostCurrent._labelkulacuzunlugu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093395;
 //BA.debugLineNum = 37093395;BA.debugLine="LabelKulacUzunlugu.TextSize = 20";
mostCurrent._labelkulacuzunlugu.setTextSize((float) (20));
RDebugUtils.currentLine=37093396;
 //BA.debugLineNum = 37093396;BA.debugLine="LabelKulacUzunlugu.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkulacuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37093398;
 //BA.debugLineNum = 37093398;BA.debugLine="LabelOturmaYuksekligi.TextColor = Colors.White";
mostCurrent._labeloturmayuksekligi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093399;
 //BA.debugLineNum = 37093399;BA.debugLine="LabelOturmaYuksekligi.TextSize = 20";
mostCurrent._labeloturmayuksekligi.setTextSize((float) (20));
RDebugUtils.currentLine=37093400;
 //BA.debugLineNum = 37093400;BA.debugLine="LabelOturmaYuksekligi.Typeface = Typeface.DEFAULT";
mostCurrent._labeloturmayuksekligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37093402;
 //BA.debugLineNum = 37093402;BA.debugLine="LabelAyakUzunlugu.TextColor = Colors.White";
mostCurrent._labelayakuzunlugu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093403;
 //BA.debugLineNum = 37093403;BA.debugLine="LabelAyakUzunlugu.TextSize = 20";
mostCurrent._labelayakuzunlugu.setTextSize((float) (20));
RDebugUtils.currentLine=37093404;
 //BA.debugLineNum = 37093404;BA.debugLine="LabelAyakUzunlugu.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelayakuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37093406;
 //BA.debugLineNum = 37093406;BA.debugLine="LabelDeriKivrimKalinligi.TextColor = Colors.White";
mostCurrent._labelderikivrimkalinligi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093407;
 //BA.debugLineNum = 37093407;BA.debugLine="LabelDeriKivrimKalinligi.TextSize = 20";
mostCurrent._labelderikivrimkalinligi.setTextSize((float) (20));
RDebugUtils.currentLine=37093408;
 //BA.debugLineNum = 37093408;BA.debugLine="LabelDeriKivrimKalinligi.Typeface = Typeface.DEFA";
mostCurrent._labelderikivrimkalinligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=37093410;
 //BA.debugLineNum = 37093410;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=37093411;
 //BA.debugLineNum = 37093411;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=37093413;
 //BA.debugLineNum = 37093413;BA.debugLine="EditTextAntropometrikBoy.TextColor = Colors.White";
mostCurrent._edittextantropometrikboy.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093414;
 //BA.debugLineNum = 37093414;BA.debugLine="EditTextAntropometrikBoy.Hint = \"Boy değerini cm";
mostCurrent._edittextantropometrikboy.setHint("Boy değerini cm cinsinden giriniz..");
RDebugUtils.currentLine=37093415;
 //BA.debugLineNum = 37093415;BA.debugLine="EditTextAntropometrikBoy.HintColor = Color.hintCo";
mostCurrent._edittextantropometrikboy.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=37093416;
 //BA.debugLineNum = 37093416;BA.debugLine="EditTextAntropometrikBoy.TextSize = 20";
mostCurrent._edittextantropometrikboy.setTextSize((float) (20));
RDebugUtils.currentLine=37093417;
 //BA.debugLineNum = 37093417;BA.debugLine="EditTextAntropometrikBoy.Typeface = Typeface.DEFA";
mostCurrent._edittextantropometrikboy.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=37093419;
 //BA.debugLineNum = 37093419;BA.debugLine="EditTextAntropometrikKilo.TextColor = Colors.Whit";
mostCurrent._edittextantropometrikkilo.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093420;
 //BA.debugLineNum = 37093420;BA.debugLine="EditTextAntropometrikKilo.Hint = \"Kilo değerini g";
mostCurrent._edittextantropometrikkilo.setHint("Kilo değerini giriniz..");
RDebugUtils.currentLine=37093421;
 //BA.debugLineNum = 37093421;BA.debugLine="EditTextAntropometrikKilo.HintColor = Color.hintC";
mostCurrent._edittextantropometrikkilo.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=37093422;
 //BA.debugLineNum = 37093422;BA.debugLine="EditTextAntropometrikKilo.TextSize = 20";
mostCurrent._edittextantropometrikkilo.setTextSize((float) (20));
RDebugUtils.currentLine=37093423;
 //BA.debugLineNum = 37093423;BA.debugLine="EditTextAntropometrikKilo.Typeface = Typeface.DEF";
mostCurrent._edittextantropometrikkilo.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=37093425;
 //BA.debugLineNum = 37093425;BA.debugLine="EditTextElUzunlugu.TextColor = Colors.White";
mostCurrent._edittexteluzunlugu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093426;
 //BA.debugLineNum = 37093426;BA.debugLine="EditTextElUzunlugu.Hint = \"El uzunluk değerini cm";
mostCurrent._edittexteluzunlugu.setHint("El uzunluk değerini cm cinsinden giriniz..");
RDebugUtils.currentLine=37093427;
 //BA.debugLineNum = 37093427;BA.debugLine="EditTextElUzunlugu.HintColor = Color.hintColor";
mostCurrent._edittexteluzunlugu.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=37093428;
 //BA.debugLineNum = 37093428;BA.debugLine="EditTextElUzunlugu.TextSize = 20";
mostCurrent._edittexteluzunlugu.setTextSize((float) (20));
RDebugUtils.currentLine=37093429;
 //BA.debugLineNum = 37093429;BA.debugLine="EditTextElUzunlugu.Typeface = Typeface.DEFAULT";
mostCurrent._edittexteluzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=37093431;
 //BA.debugLineNum = 37093431;BA.debugLine="EditTextKulacUzunlugu.TextColor = Colors.White";
mostCurrent._edittextkulacuzunlugu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093432;
 //BA.debugLineNum = 37093432;BA.debugLine="EditTextKulacUzunlugu.Hint = \"Kulaç uzunluk değer";
mostCurrent._edittextkulacuzunlugu.setHint("Kulaç uzunluk değerini cm cinsinden giriniz..");
RDebugUtils.currentLine=37093433;
 //BA.debugLineNum = 37093433;BA.debugLine="EditTextKulacUzunlugu.HintColor = Color.hintColor";
mostCurrent._edittextkulacuzunlugu.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=37093434;
 //BA.debugLineNum = 37093434;BA.debugLine="EditTextKulacUzunlugu.TextSize = 20";
mostCurrent._edittextkulacuzunlugu.setTextSize((float) (20));
RDebugUtils.currentLine=37093435;
 //BA.debugLineNum = 37093435;BA.debugLine="EditTextKulacUzunlugu.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkulacuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=37093437;
 //BA.debugLineNum = 37093437;BA.debugLine="EditTextOturmaYuksekligi.TextColor = Colors.White";
mostCurrent._edittextoturmayuksekligi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093438;
 //BA.debugLineNum = 37093438;BA.debugLine="EditTextOturmaYuksekligi.Hint = \"Oturma yükseklik";
mostCurrent._edittextoturmayuksekligi.setHint("Oturma yükseklik değerini cm cinsinden giriniz..");
RDebugUtils.currentLine=37093439;
 //BA.debugLineNum = 37093439;BA.debugLine="EditTextOturmaYuksekligi.HintColor = Color.hintCo";
mostCurrent._edittextoturmayuksekligi.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=37093440;
 //BA.debugLineNum = 37093440;BA.debugLine="EditTextOturmaYuksekligi.TextSize = 20";
mostCurrent._edittextoturmayuksekligi.setTextSize((float) (20));
RDebugUtils.currentLine=37093441;
 //BA.debugLineNum = 37093441;BA.debugLine="EditTextOturmaYuksekligi.Typeface = Typeface.DEFA";
mostCurrent._edittextoturmayuksekligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=37093443;
 //BA.debugLineNum = 37093443;BA.debugLine="EditTextAyakUzunlugu.TextColor = Colors.White";
mostCurrent._edittextayakuzunlugu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093444;
 //BA.debugLineNum = 37093444;BA.debugLine="EditTextAyakUzunlugu.Hint = \"Ayak uzunluk değerin";
mostCurrent._edittextayakuzunlugu.setHint("Ayak uzunluk değerini cm cinsinden giriniz..");
RDebugUtils.currentLine=37093445;
 //BA.debugLineNum = 37093445;BA.debugLine="EditTextAyakUzunlugu.HintColor = Color.hintColor";
mostCurrent._edittextayakuzunlugu.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=37093446;
 //BA.debugLineNum = 37093446;BA.debugLine="EditTextAyakUzunlugu.TextSize = 20";
mostCurrent._edittextayakuzunlugu.setTextSize((float) (20));
RDebugUtils.currentLine=37093447;
 //BA.debugLineNum = 37093447;BA.debugLine="EditTextAyakUzunlugu.Typeface = Typeface.DEFAULT";
mostCurrent._edittextayakuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=37093449;
 //BA.debugLineNum = 37093449;BA.debugLine="EditText5DeriKivrimKalinligi.TextColor = Colors.W";
mostCurrent._edittext5derikivrimkalinligi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=37093450;
 //BA.debugLineNum = 37093450;BA.debugLine="EditText5DeriKivrimKalinligi.Hint = \"Deri kıvrım";
mostCurrent._edittext5derikivrimkalinligi.setHint("Deri kıvrım kalınlık değerini cm cinsinden giriniz..");
RDebugUtils.currentLine=37093451;
 //BA.debugLineNum = 37093451;BA.debugLine="EditText5DeriKivrimKalinligi.HintColor = Color.hi";
mostCurrent._edittext5derikivrimkalinligi.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=37093452;
 //BA.debugLineNum = 37093452;BA.debugLine="EditText5DeriKivrimKalinligi.TextSize = 20";
mostCurrent._edittext5derikivrimkalinligi.setTextSize((float) (20));
RDebugUtils.currentLine=37093453;
 //BA.debugLineNum = 37093453;BA.debugLine="EditText5DeriKivrimKalinligi.Typeface = Typeface.";
mostCurrent._edittext5derikivrimkalinligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=37093457;
 //BA.debugLineNum = 37093457;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=37093458;
 //BA.debugLineNum = 37093458;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="antropometrikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_id As [ID], denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+mostCurrent._testdenekara._secilendenek /*String*/ +"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="antropometrikekle";
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="antropometrikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="End Sub";
return "";
}
public static String  _buttonok_click() throws Exception{
RDebugUtils.currentModule="antropometrikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonok_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonok_click", null));}
int _result = 0;
long _now = 0L;
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Sub ButtonOk_Click";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="result = Msgbox2(\"Antropometrik analiz verilerini";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Antropometrik analiz verilerini eklemek istiyor musunuz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="If result= DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=37421061;
 //BA.debugLineNum = 37421061;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=37421062;
 //BA.debugLineNum = 37421062;BA.debugLine="Log(DateTime.Date(now))";
anywheresoftware.b4a.keywords.Common.LogImpl("237421062",anywheresoftware.b4a.keywords.Common.DateTime.Date(_now),0);
RDebugUtils.currentLine=37421063;
 //BA.debugLineNum = 37421063;BA.debugLine="secilenTarih = DateTime.Date(now)";
mostCurrent._secilentarih = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=37421064;
 //BA.debugLineNum = 37421064;BA.debugLine="Log(DateTime.Time(now))";
anywheresoftware.b4a.keywords.Common.LogImpl("237421064",anywheresoftware.b4a.keywords.Common.DateTime.Time(_now),0);
RDebugUtils.currentLine=37421065;
 //BA.debugLineNum = 37421065;BA.debugLine="secilenSaat = DateTime.Time(now)";
mostCurrent._secilensaat = anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
RDebugUtils.currentLine=37421066;
 //BA.debugLineNum = 37421066;BA.debugLine="ID";
_id();
RDebugUtils.currentLine=37421068;
 //BA.debugLineNum = 37421068;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Antropometri";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO Antropometrik VALUES(?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_antropometrikid),(Object)(mostCurrent._testdenekara._secilendenek /*String*/ ),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat),(Object)(mostCurrent._edittextantropometrikboy.getText()),(Object)(mostCurrent._edittextantropometrikkilo.getText()),(Object)(mostCurrent._edittexteluzunlugu.getText()),(Object)(mostCurrent._edittextkulacuzunlugu.getText()),(Object)(mostCurrent._edittextoturmayuksekligi.getText()),(Object)(mostCurrent._edittextayakuzunlugu.getText()),(Object)(mostCurrent._edittext5derikivrimkalinligi.getText())}));
RDebugUtils.currentLine=37421069;
 //BA.debugLineNum = 37421069;BA.debugLine="Log(\"ANTROPOMETRİK VERİLER EKLENDİ\")";
anywheresoftware.b4a.keywords.Common.LogImpl("237421069","ANTROPOMETRİK VERİLER EKLENDİ",0);
RDebugUtils.currentLine=37421070;
 //BA.debugLineNum = 37421070;BA.debugLine="StartActivity(AntropometrikListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antropometriklistele.getObject()));
RDebugUtils.currentLine=37421071;
 //BA.debugLineNum = 37421071;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=37421072;
 //BA.debugLineNum = 37421072;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=37421073;
 //BA.debugLineNum = 37421073;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=37421074;
 //BA.debugLineNum = 37421074;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=37421076;
 //BA.debugLineNum = 37421076;BA.debugLine="End Sub";
return "";
}
public static String  _id() throws Exception{
RDebugUtils.currentModule="antropometrikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "id", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "id", null));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Sub ID";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="sf.initialize";
_sf._initialize(processBA);
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Antropometr";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik ORDER BY antropometrik_id DESC")));
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="If rs.RowCount>0 Then";
if (mostCurrent._rs.getRowCount()>0) { 
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="rs.Position=0";
mostCurrent._rs.setPosition((int) (0));
RDebugUtils.currentLine=37355527;
 //BA.debugLineNum = 37355527;BA.debugLine="AntropometrikID = sf.Right(\"00\" &sf.Trim(sf.Val(";
_antropometrikid = (int)(Double.parseDouble(_sf._vvvvv7("00"+_sf._vvvvvvv4(BA.NumberToString(_sf._vvvvvvv6(_sf._vvvvv7(mostCurrent._rs.GetString("antropometrik_id"),(long) (3)))+1)),(long) (3))));
 }else {
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="AntropometrikID=\"001\"";
_antropometrikid = (int)(Double.parseDouble("001"));
 };
RDebugUtils.currentLine=37355531;
 //BA.debugLineNum = 37355531;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=37355532;
 //BA.debugLineNum = 37355532;BA.debugLine="End Sub";
return "";
}
}