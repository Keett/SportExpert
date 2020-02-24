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

public class deneklistele extends Activity implements B4AActivity{
	public static deneklistele mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.deneklistele");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (deneklistele).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.deneklistele");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.deneklistele", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (deneklistele) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (deneklistele) Resume **");
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
		return deneklistele.class;
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
        BA.LogInfo("** Activity (deneklistele) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            deneklistele mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (deneklistele) Resume **");
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
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonduzenlesil = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondenekekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmevki = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbranssinif = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontakimokul = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonengeldurumu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbabaadi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumyeri = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumtarihi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoncinsiyet = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
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
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Activity.LoadLayout(\"DenekListelePage\")";
mostCurrent._activity.LoadLayout("DenekListelePage",mostCurrent.activityBA);
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781840;
 //BA.debugLineNum = 8781840;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=8781843;
 //BA.debugLineNum = 8781843;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781844;
 //BA.debugLineNum = 8781844;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781845;
 //BA.debugLineNum = 8781845;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781846;
 //BA.debugLineNum = 8781846;BA.debugLine="ButtonIsim.Text =\"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=8781847;
 //BA.debugLineNum = 8781847;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=8781849;
 //BA.debugLineNum = 8781849;BA.debugLine="ButtonCinsiyet.TextColor = Color.koyuMavi";
mostCurrent._buttoncinsiyet.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781850;
 //BA.debugLineNum = 8781850;BA.debugLine="ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttoncinsiyet.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781851;
 //BA.debugLineNum = 8781851;BA.debugLine="ButtonCinsiyet.SingleLine = True";
mostCurrent._buttoncinsiyet.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781852;
 //BA.debugLineNum = 8781852;BA.debugLine="ButtonCinsiyet.Text = \"CİNSİYET\"";
mostCurrent._buttoncinsiyet.setText(BA.ObjectToCharSequence("CİNSİYET"));
RDebugUtils.currentLine=8781853;
 //BA.debugLineNum = 8781853;BA.debugLine="ButtonCinsiyet.TextSize = 14";
mostCurrent._buttoncinsiyet.setTextSize((float) (14));
RDebugUtils.currentLine=8781855;
 //BA.debugLineNum = 8781855;BA.debugLine="ButtonDogumTarihi.TextColor = Color.koyuMavi";
mostCurrent._buttondogumtarihi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781856;
 //BA.debugLineNum = 8781856;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._buttondogumtarihi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781857;
 //BA.debugLineNum = 8781857;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
mostCurrent._buttondogumtarihi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781858;
 //BA.debugLineNum = 8781858;BA.debugLine="ButtonDogumTarihi.Text = \"DOĞUM TARİHİ\"";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence("DOĞUM TARİHİ"));
RDebugUtils.currentLine=8781859;
 //BA.debugLineNum = 8781859;BA.debugLine="ButtonDogumTarihi.TextSize = 14";
mostCurrent._buttondogumtarihi.setTextSize((float) (14));
RDebugUtils.currentLine=8781861;
 //BA.debugLineNum = 8781861;BA.debugLine="ButtonDogumYeri.TextColor = Color.koyuMavi";
mostCurrent._buttondogumyeri.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781862;
 //BA.debugLineNum = 8781862;BA.debugLine="ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttondogumyeri.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781863;
 //BA.debugLineNum = 8781863;BA.debugLine="ButtonDogumYeri.SingleLine = True";
mostCurrent._buttondogumyeri.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781864;
 //BA.debugLineNum = 8781864;BA.debugLine="ButtonDogumYeri.Text = \"DOĞUM YERİ\"";
mostCurrent._buttondogumyeri.setText(BA.ObjectToCharSequence("DOĞUM YERİ"));
RDebugUtils.currentLine=8781865;
 //BA.debugLineNum = 8781865;BA.debugLine="ButtonDogumYeri.TextSize = 14";
mostCurrent._buttondogumyeri.setTextSize((float) (14));
RDebugUtils.currentLine=8781867;
 //BA.debugLineNum = 8781867;BA.debugLine="ButtonBabaAdi.TextColor = Color.koyuMavi";
mostCurrent._buttonbabaadi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781868;
 //BA.debugLineNum = 8781868;BA.debugLine="ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonbabaadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781869;
 //BA.debugLineNum = 8781869;BA.debugLine="ButtonBabaAdi.SingleLine = True";
mostCurrent._buttonbabaadi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781870;
 //BA.debugLineNum = 8781870;BA.debugLine="ButtonBabaAdi.Text = \"BABA ADI\"";
mostCurrent._buttonbabaadi.setText(BA.ObjectToCharSequence("BABA ADI"));
RDebugUtils.currentLine=8781871;
 //BA.debugLineNum = 8781871;BA.debugLine="ButtonBabaAdi.TextSize = 14";
mostCurrent._buttonbabaadi.setTextSize((float) (14));
RDebugUtils.currentLine=8781873;
 //BA.debugLineNum = 8781873;BA.debugLine="ButtonEngelDurumu.TextColor= Color.koyuMavi";
mostCurrent._buttonengeldurumu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781874;
 //BA.debugLineNum = 8781874;BA.debugLine="ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD";
mostCurrent._buttonengeldurumu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781875;
 //BA.debugLineNum = 8781875;BA.debugLine="ButtonEngelDurumu.SingleLine= True";
mostCurrent._buttonengeldurumu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781876;
 //BA.debugLineNum = 8781876;BA.debugLine="ButtonEngelDurumu.Text= \"ENGEL DURUMU\"";
mostCurrent._buttonengeldurumu.setText(BA.ObjectToCharSequence("ENGEL DURUMU"));
RDebugUtils.currentLine=8781877;
 //BA.debugLineNum = 8781877;BA.debugLine="ButtonEngelDurumu.TextSize= 14";
mostCurrent._buttonengeldurumu.setTextSize((float) (14));
RDebugUtils.currentLine=8781879;
 //BA.debugLineNum = 8781879;BA.debugLine="ButtonTakimOkul.TextColor = Color.koyuMavi";
mostCurrent._buttontakimokul.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781880;
 //BA.debugLineNum = 8781880;BA.debugLine="ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontakimokul.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781881;
 //BA.debugLineNum = 8781881;BA.debugLine="ButtonTakimOkul.SingleLine = True";
mostCurrent._buttontakimokul.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781882;
 //BA.debugLineNum = 8781882;BA.debugLine="ButtonTakimOkul.Text = \"TAKIM/OKUL\"";
mostCurrent._buttontakimokul.setText(BA.ObjectToCharSequence("TAKIM/OKUL"));
RDebugUtils.currentLine=8781883;
 //BA.debugLineNum = 8781883;BA.debugLine="ButtonTakimOkul.TextSize = 14";
mostCurrent._buttontakimokul.setTextSize((float) (14));
RDebugUtils.currentLine=8781885;
 //BA.debugLineNum = 8781885;BA.debugLine="ButtonBransSinif.TextColor = Color.koyuMavi";
mostCurrent._buttonbranssinif.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781886;
 //BA.debugLineNum = 8781886;BA.debugLine="ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonbranssinif.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781887;
 //BA.debugLineNum = 8781887;BA.debugLine="ButtonBransSinif.SingleLine = True";
mostCurrent._buttonbranssinif.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781888;
 //BA.debugLineNum = 8781888;BA.debugLine="ButtonBransSinif.Text = \"BRANŞ/SINIF\"";
mostCurrent._buttonbranssinif.setText(BA.ObjectToCharSequence("BRANŞ/SINIF"));
RDebugUtils.currentLine=8781889;
 //BA.debugLineNum = 8781889;BA.debugLine="ButtonBransSinif.TextSize = 14";
mostCurrent._buttonbranssinif.setTextSize((float) (14));
RDebugUtils.currentLine=8781891;
 //BA.debugLineNum = 8781891;BA.debugLine="ButtonMevki.TextColor = Color.koyuMavi";
mostCurrent._buttonmevki.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781892;
 //BA.debugLineNum = 8781892;BA.debugLine="ButtonMevki.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonmevki.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=8781893;
 //BA.debugLineNum = 8781893;BA.debugLine="ButtonMevki.SingleLine = True";
mostCurrent._buttonmevki.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8781894;
 //BA.debugLineNum = 8781894;BA.debugLine="ButtonMevki.Text = \"MEVKİ\"";
mostCurrent._buttonmevki.setText(BA.ObjectToCharSequence("MEVKİ"));
RDebugUtils.currentLine=8781895;
 //BA.debugLineNum = 8781895;BA.debugLine="ButtonMevki.TextSize = 14";
mostCurrent._buttonmevki.setTextSize((float) (14));
RDebugUtils.currentLine=8781897;
 //BA.debugLineNum = 8781897;BA.debugLine="ButtonDuzenleSil.TextColor = Color.koyuMavi";
mostCurrent._buttonduzenlesil.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781898;
 //BA.debugLineNum = 8781898;BA.debugLine="ButtonDenekEkle.TextColor = Color.koyuMavi";
mostCurrent._buttondenekekle.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=8781901;
 //BA.debugLineNum = 8781901;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="deneklistele";
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbabaadi_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbabaadi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbabaadi_click", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub ButtonBabaAdi_Click";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] ,denek_babaAdi As [DENEK BABA ADI] FROM Denek WHERE denek_babaAdi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbranssinif_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbranssinif_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbranssinif_click", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub ButtonBransSinif_Click";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] ,denek_bransSinif  As [BRANŞ/SINIF] FROM Denek WHERE denek_bransSinif LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncinsiyet_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttoncinsiyet_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttoncinsiyet_click", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub ButtonCinsiyet_Click";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] , cinsiyet_adi As [CİNSİYET] FROM Denek WHERE cinsiyet_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return "";
}
public static String  _buttondenekekle_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondenekekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondenekekle_click", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub ButtonDenekEkle_Click";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Main.Status = \"S\"";
mostCurrent._main._status /*String*/  = "S";
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="StartActivity(DenekEkleGuncelle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._denekekleguncelle.getObject()));
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumtarihi_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumtarihi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumtarihi_click", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub ButtonDogumTarihi_Click";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] , denek_dogumTarihi As [DENEK DOĞUM TARİHİ] FROM Denek WHERE denek_dogumTarihi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumyeri_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumyeri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumyeri_click", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub ButtonDogumYeri_Click";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] , il_adi As [DOĞUM YERİ] FROM Denek WHERE il_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
public static String  _buttonduzenlesil_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonduzenlesil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonduzenlesil_click", null));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub ButtonDuzenleSil_Click";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="StartActivity(DenekDuzenleSil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._denekduzenlesil.getObject()));
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="End Sub";
return "";
}
public static String  _buttonengeldurumu_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonengeldurumu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonengeldurumu_click", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub ButtonEngelDurumu_Click";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] ,denek_engelDurumu As [DENEK ENGEL DURUMU] FROM Denek WHERE denek_engelDurumu LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] , denek_isim As [DENEK İSİM] FROM Denek WHERE denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmevki_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonmevki_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonmevki_click", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub ButtonMevki_Click";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] ,denek_mevki As [MEVKİ] FROM Denek WHERE denek_mevki LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return "";
}
public static String  _buttontakimokul_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontakimokul_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontakimokul_click", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub ButtonTakimOkul_Click";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] ,denek_takimOkul As [TAKIM/OKUL] FROM Denek WHERE denek_takimOkul LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC] FROM Denek WHERE denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC],denek_isim  As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi  As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki  As [MEVKİ] FROM Denek WHERE denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR cinsiyet_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_dogumTarihi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR il_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_babaAdi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_engelDurumu LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_takimOkul LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_bransSinif LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_mevki LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="End Sub";
return "";
}
public static String  _label1_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label1_click", null));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub Label1_Click";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="deneklistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="End Sub";
return "";
}
}