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

public class psikolojiksil extends Activity implements B4AActivity{
	public static psikolojiksil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.psikolojiksil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (psikolojiksil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.psikolojiksil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.psikolojiksil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (psikolojiksil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (psikolojiksil) Resume **");
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
		return psikolojiksil.class;
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
        BA.LogInfo("** Activity (psikolojiksil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            psikolojiksil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (psikolojiksil) Resume **");
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
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static int _id = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonpsikolojikaciklama = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public static String _tc = "";
public static String _tarih = "";
public static String _isim = "";
public static String _saat = "";
public static String _psikolojik_aciklama = "";
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
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="Activity.LoadLayout(\"PsikolojikSilPage\")";
mostCurrent._activity.LoadLayout("PsikolojikSilPage",mostCurrent.activityBA);
RDebugUtils.currentLine=41287683;
 //BA.debugLineNum = 41287683;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41287687;
 //BA.debugLineNum = 41287687;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41287688;
 //BA.debugLineNum = 41287688;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=41287689;
 //BA.debugLineNum = 41287689;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=41287690;
 //BA.debugLineNum = 41287690;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=41287692;
 //BA.debugLineNum = 41287692;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=41287693;
 //BA.debugLineNum = 41287693;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=41287694;
 //BA.debugLineNum = 41287694;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=41287695;
 //BA.debugLineNum = 41287695;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=41287696;
 //BA.debugLineNum = 41287696;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=41287698;
 //BA.debugLineNum = 41287698;BA.debugLine="WebView1.JavaScriptEnabled = True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=41287699;
 //BA.debugLineNum = 41287699;BA.debugLine="WebView1.ZoomEnabled = True";
mostCurrent._webview1.setZoomEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=41287701;
 //BA.debugLineNum = 41287701;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=41287702;
 //BA.debugLineNum = 41287702;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=41287703;
 //BA.debugLineNum = 41287703;BA.debugLine="ButtonIsim.Text = \"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=41287704;
 //BA.debugLineNum = 41287704;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=41287705;
 //BA.debugLineNum = 41287705;BA.debugLine="ButtonIsim.SingleLine  = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=41287707;
 //BA.debugLineNum = 41287707;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=41287708;
 //BA.debugLineNum = 41287708;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=41287709;
 //BA.debugLineNum = 41287709;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=41287710;
 //BA.debugLineNum = 41287710;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=41287711;
 //BA.debugLineNum = 41287711;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=41287713;
 //BA.debugLineNum = 41287713;BA.debugLine="ButtonPsikolojikAciklama.TextColor = Color.koyuMa";
mostCurrent._buttonpsikolojikaciklama.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=41287714;
 //BA.debugLineNum = 41287714;BA.debugLine="ButtonPsikolojikAciklama.Typeface = Typeface.DEFA";
mostCurrent._buttonpsikolojikaciklama.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=41287715;
 //BA.debugLineNum = 41287715;BA.debugLine="ButtonPsikolojikAciklama.TextSize = 14";
mostCurrent._buttonpsikolojikaciklama.setTextSize((float) (14));
RDebugUtils.currentLine=41287716;
 //BA.debugLineNum = 41287716;BA.debugLine="ButtonPsikolojikAciklama.Text = \"PSİKOLOJİK AÇIKL";
mostCurrent._buttonpsikolojikaciklama.setText(BA.ObjectToCharSequence("PSİKOLOJİK AÇIKLAMA"));
RDebugUtils.currentLine=41287717;
 //BA.debugLineNum = 41287717;BA.debugLine="ButtonPsikolojikAciklama.SingleLine = True";
mostCurrent._buttonpsikolojikaciklama.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=41287719;
 //BA.debugLineNum = 41287719;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=41287720;
 //BA.debugLineNum = 41287720;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=41287721;
 //BA.debugLineNum = 41287721;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=41287722;
 //BA.debugLineNum = 41287722;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=41287723;
 //BA.debugLineNum = 41287723;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=41287727;
 //BA.debugLineNum = 41287727;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=41287730;
 //BA.debugLineNum = 41287730;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=42205187;
 //BA.debugLineNum = 42205187;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=42205188;
 //BA.debugLineNum = 42205188;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=42205189;
 //BA.debugLineNum = 42205189;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=42205190;
 //BA.debugLineNum = 42205190;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=42205191;
 //BA.debugLineNum = 42205191;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id ORDER BY psikolojik_id DESC")));
RDebugUtils.currentLine=41549828;
 //BA.debugLineNum = 41549828;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=41549829;
 //BA.debugLineNum = 41549829;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=41549831;
 //BA.debugLineNum = 41549831;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" ")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=41549833;
 //BA.debugLineNum = 41549833;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="psikolojiksil";
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=42270723;
 //BA.debugLineNum = 42270723;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
int _i = 0;
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY psikolojik_id DESC")));
RDebugUtils.currentLine=41877509;
 //BA.debugLineNum = 41877509;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=41877511;
 //BA.debugLineNum = 41877511;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=41877512;
 //BA.debugLineNum = 41877512;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=41877514;
 //BA.debugLineNum = 41877514;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=41877515;
 //BA.debugLineNum = 41877515;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub VeriAl";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="id = rs.GetInt(\"psikolojik_id\")";
_id = mostCurrent._rs.GetInt("psikolojik_id");
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="tc = rs.GetString(\"denek_tc\")";
mostCurrent._tc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="isim = rs.GetString(\"denek_isim\")";
mostCurrent._isim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="tarih = rs.GetString(\"psikolojik_tarih\")";
mostCurrent._tarih = mostCurrent._rs.GetString("psikolojik_tarih");
RDebugUtils.currentLine=41484293;
 //BA.debugLineNum = 41484293;BA.debugLine="saat = rs.GetString(\"psikolojik_saat\")";
mostCurrent._saat = mostCurrent._rs.GetString("psikolojik_saat");
RDebugUtils.currentLine=41484294;
 //BA.debugLineNum = 41484294;BA.debugLine="psikolojik_aciklama = rs.GetString(\"psikolojik_ac";
mostCurrent._psikolojik_aciklama = mostCurrent._rs.GetString("psikolojik_aciklama");
RDebugUtils.currentLine=41484295;
 //BA.debugLineNum = 41484295;BA.debugLine="resim = rs.GetBlob(\"denek_image\")";
_resim = mostCurrent._rs.GetBlob("denek_image");
RDebugUtils.currentLine=41484296;
 //BA.debugLineNum = 41484296;BA.debugLine="Try";
try {RDebugUtils.currentLine=41484297;
 //BA.debugLineNum = 41484297;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=41484298;
 //BA.debugLineNum = 41484298;BA.debugLine="inputStream.InitializeFromBytesArray(resim, 0, r";
_inputstream.InitializeFromBytesArray(_resim,(int) (0),_resim.length);
RDebugUtils.currentLine=41484299;
 //BA.debugLineNum = 41484299;BA.debugLine="bmp.Initialize2(inputStream)";
mostCurrent._bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=41484300;
 //BA.debugLineNum = 41484300;BA.debugLine="inputStream.Close";
_inputstream.Close();
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=41484302;
 //BA.debugLineNum = 41484302;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
mostCurrent._bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png");
 };
RDebugUtils.currentLine=41484304;
 //BA.debugLineNum = 41484304;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpsikolojikaciklama_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpsikolojikaciklama_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpsikolojikaciklama_click", null));}
int _i = 0;
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Sub ButtonPsikolojikAciklama_Click";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=41746435;
 //BA.debugLineNum = 41746435;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND psikolojik_aciklama LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY psikolojik_id DESC")));
RDebugUtils.currentLine=41746437;
 //BA.debugLineNum = 41746437;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=41746438;
 //BA.debugLineNum = 41746438;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=41746439;
 //BA.debugLineNum = 41746439;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=41746440;
 //BA.debugLineNum = 41746440;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+" // Açıklama: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._psikolojik_aciklama))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=41746442;
 //BA.debugLineNum = 41746442;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=41746443;
 //BA.debugLineNum = 41746443;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpsikolojikekle_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpsikolojikekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpsikolojikekle_click", null));}
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Sub ButtonPsikolojikEkle_Click";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="StartActivity(PsikolojikEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._psikolojikekle.getObject()));
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpsikolojiktabloveri_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpsikolojiktabloveri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpsikolojiktabloveri_click", null));}
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Sub ButtonPsikolojikTabloVeri_Click";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="StartActivity(PsikolojikListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._psikolojiklistele.getObject()));
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
int _i = 0;
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik ,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND psikolojik_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY psikolojik_id DESC")));
RDebugUtils.currentLine=41680901;
 //BA.debugLineNum = 41680901;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=41680902;
 //BA.debugLineNum = 41680902;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=41680903;
 //BA.debugLineNum = 41680903;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=41680904;
 //BA.debugLineNum = 41680904;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=41680906;
 //BA.debugLineNum = 41680906;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=41680907;
 //BA.debugLineNum = 41680907;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
int _i = 0;
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY psikolojik_id DESC")));
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=41811974;
 //BA.debugLineNum = 41811974;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=41811975;
 //BA.debugLineNum = 41811975;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=41811976;
 //BA.debugLineNum = 41811976;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=41811978;
 //BA.debugLineNum = 41811978;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=41811979;
 //BA.debugLineNum = 41811979;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="WebView1.Visible = False";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=41615364;
 //BA.debugLineNum = 41615364;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR psikolojik_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' OR psikolojik_aciklama   LIKE '%"+mostCurrent._edittextara.getText()+"%') ORDER BY psikolojik_id DESC")));
RDebugUtils.currentLine=41615366;
 //BA.debugLineNum = 41615366;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=41615367;
 //BA.debugLineNum = 41615367;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=41615368;
 //BA.debugLineNum = 41615368;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=41615369;
 //BA.debugLineNum = 41615369;BA.debugLine="ListView1.AddTwoLinesAndBitmap(id,$\"TC: ${tc} //";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_id),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._isim))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Saat: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._saat))+"")),(android.graphics.Bitmap)(mostCurrent._bmp.getObject()));
 }
};
RDebugUtils.currentLine=41615371;
 //BA.debugLineNum = 41615371;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=41615372;
 //BA.debugLineNum = 41615372;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=41615373;
 //BA.debugLineNum = 41615373;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=41615375;
 //BA.debugLineNum = 41615375;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="EditTextAra.Text=\"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=42336260;
 //BA.debugLineNum = 42336260;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="WebView1.Visible = True";
mostCurrent._webview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,\"S";
mostCurrent._webview1.LoadHtml(mostCurrent._dbutils._executehtml /*String*/ (mostCurrent.activityBA,mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ ,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], psikolojik_tarih As [TARİH] ,psikolojik_saat As [SAAT], psikolojik_aciklama  As [PSİKOLOJİK AÇIKLAMA]  FROM Psikolojik,Denek WHERE Psikolojik.denek_id = Denek.denek_id AND psikolojik_id = '"+BA.ObjectToString(_value)+"' ",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (-1),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=42074115;
 //BA.debugLineNum = 42074115;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=42074116;
 //BA.debugLineNum = 42074116;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="psikolojiksil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemlongclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Psikolojik";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Psikolojik WHERE psikolojik_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=42139653;
 //BA.debugLineNum = 42139653;BA.debugLine="id = rs.GetInt(\"psikolojik_id\")";
_id = mostCurrent._rs.GetInt("psikolojik_id");
 }
};
RDebugUtils.currentLine=42139655;
 //BA.debugLineNum = 42139655;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=42139657;
 //BA.debugLineNum = 42139657;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=42139658;
 //BA.debugLineNum = 42139658;BA.debugLine="result = Msgbox2(\"Psikolojik analiz verilerini si";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Psikolojik analiz verilerini silmek istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=42139659;
 //BA.debugLineNum = 42139659;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=42139660;
 //BA.debugLineNum = 42139660;BA.debugLine="Main.sql.ExecNonQuery(\"DELETE FROM Psikolojik WH";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM Psikolojik WHERE psikolojik_id = '"+BA.NumberToString(_id)+"' ");
RDebugUtils.currentLine=42139661;
 //BA.debugLineNum = 42139661;BA.debugLine="ToastMessageShow(\"Psikolojik veriler silindi...\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Psikolojik veriler silindi..."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=42139663;
 //BA.debugLineNum = 42139663;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=42139664;
 //BA.debugLineNum = 42139664;BA.debugLine="End Sub";
return "";
}
}