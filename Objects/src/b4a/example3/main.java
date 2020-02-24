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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (antranorgorussil.mostCurrent != null);
vis = vis | (antranorgoruslistele.mostCurrent != null);
vis = vis | (dayanikliliktestlistele.mostCurrent != null);
vis = vis | (dayanikliliktestsil.mostCurrent != null);
vis = vis | (dayanikliliktestekle.mostCurrent != null);
vis = vis | (gelismistestdenekara.mostCurrent != null);
vis = vis | (programayar.mostCurrent != null);
vis = vis | (surattestlistele.mostCurrent != null);
vis = vis | (deneklistele.mostCurrent != null);
vis = vis | (antranorgorusekle.mostCurrent != null);
vis = vis | (programveri.mostCurrent != null);
vis = vis | (testdenekara.mostCurrent != null);
vis = vis | (denekekleguncelle.mostCurrent != null);
vis = vis | (dayanikliliktestmenu.mostCurrent != null);
vis = vis | (programlistele.mostCurrent != null);
vis = vis | (programsil.mostCurrent != null);
vis = vis | (surattestayar.mostCurrent != null);
vis = vis | (surattestekle.mostCurrent != null);
vis = vis | (surattestsil.mostCurrent != null);
vis = vis | (denekduzenlesil.mostCurrent != null);
vis = vis | (antropometriklistele.mostCurrent != null);
vis = vis | (saglikbilgilerisil.mostCurrent != null);
vis = vis | (testmenu.mostCurrent != null);
vis = vis | (motorozellikmenu.mostCurrent != null);
vis = vis | (saglikbilgilerilistele.mostCurrent != null);
vis = vis | (biyokimyasalekle.mostCurrent != null);
vis = vis | (antropometrikekle.mostCurrent != null);
vis = vis | (anamenu.mostCurrent != null);
vis = vis | (biyokimyasallistele.mostCurrent != null);
vis = vis | (biyokimyasalsil.mostCurrent != null);
vis = vis | (psikolojiksil.mostCurrent != null);
vis = vis | (psikolojiklistele.mostCurrent != null);
vis = vis | (antropometriksil.mostCurrent != null);
vis = vis | (psikolojikekle.mostCurrent != null);
vis = vis | (saglikbilgileriekle.mostCurrent != null);
vis = vis | (dikeysicramatest.mostCurrent != null);
vis = vis | (dengetest.mostCurrent != null);
vis = vis | (kuvvettest.mostCurrent != null);
vis = vis | (reaksiyontest.mostCurrent != null);
vis = vis | (programsec.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (antranorgorussil.previousOne != null) {
				__a = antranorgorussil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(antranorgorussil.mostCurrent == null ? null : antranorgorussil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (antranorgoruslistele.previousOne != null) {
				__a = antranorgoruslistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(antranorgoruslistele.mostCurrent == null ? null : antranorgoruslistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (dayanikliliktestlistele.previousOne != null) {
				__a = dayanikliliktestlistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(dayanikliliktestlistele.mostCurrent == null ? null : dayanikliliktestlistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (dayanikliliktestsil.previousOne != null) {
				__a = dayanikliliktestsil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(dayanikliliktestsil.mostCurrent == null ? null : dayanikliliktestsil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (dayanikliliktestekle.previousOne != null) {
				__a = dayanikliliktestekle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(dayanikliliktestekle.mostCurrent == null ? null : dayanikliliktestekle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (gelismistestdenekara.previousOne != null) {
				__a = gelismistestdenekara.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(gelismistestdenekara.mostCurrent == null ? null : gelismistestdenekara.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (programayar.previousOne != null) {
				__a = programayar.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(programayar.mostCurrent == null ? null : programayar.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (surattestlistele.previousOne != null) {
				__a = surattestlistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(surattestlistele.mostCurrent == null ? null : surattestlistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (deneklistele.previousOne != null) {
				__a = deneklistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(deneklistele.mostCurrent == null ? null : deneklistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (antranorgorusekle.previousOne != null) {
				__a = antranorgorusekle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(antranorgorusekle.mostCurrent == null ? null : antranorgorusekle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (programveri.previousOne != null) {
				__a = programveri.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(programveri.mostCurrent == null ? null : programveri.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (testdenekara.previousOne != null) {
				__a = testdenekara.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(testdenekara.mostCurrent == null ? null : testdenekara.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (denekekleguncelle.previousOne != null) {
				__a = denekekleguncelle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(denekekleguncelle.mostCurrent == null ? null : denekekleguncelle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (dayanikliliktestmenu.previousOne != null) {
				__a = dayanikliliktestmenu.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(dayanikliliktestmenu.mostCurrent == null ? null : dayanikliliktestmenu.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (programlistele.previousOne != null) {
				__a = programlistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(programlistele.mostCurrent == null ? null : programlistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (programsil.previousOne != null) {
				__a = programsil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(programsil.mostCurrent == null ? null : programsil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (surattestayar.previousOne != null) {
				__a = surattestayar.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(surattestayar.mostCurrent == null ? null : surattestayar.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (surattestekle.previousOne != null) {
				__a = surattestekle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(surattestekle.mostCurrent == null ? null : surattestekle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (surattestsil.previousOne != null) {
				__a = surattestsil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(surattestsil.mostCurrent == null ? null : surattestsil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, sesservice.class));
 {
            Activity __a = null;
            if (denekduzenlesil.previousOne != null) {
				__a = denekduzenlesil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(denekduzenlesil.mostCurrent == null ? null : denekduzenlesil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (antropometriklistele.previousOne != null) {
				__a = antropometriklistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(antropometriklistele.mostCurrent == null ? null : antropometriklistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (saglikbilgilerisil.previousOne != null) {
				__a = saglikbilgilerisil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(saglikbilgilerisil.mostCurrent == null ? null : saglikbilgilerisil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (testmenu.previousOne != null) {
				__a = testmenu.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(testmenu.mostCurrent == null ? null : testmenu.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (motorozellikmenu.previousOne != null) {
				__a = motorozellikmenu.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(motorozellikmenu.mostCurrent == null ? null : motorozellikmenu.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (saglikbilgilerilistele.previousOne != null) {
				__a = saglikbilgilerilistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(saglikbilgilerilistele.mostCurrent == null ? null : saglikbilgilerilistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (biyokimyasalekle.previousOne != null) {
				__a = biyokimyasalekle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(biyokimyasalekle.mostCurrent == null ? null : biyokimyasalekle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (antropometrikekle.previousOne != null) {
				__a = antropometrikekle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(antropometrikekle.mostCurrent == null ? null : antropometrikekle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (anamenu.previousOne != null) {
				__a = anamenu.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(anamenu.mostCurrent == null ? null : anamenu.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (biyokimyasallistele.previousOne != null) {
				__a = biyokimyasallistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(biyokimyasallistele.mostCurrent == null ? null : biyokimyasallistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (biyokimyasalsil.previousOne != null) {
				__a = biyokimyasalsil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(biyokimyasalsil.mostCurrent == null ? null : biyokimyasalsil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (psikolojiksil.previousOne != null) {
				__a = psikolojiksil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(psikolojiksil.mostCurrent == null ? null : psikolojiksil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (psikolojiklistele.previousOne != null) {
				__a = psikolojiklistele.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(psikolojiklistele.mostCurrent == null ? null : psikolojiklistele.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (antropometriksil.previousOne != null) {
				__a = antropometriksil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(antropometriksil.mostCurrent == null ? null : antropometriksil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (psikolojikekle.previousOne != null) {
				__a = psikolojikekle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(psikolojikekle.mostCurrent == null ? null : psikolojikekle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (saglikbilgileriekle.previousOne != null) {
				__a = saglikbilgileriekle.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(saglikbilgileriekle.mostCurrent == null ? null : saglikbilgileriekle.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (dikeysicramatest.previousOne != null) {
				__a = dikeysicramatest.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(dikeysicramatest.mostCurrent == null ? null : dikeysicramatest.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (dengetest.previousOne != null) {
				__a = dengetest.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(dengetest.mostCurrent == null ? null : dengetest.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (kuvvettest.previousOne != null) {
				__a = kuvvettest.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(kuvvettest.mostCurrent == null ? null : kuvvettest.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (reaksiyontest.previousOne != null) {
				__a = reaksiyontest.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(reaksiyontest.mostCurrent == null ? null : reaksiyontest.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (programsec.previousOne != null) {
				__a = programsec.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(programsec.mostCurrent == null ? null : programsec.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql = null;
public static String _status = "";
public b4a.example.dateutils _dateutils = null;
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
public b4a.example3.programsec _programsec = null;
public static String  _activity_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_click", null));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Sub Activity_Click";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="End Sub";
return "";
}
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example3.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.example3.main parent;
boolean _firsttime;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If FirstTime Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_firsttime) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="sql.Initialize(File.DirDefaultExternal, \"SE_Data";
parent._sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"SE_DatabaseVs1.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="If DBUtils.TableExists(sql, \"Denek\") = False The";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent._dbutils._tableexists /*boolean*/ (mostCurrent.activityBA,parent._sql,"Denek")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Wait For (TabloOlustur) Complete (Success As Bo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "activity_create"), _tabloolustur());
this.state = 9;
return;
case 9:
//C
this.state = 7;
_success = (Boolean) result[0];
;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="TabloDoldur";
_tablodoldur();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Activity.LoadLayout(\"GirisPage\")";
parent.mostCurrent._activity.LoadLayout("GirisPage",mostCurrent.activityBA);
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="Sleep(3000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "activity_create"),(int) (3000));
this.state = 10;
return;
case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="StartActivity(AnaMenu)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._anamenu.getObject()));
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tabloolustur() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabloolustur", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "tabloolustur", null));}
ResumableSub_TabloOlustur rsub = new ResumableSub_TabloOlustur(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TabloOlustur extends BA.ResumableSub {
public ResumableSub_TabloOlustur(b4a.example3.main parent) {
this.parent = parent;
}
b4a.example3.main parent;
Object _basarilimi = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Cinsiyet\")";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Cinsiyet");
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Iller\")";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Iller");
RDebugUtils.currentLine=27656195;
 //BA.debugLineNum = 27656195;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Gun\")";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Gun");
RDebugUtils.currentLine=27656196;
 //BA.debugLineNum = 27656196;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Ay\")";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Ay");
RDebugUtils.currentLine=27656197;
 //BA.debugLineNum = 27656197;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Yil\")";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Yil");
RDebugUtils.currentLine=27656198;
 //BA.debugLineNum = 27656198;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Denek\")";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Denek");
RDebugUtils.currentLine=27656199;
 //BA.debugLineNum = 27656199;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Antropomet";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Antropometrik");
RDebugUtils.currentLine=27656200;
 //BA.debugLineNum = 27656200;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Biyokimyas";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Biyokimyasal");
RDebugUtils.currentLine=27656201;
 //BA.debugLineNum = 27656201;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Psikolojik";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS Psikolojik");
RDebugUtils.currentLine=27656202;
 //BA.debugLineNum = 27656202;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS SaglikBilg";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS SaglikBilgileri");
RDebugUtils.currentLine=27656203;
 //BA.debugLineNum = 27656203;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS AntranorGo";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS AntranorGorusleri");
RDebugUtils.currentLine=27656204;
 //BA.debugLineNum = 27656204;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS SuratTest\"";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS SuratTest");
RDebugUtils.currentLine=27656205;
 //BA.debugLineNum = 27656205;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Dayaniklil";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS DayaniklilikTestProgram");
RDebugUtils.currentLine=27656206;
 //BA.debugLineNum = 27656206;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE IF EXISTS Dayaniklil";
parent._sql.ExecNonQuery("DROP TABLE IF EXISTS DayaniklilikTest");
RDebugUtils.currentLine=27656209;
 //BA.debugLineNum = 27656209;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Cinsiyet(cinsiyet_";
parent._sql.ExecNonQuery("CREATE TABLE Cinsiyet(cinsiyet_id int NOT NULL, cinsiyet_adi varchar(10) NOT NULL, PRIMARY KEY(cinsiyet_id))");
RDebugUtils.currentLine=27656210;
 //BA.debugLineNum = 27656210;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Iller(il_id int NO";
parent._sql.ExecNonQuery("CREATE TABLE Iller(il_id int NOT NULL, il_adi varchar(50) NOT NULL, PRIMARY KEY(il_id))");
RDebugUtils.currentLine=27656211;
 //BA.debugLineNum = 27656211;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Gun(gun_id int NOT";
parent._sql.ExecNonQuery("CREATE TABLE Gun(gun_id int NOT NULL, gun int NOT NULL, PRIMARY KEY(gun_id))");
RDebugUtils.currentLine=27656212;
 //BA.debugLineNum = 27656212;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Ay(ay_id int NOT N";
parent._sql.ExecNonQuery("CREATE TABLE Ay(ay_id int NOT NULL, ay varchar(10) NOT NULL, PRIMARY KEY(ay_id))");
RDebugUtils.currentLine=27656213;
 //BA.debugLineNum = 27656213;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Yil(yil_id int NOT";
parent._sql.ExecNonQuery("CREATE TABLE Yil(yil_id int NOT NULL, yil int NOT NULL, PRIMARY KEY(yil_id))");
RDebugUtils.currentLine=27656215;
 //BA.debugLineNum = 27656215;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Denek (denek_id in";
parent._sql.ExecNonQuery("CREATE TABLE Denek (denek_id int NOT NULL, denek_tc bigint NOT NULL, denek_isim varchar(50) NOT NULL,cinsiyet_adi varchar(10), denek_dogumTarihi date ,il_adi varchar(50),denek_babaAdi varchar(50), denek_engelDurumu vachar(500) , denek_takimOkul varchar(500) , denek_bransSinif varchar(500) , denek_mevki varchar(500),denek_image blob, PRIMARY KEY(denek_id) FOREIGN KEY(cinsiyet_adi,il_adi) REFERENCES Cinsiyet(cinsiyet_adi,il_adi))");
RDebugUtils.currentLine=27656216;
 //BA.debugLineNum = 27656216;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Antropometrik (ant";
parent._sql.ExecNonQuery("CREATE TABLE Antropometrik (antropometrik_id int NOT NULL,denek_id int, antropometrik_tarih date,antropometrik_saat long, antropometrik_boy int ,antropometrik_kilo int ,antropometrik_elUzunlugu int, antropometrik_kulacUzunlugu int ,antropometrik_oturmaYuksekligi int,antropometrik_ayakUzunlugu int,antropometrik_deriKivrimKalinligi int, PRIMARY KEY(antropometrik_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))");
RDebugUtils.currentLine=27656217;
 //BA.debugLineNum = 27656217;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Biyokimyasal(biyok";
parent._sql.ExecNonQuery("CREATE TABLE Biyokimyasal(biyokimyasal_id int NOT NULL,denek_id int,biyokimyasal_tarih date,biyokimyasal_saat long, biyokimyasal_aciklama varchar(500),PRIMARY KEY (biyokimyasal_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))");
RDebugUtils.currentLine=27656218;
 //BA.debugLineNum = 27656218;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE Psikolojik( psikol";
parent._sql.ExecNonQuery("CREATE TABLE Psikolojik( psikolojik_id int NOT NULL, denek_id int, psikolojik_tarih date, psikolojik_saat long, psikolojik_aciklama varchar(500),  PRIMARY KEY (psikolojik_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))");
RDebugUtils.currentLine=27656219;
 //BA.debugLineNum = 27656219;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE SaglikBilgileri(sa";
parent._sql.ExecNonQuery("CREATE TABLE SaglikBilgileri(saglikBilgileri_id int Not Null, denek_id int, saglikBilgileri_tarih date,saglikBilgileri_saat long, saglikBilgileri_hastalikSakatlik varchar(500), saglikBilgileri_aciklama varchar(500), PRIMARY KEY (saglikBilgileri_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))");
RDebugUtils.currentLine=27656220;
 //BA.debugLineNum = 27656220;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE AntranorGorusleri(";
parent._sql.ExecNonQuery("CREATE TABLE AntranorGorusleri(antranorGorüsleri_id int Not Null, denek_id int, antranorGorüsleri_tarih date, antranorGorüsleri_saat long, antranorGorüsleri_aciklama varchar(500), PRIMARY KEY (antranorGorüsleri_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))");
RDebugUtils.currentLine=27656221;
 //BA.debugLineNum = 27656221;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE SuratTest(surat_id";
parent._sql.ExecNonQuery("CREATE TABLE SuratTest(surat_id int NOT NULL, denek_id int, mod varchar(20), surat_tarih date, surat_saat long, rest_dakika Int, rest_saniye Int, result Int, gateSayisi Int, setSayisi Int, veri1 long, veri2 long, veri3 long, veri4 long, veri5 long, veri6 long,veri7 long ,veri8 long,veri9 long,veri10 long,veri11 long,veri12 long,veri13 long,veri14 long,veri15 long,veri16 long,veri17 long,veri18 long,veri19 long,veri20 long,veri21 long,veri22 long,veri23 long,veri24 long,veri25 long,veri26 long,veri27 long,veri28 long,veri29 long,veri30 long,veri31 long,veri32 long,veri33 long,veri34 long,veri35 long,veri36 long,veri37 long,veri38 long,veri39 long,veri40 long,veri41 long,veri42 long,veri43 long,veri44 long,veri45 long,veri46 long,veri47 long,veri48 long,veri49 long,veri50 long,veri51 long,veri52 long,veri53 long,veri54 long,veri55 long,veri56 long,veri57 long,veri58 long,veri59 long,veri60 long,veri61 long,veri62 long,veri63 long,veri64 long,veri65 long,veri66 long,veri67 long,veri68 long,veri69 long,veri70 long,veri71 long,veri72 long,veri73 long,veri74 long,veri75 long,veri76 long,veri77 long,veri78 long,veri79 long,veri80 long,veri81 long,veri82 long,veri83 long,veri84 long,veri85 long,veri86 long,veri87 long,veri88 long,veri89 long,veri90 long,veri91 long,veri92 long,veri93 long,veri94 long,veri95 long,veri96 long,veri97 long,veri98 long,veri99 long,veri100 long, PRIMARY KEY(surat_id) FOREIGN KEY(denek_id) REFERENCES Denek(denek_id))");
RDebugUtils.currentLine=27656222;
 //BA.debugLineNum = 27656222;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE DayaniklilikTestPr";
parent._sql.ExecNonQuery("CREATE TABLE DayaniklilikTestProgram (program_id int NOT NULL, program_adi varchar(50), program_tarih date, program_saat long, level int, program_testTuru varchar(20), koniMesafesi1 float, hiz1 float, dakika1 int, saniye1 int, koniMesafesi2 float,hiz2 float, dakika2 int, saniye2 int, koniMesafesi3 float,hiz3 float, dakika3 int, saniye3 int, koniMesafesi4 float, hiz4 float, dakika4 int, saniye4 int, koniMesafesi5 float, hiz5 float, dakika5 int, saniye5 int, koniMesafesi6 float, hiz6 float, dakika6 int, saniye6 int, koniMesafesi7 float, hiz7 float, dakika7 int, saniye7 int, koniMesafesi8 float, hiz8 float, dakika8 int, saniye8 int, koniMesafesi9 float, hiz9 float, dakika9 int, saniye9 int, koniMesafesi10 float, hiz10 float, dakika10 int, saniye10 int, koniMesafesi11 float, hiz11 float, dakika11 int, saniye11 int, koniMesafesi12 float, hiz12 float, dakika12 int, saniye12 int, koniMesafesi13 float, hiz13 float, dakika13 int, saniye13 int, koniMesafesi14 float, hiz14 float, dakika14 int, saniye14 int, koniMesafesi15 float, hiz15 float, dakika15 int, saniye15 int, koniMesafesi16 float, hiz16 float, dakika16 int, saniye16 int, koniMesafesi17 float, hiz17 float, dakika17 int, saniye17 int, koniMesafesi18 float, hiz18 float, dakika18 int, saniye18 int, koniMesafesi19 float, hiz19 float, dakika19 int, saniye19 int, koniMesafesi20 float, hiz20 float, dakika20 int, saniye20 int, koniMesafesi21 float, hiz21 float, dakika21 int, saniye21 int , koniMesafesi22 float, hiz22 float, dakika22 int, saniye22 int ,koniMesafesi23 float, hiz23 float, dakika23 int, saniye23 int , koniMesafesi24 float, hiz24 float, dakika24 int, saniye24 int, koniMesafesi25 float,hiz25 float, dakika25 int, saniye25 int, PRIMARY KEY (program_id))");
RDebugUtils.currentLine=27656223;
 //BA.debugLineNum = 27656223;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE DayaniklilikTest (";
parent._sql.ExecNonQuery("CREATE TABLE DayaniklilikTest (dayaniklilik_id int NOT NULL, denekId1 int, denektc1 bigint, denekIsim1 varchar(50), denekId2 int, denektc2 bigint, denekIsim2 varchar(50),denekId3 int, denektc3 bigint, denekIsim3 varchar(50),denekId4 int, denektc4 bigint, denekIsim4 varchar(50),denekId5 int, denektc5 bigint, denekIsim5 varchar(50),denekId6 int, denektc6 bigint, denekIsim6 varchar(50),denekId7 int, denektc7 bigint, denekIsim7 varchar(50),denekId8 int, denektc8 bigint, denekIsim8 varchar(50),denekId9 int, denektc9 bigint, denekIsim9 varchar(50),denekId10 int, denektc10 bigint, denekIsim10 varchar(50), program_id int, mekik_sayisi int, dayaniklilik_tarih date, dayaniklilik_saat long, PRIMARY KEY(dayaniklilik_id) FOREIGN KEY(denekId1,denekId2,denekId3,denekId4,denekId5,denekId6,denekId7,denekId8,denekId9,denekId10,program_id) REFERENCES DayaniklilikTestProgram(denekId1,denekId2,denekId3,denekId4,denekId5,denekId6,denekId7,denekId8,denekId9,denekId10,program_id) )");
RDebugUtils.currentLine=27656224;
 //BA.debugLineNum = 27656224;BA.debugLine="Log(\"dayanıklılık test oluşturuldu\")";
anywheresoftware.b4a.keywords.Common.LogImpl("227656224","dayanıklılık test oluşturuldu",0);
RDebugUtils.currentLine=27656226;
 //BA.debugLineNum = 27656226;BA.debugLine="Dim basariliMi As Object = sql.ExecNonQueryBatch(";
_basarilimi = parent._sql.ExecNonQueryBatch(processBA,"SportExpert");
RDebugUtils.currentLine=27656227;
 //BA.debugLineNum = 27656227;BA.debugLine="Wait For (basariliMi) SportExpert_NonQueryComplet";
anywheresoftware.b4a.keywords.Common.WaitFor("sportexpert_nonquerycomplete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "tabloolustur"), _basarilimi);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=27656228;
 //BA.debugLineNum = 27656228;BA.debugLine="Log(\"Create Table işlemleri  \" &Success)";
anywheresoftware.b4a.keywords.Common.LogImpl("227656228","Create Table işlemleri  "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=27656229;
 //BA.debugLineNum = 27656229;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=27656231;
 //BA.debugLineNum = 27656231;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _tablodoldur() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tablodoldur", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tablodoldur", null));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Sub TabloDoldur";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="InsertVeriler.SehirlerTablosunuDoldur";
mostCurrent._insertveriler._sehirlertablosunudoldur /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="InsertVeriler.CinsiyetTablosunuDoldur";
mostCurrent._insertveriler._cinsiyettablosunudoldur /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="InsertVeriler.GunTablosunuDoldur";
mostCurrent._insertveriler._guntablosunudoldur /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=27721732;
 //BA.debugLineNum = 27721732;BA.debugLine="InsertVeriler.AyTablosunuDoldur";
mostCurrent._insertveriler._aytablosunudoldur /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=27721733;
 //BA.debugLineNum = 27721733;BA.debugLine="InsertVeriler.YilTablosunuDoldur";
mostCurrent._insertveriler._yiltablosunudoldur /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=27721734;
 //BA.debugLineNum = 27721734;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
}