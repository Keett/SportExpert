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

public class programsec extends Activity implements B4AActivity{
	public static programsec mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.programsec");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (programsec).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.programsec");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.programsec", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (programsec) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (programsec) Resume **");
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
		return programsec.class;
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
        BA.LogInfo("** Activity (programsec) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            programsec mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (programsec) Resume **");
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
public static int _secilenprogramid = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonanasayfa = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextara = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcarpi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonprogramekle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonprogramadi = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontestturu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontarih = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlevel = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static int _programid = 0;
public static int _level = 0;
public static String _programadi = "";
public static String _testturu = "";
public static String _tarih = "";
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
public b4a.example3.psikolojikekle _psikolojikekle = null;
public b4a.example3.starter _starter = null;
public b4a.example3.saglikbilgileriekle _saglikbilgileriekle = null;
public b4a.example3.dikeysicramatest _dikeysicramatest = null;
public b4a.example3.dengetest _dengetest = null;
public b4a.example3.kuvvettest _kuvvettest = null;
public b4a.example3.reaksiyontest _reaksiyontest = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="Activity.LoadLayout(\"ProgramSecPage\")";
mostCurrent._activity.LoadLayout("ProgramSecPage",mostCurrent.activityBA);
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=47775750;
 //BA.debugLineNum = 47775750;BA.debugLine="ListView1.TwoLinesLayout.Label.Visible = False";
mostCurrent._listview1.getTwoLinesLayout().Label.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=47775751;
 //BA.debugLineNum = 47775751;BA.debugLine="ListView1.TwoLinesLayout.SecondLabel.TextColor =";
mostCurrent._listview1.getTwoLinesLayout().SecondLabel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=47775752;
 //BA.debugLineNum = 47775752;BA.debugLine="ListView1.TwoLinesLayout.SecondLabel.TextSize = 2";
mostCurrent._listview1.getTwoLinesLayout().SecondLabel.setTextSize((float) (20));
RDebugUtils.currentLine=47775753;
 //BA.debugLineNum = 47775753;BA.debugLine="SetDivider(ListView1, Color.acikMavi, 3dip)";
_setdivider(mostCurrent._listview1,mostCurrent._color._acikmavi /*int*/ ,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=47775755;
 //BA.debugLineNum = 47775755;BA.debugLine="EditTextAra.TextColor = Colors.White";
mostCurrent._edittextara.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=47775756;
 //BA.debugLineNum = 47775756;BA.debugLine="EditTextAra.Hint = \"Bu alana yazarak aratabilirsi";
mostCurrent._edittextara.setHint("Bu alana yazarak aratabilirsiniz..");
RDebugUtils.currentLine=47775757;
 //BA.debugLineNum = 47775757;BA.debugLine="EditTextAra.HintColor = Color.hintColor";
mostCurrent._edittextara.setHintColor(mostCurrent._color._hintcolor /*int*/ );
RDebugUtils.currentLine=47775758;
 //BA.debugLineNum = 47775758;BA.debugLine="EditTextAra.TextSize = 20";
mostCurrent._edittextara.setTextSize((float) (20));
RDebugUtils.currentLine=47775759;
 //BA.debugLineNum = 47775759;BA.debugLine="EditTextAra.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._edittextara.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=47775761;
 //BA.debugLineNum = 47775761;BA.debugLine="ButtonProgramAdi.TextColor = Color.koyuMavi";
mostCurrent._buttonprogramadi.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=47775762;
 //BA.debugLineNum = 47775762;BA.debugLine="ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonprogramadi.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=47775763;
 //BA.debugLineNum = 47775763;BA.debugLine="ButtonProgramAdi.TextSize = 14";
mostCurrent._buttonprogramadi.setTextSize((float) (14));
RDebugUtils.currentLine=47775764;
 //BA.debugLineNum = 47775764;BA.debugLine="ButtonProgramAdi.SingleLine = True";
mostCurrent._buttonprogramadi.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=47775765;
 //BA.debugLineNum = 47775765;BA.debugLine="ButtonTestTuru.TextColor = Color.koyuMavi";
mostCurrent._buttontestturu.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=47775766;
 //BA.debugLineNum = 47775766;BA.debugLine="ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontestturu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=47775767;
 //BA.debugLineNum = 47775767;BA.debugLine="ButtonTestTuru.TextSize = 14";
mostCurrent._buttontestturu.setTextSize((float) (14));
RDebugUtils.currentLine=47775768;
 //BA.debugLineNum = 47775768;BA.debugLine="ButtonTestTuru.SingleLine = True";
mostCurrent._buttontestturu.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=47775770;
 //BA.debugLineNum = 47775770;BA.debugLine="ButtonTarih.TextColor = Color.koyuMavi";
mostCurrent._buttontarih.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=47775771;
 //BA.debugLineNum = 47775771;BA.debugLine="ButtonTarih.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttontarih.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=47775772;
 //BA.debugLineNum = 47775772;BA.debugLine="ButtonTarih.Text = \"TARİH\"";
mostCurrent._buttontarih.setText(BA.ObjectToCharSequence("TARİH"));
RDebugUtils.currentLine=47775773;
 //BA.debugLineNum = 47775773;BA.debugLine="ButtonTarih.TextSize = 14";
mostCurrent._buttontarih.setTextSize((float) (14));
RDebugUtils.currentLine=47775774;
 //BA.debugLineNum = 47775774;BA.debugLine="ButtonTarih.SingleLine = True";
mostCurrent._buttontarih.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=47775776;
 //BA.debugLineNum = 47775776;BA.debugLine="ButtonLevel.TextColor = Color.koyuMavi";
mostCurrent._buttonlevel.setTextColor(mostCurrent._color._koyumavi /*int*/ );
RDebugUtils.currentLine=47775777;
 //BA.debugLineNum = 47775777;BA.debugLine="ButtonLevel.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._buttonlevel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=47775778;
 //BA.debugLineNum = 47775778;BA.debugLine="ButtonLevel.Text = \"LEVEL\"";
mostCurrent._buttonlevel.setText(BA.ObjectToCharSequence("LEVEL"));
RDebugUtils.currentLine=47775779;
 //BA.debugLineNum = 47775779;BA.debugLine="ButtonLevel.TextSize = 14";
mostCurrent._buttonlevel.setTextSize((float) (14));
RDebugUtils.currentLine=47775780;
 //BA.debugLineNum = 47775780;BA.debugLine="ButtonLevel.SingleLine = True";
mostCurrent._buttonlevel.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=47775782;
 //BA.debugLineNum = 47775782;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=47775783;
 //BA.debugLineNum = 47775783;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.objects.ListViewWrapper _lv,int _renk,int _height) throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdivider", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdivider", new Object[] {_lv,_renk,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Sub SetDivider(lv As ListView, Renk As Int, Height";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=48693252;
 //BA.debugLineNum = 48693252;BA.debugLine="CD.Initialize(Renk, 0)";
_cd.Initialize(_renk,(int) (0));
RDebugUtils.currentLine=48693253;
 //BA.debugLineNum = 48693253;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD), A";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=48693254;
 //BA.debugLineNum = 48693254;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=48693255;
 //BA.debugLineNum = 48693255;BA.debugLine="End Sub";
return "";
}
public static String  _listviewgosterdb() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewgosterdb", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewgosterdb", null));}
int _i = 0;
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Sub ListViewGosterDB";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=48037890;
 //BA.debugLineNum = 48037890;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC")));
RDebugUtils.currentLine=48037891;
 //BA.debugLineNum = 48037891;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=48037892;
 //BA.debugLineNum = 48037892;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=48037893;
 //BA.debugLineNum = 48037893;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=48037894;
 //BA.debugLineNum = 48037894;BA.debugLine="ListView1.AddTwoLines(programId,$\"Program Adı: $";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_programid),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" ")));
 }
};
RDebugUtils.currentLine=48037896;
 //BA.debugLineNum = 48037896;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="programsec";
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=47841282;
 //BA.debugLineNum = 47841282;BA.debugLine="End Sub";
return "";
}
public static String  _buttonanasayfa_click() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonanasayfa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonanasayfa_click", null));}
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Sub ButtonAnasayfa_Click";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlevel_click() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonlevel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonlevel_click", null));}
int _i = 0;
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Sub ButtonLevel_Click";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE level LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=48562180;
 //BA.debugLineNum = 48562180;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=48562181;
 //BA.debugLineNum = 48562181;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=48562182;
 //BA.debugLineNum = 48562182;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=48562183;
 //BA.debugLineNum = 48562183;BA.debugLine="ListView1.AddTwoLines(programId,$\"Level: ${level";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_programid),BA.ObjectToCharSequence(("Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" //// Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+"")));
 }
};
RDebugUtils.currentLine=48562185;
 //BA.debugLineNum = 48562185;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=48562186;
 //BA.debugLineNum = 48562186;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Sub VeriAl";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="programId= rs.GetInt(\"program_id\")";
_programid = mostCurrent._rs.GetInt("program_id");
RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="programAdi = rs.GetString(\"program_adi\")";
mostCurrent._programadi = mostCurrent._rs.GetString("program_adi");
RDebugUtils.currentLine=47972355;
 //BA.debugLineNum = 47972355;BA.debugLine="testTuru = rs.GetString(\"program_testTuru\")";
mostCurrent._testturu = mostCurrent._rs.GetString("program_testTuru");
RDebugUtils.currentLine=47972356;
 //BA.debugLineNum = 47972356;BA.debugLine="level = rs.GetInt(\"level\")";
_level = mostCurrent._rs.GetInt("level");
RDebugUtils.currentLine=47972357;
 //BA.debugLineNum = 47972357;BA.debugLine="tarih = rs.GetString(\"program_tarih\")";
mostCurrent._tarih = mostCurrent._rs.GetString("program_tarih");
RDebugUtils.currentLine=47972358;
 //BA.debugLineNum = 47972358;BA.debugLine="End Sub";
return "";
}
public static String  _buttonprogramadi_click() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonprogramadi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonprogramadi_click", null));}
int _i = 0;
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Sub ButtonProgramAdi_Click";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=48365572;
 //BA.debugLineNum = 48365572;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=48365573;
 //BA.debugLineNum = 48365573;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=48365574;
 //BA.debugLineNum = 48365574;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=48365575;
 //BA.debugLineNum = 48365575;BA.debugLine="ListView1.AddTwoLines(programId,$\"Program Adı: $";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_programid),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+"")));
 }
};
RDebugUtils.currentLine=48365577;
 //BA.debugLineNum = 48365577;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=48365578;
 //BA.debugLineNum = 48365578;BA.debugLine="End Sub";
return "";
}
public static String  _buttonprogramekle_click() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonprogramekle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonprogramekle_click", null));}
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Sub ButtonProgramEkle_Click";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="StartActivity(ProgramAyar)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programayar.getObject()));
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=48300035;
 //BA.debugLineNum = 48300035;BA.debugLine="End Sub";
return "";
}
public static String  _buttontarih_click() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontarih_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontarih_click", null));}
int _i = 0;
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Sub ButtonTarih_Click";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=48496644;
 //BA.debugLineNum = 48496644;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=48496645;
 //BA.debugLineNum = 48496645;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=48496646;
 //BA.debugLineNum = 48496646;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=48496647;
 //BA.debugLineNum = 48496647;BA.debugLine="ListView1.AddTwoLines(programId,$\"Tarih: ${tarih";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_programid),BA.ObjectToCharSequence(("Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+"")));
 }
};
RDebugUtils.currentLine=48496649;
 //BA.debugLineNum = 48496649;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=48496650;
 //BA.debugLineNum = 48496650;BA.debugLine="End Sub";
return "";
}
public static String  _buttontestturu_click() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttontestturu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttontestturu_click", null));}
int _i = 0;
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Sub ButtonTestTuru_Click";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_testTuru LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC ")));
RDebugUtils.currentLine=48431108;
 //BA.debugLineNum = 48431108;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=48431109;
 //BA.debugLineNum = 48431109;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=48431110;
 //BA.debugLineNum = 48431110;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=48431111;
 //BA.debugLineNum = 48431111;BA.debugLine="ListView1.AddTwoLines(programId,$\"Level: ${level";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_programid),BA.ObjectToCharSequence(("Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+"")));
 }
};
RDebugUtils.currentLine=48431113;
 //BA.debugLineNum = 48431113;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=48431114;
 //BA.debugLineNum = 48431114;BA.debugLine="End Sub";
return "";
}
public static String  _edittextara_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextara_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextara_textchanged", new Object[] {_old,_new}));}
int _i = 0;
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Sub EditTextAra_TextChanged (Old As String, New As";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="LabelCarpi.Visible = True";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=48168963;
 //BA.debugLineNum = 48168963;BA.debugLine="rs = Main.sql.ExecQuery( \"SELECT * FROM Dayanikli";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_testTuru LIKE '%"+mostCurrent._edittextara.getText()+"%' OR level LIKE '%"+mostCurrent._edittextara.getText()+"%' OR program_tarih LIKE '%"+mostCurrent._edittextara.getText()+"%' ORDER BY program_id DESC")));
RDebugUtils.currentLine=48168965;
 //BA.debugLineNum = 48168965;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=48168966;
 //BA.debugLineNum = 48168966;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=48168967;
 //BA.debugLineNum = 48168967;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=48168968;
 //BA.debugLineNum = 48168968;BA.debugLine="ListView1.AddTwoLines(programId,$\"Program Adı: $";
mostCurrent._listview1.AddTwoLines(BA.ObjectToCharSequence(_programid),BA.ObjectToCharSequence(("Program Adı: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._programadi))+" // Test Türü: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._testturu))+" // Level: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_level))+" // Tarih: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tarih))+"")));
 }
};
RDebugUtils.currentLine=48168970;
 //BA.debugLineNum = 48168970;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=48168971;
 //BA.debugLineNum = 48168971;BA.debugLine="If EditTextAra.Text = \"\" Then";
if ((mostCurrent._edittextara.getText()).equals("")) { 
RDebugUtils.currentLine=48168972;
 //BA.debugLineNum = 48168972;BA.debugLine="LabelCarpi.Visible = False";
mostCurrent._labelcarpi.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=48168974;
 //BA.debugLineNum = 48168974;BA.debugLine="End Sub";
return "";
}
public static String  _labelcarpi_click() throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelcarpi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labelcarpi_click", null));}
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Sub LabelCarpi_Click";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="EditTextAra.SelectAll";
mostCurrent._edittextara.SelectAll();
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="EditTextAra.Text = \"\"";
mostCurrent._edittextara.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="ListViewGosterDB";
_listviewgosterdb();
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="programsec";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}));}
int _i = 0;
int _result = 0;
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="rs = Main.sql.ExecQuery(\"SELECT * FROM Dayaniklil";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_id = '"+BA.ObjectToString(_value)+"' ")));
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="For i=0 To rs.RowCount-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._rs.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=48627716;
 //BA.debugLineNum = 48627716;BA.debugLine="rs.Position = i";
mostCurrent._rs.setPosition(_i);
RDebugUtils.currentLine=48627717;
 //BA.debugLineNum = 48627717;BA.debugLine="programId = rs.GetInt(\"program_id\")";
_programid = mostCurrent._rs.GetInt("program_id");
 }
};
RDebugUtils.currentLine=48627719;
 //BA.debugLineNum = 48627719;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=48627721;
 //BA.debugLineNum = 48627721;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=48627722;
 //BA.debugLineNum = 48627722;BA.debugLine="result = Msgbox2(\"Programı seçmek istediğinizden";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Programı seçmek istediğinizden emin misiniz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=48627723;
 //BA.debugLineNum = 48627723;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=48627724;
 //BA.debugLineNum = 48627724;BA.debugLine="secilenProgramId = programId";
_secilenprogramid = _programid;
RDebugUtils.currentLine=48627725;
 //BA.debugLineNum = 48627725;BA.debugLine="StartActivity(DayaniklilikTestEkle)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._dayanikliliktestekle.getObject()));
 }else 
{RDebugUtils.currentLine=48627726;
 //BA.debugLineNum = 48627726;BA.debugLine="Else if result = DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=48627727;
 //BA.debugLineNum = 48627727;BA.debugLine="ToastMessageShow(\"Devam etmek için program seçme";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Devam etmek için program seçmelisiniz"),anywheresoftware.b4a.keywords.Common.True);
 }}
;
RDebugUtils.currentLine=48627729;
 //BA.debugLineNum = 48627729;BA.debugLine="End Sub";
return "";
}
}