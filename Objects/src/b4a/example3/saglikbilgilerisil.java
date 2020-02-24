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

public class saglikbilgilerisil extends Activity implements B4AActivity{
	public static saglikbilgilerisil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.saglikbilgilerisil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (saglikbilgilerisil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.saglikbilgilerisil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.saglikbilgilerisil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (saglikbilgilerisil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (saglikbilgilerisil) Resume **");
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
		return saglikbilgilerisil.class;
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
        BA.LogInfo("** Activity (saglikbilgilerisil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            saglikbilgilerisil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (saglikbilgilerisil) Resume **");
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
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static int _id = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonhastaliksaglik = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsaglikbilgileriaciklama = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public static String _tc = "";
public static String _tarih = "";
public static String _isim = "";
public static String _saat = "";
public static String _hastalik_saglik = "";
public static String _aciklama = "";
public static byte[] _resim = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
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
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="Activity.LoadLayout(\"SaglikBilgileriSilPage\")";
mostCurrent._activity.LoadLayout("SaglikBilgileriSilPage",mostCurrent.activityBA);
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32636935;
 //BA.debugLineNum = 32636935;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32636936;
 //BA.debugLineNum = 32636936;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=32636937;
 //BA.debugLineNum = 32636937;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=32636938;
 //BA.debugLineNum = 32636938;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=32636940;
 //BA.debugLineNum = 32636940;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=32636941;
 //BA.debugLineNum = 32636941;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=32636942;
 //BA.debugLineNum = 32636942;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=32636943;
 //BA.debugLineNum = 32636943;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=32636944;
 //BA.debugLineNum = 32636944;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=32636946;
 //BA.debugLineNum = 32636946;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32636947;
 //BA.debugLineNum = 32636947;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32636949;
 //BA.debugLineNum = 32636949;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=32636950;
 //BA.debugLineNum = 32636950;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=32636951;
 //BA.debugLineNum = 32636951;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=32636952;
 //BA.debugLineNum = 32636952;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=32636953;
 //BA.debugLineNum = 32636953;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32636955;
 //BA.debugLineNum = 32636955;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=32636956;
 //BA.debugLineNum = 32636956;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=32636957;
 //BA.debugLineNum = 32636957;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=32636958;
 //BA.debugLineNum = 32636958;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=32636959;
 //BA.debugLineNum = 32636959;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32636961;
 //BA.debugLineNum = 32636961;BA.debugLine="ButtonHastalikSaglik.TextColor = Color.koyuMavi";
mostCurrent._buttonhastaliksaglik.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=32636962;
 //BA.debugLineNum = 32636962;BA.debugLine="ButtonHastalikSaglik.Typeface = Typeface.DEFAULT_";
mostCurrent._buttonhastaliksaglik.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=32636963;
 //BA.debugLineNum = 32636963;BA.debugLine="ButtonHastalikSaglik.Text = \"HASTALIK/SAĞLIK\"";
mostCurrent._buttonhastaliksaglik.setText(BA.ObjectToCharSequence("HASTALIK/SAĞLIK"));
RDebugUtils.currentLine=32636964;
 //BA.debugLineNum = 32636964;BA.debugLine="ButtonHastalikSaglik.TextSize = 14";
mostCurrent._buttonhastaliksaglik.setTextSize((float) (14));
RDebugUtils.currentLine=32636965;
 //BA.debugLineNum = 32636965;BA.debugLine="ButtonHastalikSaglik.SingleLine = True";
mostCurrent._buttonhastaliksaglik.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32636967;
 //BA.debugLineNum = 32636967;BA.debugLine="ButtonSaglikBilgileriAciklama.TextColor = Color.k";
mostCurrent._buttonsaglikbilgileriaciklama.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=32636968;
 //BA.debugLineNum = 32636968;BA.debugLine="ButtonSaglikBilgileriAciklama.Typeface = Typeface";
mostCurrent._buttonsaglikbilgileriaciklama.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=32636969;
 //BA.debugLineNum = 32636969;BA.debugLine="ButtonSaglikBilgileriAciklama.Text = \"SAĞLIK BİLG";
mostCurrent._buttonsaglikbilgileriaciklama.setText(BA.ObjectToCharSequence("SAĞLIK BİLGİLERİ AÇIKLAMA"));
RDebugUtils.currentLine=32636970;
 //BA.debugLineNum = 32636970;BA.debugLine="ButtonSaglikBilgileriAciklama.TextSize = 14";
mostCurrent._buttonsaglikbilgileriaciklama.setTextSize((float) (14));
RDebugUtils.currentLine=32636971;
 //BA.debugLineNum = 32636971;BA.debugLine="ButtonSaglikBilgileriAciklama.SingleLine = True";
mostCurrent._buttonsaglikbilgileriaciklama.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32636973;
 //BA.debugLineNum = 32636973;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=32636974;
 //BA.debugLineNum = 32636974;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=32636975;
 //BA.debugLineNum = 32636975;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=32636976;
 //BA.debugLineNum = 32636976;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=32636977;
 //BA.debugLineNum = 32636977;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32636981;
 //BA.debugLineNum = 32636981;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=32636983;
 //BA.debugLineNum = 32636983;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=33619974;
 //BA.debugLineNum = 33619974;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=33619975;
 //BA.debugLineNum = 33619975;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SaglikBilg";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id ORDER BY saglikBilgileri_id DESC")));
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=32899077;
 //BA.debugLineNum = 32899077;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=32899078;
 //BA.debugLineNum = 32899078;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Hastalık/Sağlık: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._hastalik_saglik))+" // Açıklama: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._aciklama))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=32899081;
 //BA.debugLineNum = 32899081;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="End Sub";
return "";
}
public static String  _buttonhastaliksaglik_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonhastaliksaglik_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonhastaliksaglik_click", null));}
int _i = 0;
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Sub ButtonHastalikSaglik_Click";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT saglikBilgileri_h";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT saglikBilgileri_hastalikSakatlik ,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_hastalikSakatlik LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC")));
RDebugUtils.currentLine=33161221;
 //BA.debugLineNum = 33161221;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=33161222;
 //BA.debugLineNum = 33161222;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=33161223;
 //BA.debugLineNum = 33161223;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=33161224;
 //BA.debugLineNum = 33161224;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Hastalık/Sağlık: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._hastalik_saglik))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=33161226;
 //BA.debugLineNum = 33161226;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=33161227;
 //BA.debugLineNum = 33161227;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub VeriAl";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="id = rs.GetInt(\"saglikBilgileri_id\")";
_id = mostCurrent._rs.GetInt("saglikBilgileri_id");
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
mostCurrent._tc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
mostCurrent._isim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="tarih = rs.GetString(\"saglikBilgileri_tarih\")";
mostCurrent._tarih = mostCurrent._rs.GetString("saglikBilgileri_tarih");
RDebugUtils.currentLine=32833541;
 //BA.debugLineNum = 32833541;BA.debugLine="saat = rs.GetString(\"saglikBilgileri_saat\")";
mostCurrent._saat = mostCurrent._rs.GetString("saglikBilgileri_saat");
RDebugUtils.currentLine=32833542;
 //BA.debugLineNum = 32833542;BA.debugLine="hastalik_saglik = rs.GetInt(\"saglikBilgileri_hast";
mostCurrent._hastalik_saglik = BA.NumberToString(mostCurrent._rs.GetInt("saglikBilgileri_hastalikSakatlik"));
RDebugUtils.currentLine=32833543;
 //BA.debugLineNum = 32833543;BA.debugLine="aciklama = rs.GetInt(\"saglikBilgileri_aciklama\")";
mostCurrent._aciklama = BA.NumberToString(mostCurrent._rs.GetInt("saglikBilgileri_aciklama"));
RDebugUtils.currentLine=32833544;
 //BA.debugLineNum = 32833544;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
_resim = mostCurrent._rs.GetBlob("denek_image");
RDebugUtils.currentLine=32833545;
 //BA.debugLineNum = 32833545;BA.debugLine="Try";
try {RDebugUtils.currentLine=32833546;
 //BA.debugLineNum = 32833546;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=32833547;
 //BA.debugLineNum = 32833547;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
_inputstream.InitializeFromBytesArray(_resim,(int) (0),_resim.length);
RDebugUtils.currentLine=32833548;
 //BA.debugLineNum = 32833548;BA.debugLine="bmp.Initialize2(inputStream)";
mostCurrent._bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=32833549;
 //BA.debugLineNum = 32833549;BA.debugLine="inputStream.Close";
_inputstream.Close();
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=32833551;
 //BA.debugLineNum = 32833551;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
mostCurrent._bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png");
 };
RDebugUtils.currentLine=32833553;
 //BA.debugLineNum = 32833553;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
int _i = 0;
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT denek_isim,saglik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT denek_isim,saglikBilgileri_id  FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC")));
RDebugUtils.currentLine=33292293;
 //BA.debugLineNum = 33292293;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=33292294;
 //BA.debugLineNum = 33292294;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=33292295;
 //BA.debugLineNum = 33292295;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=33292296;
 //BA.debugLineNum = 33292296;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=33292298;
 //BA.debugLineNum = 33292298;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=33292299;
 //BA.debugLineNum = 33292299;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsaglikbilgileraciklama_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsaglikbilgileraciklama_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsaglikbilgileraciklama_click", null));}
int _i = 0;
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Sub ButtonSaglikBilgilerAciklama_Click";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT saglikBilgileri_a";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT saglikBilgileri_aciklama,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC ")));
RDebugUtils.currentLine=33095685;
 //BA.debugLineNum = 33095685;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=33095686;
 //BA.debugLineNum = 33095686;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=33095687;
 //BA.debugLineNum = 33095687;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=33095688;
 //BA.debugLineNum = 33095688;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Açıklama: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._aciklama))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=33095690;
 //BA.debugLineNum = 33095690;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=33095691;
 //BA.debugLineNum = 33095691;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsaglikbilgileriekle_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsaglikbilgileriekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsaglikbilgileriekle_click", null));}
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Sub ButtonSaglikBilgileriEkle_Click";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="StartActivity(SaglikBilgileriEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._saglikbilgileriekle.getObject()));
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=33357828;
 //BA.debugLineNum = 33357828;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsaglikbilgileritabloveri_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonsaglikbilgileritabloveri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonsaglikbilgileritabloveri_click", null));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Sub ButtonSaglikBilgileriTabloVeri_Click";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="StartActivity(SaglikBilgileriListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._saglikbilgilerilistele.getObject()));
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=33423364;
 //BA.debugLineNum = 33423364;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
int _i = 0;
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT saglikBilgileri_t";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT saglikBilgileri_tarih ,saglikBilgileri_id  FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC ")));
RDebugUtils.currentLine=33030149;
 //BA.debugLineNum = 33030149;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=33030150;
 //BA.debugLineNum = 33030150;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=33030151;
 //BA.debugLineNum = 33030151;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=33030152;
 //BA.debugLineNum = 33030152;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=33030154;
 //BA.debugLineNum = 33030154;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=33030155;
 //BA.debugLineNum = 33030155;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
int _i = 0;
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=33226755;
 //BA.debugLineNum = 33226755;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT denek_tc,saglikBi";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT denek_tc,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY saglikBilgileri_id DESC")));
RDebugUtils.currentLine=33226757;
 //BA.debugLineNum = 33226757;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=33226758;
 //BA.debugLineNum = 33226758;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=33226759;
 //BA.debugLineNum = 33226759;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=33226760;
 //BA.debugLineNum = 33226760;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" ")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=33226762;
 //BA.debugLineNum = 33226762;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=33226763;
 //BA.debugLineNum = 33226763;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=32964612;
 //BA.debugLineNum = 32964612;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM SaglikBil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR saglikBilgileri_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR saglikBilgileri_hastalikSakatlik LIKE '%"+mostCurrent._edittextara.getText()+"%' OR saglikBilgileri_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%') ORDER BY saglikBilgileri_id DESC")));
RDebugUtils.currentLine=32964614;
 //BA.debugLineNum = 32964614;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=32964615;
 //BA.debugLineNum = 32964615;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=32964616;
 //BA.debugLineNum = 32964616;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=32964617;
 //BA.debugLineNum = 32964617;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" ")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=32964619;
 //BA.debugLineNum = 32964619;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=32964620;
 //BA.debugLineNum = 32964620;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=32964621;
 //BA.debugLineNum = 32964621;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=32964623;
 //BA.debugLineNum = 32964623;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="WebView1.Visible = True";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK], saglikBilgileri_aciklama As [AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_id  = '"+BA.ObjectToString(_value)+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=33488900;
 //BA.debugLineNum = 33488900;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="saglikbilgilerisil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM SaglikBilg";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM SaglikBilgileri WHERE saglikBilgileri_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=33554436;
 //BA.debugLineNum = 33554436;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=33554437;
 //BA.debugLineNum = 33554437;BA.debugLine="id = rs.GetInt(\"saglikBilgileri_id\")";
_id = mostCurrent._rs.GetInt("saglikBilgileri_id");
 }
};
RDebugUtils.currentLine=33554439;
 //BA.debugLineNum = 33554439;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=33554441;
 //BA.debugLineNum = 33554441;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=33554442;
 //BA.debugLineNum = 33554442;BA.debugLine="result = Msgbox2(\"Sağlık bilgilerini silmek isted";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Sağlık bilgilerini silmek istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=33554443;
 //BA.debugLineNum = 33554443;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=33554444;
 //BA.debugLineNum = 33554444;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM SaglikBilgile";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM SaglikBilgileri WHERE saglikBilgileri_id = '"+BA.NumberToString(_id)+"' ");
RDebugUtils.currentLine=33554445;
 //BA.debugLineNum = 33554445;BA.debugLine="ToastMessageShow(\"Sağlık bilgileri silindi...\",F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sağlık bilgileri silindi..."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=33554447;
 //BA.debugLineNum = 33554447;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=33554449;
 //BA.debugLineNum = 33554449;BA.debugLine="End Sub";
return "";
}
}