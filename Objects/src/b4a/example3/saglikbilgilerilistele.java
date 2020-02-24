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

public class saglikbilgilerilistele extends Activity implements B4AActivity{
	public static saglikbilgilerilistele mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.saglikbilgilerilistele");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (saglikbilgilerilistele).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.saglikbilgilerilistele");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.saglikbilgilerilistele", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (saglikbilgilerilistele) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (saglikbilgilerilistele) Resume **");
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
		return saglikbilgilerilistele.class;
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
        BA.LogInfo("** Activity (saglikbilgilerilistele) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            saglikbilgilerilistele mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (saglikbilgilerilistele) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonhastaliksaglik = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsaglikbilgileriaciklama = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsaglikbilgilerisil = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsaglikbilgileriekle = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonanasayfa = null;
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
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Activity.LoadLayout(\"SaglikBilgileriListelePage\")";
mostCurrent._activity.LoadLayout("SaglikBilgileriListelePage",mostCurrent.activityBA);
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=35520519;
 //BA.debugLineNum = 35520519;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=35520524;
 //BA.debugLineNum = 35520524;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=35520525;
 //BA.debugLineNum = 35520525;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=35520526;
 //BA.debugLineNum = 35520526;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=35520527;
 //BA.debugLineNum = 35520527;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=35520528;
 //BA.debugLineNum = 35520528;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35520530;
 //BA.debugLineNum = 35520530;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=35520531;
 //BA.debugLineNum = 35520531;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=35520532;
 //BA.debugLineNum = 35520532;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=35520533;
 //BA.debugLineNum = 35520533;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=35520534;
 //BA.debugLineNum = 35520534;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35520536;
 //BA.debugLineNum = 35520536;BA.debugLine="ButtonHastalikSaglik.TextColor = Color.koyuMavi";
mostCurrent._buttonhastaliksaglik.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=35520537;
 //BA.debugLineNum = 35520537;BA.debugLine="ButtonHastalikSaglik.Typeface = Typeface.DEFAULT_";
mostCurrent._buttonhastaliksaglik.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=35520538;
 //BA.debugLineNum = 35520538;BA.debugLine="ButtonHastalikSaglik.Text = \"HASTALIK/SAĞLIK\"";
mostCurrent._buttonhastaliksaglik.setText(BA.ObjectToCharSequence("HASTALIK/SAĞLIK"));
RDebugUtils.currentLine=35520539;
 //BA.debugLineNum = 35520539;BA.debugLine="ButtonHastalikSaglik.TextSize = 14";
mostCurrent._buttonhastaliksaglik.setTextSize((float) (14));
RDebugUtils.currentLine=35520540;
 //BA.debugLineNum = 35520540;BA.debugLine="ButtonHastalikSaglik.SingleLine = True";
mostCurrent._buttonhastaliksaglik.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35520542;
 //BA.debugLineNum = 35520542;BA.debugLine="ButtonSaglikBilgileriAciklama.TextColor = Color.k";
mostCurrent._buttonsaglikbilgileriaciklama.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=35520543;
 //BA.debugLineNum = 35520543;BA.debugLine="ButtonSaglikBilgileriAciklama.Typeface = Typeface";
mostCurrent._buttonsaglikbilgileriaciklama.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=35520544;
 //BA.debugLineNum = 35520544;BA.debugLine="ButtonSaglikBilgileriAciklama.Text = \"SAĞLIK BİLG";
mostCurrent._buttonsaglikbilgileriaciklama.setText(BA.ObjectToCharSequence("SAĞLIK BİLGİLERİ AÇIKLAMA"));
RDebugUtils.currentLine=35520545;
 //BA.debugLineNum = 35520545;BA.debugLine="ButtonSaglikBilgileriAciklama.TextSize = 14";
mostCurrent._buttonsaglikbilgileriaciklama.setTextSize((float) (14));
RDebugUtils.currentLine=35520546;
 //BA.debugLineNum = 35520546;BA.debugLine="ButtonSaglikBilgileriAciklama.SingleLine = True";
mostCurrent._buttonsaglikbilgileriaciklama.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35520548;
 //BA.debugLineNum = 35520548;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=35520549;
 //BA.debugLineNum = 35520549;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=35520550;
 //BA.debugLineNum = 35520550;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=35520551;
 //BA.debugLineNum = 35520551;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=35520552;
 //BA.debugLineNum = 35520552;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35520554;
 //BA.debugLineNum = 35520554;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35520555;
 //BA.debugLineNum = 35520555;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35520559;
 //BA.debugLineNum = 35520559;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=35520561;
 //BA.debugLineNum = 35520561;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK],saglikBilgileri_aciklama As [SAĞLIK BİLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id ORDER BY saglikBilgileri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="End Sub";
return "";
}
public static String  _buttonhastaliksaglik_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonhastaliksaglik_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonhastaliksaglik_click", null));}
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Sub ButtonHastalikSaglik_Click";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_hastalikSakatlik LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT  denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsaglikbilgileraciklama_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsaglikbilgileraciklama_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsaglikbilgileraciklama_click", null));}
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Sub ButtonSaglikBilgilerAciklama_Click";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_aciklama  As [SAĞLIK İLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsaglikbilgileriekle_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsaglikbilgileriekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsaglikbilgileriekle_click", null));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Sub ButtonSaglikBilgileriEkle_Click";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="Main.Status = \"S\"";
mostCurrent._main._status /*String*/  = "S";
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="StartActivity(TestDenekAra)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._testdenekara.getObject()));
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsaglikbilgilerisil_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsaglikbilgilerisil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsaglikbilgilerisil_click", null));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Sub ButtonSaglikBilgileriSil_Click";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="StartActivity(SaglikBilgileriSil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._saglikbilgilerisil.getObject()));
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_tarih  LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT  denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK],saglikBilgileri_aciklama As [SAĞLIK BİLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR saglikBilgileri_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR saglikBilgileri_hastalikSakatlik LIKE '%"+mostCurrent._edittextara.getText()+"%' OR saglikBilgileri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%' ) ORDER BY saglikBilgileri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=35782662;
 //BA.debugLineNum = 35782662;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerilistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="EditTextAra.Text= \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=36306948;
 //BA.debugLineNum = 36306948;BA.debugLine="End Sub";
return "";
}
}