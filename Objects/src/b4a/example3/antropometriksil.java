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

public class antropometriksil extends Activity implements B4AActivity{
	public static antropometriksil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.antropometriksil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (antropometriksil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.antropometriksil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.antropometriksil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (antropometriksil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (antropometriksil) Resume **");
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
		return antropometriksil.class;
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
        BA.LogInfo("** Activity (antropometriksil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            antropometriksil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (antropometriksil) Resume **");
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
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonboy = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkilo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoneluzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonkulacuzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonoturmayuksekligi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonayakuzunlugu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonderikivrimkalinligi = null;
public static String _tc = "";
public static String _tarih = "";
public static String _isim = "";
public static String _saat = "";
public static int _id = 0;
public static int _boy = 0;
public static int _kilo = 0;
public static int _el_uzunlugu = 0;
public static int _kulac_uzunlugu = 0;
public static int _oturma_yuksekligi = 0;
public static int _ayak_uzunlugu = 0;
public static int _derikivrim_kalinligi = 0;
public static byte[] _resim = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
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
public b4a.example3.psikolojikekle _psikolojikekle = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public b4a.example3.programsec _programsec = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="Activity.LoadLayout(\"AntropometrikSilPage\")";
mostCurrent._activity.LoadLayout("AntropometrikSilPage",mostCurrent.activityBA);
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43515912;
 //BA.debugLineNum = 43515912;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515913;
 //BA.debugLineNum = 43515913;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=43515914;
 //BA.debugLineNum = 43515914;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=43515916;
 //BA.debugLineNum = 43515916;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=43515917;
 //BA.debugLineNum = 43515917;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=43515918;
 //BA.debugLineNum = 43515918;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=43515919;
 //BA.debugLineNum = 43515919;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=43515920;
 //BA.debugLineNum = 43515920;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515922;
 //BA.debugLineNum = 43515922;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515923;
 //BA.debugLineNum = 43515923;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515925;
 //BA.debugLineNum = 43515925;BA.debugLine="ButtonDeriKivrimKalinligi.TextColor = Color.koyuM";
mostCurrent._buttonderikivrimkalinligi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515926;
 //BA.debugLineNum = 43515926;BA.debugLine="ButtonDeriKivrimKalinligi.Typeface = Typeface.DEF";
mostCurrent._buttonderikivrimkalinligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515927;
 //BA.debugLineNum = 43515927;BA.debugLine="ButtonDeriKivrimKalinligi.Text = \"DERİ KIVRIM KAL";
mostCurrent._buttonderikivrimkalinligi.setText(BA.ObjectToCharSequence("DERİ KIVRIM KALINLIĞI"));
RDebugUtils.currentLine=43515928;
 //BA.debugLineNum = 43515928;BA.debugLine="ButtonDeriKivrimKalinligi.TextSize = 14";
mostCurrent._buttonderikivrimkalinligi.setTextSize((float) (14));
RDebugUtils.currentLine=43515929;
 //BA.debugLineNum = 43515929;BA.debugLine="ButtonDeriKivrimKalinligi.SingleLine = True";
mostCurrent._buttonderikivrimkalinligi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515931;
 //BA.debugLineNum = 43515931;BA.debugLine="ButtonAyakUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttonayakuzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515932;
 //BA.debugLineNum = 43515932;BA.debugLine="ButtonAyakUzunlugu.Typeface = Typeface.DEFAULT_BO";
mostCurrent._buttonayakuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515933;
 //BA.debugLineNum = 43515933;BA.debugLine="ButtonAyakUzunlugu.Text = \"AYAK UZUNLUĞU\"";
mostCurrent._buttonayakuzunlugu.setText(BA.ObjectToCharSequence("AYAK UZUNLUĞU"));
RDebugUtils.currentLine=43515934;
 //BA.debugLineNum = 43515934;BA.debugLine="ButtonAyakUzunlugu.TextSize = 14";
mostCurrent._buttonayakuzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=43515935;
 //BA.debugLineNum = 43515935;BA.debugLine="ButtonAyakUzunlugu.SingleLine = True";
mostCurrent._buttonayakuzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515937;
 //BA.debugLineNum = 43515937;BA.debugLine="ButtonKulacUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttonkulacuzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515938;
 //BA.debugLineNum = 43515938;BA.debugLine="ButtonKulacUzunlugu.Typeface = Typeface.DEFAULT_B";
mostCurrent._buttonkulacuzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515939;
 //BA.debugLineNum = 43515939;BA.debugLine="ButtonKulacUzunlugu.Text = \"KULAÇ UZUNLUĞU\"";
mostCurrent._buttonkulacuzunlugu.setText(BA.ObjectToCharSequence("KULAÇ UZUNLUĞU"));
RDebugUtils.currentLine=43515940;
 //BA.debugLineNum = 43515940;BA.debugLine="ButtonKulacUzunlugu.TextSize = 14";
mostCurrent._buttonkulacuzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=43515941;
 //BA.debugLineNum = 43515941;BA.debugLine="ButtonKulacUzunlugu.SingleLine = True";
mostCurrent._buttonkulacuzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515943;
 //BA.debugLineNum = 43515943;BA.debugLine="ButtonOturmaYuksekligi.TextColor = Color.koyuMavi";
mostCurrent._buttonoturmayuksekligi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515944;
 //BA.debugLineNum = 43515944;BA.debugLine="ButtonOturmaYuksekligi.Typeface = Typeface.DEFAUL";
mostCurrent._buttonoturmayuksekligi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515945;
 //BA.debugLineNum = 43515945;BA.debugLine="ButtonOturmaYuksekligi.Text = \"OTURMA YÜKSEKLİĞİ\"";
mostCurrent._buttonoturmayuksekligi.setText(BA.ObjectToCharSequence("OTURMA YÜKSEKLİĞİ"));
RDebugUtils.currentLine=43515946;
 //BA.debugLineNum = 43515946;BA.debugLine="ButtonOturmaYuksekligi.TextSize = 14";
mostCurrent._buttonoturmayuksekligi.setTextSize((float) (14));
RDebugUtils.currentLine=43515947;
 //BA.debugLineNum = 43515947;BA.debugLine="ButtonOturmaYuksekligi.SingleLine = True";
mostCurrent._buttonoturmayuksekligi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515949;
 //BA.debugLineNum = 43515949;BA.debugLine="ButtonElUzunlugu.TextColor = Color.koyuMavi";
mostCurrent._buttoneluzunlugu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515950;
 //BA.debugLineNum = 43515950;BA.debugLine="ButtonElUzunlugu.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttoneluzunlugu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515951;
 //BA.debugLineNum = 43515951;BA.debugLine="ButtonElUzunlugu.Text = \"EL UZUNLUĞU\"";
mostCurrent._buttoneluzunlugu.setText(BA.ObjectToCharSequence("EL UZUNLUĞU"));
RDebugUtils.currentLine=43515952;
 //BA.debugLineNum = 43515952;BA.debugLine="ButtonElUzunlugu.TextSize = 14";
mostCurrent._buttoneluzunlugu.setTextSize((float) (14));
RDebugUtils.currentLine=43515953;
 //BA.debugLineNum = 43515953;BA.debugLine="ButtonElUzunlugu.SingleLine = True";
mostCurrent._buttoneluzunlugu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515955;
 //BA.debugLineNum = 43515955;BA.debugLine="ButtonKilo.TextColor = Color.koyuMavi";
mostCurrent._buttonkilo.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515956;
 //BA.debugLineNum = 43515956;BA.debugLine="ButtonKilo.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonkilo.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515957;
 //BA.debugLineNum = 43515957;BA.debugLine="ButtonKilo.Text = \"KİLO\"";
mostCurrent._buttonkilo.setText(BA.ObjectToCharSequence("KİLO"));
RDebugUtils.currentLine=43515958;
 //BA.debugLineNum = 43515958;BA.debugLine="ButtonKilo.TextSize = 14";
mostCurrent._buttonkilo.setTextSize((float) (14));
RDebugUtils.currentLine=43515959;
 //BA.debugLineNum = 43515959;BA.debugLine="ButtonKilo.SingleLine = True";
mostCurrent._buttonkilo.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515961;
 //BA.debugLineNum = 43515961;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515962;
 //BA.debugLineNum = 43515962;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515963;
 //BA.debugLineNum = 43515963;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=43515964;
 //BA.debugLineNum = 43515964;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=43515965;
 //BA.debugLineNum = 43515965;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515967;
 //BA.debugLineNum = 43515967;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515968;
 //BA.debugLineNum = 43515968;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515969;
 //BA.debugLineNum = 43515969;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=43515970;
 //BA.debugLineNum = 43515970;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=43515971;
 //BA.debugLineNum = 43515971;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515973;
 //BA.debugLineNum = 43515973;BA.debugLine="ButtonBoy.TextColor = Color.koyuMavi";
mostCurrent._buttonboy.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=43515974;
 //BA.debugLineNum = 43515974;BA.debugLine="ButtonBoy.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonboy.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=43515975;
 //BA.debugLineNum = 43515975;BA.debugLine="ButtonBoy.Text = \"BOY\"";
mostCurrent._buttonboy.setText(BA.ObjectToCharSequence("BOY"));
RDebugUtils.currentLine=43515976;
 //BA.debugLineNum = 43515976;BA.debugLine="ButtonBoy.TextSize = 14";
mostCurrent._buttonboy.setTextSize((float) (14));
RDebugUtils.currentLine=43515977;
 //BA.debugLineNum = 43515977;BA.debugLine="ButtonBoy.SingleLine = True";
mostCurrent._buttonboy.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43515981;
 //BA.debugLineNum = 43515981;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=43515983;
 //BA.debugLineNum = 43515983;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=44761091;
 //BA.debugLineNum = 44761091;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=44761092;
 //BA.debugLineNum = 44761092;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=44761093;
 //BA.debugLineNum = 44761093;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=44761094;
 //BA.debugLineNum = 44761094;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=44761095;
 //BA.debugLineNum = 44761095;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id ORDER BY antropometrik_id DESC")));
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=43778054;
 //BA.debugLineNum = 43778054;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=43778055;
 //BA.debugLineNum = 43778055;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Boy: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_boy))+" // Kilo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_kilo))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=43778057;
 //BA.debugLineNum = 43778057;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="antropometriksil";
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=44826627;
 //BA.debugLineNum = 44826627;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantropometrikekle_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantropometrikekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantropometrikekle_click", null));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Sub ButtonAntropometrikEkle_Click";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="StartActivity(AntropometrikEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antropometrikekle.getObject()));
RDebugUtils.currentLine=44630019;
 //BA.debugLineNum = 44630019;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=44630020;
 //BA.debugLineNum = 44630020;BA.debugLine="End Sub";
return "";
}
public static String  _buttonayakuzunlugu_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonayakuzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonayakuzunlugu_click", null));}
int _i = 0;
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Sub ButtonAyakUzunlugu_Click";
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=44367875;
 //BA.debugLineNum = 44367875;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_ayakUzunlugu LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC")));
RDebugUtils.currentLine=44367877;
 //BA.debugLineNum = 44367877;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=44367878;
 //BA.debugLineNum = 44367878;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44367879;
 //BA.debugLineNum = 44367879;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=44367880;
 //BA.debugLineNum = 44367880;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Ayak Uzunluğu: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ayak_uzunlugu))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=44367882;
 //BA.debugLineNum = 44367882;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44367883;
 //BA.debugLineNum = 44367883;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Public Sub VeriAl";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="id = rs.GetInt(\"antropometrik_id\")";
_id = mostCurrent._rs.GetInt("antropometrik_id");
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
mostCurrent._tc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=43712515;
 //BA.debugLineNum = 43712515;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
mostCurrent._isim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=43712516;
 //BA.debugLineNum = 43712516;BA.debugLine="tarih = rs.GetString(\"antropometrik_tarih\")";
mostCurrent._tarih = mostCurrent._rs.GetString("antropometrik_tarih");
RDebugUtils.currentLine=43712517;
 //BA.debugLineNum = 43712517;BA.debugLine="saat = rs.GetString(\"antropometrik_saat\")";
mostCurrent._saat = mostCurrent._rs.GetString("antropometrik_saat");
RDebugUtils.currentLine=43712518;
 //BA.debugLineNum = 43712518;BA.debugLine="boy = rs.GetInt(\"antropometrik_boy\")";
_boy = mostCurrent._rs.GetInt("antropometrik_boy");
RDebugUtils.currentLine=43712519;
 //BA.debugLineNum = 43712519;BA.debugLine="kilo = rs.GetInt(\"antropometrik_kilo\")";
_kilo = mostCurrent._rs.GetInt("antropometrik_kilo");
RDebugUtils.currentLine=43712520;
 //BA.debugLineNum = 43712520;BA.debugLine="el_uzunlugu = rs.GetInt(\"antropometrik_elUzunlugu";
_el_uzunlugu = mostCurrent._rs.GetInt("antropometrik_elUzunlugu");
RDebugUtils.currentLine=43712521;
 //BA.debugLineNum = 43712521;BA.debugLine="kulac_uzunlugu = rs.GetInt(\"antropometrik_kulacUz";
_kulac_uzunlugu = mostCurrent._rs.GetInt("antropometrik_kulacUzunlugu");
RDebugUtils.currentLine=43712522;
 //BA.debugLineNum = 43712522;BA.debugLine="oturma_yuksekligi = rs.GetInt(\"antropometrik_otur";
_oturma_yuksekligi = mostCurrent._rs.GetInt("antropometrik_oturmaYuksekligi");
RDebugUtils.currentLine=43712523;
 //BA.debugLineNum = 43712523;BA.debugLine="ayak_uzunlugu = rs.GetInt(\"antropometrik_ayakUzun";
_ayak_uzunlugu = mostCurrent._rs.GetInt("antropometrik_ayakUzunlugu");
RDebugUtils.currentLine=43712524;
 //BA.debugLineNum = 43712524;BA.debugLine="deriKivrim_kalinligi = rs.GetInt(\"antropometrik_d";
_derikivrim_kalinligi = mostCurrent._rs.GetInt("antropometrik_deriKivrimKalinligi");
RDebugUtils.currentLine=43712525;
 //BA.debugLineNum = 43712525;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
_resim = mostCurrent._rs.GetBlob("denek_image");
RDebugUtils.currentLine=43712526;
 //BA.debugLineNum = 43712526;BA.debugLine="Try";
try {RDebugUtils.currentLine=43712527;
 //BA.debugLineNum = 43712527;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=43712528;
 //BA.debugLineNum = 43712528;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
_inputstream.InitializeFromBytesArray(_resim,(int) (0),_resim.length);
RDebugUtils.currentLine=43712529;
 //BA.debugLineNum = 43712529;BA.debugLine="bmp.Initialize2(inputStream)";
mostCurrent._bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=43712530;
 //BA.debugLineNum = 43712530;BA.debugLine="inputStream.Close";
_inputstream.Close();
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=43712532;
 //BA.debugLineNum = 43712532;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
mostCurrent._bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png");
 };
RDebugUtils.currentLine=43712534;
 //BA.debugLineNum = 43712534;BA.debugLine="End Sub";
return "";
}
public static String  _buttonboy_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonboy_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonboy_click", null));}
int _i = 0;
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="Sub ButtonBoy_Click";
RDebugUtils.currentLine=44040193;
 //BA.debugLineNum = 44040193;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=44040195;
 //BA.debugLineNum = 44040195;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_boy LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC ")));
RDebugUtils.currentLine=44040197;
 //BA.debugLineNum = 44040197;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=44040198;
 //BA.debugLineNum = 44040198;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44040199;
 //BA.debugLineNum = 44040199;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=44040200;
 //BA.debugLineNum = 44040200;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Boy: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_boy))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=44040202;
 //BA.debugLineNum = 44040202;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44040203;
 //BA.debugLineNum = 44040203;BA.debugLine="End Sub";
return "";
}
public static String  _buttonderikivrimkalinligi_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonderikivrimkalinligi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonderikivrimkalinligi_click", null));}
int _i = 0;
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Sub ButtonDeriKivrimKalinligi_Click";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id  AND antropometrik_deriKivrimKalinligi  LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC ")));
RDebugUtils.currentLine=44433413;
 //BA.debugLineNum = 44433413;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=44433414;
 //BA.debugLineNum = 44433414;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44433415;
 //BA.debugLineNum = 44433415;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=44433416;
 //BA.debugLineNum = 44433416;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Deri Kıvrım Kalınlığı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_derikivrim_kalinligi))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=44433418;
 //BA.debugLineNum = 44433418;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44433419;
 //BA.debugLineNum = 44433419;BA.debugLine="End Sub";
return "";
}
public static String  _buttoneluzunlugu_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttoneluzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttoneluzunlugu_click", null));}
int _i = 0;
RDebugUtils.currentLine=44171264;
 //BA.debugLineNum = 44171264;BA.debugLine="Sub ButtonElUzunlugu_Click";
RDebugUtils.currentLine=44171265;
 //BA.debugLineNum = 44171265;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=44171267;
 //BA.debugLineNum = 44171267;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_elUzunlugu LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC")));
RDebugUtils.currentLine=44171269;
 //BA.debugLineNum = 44171269;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=44171270;
 //BA.debugLineNum = 44171270;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44171271;
 //BA.debugLineNum = 44171271;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=44171272;
 //BA.debugLineNum = 44171272;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // El Uzunluğu: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_el_uzunlugu))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=44171274;
 //BA.debugLineNum = 44171274;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44171275;
 //BA.debugLineNum = 44171275;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkilo_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkilo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkilo_click", null));}
int _i = 0;
RDebugUtils.currentLine=44105728;
 //BA.debugLineNum = 44105728;BA.debugLine="Sub ButtonKilo_Click";
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=44105731;
 //BA.debugLineNum = 44105731;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_kilo LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC ")));
RDebugUtils.currentLine=44105733;
 //BA.debugLineNum = 44105733;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=44105736;
 //BA.debugLineNum = 44105736;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Kilo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_kilo))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=44105738;
 //BA.debugLineNum = 44105738;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44105739;
 //BA.debugLineNum = 44105739;BA.debugLine="End Sub";
return "";
}
public static String  _buttonkulacuzunlugu_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonkulacuzunlugu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonkulacuzunlugu_click", null));}
int _i = 0;
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Sub ButtonKulacUzunlugu_Click";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=44236803;
 //BA.debugLineNum = 44236803;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik ,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_kulacUzunlugu LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC")));
RDebugUtils.currentLine=44236805;
 //BA.debugLineNum = 44236805;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=44236806;
 //BA.debugLineNum = 44236806;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44236807;
 //BA.debugLineNum = 44236807;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=44236808;
 //BA.debugLineNum = 44236808;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Kulaç Uzunluğu: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_kulac_uzunlugu))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=44236810;
 //BA.debugLineNum = 44236810;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44236811;
 //BA.debugLineNum = 44236811;BA.debugLine="End Sub";
return "";
}
public static String  _buttonoturmayuksekligi_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonoturmayuksekligi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonoturmayuksekligi_click", null));}
int _i = 0;
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Sub ButtonOturmaYuksekligi_Click";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=44302339;
 //BA.debugLineNum = 44302339;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_oturmaYuksekligi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC ")));
RDebugUtils.currentLine=44302341;
 //BA.debugLineNum = 44302341;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=44302342;
 //BA.debugLineNum = 44302342;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44302343;
 //BA.debugLineNum = 44302343;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=44302344;
 //BA.debugLineNum = 44302344;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Oturma Yüksekliği: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_oturma_yuksekligi))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=44302346;
 //BA.debugLineNum = 44302346;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44302347;
 //BA.debugLineNum = 44302347;BA.debugLine="End Sub";
return "";
}
public static String  _buttontabloveri_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontabloveri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontabloveri_click", null));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Sub ButtonTabloVeri_Click";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="StartActivity(AntropometrikListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antropometriklistele.getObject()));
RDebugUtils.currentLine=44695555;
 //BA.debugLineNum = 44695555;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=44695556;
 //BA.debugLineNum = 44695556;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
int _i = 0;
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=43909123;
 //BA.debugLineNum = 43909123;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antropometrik_id DESC")));
RDebugUtils.currentLine=43909125;
 //BA.debugLineNum = 43909125;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=43909126;
 //BA.debugLineNum = 43909126;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=43909127;
 //BA.debugLineNum = 43909127;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=43909128;
 //BA.debugLineNum = 43909128;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=43909130;
 //BA.debugLineNum = 43909130;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=43909131;
 //BA.debugLineNum = 43909131;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="ButtonTarih_Click";
_buttontarih_click();
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=43843588;
 //BA.debugLineNum = 43843588;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_tarih  LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_boy  LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_kilo  LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_elUzunlugu  LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_kulacUzunlugu  LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_oturmaYuksekligi  LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_ayakUzunlugu  LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antropometrik_deriKivrimKalinligi  LIKE '%"+mostCurrent._edittextara.getText()+"%' ) ORDER BY antropometrik_id DESC")));
RDebugUtils.currentLine=43843590;
 //BA.debugLineNum = 43843590;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=43843591;
 //BA.debugLineNum = 43843591;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=43843592;
 //BA.debugLineNum = 43843592;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=43843593;
 //BA.debugLineNum = 43843593;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Boy: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_boy))+" // Kilo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_kilo))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=43843595;
 //BA.debugLineNum = 43843595;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=43843596;
 //BA.debugLineNum = 43843596;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=43843597;
 //BA.debugLineNum = 43843597;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=43843599;
 //BA.debugLineNum = 43843599;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=44892163;
 //BA.debugLineNum = 44892163;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=44892164;
 //BA.debugLineNum = 44892164;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="WebView1.Visible = True";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT] ,antropometrik_boy As [BOY] , antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_id = '"+BA.ObjectToString(_value)+"'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=44564483;
 //BA.debugLineNum = 44564483;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=44564484;
 //BA.debugLineNum = 44564484;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="antropometriksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Antropomet";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Antropometrik WHERE antropometrik_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=44498948;
 //BA.debugLineNum = 44498948;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=44498949;
 //BA.debugLineNum = 44498949;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=44498951;
 //BA.debugLineNum = 44498951;BA.debugLine="id = rs.GetInt(\"antropometrik_id\")";
_id = mostCurrent._rs.GetInt("antropometrik_id");
 }
};
RDebugUtils.currentLine=44498953;
 //BA.debugLineNum = 44498953;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=44498955;
 //BA.debugLineNum = 44498955;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=44498956;
 //BA.debugLineNum = 44498956;BA.debugLine="result = Msgbox2(\"Antropometrik bilgiyi silmek is";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Antropometrik bilgiyi silmek istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=44498957;
 //BA.debugLineNum = 44498957;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=44498958;
 //BA.debugLineNum = 44498958;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM Antropometrik";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM Antropometrik WHERE antropometrik_id = '"+BA.NumberToString(_id)+"' ");
RDebugUtils.currentLine=44498959;
 //BA.debugLineNum = 44498959;BA.debugLine="ToastMessageShow(\"Denek silindi...\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Denek silindi..."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=44498961;
 //BA.debugLineNum = 44498961;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=44498962;
 //BA.debugLineNum = 44498962;BA.debugLine="End Sub";
return "";
}
}