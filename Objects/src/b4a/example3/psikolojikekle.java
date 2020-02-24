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

public class psikolojikekle extends Activity implements B4AActivity{
	public static psikolojikekle mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.psikolojikekle");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (psikolojikekle).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.psikolojikekle");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.psikolojikekle", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (psikolojikekle) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (psikolojikekle) Resume **");
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
		return psikolojikekle.class;
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
        BA.LogInfo("** Activity (psikolojikekle) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            psikolojikekle mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (psikolojikekle) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _edittextpsikolojikaciklama = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonpsikolojikekle = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelpsikolojikaciklama = null;
public static String _secilentarih = "";
public static String _secilensaat = "";
public static int _psikolojikid = 0;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
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
public b4a.example3.antropometriksil _antropometriksil = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public b4a.example3.programsec _programsec = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="psikolojikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="Activity.LoadLayout(\"PsikolojikEklePage\")";
mostCurrent._activity.LoadLayout("PsikolojikEklePage",mostCurrent.activityBA);
RDebugUtils.currentLine=45088773;
 //BA.debugLineNum = 45088773;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=45088774;
 //BA.debugLineNum = 45088774;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=45088776;
 //BA.debugLineNum = 45088776;BA.debugLine="LabelPsikolojikAciklama.TextColor = Colors.White";
mostCurrent._labelpsikolojikaciklama.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=45088777;
 //BA.debugLineNum = 45088777;BA.debugLine="LabelPsikolojikAciklama.TextSize = 20";
mostCurrent._labelpsikolojikaciklama.setTextSize((float) (20));
RDebugUtils.currentLine=45088778;
 //BA.debugLineNum = 45088778;BA.debugLine="LabelPsikolojikAciklama.Typeface = Typeface.DEFAU";
mostCurrent._labelpsikolojikaciklama.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=45088780;
 //BA.debugLineNum = 45088780;BA.debugLine="EditTextPsikolojikAciklama.TextColor = Color.koyu";
mostCurrent._edittextpsikolojikaciklama.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=45088781;
 //BA.debugLineNum = 45088781;BA.debugLine="EditTextPsikolojikAciklama.Hint = \"Psikolojik değ";
mostCurrent._edittextpsikolojikaciklama.setHint("Psikolojik değerlendirmenizi bu alana yazabilirsiniz..");
RDebugUtils.currentLine=45088782;
 //BA.debugLineNum = 45088782;BA.debugLine="EditTextPsikolojikAciklama.HintColor = Color.acik";
mostCurrent._edittextpsikolojikaciklama.setHintColor(mostCurrent._color._acikmavi /*int*/ );
RDebugUtils.currentLine=45088783;
 //BA.debugLineNum = 45088783;BA.debugLine="EditTextPsikolojikAciklama.TextSize = 20";
mostCurrent._edittextpsikolojikaciklama.setTextSize((float) (20));
RDebugUtils.currentLine=45088784;
 //BA.debugLineNum = 45088784;BA.debugLine="EditTextPsikolojikAciklama.Typeface = Typeface.DE";
mostCurrent._edittextpsikolojikaciklama.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=45088788;
 //BA.debugLineNum = 45088788;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=45088790;
 //BA.debugLineNum = 45088790;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="psikolojikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+mostCurrent._testdenekara._secilendenek /*String*/ +"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=45285379;
 //BA.debugLineNum = 45285379;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="psikolojikekle";
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="psikolojikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpsikolojikekle_click() throws Exception{
RDebugUtils.currentModule="psikolojikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpsikolojikekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpsikolojikekle_click", null));}
int _result = 0;
long _now = 0L;
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Sub ButtonPsikolojikEkle_Click";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="result = Msgbox2(\"Psikolojik analiz verilerini ek";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Psikolojik analiz verilerini eklemek istiyor musunuz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="If result= DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=45416452;
 //BA.debugLineNum = 45416452;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=45416453;
 //BA.debugLineNum = 45416453;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="Log(DateTime.Date(now))";
anywheresoftware.b4a.keywords.Common.LogImpl("245416454",anywheresoftware.b4a.keywords.Common.DateTime.Date(_now),0);
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="secilenTarih = DateTime.Date(now)";
mostCurrent._secilentarih = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=45416456;
 //BA.debugLineNum = 45416456;BA.debugLine="Log(DateTime.Time(now))";
anywheresoftware.b4a.keywords.Common.LogImpl("245416456",anywheresoftware.b4a.keywords.Common.DateTime.Time(_now),0);
RDebugUtils.currentLine=45416457;
 //BA.debugLineNum = 45416457;BA.debugLine="secilenSaat = DateTime.Time(now)";
mostCurrent._secilensaat = anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
RDebugUtils.currentLine=45416458;
 //BA.debugLineNum = 45416458;BA.debugLine="ID";
_id();
RDebugUtils.currentLine=45416459;
 //BA.debugLineNum = 45416459;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Psikolojik V";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO Psikolojik VALUES(?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_psikolojikid),(Object)(mostCurrent._testdenekara._secilendenek /*String*/ ),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat),(Object)(mostCurrent._edittextpsikolojikaciklama.getText())}));
RDebugUtils.currentLine=45416460;
 //BA.debugLineNum = 45416460;BA.debugLine="Log(\"PSİKOLOJİK VERİLER EKLENDİ\")";
anywheresoftware.b4a.keywords.Common.LogImpl("245416460","PSİKOLOJİK VERİLER EKLENDİ",0);
RDebugUtils.currentLine=45416461;
 //BA.debugLineNum = 45416461;BA.debugLine="StartActivity(PsikolojikListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._psikolojiklistele.getObject()));
RDebugUtils.currentLine=45416462;
 //BA.debugLineNum = 45416462;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=45416463;
 //BA.debugLineNum = 45416463;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=45416464;
 //BA.debugLineNum = 45416464;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=45416465;
 //BA.debugLineNum = 45416465;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=45416467;
 //BA.debugLineNum = 45416467;BA.debugLine="End Sub";
return "";
}
public static String  _id() throws Exception{
RDebugUtils.currentModule="psikolojikekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "id", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "id", null));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Sub ID";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="sf.initialize";
_sf._initialize(processBA);
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik ORDER BY psikolojik_id DESC")));
RDebugUtils.currentLine=45350917;
 //BA.debugLineNum = 45350917;BA.debugLine="If rs.RowCount>0 Then";
if (mostCurrent._rs.getRowCount()>0) { 
RDebugUtils.currentLine=45350918;
 //BA.debugLineNum = 45350918;BA.debugLine="rs.Position=0";
mostCurrent._rs.setPosition((int) (0));
RDebugUtils.currentLine=45350919;
 //BA.debugLineNum = 45350919;BA.debugLine="PsikolojikID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.";
_psikolojikid = (int)(Double.parseDouble(_sf._vvvvv7("00"+_sf._vvvvvvv4(BA.NumberToString(_sf._vvvvvvv6(_sf._vvvvv7(mostCurrent._rs.GetString("psikolojik_id"),(long) (3)))+1)),(long) (3))));
 }else {
RDebugUtils.currentLine=45350921;
 //BA.debugLineNum = 45350921;BA.debugLine="PsikolojikID=\"001\"";
_psikolojikid = (int)(Double.parseDouble("001"));
 };
RDebugUtils.currentLine=45350923;
 //BA.debugLineNum = 45350923;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=45350924;
 //BA.debugLineNum = 45350924;BA.debugLine="End Sub";
return "";
}
}