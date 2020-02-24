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

public class antranorgoruslistele extends Activity implements B4AActivity{
	public static antranorgoruslistele mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.antranorgoruslistele");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (antranorgoruslistele).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.antranorgoruslistele");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.antranorgoruslistele", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (antranorgoruslistele) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (antranorgoruslistele) Resume **");
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
		return antranorgoruslistele.class;
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
        BA.LogInfo("** Activity (antranorgoruslistele) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            antranorgoruslistele mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (antranorgoruslistele) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttonantranorgorusleriekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonantranorgoruslerisil = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonanasayfa = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonantranorgorusleriaciklama = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
public b4a.example3.antranorgorussil _antranorgorussil = null;
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
public b4a.example3.psikolojikekle _psikolojikekle = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public b4a.example3.programsec _programsec = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Activity.LoadLayout(\"AntranorGorusleriListelePage";
mostCurrent._activity.LoadLayout("AntranorGorusleriListelePage",mostCurrent.activityBA);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703954;
 //BA.debugLineNum = 1703954;BA.debugLine="ButtonAntranorGorusleriAciklama.TextColor = Color";
mostCurrent._buttonantranorgorusleriaciklama.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="ButtonAntranorGorusleriAciklama.Typeface = Typefa";
mostCurrent._buttonantranorgorusleriaciklama.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="ButtonAntranorGorusleriAciklama.Text = \"ANTRANÖR";
mostCurrent._buttonantranorgorusleriaciklama.setText(BA.ObjectToCharSequence("ANTRANÖR GÖRÜŞ AÇIKLAMA"));
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="ButtonAntranorGorusleriAciklama.TextSize = 14";
mostCurrent._buttonantranorgorusleriaciklama.setTextSize((float) (14));
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="ButtonAntranorGorusleriAciklama.SingleLine = True";
mostCurrent._buttonantranorgorusleriaciklama.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703960;
 //BA.debugLineNum = 1703960;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=1703961;
 //BA.debugLineNum = 1703961;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1703962;
 //BA.debugLineNum = 1703962;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=1703963;
 //BA.debugLineNum = 1703963;BA.debugLine="ButtonTarih.TextSize  =14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=1703964;
 //BA.debugLineNum = 1703964;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703966;
 //BA.debugLineNum = 1703966;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1703967;
 //BA.debugLineNum = 1703967;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=1703968;
 //BA.debugLineNum = 1703968;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=1703969;
 //BA.debugLineNum = 1703969;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=1703970;
 //BA.debugLineNum = 1703970;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=1703972;
 //BA.debugLineNum = 1703972;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703973;
 //BA.debugLineNum = 1703973;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1703978;
 //BA.debugLineNum = 1703978;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=1703980;
 //BA.debugLineNum = 1703980;BA.debugLine="End Sub";
return "";
}
public static String  _htmlgosterdb() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "htmlgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "htmlgosterdb", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub HTMLGosterDB";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], antranorGorüsleri_tarih As [TARİH],antranorGorüsleri_saat  As [SAAT], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id ORDER BY antranorGorüsleri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantranorgorusleriaciklama_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantranorgorusleriaciklama_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantranorgorusleriaciklama_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub ButtonAntranorGorusleriAciklama_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantranorgorusleriekle_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantranorgorusleriekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantranorgorusleriekle_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub ButtonAntranorGorusleriEkle_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Main.Status = \"S\"";
mostCurrent._main._status /*String*/  = "S";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="StartActivity(TestDenekAra)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._testdenekara.getObject()));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantranorgoruslerisil_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantranorgoruslerisil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantranorgoruslerisil_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ButtonAntranorGorusleriSil_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="StartActivity(AntranorGorusSil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antranorgorussil.getObject()));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT  denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], antranorGorüsleri_tarih As [TARİH],antranorGorüsleri_saat As [SAAT] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, \"";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,antranorGorüsleri_tarih   As [TARİH],antranorGorüsleri_saat  As [SAAT],antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antranorGorüsleri_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antranorGorüsleri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%' ) ORDER BY antranorGorüsleri_id DESC",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="antranorgoruslistele";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="HTMLGosterDB";
_htmlgosterdb();
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="End Sub";
return "";
}
}