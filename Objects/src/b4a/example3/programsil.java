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

public class programsil extends Activity implements B4AActivity{
	public static programsil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.programsil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (programsil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.programsil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.programsil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (programsil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (programsil) Resume **");
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
		return programsil.class;
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
        BA.LogInfo("** Activity (programsil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            programsil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (programsil) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttondayaniklilikprogramekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondayaniklilikprogramtabloveri = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonprogramadi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlevel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontestturu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonpistuzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkoniarasimesafe = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkonisayisi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonhiz = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static int _id = 0;
public static int _level = 0;
public static String _programadi = "";
public static String _testturu = "";
public static String _tarih = "";
public static String _saat = "";
public static float _konimesafesi = 0f;
public static float _hiz = 0f;
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
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="Activity.LoadLayout(\"ProgramSilPage\")";
mostCurrent._activity.LoadLayout("ProgramSilPage",mostCurrent.activityBA);
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24313863;
 //BA.debugLineNum = 24313863;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24313864;
 //BA.debugLineNum = 24313864;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313865;
 //BA.debugLineNum = 24313865;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=24313866;
 //BA.debugLineNum = 24313866;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=24313868;
 //BA.debugLineNum = 24313868;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=24313869;
 //BA.debugLineNum = 24313869;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=24313870;
 //BA.debugLineNum = 24313870;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=24313871;
 //BA.debugLineNum = 24313871;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=24313872;
 //BA.debugLineNum = 24313872;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313874;
 //BA.debugLineNum = 24313874;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
mostCurrent._buttonprogramadi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313875;
 //BA.debugLineNum = 24313875;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonprogramadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313876;
 //BA.debugLineNum = 24313876;BA.debugLine="ButtonProgramAdi.TextSize = 14";
mostCurrent._buttonprogramadi.setTextSize((float) (14));
RDebugUtils.currentLine=24313877;
 //BA.debugLineNum = 24313877;BA.debugLine="ButtonProgramAdi.SingleLine = True";
mostCurrent._buttonprogramadi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313879;
 //BA.debugLineNum = 24313879;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
mostCurrent._buttontestturu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313880;
 //BA.debugLineNum = 24313880;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontestturu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313881;
 //BA.debugLineNum = 24313881;BA.debugLine="ButtonTestTuru.TextSize = 14";
mostCurrent._buttontestturu.setTextSize((float) (14));
RDebugUtils.currentLine=24313882;
 //BA.debugLineNum = 24313882;BA.debugLine="ButtonTestTuru.SingleLine = True";
mostCurrent._buttontestturu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313884;
 //BA.debugLineNum = 24313884;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313885;
 //BA.debugLineNum = 24313885;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313886;
 //BA.debugLineNum = 24313886;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=24313887;
 //BA.debugLineNum = 24313887;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=24313888;
 //BA.debugLineNum = 24313888;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313890;
 //BA.debugLineNum = 24313890;BA.debugLine="ButtonPistUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttonpistuzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313891;
 //BA.debugLineNum = 24313891;BA.debugLine="ButtonPistUzunlugu.Typeface = Typeface.DEFAULT_BO";
mostCurrent._buttonpistuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313892;
 //BA.debugLineNum = 24313892;BA.debugLine="ButtonPistUzunlugu.Text = \"PİST UZUNLUĞU\"";
mostCurrent._buttonpistuzunlugu.setText(BA.ObjectToCharSequence("PİST UZUNLUĞU"));
RDebugUtils.currentLine=24313893;
 //BA.debugLineNum = 24313893;BA.debugLine="ButtonPistUzunlugu.TextSize = 14";
mostCurrent._buttonpistuzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=24313894;
 //BA.debugLineNum = 24313894;BA.debugLine="ButtonPistUzunlugu.SingleLine = True";
mostCurrent._buttonpistuzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313896;
 //BA.debugLineNum = 24313896;BA.debugLine="ButtonKoniArasiMesafe.TextColor = Color.koyuMavi";
mostCurrent._buttonkoniarasimesafe.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313897;
 //BA.debugLineNum = 24313897;BA.debugLine="ButtonKoniArasiMesafe.Typeface = Typeface.DEFAULT";
mostCurrent._buttonkoniarasimesafe.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313898;
 //BA.debugLineNum = 24313898;BA.debugLine="ButtonKoniArasiMesafe.Text = \"KONİ ARASI MESAFE\"";
mostCurrent._buttonkoniarasimesafe.setText(BA.ObjectToCharSequence("KONİ ARASI MESAFE"));
RDebugUtils.currentLine=24313899;
 //BA.debugLineNum = 24313899;BA.debugLine="ButtonKoniArasiMesafe.TextSize = 14";
mostCurrent._buttonkoniarasimesafe.setTextSize((float) (14));
RDebugUtils.currentLine=24313900;
 //BA.debugLineNum = 24313900;BA.debugLine="ButtonKoniArasiMesafe.SingleLine = True";
mostCurrent._buttonkoniarasimesafe.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313902;
 //BA.debugLineNum = 24313902;BA.debugLine="ButtonKoniSayisi.TextColor = Color.koyuMavi";
mostCurrent._buttonkonisayisi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313903;
 //BA.debugLineNum = 24313903;BA.debugLine="ButtonKoniSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonkonisayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313904;
 //BA.debugLineNum = 24313904;BA.debugLine="ButtonKoniSayisi.Text = \"KONİ SAYISI\"";
mostCurrent._buttonkonisayisi.setText(BA.ObjectToCharSequence("KONİ SAYISI"));
RDebugUtils.currentLine=24313905;
 //BA.debugLineNum = 24313905;BA.debugLine="ButtonKoniSayisi.TextSize = 14";
mostCurrent._buttonkonisayisi.setTextSize((float) (14));
RDebugUtils.currentLine=24313906;
 //BA.debugLineNum = 24313906;BA.debugLine="ButtonKoniSayisi.SingleLine = True";
mostCurrent._buttonkonisayisi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313908;
 //BA.debugLineNum = 24313908;BA.debugLine="ButtonHiz.TextColor = Color.koyuMavi";
mostCurrent._buttonhiz.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313909;
 //BA.debugLineNum = 24313909;BA.debugLine="ButtonHiz.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonhiz.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313910;
 //BA.debugLineNum = 24313910;BA.debugLine="ButtonHiz.Text = \"HIZ\"";
mostCurrent._buttonhiz.setText(BA.ObjectToCharSequence("HIZ"));
RDebugUtils.currentLine=24313911;
 //BA.debugLineNum = 24313911;BA.debugLine="ButtonHiz.TextSize = 14";
mostCurrent._buttonhiz.setTextSize((float) (14));
RDebugUtils.currentLine=24313912;
 //BA.debugLineNum = 24313912;BA.debugLine="ButtonHiz.SingleLine = True";
mostCurrent._buttonhiz.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313914;
 //BA.debugLineNum = 24313914;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
mostCurrent._buttonlevel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=24313915;
 //BA.debugLineNum = 24313915;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonlevel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=24313916;
 //BA.debugLineNum = 24313916;BA.debugLine="ButtonLevel.Text = \"LEVEL\"";
mostCurrent._buttonlevel.setText(BA.ObjectToCharSequence("LEVEL"));
RDebugUtils.currentLine=24313917;
 //BA.debugLineNum = 24313917;BA.debugLine="ButtonLevel.TextSize = 14";
mostCurrent._buttonlevel.setTextSize((float) (14));
RDebugUtils.currentLine=24313918;
 //BA.debugLineNum = 24313918;BA.debugLine="ButtonLevel.SingleLine = True";
mostCurrent._buttonlevel.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313920;
 //BA.debugLineNum = 24313920;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313921;
 //BA.debugLineNum = 24313921;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24313924;
 //BA.debugLineNum = 24313924;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=24313925;
 //BA.debugLineNum = 24313925;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=25624582;
 //BA.debugLineNum = 25624582;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=25624583;
 //BA.debugLineNum = 25624583;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC")));
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=24576005;
 //BA.debugLineNum = 24576005;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=24576007;
 //BA.debugLineNum = 24576007;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")));
 }
};
RDebugUtils.currentLine=24576009;
 //BA.debugLineNum = 24576009;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="programsil";
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="End Sub";
return "";
}
public static String  _buttondayaniklilikprogramekle_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondayaniklilikprogramekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondayaniklilikprogramekle_click", null));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Sub ButtonDayaniklilikProgramEkle_Click";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="StartActivity(ProgramAyar)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programayar.getObject()));
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="End Sub";
return "";
}
public static String  _buttondayaniklilikprogramtabloveri_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondayaniklilikprogramtabloveri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondayaniklilikprogramtabloveri_click", null));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Sub ButtonDayaniklilikProgramTabloVeri_Click";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="StartActivity(ProgramListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programlistele.getObject()));
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=25559044;
 //BA.debugLineNum = 25559044;BA.debugLine="End Sub";
return "";
}
public static String  _buttonhiz_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonhiz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonhiz_click", null));}
int _i = 0;
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Sub ButtonHiz_Click";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE hiz1 LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=25165831;
 //BA.debugLineNum = 25165831;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=25165832;
 //BA.debugLineNum = 25165832;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Hız: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_hiz))+"")));
 }
};
RDebugUtils.currentLine=25165834;
 //BA.debugLineNum = 25165834;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=25165835;
 //BA.debugLineNum = 25165835;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Sub VeriAl";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="id= rs.GetInt(\"program_id\")";
_id = mostCurrent._rs.GetInt("program_id");
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="programAdi = rs.GetString(\"program_adi\")";
mostCurrent._programadi = mostCurrent._rs.GetString("program_adi");
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="testTuru = rs.GetString(\"program_testTuru\")";
mostCurrent._testturu = mostCurrent._rs.GetString("program_testTuru");
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="level = rs.GetInt(\"level\")";
_level = mostCurrent._rs.GetInt("level");
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="tarih = rs.GetString(\"program_tarih\")";
mostCurrent._tarih = mostCurrent._rs.GetString("program_tarih");
RDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="saat = rs.GetString(\"program_saat\")";
mostCurrent._saat = mostCurrent._rs.GetString("program_saat");
RDebugUtils.currentLine=24510471;
 //BA.debugLineNum = 24510471;BA.debugLine="koniMesafesi = rs.GetString(\"koniMesafesi1\")";
_konimesafesi = (float)(Double.parseDouble(mostCurrent._rs.GetString("koniMesafesi1")));
RDebugUtils.currentLine=24510472;
 //BA.debugLineNum = 24510472;BA.debugLine="hiz = rs.GetString(\"hiz1\")";
_hiz = (float)(Double.parseDouble(mostCurrent._rs.GetString("hiz1")));
RDebugUtils.currentLine=24510473;
 //BA.debugLineNum = 24510473;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkoniarasimesafe_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkoniarasimesafe_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkoniarasimesafe_click", null));}
int _i = 0;
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Sub ButtonKoniArasiMesafe_Click";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE koniMesafesi1 LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=25034757;
 //BA.debugLineNum = 25034757;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=25034758;
 //BA.debugLineNum = 25034758;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=25034760;
 //BA.debugLineNum = 25034760;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Koni Mesafesi: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_konimesafesi))+"")));
 }
};
RDebugUtils.currentLine=25034762;
 //BA.debugLineNum = 25034762;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=25034763;
 //BA.debugLineNum = 25034763;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkonisayisi_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkonisayisi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkonisayisi_click", null));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Sub ButtonKoniSayisi_Click";
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlevel_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonlevel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonlevel_click", null));}
int _i = 0;
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Sub ButtonLevel_Click";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE level LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="ListView1.AddTwoLines(id,$\"Level: ${level} // Pr";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" //// Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")));
 }
};
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpistuzunlugu_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpistuzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpistuzunlugu_click", null));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Sub ButtonPistUzunlugu_Click";
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="End Sub";
return "";
}
public static String  _buttonprogramadi_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonprogramadi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonprogramadi_click", null));}
int _i = 0;
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Sub ButtonProgramAdi_Click";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")));
 }
};
RDebugUtils.currentLine=24707082;
 //BA.debugLineNum = 24707082;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
int _i = 0;
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=24903687;
 //BA.debugLineNum = 24903687;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="ListView1.AddTwoLines(id,$\"Tarih: ${tarih} // Sa";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+"")));
 }
};
RDebugUtils.currentLine=24903690;
 //BA.debugLineNum = 24903690;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=24903691;
 //BA.debugLineNum = 24903691;BA.debugLine="End Sub";
return "";
}
public static String  _buttontestturu_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontestturu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontestturu_click", null));}
int _i = 0;
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Sub ButtonTestTuru_Click";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_testTuru  LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=24838149;
 //BA.debugLineNum = 24838149;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=24838150;
 //BA.debugLineNum = 24838150;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=24838151;
 //BA.debugLineNum = 24838151;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="ListView1.AddTwoLines(id,$\"Level: ${level} // Pr";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")));
 }
};
RDebugUtils.currentLine=24838154;
 //BA.debugLineNum = 24838154;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=24838155;
 //BA.debugLineNum = 24838155;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Dayanikli";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_testTuru LIKE '%"+mostCurrent._edittextara.getText()+"%' OR level LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_saat LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC")));
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=24641543;
 //BA.debugLineNum = 24641543;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=24641545;
 //BA.debugLineNum = 24641545;BA.debugLine="ListView1.AddTwoLines(id,$\"Program Adı: ${progra";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")));
 }
};
RDebugUtils.currentLine=24641547;
 //BA.debugLineNum = 24641547;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=24641548;
 //BA.debugLineNum = 24641548;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=24641549;
 //BA.debugLineNum = 24641549;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=24641551;
 //BA.debugLineNum = 24641551;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
int _result = 0;
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="Dim result As Int = Msgbox2($\"Program ismi: ${pro";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(("Program ismi: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" olan program bilgilerini görüntülemek için Görüntüle'yi tıklayın ya da Seçili program için Dayanıklılık Testi yapmak için lütfen Test Yap'ı seçin")),BA.ObjectToCharSequence("Bildirim Mesajı"),"Görüntüle","","Test Yap",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="WebView1.Visible = True";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=25427972;
 //BA.debugLineNum = 25427972;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT program_adi  As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ],koniMesafesi1 As [KONİ MESAFESİ1] , hiz1 As [HIZ1], dakika1 As [DAKİKA1] ,saniye1  As [SANİYE1] ,koniMesafesi2 As [KONİ MESAFESİ2] , hiz2 As [HIZ2],dakika2 As [DAKİKA2],saniye2  As [SANİYE2],koniMesafesi3 As [KONİ MESAFESİ3],hiz3 As [HIZ3],dakika3 As [DAKİKA3] ,saniye3  As [SANİYE3],koniMesafesi4 As [KONİ MESAFESİ4] ,hiz4 As [HIZ4],dakika4 As [DAKİKA4],saniye4  As [SANİYE4],koniMesafesi5 As [KONİ MESAFESİ5],hiz5 As [HIZ5] ,dakika5 As [DAKİKA5],saniye5  As [SANİYE5],koniMesafesi6 As [KONİ MESAFESİ6] ,hiz6 As [HIZ6] ,dakika6 As [DAKİKA6],saniye6  As [SANİYE6],koniMesafesi7 As [KONİ MESAFESİ7] ,hiz7 As [HIZ7] ,dakika7 As [DAKİKA7] ,saniye7  As [SANİYE7], koniMesafesi8 As [KONİ MESAFESİ8] ,hiz8 As [HIZ8],dakika8 As [DAKİKA8] ,saniye8  As [SANİYE8],koniMesafesi9 As [KONİ MESAFESİ9],hiz9 As [HIZ9],dakika9 As [DAKİKA9] ,saniye9  As [SANİYE9],koniMesafesi10 As [KONİ MESAFESİ10] ,hiz10 As [HIZ10] ,dakika10 As [DAKİKA10] ,saniye10  As [SANİYE10],koniMesafesi11 As [KONİ MESAFESİ11] ,hiz11 As [HIZ11] ,dakika11 As [DAKİKA11] ,saniye11  As [SANİYE11],koniMesafesi12 As [KONİ MESAFESİ12],hiz12 As [HIZ12],dakika12 As [DAKİKA12],saniye12  As [SANİYE12],koniMesafesi13 As [KONİ MESAFESİ13] ,hiz13 As [HIZ13] ,dakika13 As [DAKİKA13] ,saniye13  As [SANİYE13],koniMesafesi14 As [KONİ MESAFESİ14],hiz14 As [HIZ14] ,dakika14 As [DAKİKA14],saniye14  As [SANİYE14],koniMesafesi15 As [KONİ MESAFESİ15],hiz15 As [HIZ15] ,dakika15 As [DAKİKA15] ,saniye15  As [SANİYE15],koniMesafesi16 As [KONİ MESAFESİ16],hiz16 As [HIZ16],dakika16 As [DAKİKA16] ,saniye16  As [SANİYE16], koniMesafesi17 As [KONİ MESAFESİ17] ,hiz17 As [HIZ17] ,dakika17 As [DAKİKA17],saniye17  As [SANİYE17] ,koniMesafesi18 As [KONİ MESAFESİ18] ,hiz18 As [HIZ18] ,dakika18 As [DAKİKA18],saniye18  As [SANİYE18] ,koniMesafesi19 As [KONİ MESAFESİ19] ,hiz19 As [HIZ19] ,dakika19 As [DAKİKA19] ,saniye19  As [SANİYE19],koniMesafesi20 As [KONİ MESAFESİ20] ,hiz20 As [HIZ20] ,dakika20 As [DAKİKA20] ,saniye20 As [SANİYE20], koniMesafesi21 As [KONİ MESAFESİ21] ,hiz21 As [HIZ21] ,dakika21 As [DAKİKA21],saniye21 As [SANİYE21], koniMesafesi22 As [KONİ MESAFESİ22] ,hiz22 As [HIZ22],dakika22 As [DAKİKA22] ,saniye22 As [SANİYE22], koniMesafesi23 As [KONİ MESAFESİ23] ,hiz23 As [HIZ23],dakika23 As [DAKİKA23],saniye23 As [SANİYE23], koniMesafesi24 As [KONİ MESAFESİ24] ,hiz24 As [HIZ24] ,dakika24 As [DAKİKA24],saniye24 As [SANİYE24],koniMesafesi25 As [KONİ MESAFESİ25] ,hiz25 As [HIZ25] ,dakika25 As [DAKİKA25] ,saniye25 As [SANİYE25] FROM DayaniklilikTestProgram WHERE program_id = '"+BA.ObjectToString(_value)+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=25427973;
 //BA.debugLineNum = 25427973;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=25427974;
 //BA.debugLineNum = 25427974;BA.debugLine="Else if result = DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=25427976;
 //BA.debugLineNum = 25427976;BA.debugLine="Activity.finish";
mostCurrent._activity.Finish();
 }}
;
RDebugUtils.currentLine=25427979;
 //BA.debugLineNum = 25427979;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="programsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=25362436;
 //BA.debugLineNum = 25362436;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=25362437;
 //BA.debugLineNum = 25362437;BA.debugLine="id = rs.GetInt(\"program_id\")";
_id = mostCurrent._rs.GetInt("program_id");
 }
};
RDebugUtils.currentLine=25362439;
 //BA.debugLineNum = 25362439;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=25362441;
 //BA.debugLineNum = 25362441;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=25362442;
 //BA.debugLineNum = 25362442;BA.debugLine="result = Msgbox2(\"Programı silmek istediğinizden";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Programı silmek istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=25362443;
 //BA.debugLineNum = 25362443;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=25362444;
 //BA.debugLineNum = 25362444;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM DayaniklilikT";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM DayaniklilikTestProgram WHERE program_id = '"+BA.NumberToString(_id)+"' ");
RDebugUtils.currentLine=25362445;
 //BA.debugLineNum = 25362445;BA.debugLine="ToastMessageShow(\"Program silindi...\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Program silindi..."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=25362447;
 //BA.debugLineNum = 25362447;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=25362448;
 //BA.debugLineNum = 25362448;BA.debugLine="End Sub";
return "";
}
}