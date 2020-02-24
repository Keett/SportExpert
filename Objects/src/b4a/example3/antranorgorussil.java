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

public class antranorgorussil extends Activity implements B4AActivity{
	public static antranorgorussil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.antranorgorussil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (antranorgorussil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.antranorgorussil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.antranorgorussil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (antranorgorussil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (antranorgorussil) Resume **");
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
		return antranorgorussil.class;
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
        BA.LogInfo("** Activity (antranorgorussil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            antranorgorussil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (antranorgorussil) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonantranorgorusleriaciklama = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonantranorgorusekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonantranorgorustabloveri = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static int _id = 0;
public static String _tc = "";
public static String _tarih = "";
public static String _isim = "";
public static String _saat = "";
public static String _aciklama = "";
public static byte[] _resim = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonanasayfa = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example3.main _main = null;
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
public b4a.example3.psikolojikekle _psikolojikekle = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public b4a.example3.programsec _programsec = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Activity.LoadLayout(\"AntranorGorusleriSilPage\")";
mostCurrent._activity.LoadLayout("AntranorGorusleriSilPage",mostCurrent.activityBA);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="ButtonAntranorGorusleriAciklama.TextColor = Color";
mostCurrent._buttonantranorgorusleriaciklama.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="ButtonAntranorGorusleriAciklama.Typeface = Typefa";
mostCurrent._buttonantranorgorusleriaciklama.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="ButtonAntranorGorusleriAciklama.Text = \"ANTRANÖR";
mostCurrent._buttonantranorgorusleriaciklama.setText(BA.ObjectToCharSequence("ANTRANÖR GÖRÜŞ AÇIKLAMA"));
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="ButtonAntranorGorusleriAciklama.TextSize = 14";
mostCurrent._buttonantranorgorusleriaciklama.setTextSize((float) (14));
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="ButtonAntranorGorusleriAciklama.SingleLine = True";
mostCurrent._buttonantranorgorusleriaciklama.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=458791;
 //BA.debugLineNum = 458791;BA.debugLine="ButtonTarih.TextSize  =14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458795;
 //BA.debugLineNum = 458795;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458799;
 //BA.debugLineNum = 458799;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=458800;
 //BA.debugLineNum = 458800;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id ORDER BY antranorGorüsleri_id DESC")));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Açıklama: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._aciklama))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="antranorgorussil";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantranorgorusaciklama_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantranorgorusaciklama_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantranorgorusaciklama_click", null));}
int _i = 0;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub ButtonAntranorGorusAciklama_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC")));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Açıklama: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._aciklama))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub VeriAl";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="id = rs.GetInt(\"antranorGorüsleri_id\")";
_id = mostCurrent._rs.GetInt("antranorGorüsleri_id");
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
mostCurrent._tc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
mostCurrent._isim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="tarih = rs.GetString(\"antranorGorüsleri_tarih\")";
mostCurrent._tarih = mostCurrent._rs.GetString("antranorGorüsleri_tarih");
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="saat = rs.GetString(\"antranorGorüsleri_saat\")";
mostCurrent._saat = mostCurrent._rs.GetString("antranorGorüsleri_saat");
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="aciklama = rs.GetString(\"antranorGorüsleri_acikla";
mostCurrent._aciklama = mostCurrent._rs.GetString("antranorGorüsleri_aciklama");
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
_resim = mostCurrent._rs.GetBlob("denek_image");
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Try";
try {RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
_inputstream.InitializeFromBytesArray(_resim,(int) (0),_resim.length);
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="bmp.Initialize2(inputStream)";
mostCurrent._bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="inputStream.Close";
_inputstream.Close();
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
mostCurrent._bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png");
 };
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantranorgorusekle_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantranorgorusekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantranorgorusekle_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub ButtonAntranorGorusEkle_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="StartActivity(AntropometrikEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antropometrikekle.getObject()));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public static String  _buttonantranorgorustabloveri_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonantranorgorustabloveri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonantranorgorustabloveri_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub ButtonAntranorGorusTabloVeri_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="StartActivity(AntropometrikListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antropometriklistele.getObject()));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
int _i = 0;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC")));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
int _i = 0;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_tarih  LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC ")));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
int _i = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY antranorGorüsleri_id DESC")));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" ")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM AntranorG";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antranorGorüsleri_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR antranorGorüsleri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%') ORDER BY antranorGorüsleri_id DESC")));
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="WebView1.Visible = True";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM],antranorGorüsleri_tarih As [TARİH], antranorGorüsleri_saat As [SAAT], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_id = '"+BA.ObjectToString(_value)+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="antranorgorussil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM AntranorGo";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM AntranorGorusleri WHERE antranorGorüsleri_id  = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="id = rs.GetInt(\"antranorGorüsleri_id\")";
_id = mostCurrent._rs.GetInt("antranorGorüsleri_id");
 }
};
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="result = Msgbox2(\"Antranor görüşleri silmek isted";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Antranor görüşleri silmek istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM AntranorGorus";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM AntranorGorusleri WHERE antranorGorüsleri_id = '"+BA.NumberToString(_id)+"' ");
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="ToastMessageShow(\"Antranor Gorusleri silindi...\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Antranor Gorusleri silindi..."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="End Sub";
return "";
}
}