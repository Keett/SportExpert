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

public class dayanikliliktestlistele extends Activity implements B4AActivity{
	public static dayanikliliktestlistele mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.dayanikliliktestlistele");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (dayanikliliktestlistele).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.dayanikliliktestlistele");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.dayanikliliktestlistele", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (dayanikliliktestlistele) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (dayanikliliktestlistele) Resume **");
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
		return dayanikliliktestlistele.class;
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
        BA.LogInfo("** Activity (dayanikliliktestlistele) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            dayanikliliktestlistele mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (dayanikliliktestlistele) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttonanasayfa = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondayanikliliktestekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsil = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondenektc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondenekisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonprogramadi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontestturu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlevel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmekiksayisi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
public b4a.example3.antranorgorussil _antranorgorussil = null;
public b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
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
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Activity.LoadLayout(\"DayaniklilikTestListelePage\"";
mostCurrent._activity.LoadLayout("DayaniklilikTestListelePage",mostCurrent.activityBA);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="ButtonDenekTC.TextColor = Color.koyuMavi";
mostCurrent._buttondenektc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="ButtonDenekTC.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttondenektc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="ButtonDenekTC.TextSize = 14";
mostCurrent._buttondenektc.setTextSize((float) (14));
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="ButtonDenekTC.SingleLine = True";
mostCurrent._buttondenektc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="ButtonDenekIsim.TextColor = Color.koyuMavi";
mostCurrent._buttondenekisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="ButtonDenekIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttondenekisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2686995;
 //BA.debugLineNum = 2686995;BA.debugLine="ButtonDenekIsim.TextSize = 14";
mostCurrent._buttondenekisim.setTextSize((float) (14));
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="ButtonDenekIsim.SingleLine = True";
mostCurrent._buttondenekisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2686998;
 //BA.debugLineNum = 2686998;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
mostCurrent._buttonprogramadi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=2686999;
 //BA.debugLineNum = 2686999;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonprogramadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="ButtonProgramAdi.TextSize = 14";
mostCurrent._buttonprogramadi.setTextSize((float) (14));
RDebugUtils.currentLine=2687001;
 //BA.debugLineNum = 2687001;BA.debugLine="ButtonProgramAdi.SingleLine = True";
mostCurrent._buttonprogramadi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2687003;
 //BA.debugLineNum = 2687003;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
mostCurrent._buttontestturu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=2687004;
 //BA.debugLineNum = 2687004;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontestturu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2687005;
 //BA.debugLineNum = 2687005;BA.debugLine="ButtonTestTuru.TextSize = 14";
mostCurrent._buttontestturu.setTextSize((float) (14));
RDebugUtils.currentLine=2687006;
 //BA.debugLineNum = 2687006;BA.debugLine="ButtonTestTuru.SingleLine = True";
mostCurrent._buttontestturu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2687008;
 //BA.debugLineNum = 2687008;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
mostCurrent._buttonlevel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=2687009;
 //BA.debugLineNum = 2687009;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonlevel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2687010;
 //BA.debugLineNum = 2687010;BA.debugLine="ButtonLevel.TextSize = 14";
mostCurrent._buttonlevel.setTextSize((float) (14));
RDebugUtils.currentLine=2687011;
 //BA.debugLineNum = 2687011;BA.debugLine="ButtonLevel.SingleLine = True";
mostCurrent._buttonlevel.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2687013;
 //BA.debugLineNum = 2687013;BA.debugLine="ButtonMekikSayisi.TextColor = Color.koyuMavi";
mostCurrent._buttonmekiksayisi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=2687014;
 //BA.debugLineNum = 2687014;BA.debugLine="ButtonMekikSayisi.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._buttonmekiksayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2687015;
 //BA.debugLineNum = 2687015;BA.debugLine="ButtonMekikSayisi.TextSize = 14";
mostCurrent._buttonmekiksayisi.setTextSize((float) (14));
RDebugUtils.currentLine=2687016;
 //BA.debugLineNum = 2687016;BA.debugLine="ButtonMekikSayisi.SingleLine = True";
mostCurrent._buttonmekiksayisi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2687018;
 //BA.debugLineNum = 2687018;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=2687019;
 //BA.debugLineNum = 2687019;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2687020;
 //BA.debugLineNum = 2687020;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=2687021;
 //BA.debugLineNum = 2687021;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2687023;
 //BA.debugLineNum = 2687023;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2687024;
 //BA.debugLineNum = 2687024;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2687028;
 //BA.debugLineNum = 2687028;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=2687030;
 //BA.debugLineNum = 2687030;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT dayaniklilik_tarih As [TARİH],dayaniklilik_saat As [SAAT], program_adi As [PROGRAM], mekik_sayisi As [MEKİK], denektc1 As [TC1], denekIsim1 As [İSİM1], denektc2 As [TC2], denekIsim2 As [İSİM2],denektc3 As [TC3], denekIsim3 As [İSİM3],denektc4 As [TC4], denekIsim4 As [İSİM4],denektc5 As [TC5], denekIsim5 As [İSİM5],denektc6 As [TC6], denekIsim6 As [İSİM6],denektc7 As [TC7], denekIsim7 As [İSİM7],denektc8 As [TC8], denekIsim8 As [İSİM8],denektc9 As [TC9], denekIsim9 As [İSİM9],denektc10 As [TC10], denekIsim10 As [İSİM10] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id ORDER BY dayaniklilik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return "";
}
public static String  _buttondayanikliliktestekle_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondayanikliliktestekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondayanikliliktestekle_click", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub ButtonDayaniklilikTestEkle_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="StartActivity(GelismisTestDenekAra)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._gelismistestdenekara.getObject()));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Activity.finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return "";
}
public static String  _buttondenekisim_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondenekisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondenekisim_click", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub ButtonDenekIsim_Click";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public static String  _buttondenektc_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondenektc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondenektc_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub ButtonDenekTC_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denektc1 As [TC1],denektc2 As [TC2], denektc3 As [TC3],denektc4 As [TC4],denektc5 As [TC5],denektc6 As [TC6],denektc7 As [TC7],denektc8 As [TC8],denektc9 As [TC9],denektc10 As [TC10],dayaniklilik_tarih As [TARİH],program_adi As [PROGRAM], mekik_sayisi As [MEKİK] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id AND (denektc1 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc2 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc3 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc4 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc5 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc6 LIKE '%"+mostCurrent._edittextara.getText()+"%'  OR denektc7 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc8 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc9 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc10 LIKE '%"+mostCurrent._edittextara.getText()+"%') ORDER BY dayaniklilik_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlevel_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonlevel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonlevel_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub ButtonLevel_Click";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmekiksayisi_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonmekiksayisi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonmekiksayisi_click", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub ButtonMekikSayisi_Click";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public static String  _buttonprogramadi_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonprogramadi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonprogramadi_click", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub ButtonProgramAdi_Click";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsil_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsil_click", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub ButtonSil_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="StartActivity(DayaniklilikTestSil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._dayanikliliktestsil.getObject()));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public static String  _buttontestturu_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontestturu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontestturu_click", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub ButtonTestTuru_Click";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT dayaniklilik_tarih As [TARİH],program_adi As [PROGRAM], mekik_sayisi As [MEKİK], denektc1 As [TC1], denekIsim1 As [İSİM1], denektc2 As [TC2], denekIsim2 As [İSİM2],denektc3 As [TC3], denekIsim3 As [İSİM3],denektc4 As [TC4], denekIsim4 As [İSİM4],denektc5 As [TC5], denekIsim5 As [İSİM5],denektc6 As [TC6], denekIsim6 As [İSİM6],denektc7 As [TC7], denekIsim7 As [İSİM7],denektc8 As [TC8], denekIsim8 As [İSİM8],denektc9 As [TC9], denekIsim9 As [İSİM9],denektc10 As [TC10], denekIsim10 As [İSİM10] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id AND (denektc1 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim1 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc2 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim2 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc3 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim3 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc4 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim4 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc5 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim5 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc6 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim6 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc7 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim7 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc8 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim8 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc9 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim9 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denektc10 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denekIsim10 LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR  program_testTuru LIKE '%"+mostCurrent._edittextara.getText()+"%' OR  level LIKE '%"+mostCurrent._edittextara.getText()+"%' OR  mekik_sayisi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR dayaniklilik_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ) ORDER BY dayaniklilik_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="End Sub";
return "";
}
}