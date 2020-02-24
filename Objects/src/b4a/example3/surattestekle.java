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

public class surattestekle extends Activity implements B4AActivity{
	public static surattestekle mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.surattestekle");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (surattestekle).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.surattestekle");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.surattestekle", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (surattestekle) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (surattestekle) Resume **");
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
		return surattestekle.class;
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
        BA.LogInfo("** Activity (surattestekle) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            surattestekle mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (surattestekle) Resume **");
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
public static class _periodwithms{
public boolean IsInitialized;
public b4a.example.dateutils._period p;
public int ms;
public void Initialize() {
IsInitialized = true;
p = new b4a.example.dateutils._period();
ms = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _secilentarih = "";
public static String _secilensaat = "";
public static anywheresoftware.b4a.objects.Timer _chronometer = null;
public static b4a.example3.surattestekle._periodwithms _pm = null;
public static anywheresoftware.b4a.objects.Timer _timer = null;
public static long _hedefzaman = 0L;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldenekisim = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltimer = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelchronometer = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsetsayisi = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelgatesayisi = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltestisim = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmodisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonreset = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbaslamasuresi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonayarlar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonok = null;
public static long _starttime = 0L;
public static int _i = 0;
public static String[] _dizi = null;
public static int _surattestid = 0;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltımedegerleri = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelresult = null;
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
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
long _now = 0L;
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="Activity.LoadLayout(\"SuratTestEklePage\")";
mostCurrent._activity.LoadLayout("SuratTestEklePage",mostCurrent.activityBA);
RDebugUtils.currentLine=26411011;
 //BA.debugLineNum = 26411011;BA.debugLine="ReadBlob";
_readblob();
RDebugUtils.currentLine=26411013;
 //BA.debugLineNum = 26411013;BA.debugLine="ButtonOK.Visible = False";
mostCurrent._buttonok.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26411014;
 //BA.debugLineNum = 26411014;BA.debugLine="ButtonOK.Enabled = False";
mostCurrent._buttonok.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26411016;
 //BA.debugLineNum = 26411016;BA.debugLine="ButtonBaslamaSuresi.Tag = \"SureBasla\"  ' --------";
mostCurrent._buttonbaslamasuresi.setTag((Object)("SureBasla"));
RDebugUtils.currentLine=26411019;
 //BA.debugLineNum = 26411019;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor = Colo";
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=26411020;
 //BA.debugLineNum = 26411020;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize = 20";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (20));
RDebugUtils.currentLine=26411021;
 //BA.debugLineNum = 26411021;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=26411023;
 //BA.debugLineNum = 26411023;BA.debugLine="LabelDenekIsim.Text = TestDenekAra.denekIsim";
mostCurrent._labeldenekisim.setText(BA.ObjectToCharSequence(mostCurrent._testdenekara._denekisim /*String*/ ));
RDebugUtils.currentLine=26411024;
 //BA.debugLineNum = 26411024;BA.debugLine="LabelDenekIsim.TextSize = 20";
mostCurrent._labeldenekisim.setTextSize((float) (20));
RDebugUtils.currentLine=26411025;
 //BA.debugLineNum = 26411025;BA.debugLine="LabelDenekIsim.TextColor = Colors.White";
mostCurrent._labeldenekisim.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411026;
 //BA.debugLineNum = 26411026;BA.debugLine="LabelDenekIsim.Typeface = Typeface.DEFAULT";
mostCurrent._labeldenekisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=26411028;
 //BA.debugLineNum = 26411028;BA.debugLine="LabelGateSayisi.Text = $\" Bağlı Kapı Sayısı: ${Su";
mostCurrent._labelgatesayisi.setText(BA.ObjectToCharSequence((" Bağlı Kapı Sayısı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._surattestayar._gate /*int*/ ))+"")));
RDebugUtils.currentLine=26411029;
 //BA.debugLineNum = 26411029;BA.debugLine="LabelGateSayisi.TextSize = 20";
mostCurrent._labelgatesayisi.setTextSize((float) (20));
RDebugUtils.currentLine=26411030;
 //BA.debugLineNum = 26411030;BA.debugLine="LabelGateSayisi.TextColor = Colors.White";
mostCurrent._labelgatesayisi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411031;
 //BA.debugLineNum = 26411031;BA.debugLine="LabelGateSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelgatesayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=26411033;
 //BA.debugLineNum = 26411033;BA.debugLine="LabelSetSayisi.Text = $\" Set Sayısı: ${SuratTestA";
mostCurrent._labelsetsayisi.setText(BA.ObjectToCharSequence((" Set Sayısı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._surattestayar._set /*int*/ ))+"")));
RDebugUtils.currentLine=26411034;
 //BA.debugLineNum = 26411034;BA.debugLine="LabelSetSayisi.TextSize = 20";
mostCurrent._labelsetsayisi.setTextSize((float) (20));
RDebugUtils.currentLine=26411035;
 //BA.debugLineNum = 26411035;BA.debugLine="LabelSetSayisi.TextColor = Colors.White";
mostCurrent._labelsetsayisi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411036;
 //BA.debugLineNum = 26411036;BA.debugLine="LabelSetSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsetsayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=26411038;
 //BA.debugLineNum = 26411038;BA.debugLine="LabelTestIsim.Text = MotorOzellikMenu.motorOzelli";
mostCurrent._labeltestisim.setText(BA.ObjectToCharSequence(mostCurrent._motorozellikmenu._motorozelliktestadi /*String*/ ));
RDebugUtils.currentLine=26411039;
 //BA.debugLineNum = 26411039;BA.debugLine="LabelTestIsim.TextSize = 20";
mostCurrent._labeltestisim.setTextSize((float) (20));
RDebugUtils.currentLine=26411040;
 //BA.debugLineNum = 26411040;BA.debugLine="LabelTestIsim.TextColor = Colors.White";
mostCurrent._labeltestisim.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411041;
 //BA.debugLineNum = 26411041;BA.debugLine="LabelTestIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeltestisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=26411043;
 //BA.debugLineNum = 26411043;BA.debugLine="LabelModIsim.Text = $\"Seçili Mod: ${SuratTestAyar";
mostCurrent._labelmodisim.setText(BA.ObjectToCharSequence(("Seçili Mod: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._surattestayar._secilenmode /*String*/ ))+"")));
RDebugUtils.currentLine=26411044;
 //BA.debugLineNum = 26411044;BA.debugLine="LabelModIsim.TextSize = 20";
mostCurrent._labelmodisim.setTextSize((float) (20));
RDebugUtils.currentLine=26411045;
 //BA.debugLineNum = 26411045;BA.debugLine="LabelModIsim.TextColor = Colors.White";
mostCurrent._labelmodisim.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411046;
 //BA.debugLineNum = 26411046;BA.debugLine="LabelModIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelmodisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=26411048;
 //BA.debugLineNum = 26411048;BA.debugLine="LabelResult.Text = $\"#Max. Result = ${SuratTestAy";
mostCurrent._labelresult.setText(BA.ObjectToCharSequence(("#Max. Result = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._surattestayar._result /*int*/ ))+"")));
RDebugUtils.currentLine=26411049;
 //BA.debugLineNum = 26411049;BA.debugLine="LabelResult.TextSize = 20";
mostCurrent._labelresult.setTextSize((float) (20));
RDebugUtils.currentLine=26411050;
 //BA.debugLineNum = 26411050;BA.debugLine="LabelResult.TextColor = Colors.White";
mostCurrent._labelresult.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411051;
 //BA.debugLineNum = 26411051;BA.debugLine="LabelResult.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelresult.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=26411053;
 //BA.debugLineNum = 26411053;BA.debugLine="LabelTımeDegerleri.Text = $\"TIME DEĞERLERİ\"$";
mostCurrent._labeltımedegerleri.setText(BA.ObjectToCharSequence(("TIME DEĞERLERİ")));
RDebugUtils.currentLine=26411054;
 //BA.debugLineNum = 26411054;BA.debugLine="LabelTımeDegerleri.TextSize = 20";
mostCurrent._labeltımedegerleri.setTextSize((float) (20));
RDebugUtils.currentLine=26411055;
 //BA.debugLineNum = 26411055;BA.debugLine="LabelTımeDegerleri.TextColor = Colors.White";
mostCurrent._labeltımedegerleri.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411056;
 //BA.debugLineNum = 26411056;BA.debugLine="LabelTımeDegerleri.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labeltımedegerleri.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=26411058;
 //BA.debugLineNum = 26411058;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=26411059;
 //BA.debugLineNum = 26411059;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=26411060;
 //BA.debugLineNum = 26411060;BA.debugLine="secilenTarih = DateTime.Date(now)";
_secilentarih = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=26411061;
 //BA.debugLineNum = 26411061;BA.debugLine="secilenSaat = DateTime.Time(now)";
_secilensaat = anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
RDebugUtils.currentLine=26411063;
 //BA.debugLineNum = 26411063;BA.debugLine="LabelDate.Text = $\"Tarih: ${secilenTarih} Zaman:";
mostCurrent._labeldate.setText(BA.ObjectToCharSequence(("Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_secilentarih))+"\n"+"Zaman: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_secilensaat))+"")));
RDebugUtils.currentLine=26411065;
 //BA.debugLineNum = 26411065;BA.debugLine="LabelDate.TextSize = 20";
mostCurrent._labeldate.setTextSize((float) (20));
RDebugUtils.currentLine=26411066;
 //BA.debugLineNum = 26411066;BA.debugLine="LabelDate.TextColor = Colors.White";
mostCurrent._labeldate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=26411067;
 //BA.debugLineNum = 26411067;BA.debugLine="LabelDate.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldate.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=26411070;
 //BA.debugLineNum = 26411070;BA.debugLine="Chronometer.Initialize(\"Chronometer\",10)";
_chronometer.Initialize(processBA,"Chronometer",(long) (10));
RDebugUtils.currentLine=26411071;
 //BA.debugLineNum = 26411071;BA.debugLine="StartTime = DateTime.Now";
_starttime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=26411072;
 //BA.debugLineNum = 26411072;BA.debugLine="timer.Initialize(\"timer\", 1000)";
_timer.Initialize(processBA,"timer",(long) (1000));
RDebugUtils.currentLine=26411074;
 //BA.debugLineNum = 26411074;BA.debugLine="End Sub";
return "";
}
public static String  _readblob() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "readblob", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "readblob", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Sub ReadBlob";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="Try";
try {RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=26935299;
 //BA.debugLineNum = 26935299;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="inputStream.InitializeFromBytesArray(TestDenekAr";
_inputstream.InitializeFromBytesArray(mostCurrent._testdenekara._denekimage /*byte[]*/ ,(int) (0),mostCurrent._testdenekara._denekimage /*byte[]*/ .length);
RDebugUtils.currentLine=26935301;
 //BA.debugLineNum = 26935301;BA.debugLine="bmp.Initialize2(inputStream)";
_bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=26935302;
 //BA.debugLineNum = 26935302;BA.debugLine="inputStream.Close";
_inputstream.Close();
RDebugUtils.currentLine=26935303;
 //BA.debugLineNum = 26935303;BA.debugLine="ImageView1.SetBackgroundImage(bmp)";
mostCurrent._imageview1.SetBackgroundImageNew((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=26935304;
 //BA.debugLineNum = 26935304;BA.debugLine="Log(\"try\")";
anywheresoftware.b4a.keywords.Common.LogImpl("226935304","try",0);
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=26935306;
 //BA.debugLineNum = 26935306;BA.debugLine="ImageView1.Bitmap = LoadBitmap(File.DirAssets, \"";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png").getObject()));
RDebugUtils.currentLine=26935307;
 //BA.debugLineNum = 26935307;BA.debugLine="Log(\"catch\")";
anywheresoftware.b4a.keywords.Common.LogImpl("226935307","catch",0);
 };
RDebugUtils.currentLine=26935309;
 //BA.debugLineNum = 26935309;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=27590660;
 //BA.debugLineNum = 27590660;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=27590661;
 //BA.debugLineNum = 27590661;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=27590662;
 //BA.debugLineNum = 27590662;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=27590663;
 //BA.debugLineNum = 27590663;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="surattestekle";
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="End Sub";
return "";
}
public static String  _buttonayarlar_click() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonayarlar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonayarlar_click", null));}
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Sub ButtonAyarlar_Click";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Pause";
_pause();
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="StartActivity(SuratTestAyar)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._surattestayar.getObject()));
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="End Sub";
return "";
}
public static String  _pause() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pause", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pause", null));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Sub Pause";
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="Chronometer.Enabled = False";
_chronometer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="ButtonReset.Visible = False";
mostCurrent._buttonreset.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="timer.Enabled = True";
_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27066373;
 //BA.debugLineNum = 27066373;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbaslamasuresi_click() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbaslamasuresi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbaslamasuresi_click", null));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Sub ButtonBaslamaSuresi_Click";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="If ButtonBaslamaSuresi.Tag = \"SureBasla\" Then";
if ((mostCurrent._buttonbaslamasuresi.getTag()).equals((Object)("SureBasla"))) { 
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="ButtonLap.Visible = False";
mostCurrent._buttonlap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="ButtonReset.Visible = False";
mostCurrent._buttonreset.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="If i == SuratTestAyar.result Then";
if (_i==mostCurrent._surattestayar._result /*int*/ ) { 
RDebugUtils.currentLine=27328517;
 //BA.debugLineNum = 27328517;BA.debugLine="Pause";
_pause();
RDebugUtils.currentLine=27328518;
 //BA.debugLineNum = 27328518;BA.debugLine="LabelChronometer.Text = \"Test Bitti\"";
mostCurrent._labelchronometer.setText(BA.ObjectToCharSequence("Test Bitti"));
 }else {
RDebugUtils.currentLine=27328520;
 //BA.debugLineNum = 27328520;BA.debugLine="LabelChronometer.Visible = False";
mostCurrent._labelchronometer.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27328521;
 //BA.debugLineNum = 27328521;BA.debugLine="LabelTimer.Visible = True";
mostCurrent._labeltimer.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27328522;
 //BA.debugLineNum = 27328522;BA.debugLine="StartTimer(SuratTestAyar.degerDakika,SuratTestA";
_starttimer(mostCurrent._surattestayar._degerdakika /*int*/ ,(int) (mostCurrent._surattestayar._degersaniye /*int*/ +2));
 };
RDebugUtils.currentLine=27328525;
 //BA.debugLineNum = 27328525;BA.debugLine="ButtonBaslamaSuresi.Tag =\"SureBitir\"";
mostCurrent._buttonbaslamasuresi.setTag((Object)("SureBitir"));
RDebugUtils.currentLine=27328526;
 //BA.debugLineNum = 27328526;BA.debugLine="ButtonBaslamaSuresi.Text = \"Çıkış yaptı\"";
mostCurrent._buttonbaslamasuresi.setText(BA.ObjectToCharSequence("Çıkış yaptı"));
 }else 
{RDebugUtils.currentLine=27328528;
 //BA.debugLineNum = 27328528;BA.debugLine="Else if ButtonBaslamaSuresi.Tag = \"SureBitir\" The";
if ((mostCurrent._buttonbaslamasuresi.getTag()).equals((Object)("SureBitir"))) { 
RDebugUtils.currentLine=27328529;
 //BA.debugLineNum = 27328529;BA.debugLine="ButtonReset.Visible = True";
mostCurrent._buttonreset.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27328530;
 //BA.debugLineNum = 27328530;BA.debugLine="ButtonLap.Visible = True";
mostCurrent._buttonlap.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27328532;
 //BA.debugLineNum = 27328532;BA.debugLine="DinlenmeCikisSureYakalama";
_dinlenmecikissureyakalama();
RDebugUtils.currentLine=27328533;
 //BA.debugLineNum = 27328533;BA.debugLine="LabelTimer.Visible = False";
mostCurrent._labeltimer.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27328534;
 //BA.debugLineNum = 27328534;BA.debugLine="LabelChronometer.Visible = True";
mostCurrent._labelchronometer.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27328535;
 //BA.debugLineNum = 27328535;BA.debugLine="Start";
_start();
RDebugUtils.currentLine=27328536;
 //BA.debugLineNum = 27328536;BA.debugLine="ButtonBaslamaSuresi.Tag = \"SureBasla\"";
mostCurrent._buttonbaslamasuresi.setTag((Object)("SureBasla"));
RDebugUtils.currentLine=27328537;
 //BA.debugLineNum = 27328537;BA.debugLine="ButtonBaslamaSuresi.Text = \"Dinleniş süresi başl";
mostCurrent._buttonbaslamasuresi.setText(BA.ObjectToCharSequence("Dinleniş süresi başlat"));
 }}
;
RDebugUtils.currentLine=27328540;
 //BA.debugLineNum = 27328540;BA.debugLine="End Sub";
return "";
}
public static String  _starttimer(int _minute,int _second) throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starttimer", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starttimer", new Object[] {_minute,_second}));}
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Sub StartTimer(minute As Int, second As Int)";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="hedefZaman = DateTime.Now + minute * DateTime.Tic";
_hedefzaman = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+_minute*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute+_second*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="timer.Enabled = True";
_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="End Sub";
return "";
}
public static String  _dinlenmecikissureyakalama() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dinlenmecikissureyakalama", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dinlenmecikissureyakalama", null));}
String _dinlenme = "";
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Sub DinlenmeCikisSureYakalama";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Dim Dinlenme As String = LabelTimer.Text";
_dinlenme = mostCurrent._labeltimer.getText();
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="ListView1.AddSingleLine($\"Dinlenme Süresi:";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(("Dinlenme Süresi:             =>>            "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dinlenme))+"")));
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="End Sub";
return "";
}
public static String  _start() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "start", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "start", null));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Sub Start";
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="ButtonReset_Click";
_buttonreset_click();
RDebugUtils.currentLine=27000838;
 //BA.debugLineNum = 27000838;BA.debugLine="LabelChronometer.Visible = True";
mostCurrent._labelchronometer.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="Chronometer.Enabled = True";
_chronometer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27000840;
 //BA.debugLineNum = 27000840;BA.debugLine="LabelTimer.Visible = False";
mostCurrent._labeltimer.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27000842;
 //BA.debugLineNum = 27000842;BA.debugLine="ButtonReset.Enabled = True";
mostCurrent._buttonreset.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27000843;
 //BA.debugLineNum = 27000843;BA.debugLine="ButtonLap.Enabled = True";
mostCurrent._buttonlap.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27000844;
 //BA.debugLineNum = 27000844;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlap_click() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonlap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonlap_click", null));}
String _lapdeger = "";
String _splitdeger = "";
String _restdeger = "";
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Sub ButtonLap_Click";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="If i < SuratTestAyar.result  Then";
if (_i<mostCurrent._surattestayar._result /*int*/ ) { 
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="If SuratTestAyar.secilenMode = \"Lap Mode\" Then";
if ((mostCurrent._surattestayar._secilenmode /*String*/ ).equals("Lap Mode")) { 
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="Dim LapDeger As String = LabelChronometer.Text";
_lapdeger = mostCurrent._labelchronometer.getText();
RDebugUtils.currentLine=27197444;
 //BA.debugLineNum = 27197444;BA.debugLine="ListView1.AddSingleLine($\"Lap Deger : ${i}";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(("Lap Deger : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"                 =>>            "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lapdeger))+"")));
RDebugUtils.currentLine=27197445;
 //BA.debugLineNum = 27197445;BA.debugLine="dizi(i) = LapDeger";
mostCurrent._dizi[_i] = _lapdeger;
 }else 
{RDebugUtils.currentLine=27197446;
 //BA.debugLineNum = 27197446;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Split Mode\"";
if ((mostCurrent._surattestayar._secilenmode /*String*/ ).equals("Split Mode")) { 
RDebugUtils.currentLine=27197447;
 //BA.debugLineNum = 27197447;BA.debugLine="Dim splitDeger As String = LabelChronometer.Tex";
_splitdeger = mostCurrent._labelchronometer.getText();
RDebugUtils.currentLine=27197448;
 //BA.debugLineNum = 27197448;BA.debugLine="ListView1.AddSingleLine($\"Split Deger : ${i}";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(("Split Deger : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"               =>>            "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_splitdeger))+"")));
RDebugUtils.currentLine=27197449;
 //BA.debugLineNum = 27197449;BA.debugLine="dizi(i) = splitDeger";
mostCurrent._dizi[_i] = _splitdeger;
RDebugUtils.currentLine=27197450;
 //BA.debugLineNum = 27197450;BA.debugLine="ButtonReset_Click";
_buttonreset_click();
 }else 
{RDebugUtils.currentLine=27197451;
 //BA.debugLineNum = 27197451;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Rest Mode\"";
if ((mostCurrent._surattestayar._secilenmode /*String*/ ).equals("Rest Mode")) { 
RDebugUtils.currentLine=27197452;
 //BA.debugLineNum = 27197452;BA.debugLine="Dim restDeger As String = LabelChronometer.Text";
_restdeger = mostCurrent._labelchronometer.getText();
RDebugUtils.currentLine=27197453;
 //BA.debugLineNum = 27197453;BA.debugLine="ListView1.AddSingleLine($\"Rest Deger : ${i}";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(("Rest Deger : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"                =>>            "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_restdeger))+"")));
RDebugUtils.currentLine=27197454;
 //BA.debugLineNum = 27197454;BA.debugLine="dizi(i) = restDeger";
mostCurrent._dizi[_i] = _restdeger;
RDebugUtils.currentLine=27197455;
 //BA.debugLineNum = 27197455;BA.debugLine="If i Mod SuratTestAyar.restDegerBul == 0 Then";
if (_i%mostCurrent._surattestayar._restdegerbul /*int*/ ==0) { 
RDebugUtils.currentLine=27197456;
 //BA.debugLineNum = 27197456;BA.debugLine="Pause";
_pause();
RDebugUtils.currentLine=27197457;
 //BA.debugLineNum = 27197457;BA.debugLine="ButtonBaslamaSuresi_Click";
_buttonbaslamasuresi_click();
 };
 }}}
;
 }else 
{RDebugUtils.currentLine=27197460;
 //BA.debugLineNum = 27197460;BA.debugLine="Else if i == SuratTestAyar.result Then";
if (_i==mostCurrent._surattestayar._result /*int*/ ) { 
RDebugUtils.currentLine=27197461;
 //BA.debugLineNum = 27197461;BA.debugLine="If SuratTestAyar.secilenMode = \"Lap Mode\" Then";
if ((mostCurrent._surattestayar._secilenmode /*String*/ ).equals("Lap Mode")) { 
RDebugUtils.currentLine=27197462;
 //BA.debugLineNum = 27197462;BA.debugLine="Dim LapDeger As String = LabelChronometer.Text";
_lapdeger = mostCurrent._labelchronometer.getText();
RDebugUtils.currentLine=27197463;
 //BA.debugLineNum = 27197463;BA.debugLine="ListView1.AddSingleLine($\"Lap Deger : ${i}";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(("Lap Deger : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"                 =>>            "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lapdeger))+"")));
RDebugUtils.currentLine=27197464;
 //BA.debugLineNum = 27197464;BA.debugLine="dizi(i) = LapDeger";
mostCurrent._dizi[_i] = _lapdeger;
 }else 
{RDebugUtils.currentLine=27197465;
 //BA.debugLineNum = 27197465;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Split Mode\"";
if ((mostCurrent._surattestayar._secilenmode /*String*/ ).equals("Split Mode")) { 
RDebugUtils.currentLine=27197466;
 //BA.debugLineNum = 27197466;BA.debugLine="Dim splitDeger As String = LabelChronometer.Tex";
_splitdeger = mostCurrent._labelchronometer.getText();
RDebugUtils.currentLine=27197467;
 //BA.debugLineNum = 27197467;BA.debugLine="ListView1.AddSingleLine($\"Split Deger : ${i}";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(("Split Deger : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"               =>>            "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_splitdeger))+"")));
RDebugUtils.currentLine=27197468;
 //BA.debugLineNum = 27197468;BA.debugLine="dizi(i) = splitDeger";
mostCurrent._dizi[_i] = _splitdeger;
 }else 
{RDebugUtils.currentLine=27197469;
 //BA.debugLineNum = 27197469;BA.debugLine="Else If SuratTestAyar.secilenMode = \"Rest Mode\"";
if ((mostCurrent._surattestayar._secilenmode /*String*/ ).equals("Rest Mode")) { 
RDebugUtils.currentLine=27197470;
 //BA.debugLineNum = 27197470;BA.debugLine="Dim restDeger As String = LabelChronometer.Text";
_restdeger = mostCurrent._labelchronometer.getText();
RDebugUtils.currentLine=27197471;
 //BA.debugLineNum = 27197471;BA.debugLine="ListView1.AddSingleLine($\"Rest Deger : ${i}";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(("Rest Deger : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"                =>>            "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_restdeger))+"")));
RDebugUtils.currentLine=27197472;
 //BA.debugLineNum = 27197472;BA.debugLine="dizi(i) = restDeger";
mostCurrent._dizi[_i] = _restdeger;
 }}}
;
RDebugUtils.currentLine=27197474;
 //BA.debugLineNum = 27197474;BA.debugLine="Pause";
_pause();
RDebugUtils.currentLine=27197475;
 //BA.debugLineNum = 27197475;BA.debugLine="LabelChronometer.Text = \"Test Bitti\"";
mostCurrent._labelchronometer.setText(BA.ObjectToCharSequence("Test Bitti"));
RDebugUtils.currentLine=27197476;
 //BA.debugLineNum = 27197476;BA.debugLine="ButtonBaslamaSuresi.Enabled = False";
mostCurrent._buttonbaslamasuresi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27197477;
 //BA.debugLineNum = 27197477;BA.debugLine="ButtonBaslamaSuresi.Visible = False";
mostCurrent._buttonbaslamasuresi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27197478;
 //BA.debugLineNum = 27197478;BA.debugLine="ButtonLap.Enabled = False";
mostCurrent._buttonlap.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27197479;
 //BA.debugLineNum = 27197479;BA.debugLine="ButtonLap.Visible = False";
mostCurrent._buttonlap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27197480;
 //BA.debugLineNum = 27197480;BA.debugLine="ButtonReset.Enabled = False";
mostCurrent._buttonreset.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27197481;
 //BA.debugLineNum = 27197481;BA.debugLine="ButtonReset.Visible = False";
mostCurrent._buttonreset.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27197482;
 //BA.debugLineNum = 27197482;BA.debugLine="ButtonOK.Visible = True";
mostCurrent._buttonok.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27197483;
 //BA.debugLineNum = 27197483;BA.debugLine="ButtonOK.Enabled = True";
mostCurrent._buttonok.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=27197485;
 //BA.debugLineNum = 27197485;BA.debugLine="Pause";
_pause();
RDebugUtils.currentLine=27197486;
 //BA.debugLineNum = 27197486;BA.debugLine="LabelChronometer.Text = \"Test Bitti\"";
mostCurrent._labelchronometer.setText(BA.ObjectToCharSequence("Test Bitti"));
 }}
;
RDebugUtils.currentLine=27197488;
 //BA.debugLineNum = 27197488;BA.debugLine="i=i+1";
_i = (int) (_i+1);
RDebugUtils.currentLine=27197489;
 //BA.debugLineNum = 27197489;BA.debugLine="End Sub";
return "";
}
public static String  _buttonreset_click() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonreset_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonreset_click", null));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Sub ButtonReset_Click";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="StartTime = DateTime.Now";
_starttime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="End Sub";
return "";
}
public static String  _buttonok_click() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonok_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonok_click", null));}
int _result = 0;
long _now = 0L;
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Sub ButtonOK_Click";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="result = Msgbox2(\"Sürat Test verilerini eklemek i";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Sürat Test verilerini eklemek istiyor musunuz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="If result= DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=27525124;
 //BA.debugLineNum = 27525124;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=27525125;
 //BA.debugLineNum = 27525125;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=27525127;
 //BA.debugLineNum = 27525127;BA.debugLine="secilenTarih = DateTime.Date(now)";
_secilentarih = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=27525128;
 //BA.debugLineNum = 27525128;BA.debugLine="secilenSaat = DateTime.Time(now)";
_secilensaat = anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
RDebugUtils.currentLine=27525129;
 //BA.debugLineNum = 27525129;BA.debugLine="ID";
_id();
RDebugUtils.currentLine=27525130;
 //BA.debugLineNum = 27525130;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO SuratTest VA";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO SuratTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_surattestid),(Object)(mostCurrent._testdenekara._secilendenek /*String*/ ),(Object)(mostCurrent._surattestayar._secilenmode /*String*/ ),(Object)(_secilentarih),(Object)(_secilensaat),(Object)(mostCurrent._surattestayar._degerdakika /*int*/ ),(Object)(mostCurrent._surattestayar._degersaniye /*int*/ ),(Object)(mostCurrent._surattestayar._result /*int*/ ),(Object)(mostCurrent._surattestayar._gate /*int*/ ),(Object)(mostCurrent._surattestayar._set /*int*/ ),(Object)(mostCurrent._dizi[(int) (1)]),(Object)(mostCurrent._dizi[(int) (2)]),(Object)(mostCurrent._dizi[(int) (3)]),(Object)(mostCurrent._dizi[(int) (4)]),(Object)(mostCurrent._dizi[(int) (5)]),(Object)(mostCurrent._dizi[(int) (6)]),(Object)(mostCurrent._dizi[(int) (7)]),(Object)(mostCurrent._dizi[(int) (8)]),(Object)(mostCurrent._dizi[(int) (9)]),(Object)(mostCurrent._dizi[(int) (10)]),(Object)(mostCurrent._dizi[(int) (11)]),(Object)(mostCurrent._dizi[(int) (12)]),(Object)(mostCurrent._dizi[(int) (13)]),(Object)(mostCurrent._dizi[(int) (14)]),(Object)(mostCurrent._dizi[(int) (15)]),(Object)(mostCurrent._dizi[(int) (16)]),(Object)(mostCurrent._dizi[(int) (17)]),(Object)(mostCurrent._dizi[(int) (18)]),(Object)(mostCurrent._dizi[(int) (19)]),(Object)(mostCurrent._dizi[(int) (20)]),(Object)(mostCurrent._dizi[(int) (21)]),(Object)(mostCurrent._dizi[(int) (22)]),(Object)(mostCurrent._dizi[(int) (23)]),(Object)(mostCurrent._dizi[(int) (24)]),(Object)(mostCurrent._dizi[(int) (25)]),(Object)(mostCurrent._dizi[(int) (26)]),(Object)(mostCurrent._dizi[(int) (27)]),(Object)(mostCurrent._dizi[(int) (28)]),(Object)(mostCurrent._dizi[(int) (29)]),(Object)(mostCurrent._dizi[(int) (30)]),(Object)(mostCurrent._dizi[(int) (31)]),(Object)(mostCurrent._dizi[(int) (32)]),(Object)(mostCurrent._dizi[(int) (33)]),(Object)(mostCurrent._dizi[(int) (34)]),(Object)(mostCurrent._dizi[(int) (35)]),(Object)(mostCurrent._dizi[(int) (36)]),(Object)(mostCurrent._dizi[(int) (37)]),(Object)(mostCurrent._dizi[(int) (38)]),(Object)(mostCurrent._dizi[(int) (39)]),(Object)(mostCurrent._dizi[(int) (40)]),(Object)(mostCurrent._dizi[(int) (41)]),(Object)(mostCurrent._dizi[(int) (42)]),(Object)(mostCurrent._dizi[(int) (43)]),(Object)(mostCurrent._dizi[(int) (44)]),(Object)(mostCurrent._dizi[(int) (45)]),(Object)(mostCurrent._dizi[(int) (46)]),(Object)(mostCurrent._dizi[(int) (47)]),(Object)(mostCurrent._dizi[(int) (48)]),(Object)(mostCurrent._dizi[(int) (49)]),(Object)(mostCurrent._dizi[(int) (50)]),(Object)(mostCurrent._dizi[(int) (51)]),(Object)(mostCurrent._dizi[(int) (52)]),(Object)(mostCurrent._dizi[(int) (53)]),(Object)(mostCurrent._dizi[(int) (54)]),(Object)(mostCurrent._dizi[(int) (55)]),(Object)(mostCurrent._dizi[(int) (56)]),(Object)(mostCurrent._dizi[(int) (57)]),(Object)(mostCurrent._dizi[(int) (58)]),(Object)(mostCurrent._dizi[(int) (59)]),(Object)(mostCurrent._dizi[(int) (60)]),(Object)(mostCurrent._dizi[(int) (61)]),(Object)(mostCurrent._dizi[(int) (62)]),(Object)(mostCurrent._dizi[(int) (63)]),(Object)(mostCurrent._dizi[(int) (64)]),(Object)(mostCurrent._dizi[(int) (65)]),(Object)(mostCurrent._dizi[(int) (66)]),(Object)(mostCurrent._dizi[(int) (67)]),(Object)(mostCurrent._dizi[(int) (68)]),(Object)(mostCurrent._dizi[(int) (69)]),(Object)(mostCurrent._dizi[(int) (70)]),(Object)(mostCurrent._dizi[(int) (71)]),(Object)(mostCurrent._dizi[(int) (72)]),(Object)(mostCurrent._dizi[(int) (73)]),(Object)(mostCurrent._dizi[(int) (74)]),(Object)(mostCurrent._dizi[(int) (75)]),(Object)(mostCurrent._dizi[(int) (76)]),(Object)(mostCurrent._dizi[(int) (77)]),(Object)(mostCurrent._dizi[(int) (78)]),(Object)(mostCurrent._dizi[(int) (79)]),(Object)(mostCurrent._dizi[(int) (80)]),(Object)(mostCurrent._dizi[(int) (81)]),(Object)(mostCurrent._dizi[(int) (82)]),(Object)(mostCurrent._dizi[(int) (83)]),(Object)(mostCurrent._dizi[(int) (84)]),(Object)(mostCurrent._dizi[(int) (85)]),(Object)(mostCurrent._dizi[(int) (86)]),(Object)(mostCurrent._dizi[(int) (87)]),(Object)(mostCurrent._dizi[(int) (88)]),(Object)(mostCurrent._dizi[(int) (89)]),(Object)(mostCurrent._dizi[(int) (90)]),(Object)(mostCurrent._dizi[(int) (91)]),(Object)(mostCurrent._dizi[(int) (92)]),(Object)(mostCurrent._dizi[(int) (93)]),(Object)(mostCurrent._dizi[(int) (94)]),(Object)(mostCurrent._dizi[(int) (95)]),(Object)(mostCurrent._dizi[(int) (96)]),(Object)(mostCurrent._dizi[(int) (97)]),(Object)(mostCurrent._dizi[(int) (98)]),(Object)(mostCurrent._dizi[(int) (99)]),(Object)(mostCurrent._dizi[(int) (100)])}));
RDebugUtils.currentLine=27525131;
 //BA.debugLineNum = 27525131;BA.debugLine="Log(\" VERİLER EKLENDİ\")";
anywheresoftware.b4a.keywords.Common.LogImpl("227525131"," VERİLER EKLENDİ",0);
RDebugUtils.currentLine=27525132;
 //BA.debugLineNum = 27525132;BA.debugLine="StartActivity(SuratTestListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._surattestlistele.getObject()));
RDebugUtils.currentLine=27525133;
 //BA.debugLineNum = 27525133;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=27525134;
 //BA.debugLineNum = 27525134;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=27525135;
 //BA.debugLineNum = 27525135;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27525136;
 //BA.debugLineNum = 27525136;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=27525138;
 //BA.debugLineNum = 27525138;BA.debugLine="End Sub";
return "";
}
public static String  _id() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "id", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "id", null));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Sub ID";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="sf.initialize";
_sf._initialize(processBA);
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM SuratTest O";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SuratTest ORDER BY surat_id DESC")));
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="If rs.RowCount>0 Then";
if (mostCurrent._rs.getRowCount()>0) { 
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="rs.Position=0";
mostCurrent._rs.setPosition((int) (0));
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="SuratTestID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.R";
_surattestid = (int)(Double.parseDouble(_sf._vvvvv7("00"+_sf._vvvvvvv4(BA.NumberToString(_sf._vvvvvvv6(_sf._vvvvv7(mostCurrent._rs.GetString("surat_id"),(long) (3)))+1)),(long) (3))));
 }else {
RDebugUtils.currentLine=27459593;
 //BA.debugLineNum = 27459593;BA.debugLine="SuratTestID=\"001\"";
_surattestid = (int)(Double.parseDouble("001"));
 };
RDebugUtils.currentLine=27459595;
 //BA.debugLineNum = 27459595;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=27459597;
 //BA.debugLineNum = 27459597;BA.debugLine="End Sub";
return "";
}
public static String  _chronometer_tick() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chronometer_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chronometer_tick", null));}
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Sub Chronometer_Tick";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="pm = PeriodBetweenWithMilliseconds(StartTime, Dat";
_pm = _periodbetweenwithmilliseconds(_starttime,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="LabelChronometer.Text = FN(pm.p.Hours) & \":\" & FN";
mostCurrent._labelchronometer.setText(BA.ObjectToCharSequence(_fn(_pm.p /*b4a.example.dateutils._period*/ .Hours)+":"+_fn(_pm.p /*b4a.example.dateutils._period*/ .Minutes)+":"+_fn(_pm.p /*b4a.example.dateutils._period*/ .Seconds)+"."+anywheresoftware.b4a.keywords.Common.NumberFormat(_pm.ms /*int*/ ,(int) (3),(int) (0))));
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="End Sub";
return "";
}
public static b4a.example3.surattestekle._periodwithms  _periodbetweenwithmilliseconds(long _time1,long _time2) throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "periodbetweenwithmilliseconds", false))
	 {return ((b4a.example3.surattestekle._periodwithms) Debug.delegate(mostCurrent.activityBA, "periodbetweenwithmilliseconds", new Object[] {_time1,_time2}));}
b4a.example.dateutils._period _p = null;
int _ms = 0;
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Sub PeriodBetweenWithMilliseconds(time1 As Long, t";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(time1,";
_p = mostCurrent._dateutils._periodbetween(mostCurrent.activityBA,_time1,_time2);
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="Dim ms As Int = (time2 - time1) Mod DateTime.Tick";
_ms = (int) ((_time2-_time1)%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="If ms < 0 Then";
if (_ms<0) { 
RDebugUtils.currentLine=26869764;
 //BA.debugLineNum = 26869764;BA.debugLine="ms = ms + 1000";
_ms = (int) (_ms+1000);
 };
RDebugUtils.currentLine=26869766;
 //BA.debugLineNum = 26869766;BA.debugLine="Dim pm As PeriodWithMs";
_pm = new b4a.example3.surattestekle._periodwithms();
RDebugUtils.currentLine=26869767;
 //BA.debugLineNum = 26869767;BA.debugLine="pm.p = p";
_pm.p /*b4a.example.dateutils._period*/  = _p;
RDebugUtils.currentLine=26869768;
 //BA.debugLineNum = 26869768;BA.debugLine="pm.ms = ms";
_pm.ms /*int*/  = _ms;
RDebugUtils.currentLine=26869769;
 //BA.debugLineNum = 26869769;BA.debugLine="Return pm";
if (true) return _pm;
RDebugUtils.currentLine=26869770;
 //BA.debugLineNum = 26869770;BA.debugLine="End Sub";
return null;
}
public static String  _fn(int _n) throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fn", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "fn", new Object[] {_n}));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Sub FN(n As Int) As String";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Return NumberFormat(n, 2, 0)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_n,(int) (2),(int) (0));
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
return "";
}
public static String  _timer_tick() throws Exception{
RDebugUtils.currentModule="surattestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer_tick", null));}
long _t = 0L;
int _minutes = 0;
int _seconds = 0;
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Sub timer_Tick";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Dim t As Long = Max(0, hedefZaman - DateTime.Now)";
_t = (long) (anywheresoftware.b4a.keywords.Common.Max(0,_hedefzaman-anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="Dim minutes, seconds As Int";
_minutes = 0;
_seconds = 0;
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="minutes = (t Mod DateTime.TicksPerHour) / DateTim";
_minutes = (int) ((_t%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute);
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="seconds = (t Mod DateTime.TicksPerMinute) / DateT";
_seconds = (int) ((_t%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
RDebugUtils.currentLine=26673157;
 //BA.debugLineNum = 26673157;BA.debugLine="LabelTimer.Text = $\" $1.0{minutes} : $1.0{seconds";
mostCurrent._labeltimer.setText(BA.ObjectToCharSequence((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_minutes))+" : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_seconds))+" ")));
RDebugUtils.currentLine=26673159;
 //BA.debugLineNum = 26673159;BA.debugLine="If t=0 Then";
if (_t==0) { 
RDebugUtils.currentLine=26673161;
 //BA.debugLineNum = 26673161;BA.debugLine="ToastMessageShow(\"Dinleniş sona erdi\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Dinleniş sona erdi"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26673162;
 //BA.debugLineNum = 26673162;BA.debugLine="timer.Enabled = False";
_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26673163;
 //BA.debugLineNum = 26673163;BA.debugLine="LabelChronometer.Visible = True";
mostCurrent._labelchronometer.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26673164;
 //BA.debugLineNum = 26673164;BA.debugLine="LabelTimer.Visible = False";
mostCurrent._labeltimer.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=26673166;
 //BA.debugLineNum = 26673166;BA.debugLine="End Sub";
return "";
}
}