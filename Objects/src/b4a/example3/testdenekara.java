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

public class testdenekara extends Activity implements B4AActivity{
	public static testdenekara mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.testdenekara");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (testdenekara).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.testdenekara");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.testdenekara", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (testdenekara) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (testdenekara) Resume **");
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
		return testdenekara.class;
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
        BA.LogInfo("** Activity (testdenekara) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            testdenekara mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (testdenekara) Resume **");
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
public static byte[] _denekimage = null;
public static String _secilendenek = "";
public static String _denektc = "";
public static String _denekisim = "";
public static String _denekcinsiyet = "";
public static String _denekdogumtarihi = "";
public static String _denekil = "";
public static String _denekbaba = "";
public static String _denekengel = "";
public static String _denektakim = "";
public static String _denekbrans = "";
public static String _denekmevki = "";
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonisim = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoncinsiyet = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumtarihi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondogumyeri = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbabaadi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonengeldurumu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontakimokul = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonbranssinif = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmevki = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
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
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Activity.LoadLayout(\"DenekAraTestPage\")";
mostCurrent._activity.LoadLayout("DenekAraTestPage",mostCurrent.activityBA);
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.Visible = False";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextColor";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="SetDivider(ListView1,Color.acikMavi,3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=19333132;
 //BA.debugLineNum = 19333132;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=19333133;
 //BA.debugLineNum = 19333133;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=19333134;
 //BA.debugLineNum = 19333134;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=19333135;
 //BA.debugLineNum = 19333135;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=19333136;
 //BA.debugLineNum = 19333136;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333138;
 //BA.debugLineNum = 19333138;BA.debugLine="ButtonTc.TextColor = Color.koyuMavi";
mostCurrent._buttontc.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333139;
 //BA.debugLineNum = 19333139;BA.debugLine="ButtonTc.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontc.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333140;
 //BA.debugLineNum = 19333140;BA.debugLine="ButtonTc.SingleLine = True";
mostCurrent._buttontc.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333141;
 //BA.debugLineNum = 19333141;BA.debugLine="ButtonTc.Text = \"TC\"";
mostCurrent._buttontc.setText(BA.ObjectToCharSequence("TC"));
RDebugUtils.currentLine=19333142;
 //BA.debugLineNum = 19333142;BA.debugLine="ButtonTc.TextSize = 14";
mostCurrent._buttontc.setTextSize((float) (14));
RDebugUtils.currentLine=19333144;
 //BA.debugLineNum = 19333144;BA.debugLine="ButtonIsim.TextColor = Color.koyuMavi";
mostCurrent._buttonisim.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333145;
 //BA.debugLineNum = 19333145;BA.debugLine="ButtonIsim.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonisim.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333146;
 //BA.debugLineNum = 19333146;BA.debugLine="ButtonIsim.SingleLine = True";
mostCurrent._buttonisim.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333147;
 //BA.debugLineNum = 19333147;BA.debugLine="ButtonIsim.Text =\"İSİM\"";
mostCurrent._buttonisim.setText(BA.ObjectToCharSequence("İSİM"));
RDebugUtils.currentLine=19333148;
 //BA.debugLineNum = 19333148;BA.debugLine="ButtonIsim.TextSize = 14";
mostCurrent._buttonisim.setTextSize((float) (14));
RDebugUtils.currentLine=19333150;
 //BA.debugLineNum = 19333150;BA.debugLine="ButtonCinsiyet.TextColor = Color.koyuMavi";
mostCurrent._buttoncinsiyet.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333151;
 //BA.debugLineNum = 19333151;BA.debugLine="ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttoncinsiyet.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333152;
 //BA.debugLineNum = 19333152;BA.debugLine="ButtonCinsiyet.SingleLine = True";
mostCurrent._buttoncinsiyet.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333153;
 //BA.debugLineNum = 19333153;BA.debugLine="ButtonCinsiyet.Text = \"CİNSİYET\"";
mostCurrent._buttoncinsiyet.setText(BA.ObjectToCharSequence("CİNSİYET"));
RDebugUtils.currentLine=19333154;
 //BA.debugLineNum = 19333154;BA.debugLine="ButtonCinsiyet.TextSize = 14";
mostCurrent._buttoncinsiyet.setTextSize((float) (14));
RDebugUtils.currentLine=19333156;
 //BA.debugLineNum = 19333156;BA.debugLine="ButtonDogumTarihi.TextColor = Color.koyuMavi";
mostCurrent._buttondogumtarihi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333157;
 //BA.debugLineNum = 19333157;BA.debugLine="ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._buttondogumtarihi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333158;
 //BA.debugLineNum = 19333158;BA.debugLine="ButtonDogumTarihi.SingleLine = True";
mostCurrent._buttondogumtarihi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333159;
 //BA.debugLineNum = 19333159;BA.debugLine="ButtonDogumTarihi.Text = \"DOĞUM TARİHİ\"";
mostCurrent._buttondogumtarihi.setText(BA.ObjectToCharSequence("DOĞUM TARİHİ"));
RDebugUtils.currentLine=19333160;
 //BA.debugLineNum = 19333160;BA.debugLine="ButtonDogumTarihi.TextSize = 14";
mostCurrent._buttondogumtarihi.setTextSize((float) (14));
RDebugUtils.currentLine=19333162;
 //BA.debugLineNum = 19333162;BA.debugLine="ButtonDogumYeri.TextColor = Color.koyuMavi";
mostCurrent._buttondogumyeri.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333163;
 //BA.debugLineNum = 19333163;BA.debugLine="ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttondogumyeri.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333164;
 //BA.debugLineNum = 19333164;BA.debugLine="ButtonDogumYeri.SingleLine = True";
mostCurrent._buttondogumyeri.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333165;
 //BA.debugLineNum = 19333165;BA.debugLine="ButtonDogumYeri.Text = \"DOĞUM YERİ\"";
mostCurrent._buttondogumyeri.setText(BA.ObjectToCharSequence("DOĞUM YERİ"));
RDebugUtils.currentLine=19333166;
 //BA.debugLineNum = 19333166;BA.debugLine="ButtonDogumYeri.TextSize = 14";
mostCurrent._buttondogumyeri.setTextSize((float) (14));
RDebugUtils.currentLine=19333168;
 //BA.debugLineNum = 19333168;BA.debugLine="ButtonBabaAdi.TextColor = Color.koyuMavi";
mostCurrent._buttonbabaadi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333169;
 //BA.debugLineNum = 19333169;BA.debugLine="ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonbabaadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333170;
 //BA.debugLineNum = 19333170;BA.debugLine="ButtonBabaAdi.SingleLine = True";
mostCurrent._buttonbabaadi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333171;
 //BA.debugLineNum = 19333171;BA.debugLine="ButtonBabaAdi.Text = \"BABA ADI\"";
mostCurrent._buttonbabaadi.setText(BA.ObjectToCharSequence("BABA ADI"));
RDebugUtils.currentLine=19333172;
 //BA.debugLineNum = 19333172;BA.debugLine="ButtonBabaAdi.TextSize = 14";
mostCurrent._buttonbabaadi.setTextSize((float) (14));
RDebugUtils.currentLine=19333174;
 //BA.debugLineNum = 19333174;BA.debugLine="ButtonEngelDurumu.TextColor= Color.koyuMavi";
mostCurrent._buttonengeldurumu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333175;
 //BA.debugLineNum = 19333175;BA.debugLine="ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD";
mostCurrent._buttonengeldurumu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333176;
 //BA.debugLineNum = 19333176;BA.debugLine="ButtonEngelDurumu.SingleLine= True";
mostCurrent._buttonengeldurumu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333177;
 //BA.debugLineNum = 19333177;BA.debugLine="ButtonEngelDurumu.Text= \"ENGEL DURUMU\"";
mostCurrent._buttonengeldurumu.setText(BA.ObjectToCharSequence("ENGEL DURUMU"));
RDebugUtils.currentLine=19333178;
 //BA.debugLineNum = 19333178;BA.debugLine="ButtonEngelDurumu.TextSize= 14";
mostCurrent._buttonengeldurumu.setTextSize((float) (14));
RDebugUtils.currentLine=19333180;
 //BA.debugLineNum = 19333180;BA.debugLine="ButtonTakimOkul.TextColor = Color.koyuMavi";
mostCurrent._buttontakimokul.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333181;
 //BA.debugLineNum = 19333181;BA.debugLine="ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontakimokul.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333182;
 //BA.debugLineNum = 19333182;BA.debugLine="ButtonTakimOkul.SingleLine = True";
mostCurrent._buttontakimokul.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333183;
 //BA.debugLineNum = 19333183;BA.debugLine="ButtonTakimOkul.Text = \"TAKIM/OKUL\"";
mostCurrent._buttontakimokul.setText(BA.ObjectToCharSequence("TAKIM/OKUL"));
RDebugUtils.currentLine=19333184;
 //BA.debugLineNum = 19333184;BA.debugLine="ButtonTakimOkul.TextSize = 14";
mostCurrent._buttontakimokul.setTextSize((float) (14));
RDebugUtils.currentLine=19333186;
 //BA.debugLineNum = 19333186;BA.debugLine="ButtonBransSinif.TextColor = Color.koyuMavi";
mostCurrent._buttonbranssinif.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333187;
 //BA.debugLineNum = 19333187;BA.debugLine="ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonbranssinif.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333188;
 //BA.debugLineNum = 19333188;BA.debugLine="ButtonBransSinif.SingleLine = True";
mostCurrent._buttonbranssinif.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333189;
 //BA.debugLineNum = 19333189;BA.debugLine="ButtonBransSinif.Text = \"BRANŞ/SINIF\"";
mostCurrent._buttonbranssinif.setText(BA.ObjectToCharSequence("BRANŞ/SINIF"));
RDebugUtils.currentLine=19333190;
 //BA.debugLineNum = 19333190;BA.debugLine="ButtonBransSinif.TextSize = 14";
mostCurrent._buttonbranssinif.setTextSize((float) (14));
RDebugUtils.currentLine=19333192;
 //BA.debugLineNum = 19333192;BA.debugLine="ButtonMevki.TextColor = Color.koyuMavi";
mostCurrent._buttonmevki.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=19333193;
 //BA.debugLineNum = 19333193;BA.debugLine="ButtonMevki.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonmevki.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=19333194;
 //BA.debugLineNum = 19333194;BA.debugLine="ButtonMevki.SingleLine = True";
mostCurrent._buttonmevki.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333195;
 //BA.debugLineNum = 19333195;BA.debugLine="ButtonMevki.Text = \"MEVKİ\"";
mostCurrent._buttonmevki.setText(BA.ObjectToCharSequence("MEVKİ"));
RDebugUtils.currentLine=19333196;
 //BA.debugLineNum = 19333196;BA.debugLine="ButtonMevki.TextSize = 14";
mostCurrent._buttonmevki.setTextSize((float) (14));
RDebugUtils.currentLine=19333200;
 //BA.debugLineNum = 19333200;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=19333202;
 //BA.debugLineNum = 19333202;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek\")";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek")));
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekisim))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=19595274;
 //BA.debugLineNum = 19595274;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="testdenekara";
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbabaadi_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbabaadi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbabaadi_click", null));}
int _i = 0;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub ButtonBabaAdi_Click";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_babaAdi LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Baba Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekbaba))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=20054025;
 //BA.debugLineNum = 20054025;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=20054026;
 //BA.debugLineNum = 20054026;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Sub VeriAl";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="secilenDenek = rs.GetString(\"denek_id\")";
_secilendenek = mostCurrent._rs.GetString("denek_id");
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="denekTc = rs.GetString(\"denek_tc\")";
_denektc = mostCurrent._rs.GetString("denek_tc");
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="denekIsim = rs.GetString(\"denek_isim\")";
_denekisim = mostCurrent._rs.GetString("denek_isim");
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="denekCinsiyet= rs.GetString(\"cinsiyet_adi\")";
_denekcinsiyet = mostCurrent._rs.GetString("cinsiyet_adi");
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="denekDogumTarihi = rs.GetString(\"denek_dogumTarih";
_denekdogumtarihi = mostCurrent._rs.GetString("denek_dogumTarihi");
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="denekIl = rs.GetString(\"il_adi\")";
_denekil = mostCurrent._rs.GetString("il_adi");
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="denekBaba = rs.GetString(\"denek_babaAdi\")";
_denekbaba = mostCurrent._rs.GetString("denek_babaAdi");
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="denekEngel = rs.GetString(\"denek_engelDurumu\")";
_denekengel = mostCurrent._rs.GetString("denek_engelDurumu");
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="denekTakim = rs.GetString(\"denek_takimOkul\")";
_denektakim = mostCurrent._rs.GetString("denek_takimOkul");
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="denekBrans = rs.GetString(\"denek_bransSinif\")";
_denekbrans = mostCurrent._rs.GetString("denek_bransSinif");
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="denekMevki = rs.GetString(\"denek_mevki\")";
_denekmevki = mostCurrent._rs.GetString("denek_mevki");
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="denekImage = rs.GetBlob(\"denek_image\")";
_denekimage = mostCurrent._rs.GetBlob("denek_image");
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="Try";
try {RDebugUtils.currentLine=19529742;
 //BA.debugLineNum = 19529742;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="inputStream.InitializeFromBytesArray(denekImage,";
_inputstream.InitializeFromBytesArray(_denekimage,(int) (0),_denekimage.length);
RDebugUtils.currentLine=19529744;
 //BA.debugLineNum = 19529744;BA.debugLine="bmp.Initialize2(inputStream)";
_bmp.Initialize2((java.io.InputStream)(_inputstream.getObject()));
RDebugUtils.currentLine=19529745;
 //BA.debugLineNum = 19529745;BA.debugLine="inputStream.Close";
_inputstream.Close();
 } 
       catch (Exception e19) {
			processBA.setLastException(e19);RDebugUtils.currentLine=19529747;
 //BA.debugLineNum = 19529747;BA.debugLine="bmp = LoadBitmap(File.DirAssets, \"FotoKisi.png\")";
_bmp = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FotoKisi.png");
 };
RDebugUtils.currentLine=19529750;
 //BA.debugLineNum = 19529750;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbranssinif_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbranssinif_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbranssinif_click", null));}
int _i = 0;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Sub ButtonBransSinif_Click";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_bransSinif LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Branş/Sınıf: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekbrans))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=20250633;
 //BA.debugLineNum = 20250633;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=20250634;
 //BA.debugLineNum = 20250634;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncinsiyet_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttoncinsiyet_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttoncinsiyet_click", null));}
int _i = 0;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Sub ButtonCinsiyet_Click";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE cinsiyet_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Cinsiyet: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekcinsiyet))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumtarihi_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumtarihi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumtarihi_click", null));}
int _i = 0;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Sub ButtonDogumTarihi_Click";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_dogumTarihi LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Doğum Tarihi: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekdogumtarihi))+" ")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="End Sub";
return "";
}
public static String  _buttondogumyeri_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttondogumyeri_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttondogumyeri_click", null));}
int _i = 0;
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub ButtonDogumYeri_Click";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE il_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Doğum Yeri: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekil))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="End Sub";
return "";
}
public static String  _buttonengeldurumu_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonengeldurumu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonengeldurumu_click", null));}
int _i = 0;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Sub ButtonEngelDurumu_Click";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_engelDurumu LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Engel Durumu: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekengel))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="End Sub";
return "";
}
public static String  _buttonisim_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonisim_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonisim_click", null));}
int _i = 0;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Sub ButtonIsim_Click";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"Ad";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekisim))+" // TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmevki_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonmevki_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonmevki_click", null));}
int _i = 0;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Sub ButtonMevki_Click";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_mevki LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Mevki: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekmevki))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="End Sub";
return "";
}
public static String  _buttontakimokul_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontakimokul_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontakimokul_click", null));}
int _i = 0;
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Sub ButtonTakimOkul_Click";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_takimOkul LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek, $\"T";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+", // Takım/Okul: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektakim))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=20185098;
 //BA.debugLineNum = 20185098;BA.debugLine="End Sub";
return "";
}
public static String  _buttontc_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontc_click", null));}
int _i = 0;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Sub ButtonTc_Click";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' ")));
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Denek WHE";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_tc LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_isim LIKE '%"+mostCurrent._edittextara.getText()+"%' OR cinsiyet_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_dogumTarihi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR il_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_babaAdi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_engelDurumu LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_takimOkul LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_bransSinif LIKE '%"+mostCurrent._edittextara.getText()+"%' OR denek_mevki LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY denek_id DESC")));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="ListView1.AddTwoLinesAndBitmap(secilenDenek,$\"TC";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_secilendenek),BA.ObjectToCharSequence(("TC: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denektc))+" // Ad Soyad: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekisim))+" // Cinsiyet: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_denekcinsiyet))+"")),(android.graphics.Bitmap)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="EditTextAra.Text =\"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="testdenekara";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
int _i = 0;
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Dim rs As ResultSet";
mostCurrent._rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Denek WHER";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM Denek WHERE denek_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=20381701;
 //BA.debugLineNum = 20381701;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="Try";
try {RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="VeriAl";
_verial();
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("220381705",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }
};
RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="Log(secilenDenek)";
anywheresoftware.b4a.keywords.Common.LogImpl("220381711",_secilendenek,0);
RDebugUtils.currentLine=20381713;
 //BA.debugLineNum = 20381713;BA.debugLine="If TestMenu.yapilacakTest = \"Antropometrik\" Then";
if ((mostCurrent._testmenu._yapilacaktest /*String*/ ).equals("Antropometrik")) { 
RDebugUtils.currentLine=20381714;
 //BA.debugLineNum = 20381714;BA.debugLine="StartActivity(AntropometrikEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antropometrikekle.getObject()));
 }else 
{RDebugUtils.currentLine=20381715;
 //BA.debugLineNum = 20381715;BA.debugLine="Else If TestMenu.yapilacakTest  =\"Biyokimyasal\" T";
if ((mostCurrent._testmenu._yapilacaktest /*String*/ ).equals("Biyokimyasal")) { 
RDebugUtils.currentLine=20381716;
 //BA.debugLineNum = 20381716;BA.debugLine="StartActivity(BiyokimyasalEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._biyokimyasalekle.getObject()));
 }else 
{RDebugUtils.currentLine=20381717;
 //BA.debugLineNum = 20381717;BA.debugLine="Else If TestMenu.yapilacakTest = \"Psikolojik\"  Th";
if ((mostCurrent._testmenu._yapilacaktest /*String*/ ).equals("Psikolojik")) { 
RDebugUtils.currentLine=20381718;
 //BA.debugLineNum = 20381718;BA.debugLine="StartActivity(PsikolojikEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._psikolojikekle.getObject()));
 }else 
{RDebugUtils.currentLine=20381719;
 //BA.debugLineNum = 20381719;BA.debugLine="Else If TestMenu.yapilacakTest = \"MotorOzellik\" T";
if ((mostCurrent._testmenu._yapilacaktest /*String*/ ).equals("MotorOzellik")) { 
RDebugUtils.currentLine=20381720;
 //BA.debugLineNum = 20381720;BA.debugLine="If MotorOzellikMenu.yapilacakMotorOzellikTest =";
if ((mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*String*/ ).equals("SuratTest")) { 
RDebugUtils.currentLine=20381721;
 //BA.debugLineNum = 20381721;BA.debugLine="StartActivity(SuratTestAyar)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._surattestayar.getObject()));
 }else 
{RDebugUtils.currentLine=20381722;
 //BA.debugLineNum = 20381722;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
if ((mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*String*/ ).equals("DayaniklilikTest")) { 
 }else 
{RDebugUtils.currentLine=20381725;
 //BA.debugLineNum = 20381725;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
if ((mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*String*/ ).equals("DikeySicramaTest")) { 
 }else 
{RDebugUtils.currentLine=20381726;
 //BA.debugLineNum = 20381726;BA.debugLine="Else If MotorOzellikMenu.yapilacakMotorOzellikTe";
if ((mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*String*/ ).equals("DengeTest")) { 
 }else 
{RDebugUtils.currentLine=20381727;
 //BA.debugLineNum = 20381727;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
if ((mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*String*/ ).equals("KuvvetTest")) { 
 }else 
{RDebugUtils.currentLine=20381728;
 //BA.debugLineNum = 20381728;BA.debugLine="Else if MotorOzellikMenu.yapilacakMotorOzellikTe";
if ((mostCurrent._motorozellikmenu._yapilacakmotorozelliktest /*String*/ ).equals("ReaksiyonTest")) { 
 }else {
RDebugUtils.currentLine=20381730;
 //BA.debugLineNum = 20381730;BA.debugLine="ToastMessageShow(\"motor özellik testleri menüsü";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("motor özellik testleri menüsünden seçim yapılamadı"),anywheresoftware.b4a.keywords.Common.True);
 }}}}}}
;
 }else 
{RDebugUtils.currentLine=20381732;
 //BA.debugLineNum = 20381732;BA.debugLine="Else If TestMenu.yapilacakTest = \"AntranorGorusle";
if ((mostCurrent._testmenu._yapilacaktest /*String*/ ).equals("AntranorGorusleri")) { 
RDebugUtils.currentLine=20381733;
 //BA.debugLineNum = 20381733;BA.debugLine="StartActivity(AntranorGorusEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._antranorgorusekle.getObject()));
 }else 
{RDebugUtils.currentLine=20381734;
 //BA.debugLineNum = 20381734;BA.debugLine="Else If TestMenu.yapilacakTest = \"SaglikBilgileri";
if ((mostCurrent._testmenu._yapilacaktest /*String*/ ).equals("SaglikBilgileri")) { 
RDebugUtils.currentLine=20381735;
 //BA.debugLineNum = 20381735;BA.debugLine="StartActivity(SaglikBilgileriEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._saglikbilgileriekle.getObject()));
 }else {
RDebugUtils.currentLine=20381737;
 //BA.debugLineNum = 20381737;BA.debugLine="ToastMessageShow(\"Test menüsünden seçim yapılama";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Test menüsünden seçim yapılamadı"),anywheresoftware.b4a.keywords.Common.True);
 }}}}}}
;
RDebugUtils.currentLine=20381740;
 //BA.debugLineNum = 20381740;BA.debugLine="End Sub";
return "";
}
}