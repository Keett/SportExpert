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

public class surattestlistele extends Activity implements B4AActivity{
	public static surattestlistele mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.surattestlistele");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (surattestlistele).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.surattestlistele");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.surattestlistele", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (surattestlistele) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (surattestlistele) Resume **");
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
		return surattestlistele.class;
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
        BA.LogInfo("** Activity (surattestlistele) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            surattestlistele mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (surattestlistele) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsurattestekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsil = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmod = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttongatesayisi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsetsayisi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
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
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Activity.LoadLayout(\"SuratTestListelePage\")";
mostCurrent._activity.LoadLayout("SuratTestListelePage",mostCurrent.activityBA);
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7667731;
 //BA.debugLineNum = 7667731;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7667732;
 //BA.debugLineNum = 7667732;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=7667733;
 //BA.debugLineNum = 7667733;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=7667734;
 //BA.debugLineNum = 7667734;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667736;
 //BA.debugLineNum = 7667736;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7667737;
 //BA.debugLineNum = 7667737;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7667738;
 //BA.debugLineNum = 7667738;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=7667739;
 //BA.debugLineNum = 7667739;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=7667740;
 //BA.debugLineNum = 7667740;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667742;
 //BA.debugLineNum = 7667742;BA.debugLine="ButtonMod.TextColor = Color.koyuMavi";
mostCurrent._buttonmod.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7667743;
 //BA.debugLineNum = 7667743;BA.debugLine="ButtonMod.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonmod.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7667744;
 //BA.debugLineNum = 7667744;BA.debugLine="ButtonMod.Text = \"MOD\"";
mostCurrent._buttonmod.setText(BA.ObjectToCharSequence("MOD"));
RDebugUtils.currentLine=7667745;
 //BA.debugLineNum = 7667745;BA.debugLine="ButtonMod.TextSize = 14";
mostCurrent._buttonmod.setTextSize((float) (14));
RDebugUtils.currentLine=7667746;
 //BA.debugLineNum = 7667746;BA.debugLine="ButtonMod.SingleLine = True";
mostCurrent._buttonmod.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667748;
 //BA.debugLineNum = 7667748;BA.debugLine="ButtonGateSayisi.TextColor = Color.koyuMavi";
mostCurrent._buttongatesayisi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7667749;
 //BA.debugLineNum = 7667749;BA.debugLine="ButtonGateSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttongatesayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7667750;
 //BA.debugLineNum = 7667750;BA.debugLine="ButtonGateSayisi.Text = \"GATE SAYISI\"";
mostCurrent._buttongatesayisi.setText(BA.ObjectToCharSequence("GATE SAYISI"));
RDebugUtils.currentLine=7667751;
 //BA.debugLineNum = 7667751;BA.debugLine="ButtonGateSayisi.TextSize = 14";
mostCurrent._buttongatesayisi.setTextSize((float) (14));
RDebugUtils.currentLine=7667752;
 //BA.debugLineNum = 7667752;BA.debugLine="ButtonGateSayisi.SingleLine = True";
mostCurrent._buttongatesayisi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667754;
 //BA.debugLineNum = 7667754;BA.debugLine="ButtonSetSayisi.TextColor = Color.koyuMavi";
mostCurrent._buttonsetsayisi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=7667755;
 //BA.debugLineNum = 7667755;BA.debugLine="ButtonSetSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonsetsayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=7667756;
 //BA.debugLineNum = 7667756;BA.debugLine="ButtonSetSayisi.Text = \"SET SAYISI\"";
mostCurrent._buttonsetsayisi.setText(BA.ObjectToCharSequence("SET SAYISI"));
RDebugUtils.currentLine=7667757;
 //BA.debugLineNum = 7667757;BA.debugLine="ButtonSetSayisi.TextSize = 14";
mostCurrent._buttonsetsayisi.setTextSize((float) (14));
RDebugUtils.currentLine=7667758;
 //BA.debugLineNum = 7667758;BA.debugLine="ButtonSetSayisi.SingleLine = True";
mostCurrent._buttonsetsayisi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667760;
 //BA.debugLineNum = 7667760;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667761;
 //BA.debugLineNum = 7667761;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7667764;
 //BA.debugLineNum = 7667764;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=7667765;
 //BA.debugLineNum = 7667765;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP3], veri4 As [LAP4], veri5 As [LAP5], veri6 As [LAP6],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="surattestlistele";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="End Sub";
return "";
}
public static String  _buttongatesayisi_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttongatesayisi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttongatesayisi_click", null));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub ButtonGateSayisi_Click";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,gateSayisi As [BAĞLI GATE SAYISI] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND gateSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_isim As [DENEK İSİM] ,denek_tc As [Denek TC], mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmod_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonmod_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonmod_click", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub ButtonMod_Click";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD],surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND mod LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsetsayisi_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsetsayisi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsetsayisi_click", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub ButtonSetSayisi_Click";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,setSayisi As [SET SAYISI], mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] , veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND setSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsil_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsil_click", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub ButtonSil_Click";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="StartActivity(SuratTestSil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._surattestsil.getObject()));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsurattestekle_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsurattestekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsurattestekle_click", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub ButtonSuratTestEkle_Click";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="StartActivity(TestDenekAra)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._testdenekara.getObject()));
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,surat_tarih As [TARİH], surat_saat As [SAAT], mod As [SEÇİLEN MOD], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND surat_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR mod LIKE '%"+mostCurrent._edittextara.getText()+"%' OR surat_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR gateSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR setSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%') ORDER BY surat_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="surattestlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="End Sub";
return "";
}
}