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

public class programlistele extends Activity implements B4AActivity{
	public static programlistele mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.programlistele");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (programlistele).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.programlistele");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.programlistele", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (programlistele) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (programlistele) Resume **");
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
		return programlistele.class;
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
        BA.LogInfo("** Activity (programlistele) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            programlistele mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (programlistele) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonpistuzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonhiz = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlevel = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkoniarasimesafe = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkonisayisi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondayanikliliktestekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsil = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonprogramadi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontestturu = null;
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
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Activity.LoadLayout(\"ProgramListelePage\")";
mostCurrent._activity.LoadLayout("ProgramListelePage",mostCurrent.activityBA);
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068684;
 //BA.debugLineNum = 23068684;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
mostCurrent._buttonprogramadi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068685;
 //BA.debugLineNum = 23068685;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonprogramadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068686;
 //BA.debugLineNum = 23068686;BA.debugLine="ButtonProgramAdi.TextSize = 14";
mostCurrent._buttonprogramadi.setTextSize((float) (14));
RDebugUtils.currentLine=23068687;
 //BA.debugLineNum = 23068687;BA.debugLine="ButtonProgramAdi.SingleLine = True";
mostCurrent._buttonprogramadi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068689;
 //BA.debugLineNum = 23068689;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
mostCurrent._buttontestturu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068690;
 //BA.debugLineNum = 23068690;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontestturu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068691;
 //BA.debugLineNum = 23068691;BA.debugLine="ButtonTestTuru.TextSize = 14";
mostCurrent._buttontestturu.setTextSize((float) (14));
RDebugUtils.currentLine=23068692;
 //BA.debugLineNum = 23068692;BA.debugLine="ButtonTestTuru.SingleLine = True";
mostCurrent._buttontestturu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068694;
 //BA.debugLineNum = 23068694;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068695;
 //BA.debugLineNum = 23068695;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068696;
 //BA.debugLineNum = 23068696;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=23068697;
 //BA.debugLineNum = 23068697;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=23068698;
 //BA.debugLineNum = 23068698;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068700;
 //BA.debugLineNum = 23068700;BA.debugLine="ButtonPistUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttonpistuzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068701;
 //BA.debugLineNum = 23068701;BA.debugLine="ButtonPistUzunlugu.Typeface = Typeface.DEFAULT_BO";
mostCurrent._buttonpistuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068702;
 //BA.debugLineNum = 23068702;BA.debugLine="ButtonPistUzunlugu.Text = \"PİST UZUNLUĞU\"";
mostCurrent._buttonpistuzunlugu.setText(BA.ObjectToCharSequence("PİST UZUNLUĞU"));
RDebugUtils.currentLine=23068703;
 //BA.debugLineNum = 23068703;BA.debugLine="ButtonPistUzunlugu.TextSize = 14";
mostCurrent._buttonpistuzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=23068704;
 //BA.debugLineNum = 23068704;BA.debugLine="ButtonPistUzunlugu.SingleLine = True";
mostCurrent._buttonpistuzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068706;
 //BA.debugLineNum = 23068706;BA.debugLine="ButtonKoniArasiMesafe.TextColor = Color.koyuMavi";
mostCurrent._buttonkoniarasimesafe.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068707;
 //BA.debugLineNum = 23068707;BA.debugLine="ButtonKoniArasiMesafe.Typeface = Typeface.DEFAULT";
mostCurrent._buttonkoniarasimesafe.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068708;
 //BA.debugLineNum = 23068708;BA.debugLine="ButtonKoniArasiMesafe.Text = \"KONİ ARASI MESAFE\"";
mostCurrent._buttonkoniarasimesafe.setText(BA.ObjectToCharSequence("KONİ ARASI MESAFE"));
RDebugUtils.currentLine=23068709;
 //BA.debugLineNum = 23068709;BA.debugLine="ButtonKoniArasiMesafe.TextSize = 14";
mostCurrent._buttonkoniarasimesafe.setTextSize((float) (14));
RDebugUtils.currentLine=23068710;
 //BA.debugLineNum = 23068710;BA.debugLine="ButtonKoniArasiMesafe.SingleLine = True";
mostCurrent._buttonkoniarasimesafe.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068712;
 //BA.debugLineNum = 23068712;BA.debugLine="ButtonKoniSayisi.TextColor = Color.koyuMavi";
mostCurrent._buttonkonisayisi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068713;
 //BA.debugLineNum = 23068713;BA.debugLine="ButtonKoniSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonkonisayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068714;
 //BA.debugLineNum = 23068714;BA.debugLine="ButtonKoniSayisi.Text = \"KONİ SAYISI\"";
mostCurrent._buttonkonisayisi.setText(BA.ObjectToCharSequence("KONİ SAYISI"));
RDebugUtils.currentLine=23068715;
 //BA.debugLineNum = 23068715;BA.debugLine="ButtonKoniSayisi.TextSize = 14";
mostCurrent._buttonkonisayisi.setTextSize((float) (14));
RDebugUtils.currentLine=23068716;
 //BA.debugLineNum = 23068716;BA.debugLine="ButtonKoniSayisi.SingleLine = True";
mostCurrent._buttonkonisayisi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068718;
 //BA.debugLineNum = 23068718;BA.debugLine="ButtonHiz.TextColor = Color.koyuMavi";
mostCurrent._buttonhiz.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068719;
 //BA.debugLineNum = 23068719;BA.debugLine="ButtonHiz.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonhiz.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068720;
 //BA.debugLineNum = 23068720;BA.debugLine="ButtonHiz.Text = \"HIZ\"";
mostCurrent._buttonhiz.setText(BA.ObjectToCharSequence("HIZ"));
RDebugUtils.currentLine=23068721;
 //BA.debugLineNum = 23068721;BA.debugLine="ButtonHiz.TextSize = 14";
mostCurrent._buttonhiz.setTextSize((float) (14));
RDebugUtils.currentLine=23068722;
 //BA.debugLineNum = 23068722;BA.debugLine="ButtonHiz.SingleLine = True";
mostCurrent._buttonhiz.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068724;
 //BA.debugLineNum = 23068724;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
mostCurrent._buttonlevel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=23068725;
 //BA.debugLineNum = 23068725;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonlevel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=23068726;
 //BA.debugLineNum = 23068726;BA.debugLine="ButtonLevel.Text = \"LEVEL\"";
mostCurrent._buttonlevel.setText(BA.ObjectToCharSequence("LEVEL"));
RDebugUtils.currentLine=23068727;
 //BA.debugLineNum = 23068727;BA.debugLine="ButtonLevel.TextSize = 14";
mostCurrent._buttonlevel.setTextSize((float) (14));
RDebugUtils.currentLine=23068728;
 //BA.debugLineNum = 23068728;BA.debugLine="ButtonLevel.SingleLine = True";
mostCurrent._buttonlevel.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068730;
 //BA.debugLineNum = 23068730;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068731;
 //BA.debugLineNum = 23068731;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23068734;
 //BA.debugLineNum = 23068734;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=23068736;
 //BA.debugLineNum = 23068736;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT program_adi  As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ],koniMesafesi1 As [KONİ MESAFESİ1] , hiz1 As [HIZ1], dakika1 As [DAKİKA1] ,saniye1  As [SANİYE1] ,koniMesafesi2 As [KONİ MESAFESİ2] , hiz2 As [HIZ2],dakika2 As [DAKİKA2],saniye2  As [SANİYE2],koniMesafesi3 As [KONİ MESAFESİ3],hiz3 As [HIZ3],dakika3 As [DAKİKA3] ,saniye3  As [SANİYE3],koniMesafesi4 As [KONİ MESAFESİ4] ,hiz4 As [HIZ4],dakika4 As [DAKİKA4],saniye4  As [SANİYE4],koniMesafesi5 As [KONİ MESAFESİ5],hiz5 As [HIZ5] ,dakika5 As [DAKİKA5],saniye5  As [SANİYE5],koniMesafesi6 As [KONİ MESAFESİ6] ,hiz6 As [HIZ6] ,dakika6 As [DAKİKA6],saniye6  As [SANİYE6],koniMesafesi7 As [KONİ MESAFESİ7] ,hiz7 As [HIZ7] ,dakika7 As [DAKİKA7] ,saniye7  As [SANİYE7], koniMesafesi8 As [KONİ MESAFESİ8] ,hiz8 As [HIZ8],dakika8 As [DAKİKA8] ,saniye8  As [SANİYE8],koniMesafesi9 As [KONİ MESAFESİ9],hiz9 As [HIZ9],dakika9 As [DAKİKA9] ,saniye9  As [SANİYE9],koniMesafesi10 As [KONİ MESAFESİ10] ,hiz10 As [HIZ10] ,dakika10 As [DAKİKA10] ,saniye10  As [SANİYE10],koniMesafesi11 As [KONİ MESAFESİ11] ,hiz11 As [HIZ11] ,dakika11 As [DAKİKA11] ,saniye11  As [SANİYE11],koniMesafesi12 As [KONİ MESAFESİ12],hiz12 As [HIZ12],dakika12 As [DAKİKA12],saniye12  As [SANİYE12],koniMesafesi13 As [KONİ MESAFESİ13] ,hiz13 As [HIZ13] ,dakika13 As [DAKİKA13] ,saniye13  As [SANİYE13],koniMesafesi14 As [KONİ MESAFESİ14],hiz14 As [HIZ14] ,dakika14 As [DAKİKA14],saniye14  As [SANİYE14],koniMesafesi15 As [KONİ MESAFESİ15],hiz15 As [HIZ15] ,dakika15 As [DAKİKA15] ,saniye15  As [SANİYE15],koniMesafesi16 As [KONİ MESAFESİ16],hiz16 As [HIZ16],dakika16 As [DAKİKA16] ,saniye16  As [SANİYE16], koniMesafesi17 As [KONİ MESAFESİ17] ,hiz17 As [HIZ17] ,dakika17 As [DAKİKA17],saniye17  As [SANİYE17] ,koniMesafesi18 As [KONİ MESAFESİ18] ,hiz18 As [HIZ18] ,dakika18 As [DAKİKA18],saniye18  As [SANİYE18] ,koniMesafesi19 As [KONİ MESAFESİ19] ,hiz19 As [HIZ19] ,dakika19 As [DAKİKA19] ,saniye19  As [SANİYE19],koniMesafesi20 As [KONİ MESAFESİ20] ,hiz20 As [HIZ20] ,dakika20 As [DAKİKA20] ,saniye20 As [SANİYE20], koniMesafesi21 As [KONİ MESAFESİ21] ,hiz21 As [HIZ21] ,dakika21 As [DAKİKA21],saniye21 As [SANİYE21], koniMesafesi22 As [KONİ MESAFESİ22] ,hiz22 As [HIZ22],dakika22 As [DAKİKA22] ,saniye22 As [SANİYE22], koniMesafesi23 As [KONİ MESAFESİ23] ,hiz23 As [HIZ23],dakika23 As [DAKİKA23],saniye23 As [SANİYE23], koniMesafesi24 As [KONİ MESAFESİ24] ,hiz24 As [HIZ24] ,dakika24 As [DAKİKA24],saniye24 As [SANİYE24],koniMesafesi25 As [KONİ MESAFESİ25] ,hiz25 As [HIZ25] ,dakika25 As [DAKİKA25] ,saniye25 As [SANİYE25] FROM DayaniklilikTestProgram ORDER BY program_id  DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="programlistele";
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="End Sub";
return "";
}
public static String  _buttondayanikliliktestekle_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondayanikliliktestekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondayanikliliktestekle_click", null));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Sub ButtonDayaniklilikTestEkle_Click";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="StartActivity(ProgramAyar)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programayar.getObject()));
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="End Sub";
return "";
}
public static String  _buttonhiz_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonhiz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonhiz_click", null));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Sub ButtonHiz_Click";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT hiz1 As [HIZ] , program_adi As [PROGRAM ADI] , program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE hiz1 LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY program_id  DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkoniarasimesafe_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkoniarasimesafe_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkoniarasimesafe_click", null));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Sub ButtonKoniArasiMesafe_Click";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT  koniMesafesi1 As [KONİ MESAFESİ] ,program_adi As [PROGRAM ADI] , program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE koniMesafesi1  LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY program_id  DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkonisayisi_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkonisayisi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkonisayisi_click", null));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Sub ButtonKoniSayisi_Click";
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlevel_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonlevel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonlevel_click", null));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Sub ButtonLevel_Click";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT level As [LEVEL], program_adi As [PROGRAM ADI] ,program_testTuru As [PROGRAM TEST TÜRÜ],  program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE level LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY program_id  DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpistuzunlugu_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpistuzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpistuzunlugu_click", null));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Sub ButtonPistUzunlugu_Click";
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="End Sub";
return "";
}
public static String  _buttonprogramadi_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonprogramadi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonprogramadi_click", null));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub ButtonProgramAdi_Click";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT program_adi As [PROGRAM ADI] ,program_testTuru As [PROGRAM TEST TÜRÜ], level As [LEVEL], program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY program_id  DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsil_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsil_click", null));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Sub ButtonSil_Click";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="StartActivity(ProgramSil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programsil.getObject()));
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT program_adi As [PROGRAM ADI] , program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY program_id  DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="End Sub";
return "";
}
public static String  _buttontestturu_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontestturu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontestturu_click", null));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub ButtonTestTuru_Click";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT program_testTuru As [PROGRAM TEST TÜRÜ], program_adi As [PROGRAM ADI] , level As [LEVEL], program_tarih As [TARİH], program_saat As [SAAT] FROM DayaniklilikTestProgram WHERE program_testTuru LIKE '%"+mostCurrent._edittextara.getText()+"%'  ORDER BY program_id  DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT program_adi  As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ] FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR level LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_testTuru LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id  DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="programlistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="End Sub";
return "";
}
}