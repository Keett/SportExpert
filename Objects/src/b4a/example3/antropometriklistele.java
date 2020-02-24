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

public class antropometriklistele extends Activity implements B4AActivity{
	public static antropometriklistele mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.antropometriklistele");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (antropometriklistele).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.antropometriklistele");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.antropometriklistele", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (antropometriklistele) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (antropometriklistele) Resume **");
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
		return antropometriklistele.class;
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
        BA.LogInfo("** Activity (antropometriklistele) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            antropometriklistele mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (antropometriklistele) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkulacuzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonderikivrimkalinligi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonayakuzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonoturmayuksekligi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoneluzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkilo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonboy = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
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
public b4a.example3.denekduzenlesil _denekduzenlesil = null;
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
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="Activity.LoadLayout(\"AntropometrikListelePage\")";
mostCurrent._activity.LoadLayout("AntropometrikListelePage",mostCurrent.activityBA);
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=31326214;
 //BA.debugLineNum = 31326214;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=31326215;
 //BA.debugLineNum = 31326215;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=31326216;
 //BA.debugLineNum = 31326216;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=31326217;
 //BA.debugLineNum = 31326217;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=31326218;
 //BA.debugLineNum = 31326218;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326220;
 //BA.debugLineNum = 31326220;BA.debugLine="ButtonDeriKivrimKalinligi.TextColor = Color.koyuM";
mostCurrent._buttonderikivrimkalinligi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326221;
 //BA.debugLineNum = 31326221;BA.debugLine="ButtonDeriKivrimKalinligi.Typeface = Typeface.DEF";
mostCurrent._buttonderikivrimkalinligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326222;
 //BA.debugLineNum = 31326222;BA.debugLine="ButtonDeriKivrimKalinligi.Text = \"DERİ KIVRIM KAL";
mostCurrent._buttonderikivrimkalinligi.setText(BA.ObjectToCharSequence("DERİ KIVRIM KALINLIĞI"));
RDebugUtils.currentLine=31326223;
 //BA.debugLineNum = 31326223;BA.debugLine="ButtonDeriKivrimKalinligi.TextSize = 14";
mostCurrent._buttonderikivrimkalinligi.setTextSize((float) (14));
RDebugUtils.currentLine=31326224;
 //BA.debugLineNum = 31326224;BA.debugLine="ButtonDeriKivrimKalinligi.SingleLine = True";
mostCurrent._buttonderikivrimkalinligi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326226;
 //BA.debugLineNum = 31326226;BA.debugLine="ButtonAyakUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttonayakuzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326227;
 //BA.debugLineNum = 31326227;BA.debugLine="ButtonAyakUzunlugu.Typeface = Typeface.DEFAULT_BO";
mostCurrent._buttonayakuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326228;
 //BA.debugLineNum = 31326228;BA.debugLine="ButtonAyakUzunlugu.Text = \"AYAK UZUNLUĞU\"";
mostCurrent._buttonayakuzunlugu.setText(BA.ObjectToCharSequence("AYAK UZUNLUĞU"));
RDebugUtils.currentLine=31326229;
 //BA.debugLineNum = 31326229;BA.debugLine="ButtonAyakUzunlugu.TextSize = 14";
mostCurrent._buttonayakuzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=31326230;
 //BA.debugLineNum = 31326230;BA.debugLine="ButtonAyakUzunlugu.SingleLine = True";
mostCurrent._buttonayakuzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326232;
 //BA.debugLineNum = 31326232;BA.debugLine="ButtonKulacUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttonkulacuzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326233;
 //BA.debugLineNum = 31326233;BA.debugLine="ButtonKulacUzunlugu.Typeface = Typeface.DEFAULT_B";
mostCurrent._buttonkulacuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326234;
 //BA.debugLineNum = 31326234;BA.debugLine="ButtonKulacUzunlugu.Text = \"KULAÇ UZUNLUĞU\"";
mostCurrent._buttonkulacuzunlugu.setText(BA.ObjectToCharSequence("KULAÇ UZUNLUĞU"));
RDebugUtils.currentLine=31326235;
 //BA.debugLineNum = 31326235;BA.debugLine="ButtonKulacUzunlugu.TextSize = 14";
mostCurrent._buttonkulacuzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=31326236;
 //BA.debugLineNum = 31326236;BA.debugLine="ButtonKulacUzunlugu.SingleLine = True";
mostCurrent._buttonkulacuzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326238;
 //BA.debugLineNum = 31326238;BA.debugLine="ButtonOturmaYuksekligi.TextColor = Color.koyuMavi";
mostCurrent._buttonoturmayuksekligi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326239;
 //BA.debugLineNum = 31326239;BA.debugLine="ButtonOturmaYuksekligi.Typeface = Typeface.DEFAUL";
mostCurrent._buttonoturmayuksekligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326240;
 //BA.debugLineNum = 31326240;BA.debugLine="ButtonOturmaYuksekligi.Text = \"OTURMA YÜKSEKLİĞİ\"";
mostCurrent._buttonoturmayuksekligi.setText(BA.ObjectToCharSequence("OTURMA YÜKSEKLİĞİ"));
RDebugUtils.currentLine=31326241;
 //BA.debugLineNum = 31326241;BA.debugLine="ButtonOturmaYuksekligi.TextSize = 14";
mostCurrent._buttonoturmayuksekligi.setTextSize((float) (14));
RDebugUtils.currentLine=31326242;
 //BA.debugLineNum = 31326242;BA.debugLine="ButtonOturmaYuksekligi.SingleLine = True";
mostCurrent._buttonoturmayuksekligi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326244;
 //BA.debugLineNum = 31326244;BA.debugLine="ButtonElUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttoneluzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326245;
 //BA.debugLineNum = 31326245;BA.debugLine="ButtonElUzunlugu.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttoneluzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326246;
 //BA.debugLineNum = 31326246;BA.debugLine="ButtonElUzunlugu.Text = \"EL UZUNLUĞU\"";
mostCurrent._buttoneluzunlugu.setText(BA.ObjectToCharSequence("EL UZUNLUĞU"));
RDebugUtils.currentLine=31326247;
 //BA.debugLineNum = 31326247;BA.debugLine="ButtonElUzunlugu.TextSize = 14";
mostCurrent._buttoneluzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=31326248;
 //BA.debugLineNum = 31326248;BA.debugLine="ButtonElUzunlugu.SingleLine = True";
mostCurrent._buttoneluzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326250;
 //BA.debugLineNum = 31326250;BA.debugLine="ButtonKilo.TextColor = Color.koyuMavi";
mostCurrent._buttonkilo.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326251;
 //BA.debugLineNum = 31326251;BA.debugLine="ButtonKilo.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonkilo.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326252;
 //BA.debugLineNum = 31326252;BA.debugLine="ButtonKilo.Text = \"KİLO\"";
mostCurrent._buttonkilo.setText(BA.ObjectToCharSequence("KİLO"));
RDebugUtils.currentLine=31326253;
 //BA.debugLineNum = 31326253;BA.debugLine="ButtonKilo.TextSize = 14";
mostCurrent._buttonkilo.setTextSize((float) (14));
RDebugUtils.currentLine=31326254;
 //BA.debugLineNum = 31326254;BA.debugLine="ButtonKilo.SingleLine = True";
mostCurrent._buttonkilo.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326256;
 //BA.debugLineNum = 31326256;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326257;
 //BA.debugLineNum = 31326257;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326258;
 //BA.debugLineNum = 31326258;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=31326259;
 //BA.debugLineNum = 31326259;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=31326260;
 //BA.debugLineNum = 31326260;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326262;
 //BA.debugLineNum = 31326262;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326263;
 //BA.debugLineNum = 31326263;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326264;
 //BA.debugLineNum = 31326264;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=31326265;
 //BA.debugLineNum = 31326265;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=31326266;
 //BA.debugLineNum = 31326266;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326268;
 //BA.debugLineNum = 31326268;BA.debugLine="ButtonBoy.TextColor = Color.koyuMavi";
mostCurrent._buttonboy.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=31326269;
 //BA.debugLineNum = 31326269;BA.debugLine="ButtonBoy.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonboy.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=31326270;
 //BA.debugLineNum = 31326270;BA.debugLine="ButtonBoy.Text = \"BOY\"";
mostCurrent._buttonboy.setText(BA.ObjectToCharSequence("BOY"));
RDebugUtils.currentLine=31326271;
 //BA.debugLineNum = 31326271;BA.debugLine="ButtonBoy.TextSize = 14";
mostCurrent._buttonboy.setTextSize((float) (14));
RDebugUtils.currentLine=31326272;
 //BA.debugLineNum = 31326272;BA.debugLine="ButtonBoy.SingleLine = True";
mostCurrent._buttonboy.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326274;
 //BA.debugLineNum = 31326274;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326275;
 //BA.debugLineNum = 31326275;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31326278;
 //BA.debugLineNum = 31326278;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=31326280;
 //BA.debugLineNum = 31326280;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY] , antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id ORDER BY antropometrik_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="antropometriklistele";
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantropometrikekle_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantropometrikekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantropometrikekle_click", null));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Sub ButtonAntropometrikEkle_Click";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="StartActivity(TestDenekAra)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._testdenekara.getObject()));
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="End Sub";
return "";
}
public static String  _buttonayakuzunlugu_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonayakuzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonayakuzunlugu_click", null));}
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Sub ButtonAyakUzunlugu_Click";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_ayakUzunlugu LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="End Sub";
return "";
}
public static String  _buttonboy_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonboy_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonboy_click", null));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Sub ButtonBoy_Click";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_boy LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="End Sub";
return "";
}
public static String  _buttonderikivrimkalinligi_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonderikivrimkalinligi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonderikivrimkalinligi_click", null));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Sub ButtonDeriKivrimKalinligi_Click";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_deriKivrimKalinligi LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="End Sub";
return "";
}
public static String  _buttoneluzunlugu_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttoneluzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttoneluzunlugu_click", null));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Sub ButtonElUzunlugu_Click";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_elUzunlugu As [EL UZUNLUĞU] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_elUzunlugu LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkilo_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkilo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkilo_click", null));}
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Sub ButtonKilo_Click";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_kilo As [KİLO] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_kilo LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkulacuzunlugu_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkulacuzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkulacuzunlugu_click", null));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Sub ButtonKulacUzunlugu_Click";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND  antropometrik_kulacUzunlugu LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="End Sub";
return "";
}
public static String  _buttonoturmayuksekligi_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonoturmayuksekligi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonoturmayuksekligi_click", null));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Sub ButtonOturmaYuksekligi_Click";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_oturmaYuksekligi As [OTURMA UZUNLUĞU] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_oturmaYuksekligi LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsil_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsil_click", null));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Sub ButtonSil_Click";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="StartActivity(AntropometrikSil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antropometriksil.getObject()));
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY antropometrik_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC],denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC  ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc  As [Denek TC],antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY],antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_boy LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_kilo LIKE '%"+mostCurrent._edittextara.getText()+"%') ORDER BY antropometrik_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="antropometriklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="End Sub";
return "";
}
}