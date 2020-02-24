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

public class surattestsil extends Activity implements B4AActivity{
	public static surattestsil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.surattestsil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (surattestsil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.surattestsil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.surattestsil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (surattestsil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (surattestsil) Resume **");
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
		return surattestsil.class;
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
        BA.LogInfo("** Activity (surattestsil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            surattestsil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (surattestsil) Resume **");
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
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static String _tc = "";
public static String _tarih = "";
public static String _isim = "";
public static String _saat = "";
public static String _moddeger = "";
public static int _id = 0;
public static int _gate_sayisi = 0;
public static int _set_sayisi = 0;
public static byte[] _resim = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonanasayfa = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsurattestekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontablodagoster = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmod = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttongatesayisi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsetsayisi = null;
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
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="Activity.LoadLayout(\"SuratTestSilPage\")";
mostCurrent._activity.LoadLayout("SuratTestSilPage",mostCurrent.activityBA);
RDebugUtils.currentLine=27983877;
 //BA.debugLineNum = 27983877;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27983878;
 //BA.debugLineNum = 27983878;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=27983879;
 //BA.debugLineNum = 27983879;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=27983880;
 //BA.debugLineNum = 27983880;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=27983882;
 //BA.debugLineNum = 27983882;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=27983883;
 //BA.debugLineNum = 27983883;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=27983884;
 //BA.debugLineNum = 27983884;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=27983885;
 //BA.debugLineNum = 27983885;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=27983886;
 //BA.debugLineNum = 27983886;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=27983888;
 //BA.debugLineNum = 27983888;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983889;
 //BA.debugLineNum = 27983889;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983891;
 //BA.debugLineNum = 27983891;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=27983892;
 //BA.debugLineNum = 27983892;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=27983893;
 //BA.debugLineNum = 27983893;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=27983894;
 //BA.debugLineNum = 27983894;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=27983895;
 //BA.debugLineNum = 27983895;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983897;
 //BA.debugLineNum = 27983897;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=27983898;
 //BA.debugLineNum = 27983898;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=27983899;
 //BA.debugLineNum = 27983899;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=27983900;
 //BA.debugLineNum = 27983900;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=27983901;
 //BA.debugLineNum = 27983901;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983903;
 //BA.debugLineNum = 27983903;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=27983904;
 //BA.debugLineNum = 27983904;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=27983905;
 //BA.debugLineNum = 27983905;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=27983906;
 //BA.debugLineNum = 27983906;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=27983907;
 //BA.debugLineNum = 27983907;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983909;
 //BA.debugLineNum = 27983909;BA.debugLine="ButtonMod.TextColor = Color.koyuMavi";
mostCurrent._buttonmod.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=27983910;
 //BA.debugLineNum = 27983910;BA.debugLine="ButtonMod.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonmod.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=27983911;
 //BA.debugLineNum = 27983911;BA.debugLine="ButtonMod.Text = \"MOD\"";
mostCurrent._buttonmod.setText(BA.ObjectToCharSequence("MOD"));
RDebugUtils.currentLine=27983912;
 //BA.debugLineNum = 27983912;BA.debugLine="ButtonMod.TextSize = 14";
mostCurrent._buttonmod.setTextSize((float) (14));
RDebugUtils.currentLine=27983913;
 //BA.debugLineNum = 27983913;BA.debugLine="ButtonMod.SingleLine = True";
mostCurrent._buttonmod.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983915;
 //BA.debugLineNum = 27983915;BA.debugLine="ButtonGateSayisi.TextColor = Color.koyuMavi";
mostCurrent._buttongatesayisi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=27983916;
 //BA.debugLineNum = 27983916;BA.debugLine="ButtonGateSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttongatesayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=27983917;
 //BA.debugLineNum = 27983917;BA.debugLine="ButtonGateSayisi.Text = \"GATE SAYISI\"";
mostCurrent._buttongatesayisi.setText(BA.ObjectToCharSequence("GATE SAYISI"));
RDebugUtils.currentLine=27983918;
 //BA.debugLineNum = 27983918;BA.debugLine="ButtonGateSayisi.TextSize = 14";
mostCurrent._buttongatesayisi.setTextSize((float) (14));
RDebugUtils.currentLine=27983919;
 //BA.debugLineNum = 27983919;BA.debugLine="ButtonGateSayisi.SingleLine = True";
mostCurrent._buttongatesayisi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983921;
 //BA.debugLineNum = 27983921;BA.debugLine="ButtonSetSayisi.TextColor = Color.koyuMavi";
mostCurrent._buttonsetsayisi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=27983922;
 //BA.debugLineNum = 27983922;BA.debugLine="ButtonSetSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonsetsayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=27983923;
 //BA.debugLineNum = 27983923;BA.debugLine="ButtonSetSayisi.Text = \"SET SAYISI\"";
mostCurrent._buttonsetsayisi.setText(BA.ObjectToCharSequence("SET SAYISI"));
RDebugUtils.currentLine=27983924;
 //BA.debugLineNum = 27983924;BA.debugLine="ButtonSetSayisi.TextSize = 14";
mostCurrent._buttonsetsayisi.setTextSize((float) (14));
RDebugUtils.currentLine=27983925;
 //BA.debugLineNum = 27983925;BA.debugLine="ButtonSetSayisi.SingleLine = True";
mostCurrent._buttonsetsayisi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27983928;
 //BA.debugLineNum = 27983928;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=27983929;
 //BA.debugLineNum = 27983929;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=29163524;
 //BA.debugLineNum = 29163524;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=29163525;
 //BA.debugLineNum = 29163525;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=29163526;
 //BA.debugLineNum = 29163526;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=29163527;
 //BA.debugLineNum = 29163527;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id ORDER BY surat_id  DESC")));
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=28311559;
 //BA.debugLineNum = 28311559;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Mod: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._moddeger))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=28311561;
 //BA.debugLineNum = 28311561;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="surattestsil";
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="End Sub";
return "";
}
public static String  _buttongatesayisi_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttongatesayisi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttongatesayisi_click", null));}
int _i = 0;
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Sub ButtonGateSayisi_Click";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND gateSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC")));
RDebugUtils.currentLine=28704773;
 //BA.debugLineNum = 28704773;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28704774;
 //BA.debugLineNum = 28704774;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=28704775;
 //BA.debugLineNum = 28704775;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=28704776;
 //BA.debugLineNum = 28704776;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Gate Sayısı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_gate_sayisi))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=28704778;
 //BA.debugLineNum = 28704778;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=28704779;
 //BA.debugLineNum = 28704779;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub VeriAl";
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="id = rs.GetInt(\"surat_id\")";
_id = mostCurrent._rs.GetInt("surat_id");
RDebugUtils.currentLine=28180483;
 //BA.debugLineNum = 28180483;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
mostCurrent._tc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
mostCurrent._isim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=28180485;
 //BA.debugLineNum = 28180485;BA.debugLine="tarih = rs.GetString(\"surat_tarih\")";
mostCurrent._tarih = mostCurrent._rs.GetString("surat_tarih");
RDebugUtils.currentLine=28180486;
 //BA.debugLineNum = 28180486;BA.debugLine="saat = rs.GetString(\"surat_saat\")";
mostCurrent._saat = mostCurrent._rs.GetString("surat_saat");
RDebugUtils.currentLine=28180487;
 //BA.debugLineNum = 28180487;BA.debugLine="modDeger = rs.GetString(\"mod\")";
mostCurrent._moddeger = mostCurrent._rs.GetString("mod");
RDebugUtils.currentLine=28180488;
 //BA.debugLineNum = 28180488;BA.debugLine="gate_sayisi = rs.GetInt(\"gateSayisi\")";
_gate_sayisi = mostCurrent._rs.GetInt("gateSayisi");
RDebugUtils.currentLine=28180489;
 //BA.debugLineNum = 28180489;BA.debugLine="set_sayisi = rs.GetInt(\"setSayisi\")";
_set_sayisi = mostCurrent._rs.GetInt("setSayisi");
RDebugUtils.currentLine=28180490;
 //BA.debugLineNum = 28180490;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
_resim = mostCurrent._rs.GetBlob("denek_image");
RDebugUtils.currentLine=28180491;
 //BA.debugLineNum = 28180491;BA.debugLine="Try";
try {RDebugUtils.currentLine=28180492;
 //BA.debugLineNum = 28180492;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=28180493;
 //BA.debugLineNum = 28180493;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
_inputstream.InitializeFromBytesArray(_resim,(int) (0),_resim.length);
RDebugUtils.currentLine=28180494;
 //BA.debugLineNum = 28180494;BA.debugLine="bmp.Initialize2(inputStream)";
mostCurrent._bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=28180495;
 //BA.debugLineNum = 28180495;BA.debugLine="inputStream.Close";
_inputstream.Close();
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=28180497;
 //BA.debugLineNum = 28180497;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
mostCurrent._bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png");
 };
RDebugUtils.currentLine=28180499;
 //BA.debugLineNum = 28180499;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
int _i = 0;
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC")));
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=28508167;
 //BA.debugLineNum = 28508167;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=28508168;
 //BA.debugLineNum = 28508168;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=28508170;
 //BA.debugLineNum = 28508170;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=28508171;
 //BA.debugLineNum = 28508171;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmod_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonmod_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonmod_click", null));}
int _i = 0;
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Sub ButtonMod_Click";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=28573699;
 //BA.debugLineNum = 28573699;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND mod LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC")));
RDebugUtils.currentLine=28573701;
 //BA.debugLineNum = 28573701;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28573702;
 //BA.debugLineNum = 28573702;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=28573703;
 //BA.debugLineNum = 28573703;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=28573704;
 //BA.debugLineNum = 28573704;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Mod: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._moddeger))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=28573706;
 //BA.debugLineNum = 28573706;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=28573707;
 //BA.debugLineNum = 28573707;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsetsayisi_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsetsayisi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsetsayisi_click", null));}
int _i = 0;
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Sub ButtonSetSayisi_Click";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND setSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC")));
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28770310;
 //BA.debugLineNum = 28770310;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=28770311;
 //BA.debugLineNum = 28770311;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=28770312;
 //BA.debugLineNum = 28770312;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Set sayısı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_set_sayisi))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=28770314;
 //BA.debugLineNum = 28770314;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=28770315;
 //BA.debugLineNum = 28770315;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsurattestekle_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsurattestekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsurattestekle_click", null));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Sub ButtonSuratTestEkle_Click";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="StartActivity(TestDenekAra)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._testdenekara.getObject()));
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="End Sub";
return "";
}
public static String  _buttontablodagoster_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontablodagoster_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontablodagoster_click", null));}
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Sub ButtonTablodaGoster_Click";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="StartActivity(SuratTestListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._surattestlistele.getObject()));
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="ButtonTc_Click";
_buttontc_click();
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
int _i = 0;
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_Tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY surat_id DESC")));
RDebugUtils.currentLine=28442629;
 //BA.debugLineNum = 28442629;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=28442631;
 //BA.debugLineNum = 28442631;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=28442632;
 //BA.debugLineNum = 28442632;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=28442634;
 //BA.debugLineNum = 28442634;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=28442635;
 //BA.debugLineNum = 28442635;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest,";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR mod LIKE '%"+mostCurrent._edittextara.getText()+"%' OR surat_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR gateSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR setSayisi LIKE '%"+mostCurrent._edittextara.getText()+"%') ORDER BY surat_id DESC")));
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=28377095;
 //BA.debugLineNum = 28377095;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=28377096;
 //BA.debugLineNum = 28377096;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Mod: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._moddeger))+" // Gate Sayısı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_gate_sayisi))+" // Set Sayısı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_set_sayisi))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=28377099;
 //BA.debugLineNum = 28377099;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=28377100;
 //BA.debugLineNum = 28377100;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=28377101;
 //BA.debugLineNum = 28377101;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=28377103;
 //BA.debugLineNum = 28377103;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="WebView1.Visible = True";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND surat_id = '"+BA.ObjectToString(_value)+"'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="surattestsil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SuratTest";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest WHERE surat_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=29097989;
 //BA.debugLineNum = 29097989;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=29097991;
 //BA.debugLineNum = 29097991;BA.debugLine="id = rs.GetInt(\"surat_id\")";
_id = mostCurrent._rs.GetInt("surat_id");
 }
};
RDebugUtils.currentLine=29097993;
 //BA.debugLineNum = 29097993;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=29097995;
 //BA.debugLineNum = 29097995;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=29097996;
 //BA.debugLineNum = 29097996;BA.debugLine="result = Msgbox2(\"Sürat test bilgisini silmek ist";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Sürat test bilgisini silmek istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=29097997;
 //BA.debugLineNum = 29097997;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=29097998;
 //BA.debugLineNum = 29097998;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM SuratTest WHE";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM SuratTest WHERE surat_id = '"+BA.NumberToString(_id)+"' ");
RDebugUtils.currentLine=29097999;
 //BA.debugLineNum = 29097999;BA.debugLine="ToastMessageShow(\"Sürat test bilgisini silindi..";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sürat test bilgisini silindi..."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=29098001;
 //BA.debugLineNum = 29098001;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=29098002;
 //BA.debugLineNum = 29098002;BA.debugLine="End Sub";
return "";
}
}