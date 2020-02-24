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

public class dayanikliliktestekle extends Activity implements B4AActivity{
	public static dayanikliliktestekle mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.dayanikliliktestekle");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (dayanikliliktestekle).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.dayanikliliktestekle");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.dayanikliliktestekle", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (dayanikliliktestekle) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (dayanikliliktestekle) Resume **");
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
		return dayanikliliktestekle.class;
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
        BA.LogInfo("** Activity (dayanikliliktestekle) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            dayanikliliktestekle mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (dayanikliliktestekle) Resume **");
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
public anywheresoftware.b4a.objects.WebViewWrapper _webviewdenek = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewprogram = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmekiksayisi = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextmekiksayisi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonekle = null;
public static int _dayananikliliktestid = 0;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static String _secilentarih = "";
public static String _secilensaat = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
public b4a.example3.antranorgorussil _antranorgorussil = null;
public b4a.example3.antranorgoruslistele _antranorgoruslistele = null;
public b4a.example3.dayanikliliktestlistele _dayanikliliktestlistele = null;
public b4a.example3.dayanikliliktestsil _dayanikliliktestsil = null;
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
public b4a.example3.psikolojikekle _psikolojikekle = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public b4a.example3.programsec _programsec = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="dayanikliliktestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Activity.LoadLayout(\"DayaniklilikTestEklePage\")";
mostCurrent._activity.LoadLayout("DayaniklilikTestEklePage",mostCurrent.activityBA);
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="WebViewDenek.JavaScriptEnabled = True";
mostCurrent._webviewdenek.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="WebViewDenek.ZoomEnabled = True";
mostCurrent._webviewdenek.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="WebViewProgram.JavaScriptEnabled = True";
mostCurrent._webviewprogram.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="WebViewProgram.ZoomEnabled = True";
mostCurrent._webviewprogram.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="LabelMekikSayisi.Text = \"MEKİK SAYISI:\"";
mostCurrent._labelmekiksayisi.setText(BA.ObjectToCharSequence("MEKİK SAYISI:"));
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="LabelMekikSayisi.TextSize = 20";
mostCurrent._labelmekiksayisi.setTextSize((float) (20));
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="LabelMekikSayisi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelmekiksayisi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="LabelMekikSayisi.TextColor = Colors.White";
mostCurrent._labelmekiksayisi.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="HtmlGosterDenek";
_htmlgosterdenek();
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="HtmlGosterProgram";
_htmlgosterprogram();
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdenek() throws Exception{
RDebugUtils.currentModule="dayanikliliktestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdenek", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdenek", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub HtmlGosterDenek";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Select GelismisTestDenekAra.checkedIdList.Size";
switch (BA.switchObjectToInt(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10))) {
case 0: {
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 1: {
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 2: {
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 3: {
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 4: {
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)))+"'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 5: {
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 6: {
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 7: {
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 8: {
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)))+"'  ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
case 9: {
RDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewdenek.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)))+"' OR denek_id = '"+BA.ObjectToString(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (9)))+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
 break; }
default: {
RDebugUtils.currentLine=4390935;
 //BA.debugLineNum = 4390935;BA.debugLine="Log(\"Sadece 10 tane kişi gösterilebilir\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24390935","Sadece 10 tane kişi gösterilebilir",0);
 break; }
}
;
RDebugUtils.currentLine=4390937;
 //BA.debugLineNum = 4390937;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterprogram() throws Exception{
RDebugUtils.currentModule="dayanikliliktestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterprogram", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterprogram", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub HtmlGosterProgram";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="WebViewProgram.LoadHtml(DBUtils.ExecuteHtml(Main.";
mostCurrent._webviewprogram.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT program_adi As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ], koniMesafesi1 As [KONİ MESAFESİ1] , hiz1 As [HIZ1], dakika1 As [DAKİKA1] ,saniye1  As [SANİYE1], koniMesafesi2 As [KONİ MESAFESİ2] , hiz2 As [HIZ2],dakika2 As [DAKİKA2],saniye2  As [SANİYE2],koniMesafesi3 As [KONİ MESAFESİ3],hiz3 As [HIZ3],dakika3 As [DAKİKA3] ,saniye3  As [SANİYE3],koniMesafesi4 As [KONİ MESAFESİ4] ,hiz4 As [HIZ4],dakika4 As [DAKİKA4],saniye4  As [SANİYE4],koniMesafesi5 As [KONİ MESAFESİ5],hiz5 As [HIZ5] ,dakika5 As [DAKİKA5],saniye5  As [SANİYE5],koniMesafesi6 As [KONİ MESAFESİ6] ,hiz6 As [HIZ6] ,dakika6 As [DAKİKA6],saniye6  As [SANİYE6],koniMesafesi7 As [KONİ MESAFESİ7] ,hiz7 As [HIZ7] ,dakika7 As [DAKİKA7] ,saniye7  As [SANİYE7], koniMesafesi8 As [KONİ MESAFESİ8] ,hiz8 As [HIZ8],dakika8 As [DAKİKA8] ,saniye8  As [SANİYE8],koniMesafesi9 As [KONİ MESAFESİ9],hiz9 As [HIZ9],dakika9 As [DAKİKA9] ,saniye9  As [SANİYE9],koniMesafesi10 As [KONİ MESAFESİ10] ,hiz10 As [HIZ10] ,dakika10 As [DAKİKA10] ,saniye10  As [SANİYE10],koniMesafesi11 As [KONİ MESAFESİ11] ,hiz11 As [HIZ11] ,dakika11 As [DAKİKA11] ,saniye11  As [SANİYE11],koniMesafesi12 As [KONİ MESAFESİ12],hiz12 As [HIZ12],dakika12 As [DAKİKA12],saniye12  As [SANİYE12],koniMesafesi13 As [KONİ MESAFESİ13] ,hiz13 As [HIZ13] ,dakika13 As [DAKİKA13] ,saniye13  As [SANİYE13],koniMesafesi14 As [KONİ MESAFESİ14],hiz14 As [HIZ14] ,dakika14 As [DAKİKA14],saniye14  As [SANİYE14],koniMesafesi15 As [KONİ MESAFESİ15],hiz15 As [HIZ15] ,dakika15 As [DAKİKA15] ,saniye15  As [SANİYE15],koniMesafesi16 As [KONİ MESAFESİ16],hiz16 As [HIZ16],dakika16 As [DAKİKA16] ,saniye16  As [SANİYE16], koniMesafesi17 As [KONİ MESAFESİ17] ,hiz17 As [HIZ17] ,dakika17 As [DAKİKA17],saniye17  As [SANİYE17] ,koniMesafesi18 As [KONİ MESAFESİ18] ,hiz18 As [HIZ18] ,dakika18 As [DAKİKA18],saniye18  As [SANİYE18] ,koniMesafesi19 As [KONİ MESAFESİ19] ,hiz19 As [HIZ19] ,dakika19 As [DAKİKA19] ,saniye19  As [SANİYE19],koniMesafesi20 As [KONİ MESAFESİ20] ,hiz20 As [HIZ20] ,dakika20 As [DAKİKA20] ,saniye20 As [SANİYE20], koniMesafesi21 As [KONİ MESAFESİ21] ,hiz21 As [HIZ21] ,dakika21 As [DAKİKA21],saniye21 As [SANİYE21], koniMesafesi22 As [KONİ MESAFESİ22] ,hiz22 As [HIZ22],dakika22 As [DAKİKA22] ,saniye22 As [SANİYE22], koniMesafesi23 As [KONİ MESAFESİ23] ,hiz23 As [HIZ23],dakika23 As [DAKİKA23],saniye23 As [SANİYE23], koniMesafesi24 As [KONİ MESAFESİ24] ,hiz24 As [HIZ24] ,dakika24 As [DAKİKA24],saniye24 As [SANİYE24],koniMesafesi25 As [KONİ MESAFESİ25] ,hiz25 As [HIZ25] ,dakika25 As [DAKİKA25] ,saniye25 As [SANİYE25] FROM DayaniklilikTestProgram WHERE program_id = '"+BA.NumberToString(mostCurrent._programsec._secilenprogramid /*int*/ )+"'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="dayanikliliktestekle";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="dayanikliliktestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return "";
}
public static String  _buttonekle_click() throws Exception{
RDebugUtils.currentModule="dayanikliliktestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonekle_click", null));}
int _result = 0;
long _now = 0L;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub ButtonEkle_Click";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="result = Msgbox2(\"Dayanıklılık Test eklemek istiy";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Dayanıklılık Test eklemek istiyor musunuz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="If result= DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="secilenTarih = DateTime.Date(now)";
mostCurrent._secilentarih = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="secilenSaat = DateTime.Time(now)";
mostCurrent._secilensaat = anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="ID";
_id();
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Select GelismisTestDenekAra.checkedIdList.Size";
switch (BA.switchObjectToInt(mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10))) {
case 0: {
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 1: {
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 2: {
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 3: {
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 4: {
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 5: {
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 6: {
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 7: {
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 8: {
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)),anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,anywheresoftware.b4a.keywords.Common.Null,(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
case 9: {
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklil";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_dayananikliliktestid),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (2)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (3)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (4)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (5)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (6)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (7)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (8)),mostCurrent._gelismistestdenekara._checkedidlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (9)),mostCurrent._gelismistestdenekara._checkedtclist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (9)),mostCurrent._gelismistestdenekara._checkedisimlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (9)),(Object)(mostCurrent._programsec._secilenprogramid /*int*/ ),(Object)(mostCurrent._edittextmekiksayisi.getText()),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat)}));
 break; }
default: {
RDebugUtils.currentLine=4522015;
 //BA.debugLineNum = 4522015;BA.debugLine="Log(\"Sadece 10 tane kişi seçilebilir\")";
anywheresoftware.b4a.keywords.Common.LogImpl("24522015","Sadece 10 tane kişi seçilebilir",0);
 break; }
}
;
RDebugUtils.currentLine=4522017;
 //BA.debugLineNum = 4522017;BA.debugLine="StartActivity(DayaniklilikTestListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._dayanikliliktestlistele.getObject()));
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=4522020;
 //BA.debugLineNum = 4522020;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4522021;
 //BA.debugLineNum = 4522021;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=4522023;
 //BA.debugLineNum = 4522023;BA.debugLine="End Sub";
return "";
}
public static String  _id() throws Exception{
RDebugUtils.currentModule="dayanikliliktestekle";
if (Debug.shouldDelegate(mostCurrent.activityBA, "id", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "id", null));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub ID";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="sf.initialize";
_sf._initialize(processBA);
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Dayaniklili";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTest ORDER BY dayaniklilik_id DESC")));
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="If rs.RowCount>0 Then";
if (mostCurrent._rs.getRowCount()>0) { 
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="rs.Position=0";
mostCurrent._rs.setPosition((int) (0));
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="DayananiklilikTestID = sf.Right(\"00\" &sf.Trim(sf";
_dayananikliliktestid = (int)(Double.parseDouble(_sf._vvvvv7("00"+_sf._vvvvvvv4(BA.NumberToString(_sf._vvvvvvv6(_sf._vvvvv7(mostCurrent._rs.GetString("dayaniklilik_id"),(long) (3)))+1)),(long) (3))));
 }else {
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="DayananiklilikTestID=\"001\"";
_dayananikliliktestid = (int)(Double.parseDouble("001"));
 };
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="End Sub";
return "";
}
}