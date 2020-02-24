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

public class programveri extends Activity implements B4AActivity{
	public static programveri mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example3", "b4a.example3.programveri");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (programveri).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example3", "b4a.example3.programveri");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example3.programveri", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (programveri) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (programveri) Resume **");
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
		return programveri.class;
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
        BA.LogInfo("** Activity (programveri) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            programveri mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (programveri) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _buttonok = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public static int _programid = 0;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static String _secilentarih = "";
public static String _secilensaat = "";
public static float _konimesafesi1 = 0f;
public static float _konimesafesi2 = 0f;
public static float _konimesafesi3 = 0f;
public static float _konimesafesi4 = 0f;
public static float _konimesafesi5 = 0f;
public static float _konimesafesi6 = 0f;
public static float _konimesafesi7 = 0f;
public static float _konimesafesi8 = 0f;
public static float _konimesafesi9 = 0f;
public static float _konimesafesi10 = 0f;
public static float _konimesafesi11 = 0f;
public static float _konimesafesi12 = 0f;
public static float _konimesafesi13 = 0f;
public static float _konimesafesi14 = 0f;
public static float _konimesafesi15 = 0f;
public static float _konimesafesi16 = 0f;
public static float _konimesafesi17 = 0f;
public static float _konimesafesi18 = 0f;
public static float _konimesafesi19 = 0f;
public static float _konimesafesi20 = 0f;
public static float _konimesafesi21 = 0f;
public static float _konimesafesi22 = 0f;
public static float _konimesafesi23 = 0f;
public static float _konimesafesi24 = 0f;
public static float _konimesafesi25 = 0f;
public static float _hiz1 = 0f;
public static float _hiz2 = 0f;
public static float _hiz3 = 0f;
public static float _hiz4 = 0f;
public static float _hiz5 = 0f;
public static float _hiz6 = 0f;
public static float _hiz7 = 0f;
public static float _hiz8 = 0f;
public static float _hiz9 = 0f;
public static float _hiz10 = 0f;
public static float _hiz11 = 0f;
public static float _hiz12 = 0f;
public static float _hiz13 = 0f;
public static float _hiz14 = 0f;
public static float _hiz15 = 0f;
public static float _hiz16 = 0f;
public static float _hiz17 = 0f;
public static float _hiz18 = 0f;
public static float _hiz19 = 0f;
public static float _hiz20 = 0f;
public static float _hiz21 = 0f;
public static float _hiz22 = 0f;
public static float _hiz23 = 0f;
public static float _hiz24 = 0f;
public static float _hiz25 = 0f;
public static int _dakika1 = 0;
public static int _dakika2 = 0;
public static int _dakika3 = 0;
public static int _dakika4 = 0;
public static int _dakika5 = 0;
public static int _dakika6 = 0;
public static int _dakika7 = 0;
public static int _dakika8 = 0;
public static int _dakika9 = 0;
public static int _dakika10 = 0;
public static int _dakika11 = 0;
public static int _dakika12 = 0;
public static int _dakika13 = 0;
public static int _dakika14 = 0;
public static int _dakika15 = 0;
public static int _dakika16 = 0;
public static int _dakika17 = 0;
public static int _dakika18 = 0;
public static int _dakika19 = 0;
public static int _dakika20 = 0;
public static int _dakika21 = 0;
public static int _dakika22 = 0;
public static int _dakika23 = 0;
public static int _dakika24 = 0;
public static int _dakika25 = 0;
public static int _saniye1 = 0;
public static int _saniye2 = 0;
public static int _saniye3 = 0;
public static int _saniye4 = 0;
public static int _saniye5 = 0;
public static int _saniye6 = 0;
public static int _saniye7 = 0;
public static int _saniye8 = 0;
public static int _saniye9 = 0;
public static int _saniye10 = 0;
public static int _saniye11 = 0;
public static int _saniye12 = 0;
public static int _saniye13 = 0;
public static int _saniye14 = 0;
public static int _saniye15 = 0;
public static int _saniye16 = 0;
public static int _saniye17 = 0;
public static int _saniye18 = 0;
public static int _saniye19 = 0;
public static int _saniye20 = 0;
public static int _saniye21 = 0;
public static int _saniye22 = 0;
public static int _saniye23 = 0;
public static int _saniye24 = 0;
public static int _saniye25 = 0;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi14 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi17 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi18 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi20 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi21 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi22 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi23 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi24 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelseviyeismi25 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz14 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz17 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz18 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz20 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz21 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz22 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz23 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz24 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhiz25 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika14 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika17 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika18 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika20 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika21 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika22 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika23 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika24 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldakika25 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye14 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye17 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye18 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye20 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye21 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye22 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye23 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye24 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelsaniye25 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi14 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi17 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi18 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi20 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi21 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi22 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi23 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi24 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkonimesafesi25 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi12 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi13 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi15 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi16 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi17 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi18 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi19 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi20 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi21 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi22 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi23 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi24 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextkonimesafesi25 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz12 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz13 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz15 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz16 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz17 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz18 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz19 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz20 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz21 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz22 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz23 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz24 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittexthiz25 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika12 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika13 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika15 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika16 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika17 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika18 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika19 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika20 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika21 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika22 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika23 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika24 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextdakika25 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye12 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye13 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye15 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye16 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye17 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye18 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye19 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye20 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye21 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye22 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye23 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye24 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextsaniye25 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel6 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel7 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel8 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel9 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel10 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel11 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel13 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel14 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel15 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel16 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel17 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel18 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel19 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel20 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel21 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel22 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel23 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel24 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel25 = null;
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
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Activity.LoadLayout(\"ProgramAyar1Page\")";
mostCurrent._activity.LoadLayout("ProgramAyar1Page",mostCurrent.activityBA);
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ProgramVeriPage\")";
mostCurrent._scrollview1.getPanel().LoadLayout("ProgramVeriPage",mostCurrent.activityBA);
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="ScrollView1.Panel.Width = 2000dip";
mostCurrent._scrollview1.getPanel().setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2000)));
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="ScrollView1.Panel.Height = 2030dip";
mostCurrent._scrollview1.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2030)));
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="levelPanelGoster";
_levelpanelgoster();
RDebugUtils.currentLine=12124173;
 //BA.debugLineNum = 12124173;BA.debugLine="EditTextKoniMesafesi1.TextSize = 20";
mostCurrent._edittextkonimesafesi1.setTextSize((float) (20));
RDebugUtils.currentLine=12124174;
 //BA.debugLineNum = 12124174;BA.debugLine="EditTextKoniMesafesi1.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124175;
 //BA.debugLineNum = 12124175;BA.debugLine="EditTextKoniMesafesi1.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124176;
 //BA.debugLineNum = 12124176;BA.debugLine="EditTextKoniMesafesi1.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi1.setInputType(mostCurrent._edittextkonimesafesi1.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124178;
 //BA.debugLineNum = 12124178;BA.debugLine="EditTextKoniMesafesi2.TextSize = 20";
mostCurrent._edittextkonimesafesi2.setTextSize((float) (20));
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="EditTextKoniMesafesi2.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124180;
 //BA.debugLineNum = 12124180;BA.debugLine="EditTextKoniMesafesi2.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124181;
 //BA.debugLineNum = 12124181;BA.debugLine="EditTextKoniMesafesi2.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi2.setInputType(mostCurrent._edittextkonimesafesi2.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124183;
 //BA.debugLineNum = 12124183;BA.debugLine="EditTextKoniMesafesi3.TextSize = 20";
mostCurrent._edittextkonimesafesi3.setTextSize((float) (20));
RDebugUtils.currentLine=12124184;
 //BA.debugLineNum = 12124184;BA.debugLine="EditTextKoniMesafesi3.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124185;
 //BA.debugLineNum = 12124185;BA.debugLine="EditTextKoniMesafesi3.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124186;
 //BA.debugLineNum = 12124186;BA.debugLine="EditTextKoniMesafesi3.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi3.setInputType(mostCurrent._edittextkonimesafesi3.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124188;
 //BA.debugLineNum = 12124188;BA.debugLine="EditTextKoniMesafesi4.TextSize = 20";
mostCurrent._edittextkonimesafesi4.setTextSize((float) (20));
RDebugUtils.currentLine=12124189;
 //BA.debugLineNum = 12124189;BA.debugLine="EditTextKoniMesafesi4.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124190;
 //BA.debugLineNum = 12124190;BA.debugLine="EditTextKoniMesafesi4.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124191;
 //BA.debugLineNum = 12124191;BA.debugLine="EditTextKoniMesafesi4.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi4.setInputType(mostCurrent._edittextkonimesafesi4.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124193;
 //BA.debugLineNum = 12124193;BA.debugLine="EditTextKoniMesafesi5.TextSize = 20";
mostCurrent._edittextkonimesafesi5.setTextSize((float) (20));
RDebugUtils.currentLine=12124194;
 //BA.debugLineNum = 12124194;BA.debugLine="EditTextKoniMesafesi5.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124195;
 //BA.debugLineNum = 12124195;BA.debugLine="EditTextKoniMesafesi5.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124196;
 //BA.debugLineNum = 12124196;BA.debugLine="EditTextKoniMesafesi5.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi5.setInputType(mostCurrent._edittextkonimesafesi5.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124198;
 //BA.debugLineNum = 12124198;BA.debugLine="EditTextKoniMesafesi6.TextSize = 20";
mostCurrent._edittextkonimesafesi6.setTextSize((float) (20));
RDebugUtils.currentLine=12124199;
 //BA.debugLineNum = 12124199;BA.debugLine="EditTextKoniMesafesi6.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124200;
 //BA.debugLineNum = 12124200;BA.debugLine="EditTextKoniMesafesi6.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124201;
 //BA.debugLineNum = 12124201;BA.debugLine="EditTextKoniMesafesi6.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi6.setInputType(mostCurrent._edittextkonimesafesi6.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124203;
 //BA.debugLineNum = 12124203;BA.debugLine="EditTextKoniMesafesi7.TextSize = 20";
mostCurrent._edittextkonimesafesi7.setTextSize((float) (20));
RDebugUtils.currentLine=12124204;
 //BA.debugLineNum = 12124204;BA.debugLine="EditTextKoniMesafesi7.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124205;
 //BA.debugLineNum = 12124205;BA.debugLine="EditTextKoniMesafesi7.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124206;
 //BA.debugLineNum = 12124206;BA.debugLine="EditTextKoniMesafesi7.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi7.setInputType(mostCurrent._edittextkonimesafesi7.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124208;
 //BA.debugLineNum = 12124208;BA.debugLine="EditTextKoniMesafesi8.TextSize = 20";
mostCurrent._edittextkonimesafesi8.setTextSize((float) (20));
RDebugUtils.currentLine=12124209;
 //BA.debugLineNum = 12124209;BA.debugLine="EditTextKoniMesafesi8.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124210;
 //BA.debugLineNum = 12124210;BA.debugLine="EditTextKoniMesafesi8.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124211;
 //BA.debugLineNum = 12124211;BA.debugLine="EditTextKoniMesafesi8.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi8.setInputType(mostCurrent._edittextkonimesafesi8.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124213;
 //BA.debugLineNum = 12124213;BA.debugLine="EditTextKoniMesafesi9.TextSize = 20";
mostCurrent._edittextkonimesafesi9.setTextSize((float) (20));
RDebugUtils.currentLine=12124214;
 //BA.debugLineNum = 12124214;BA.debugLine="EditTextKoniMesafesi9.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124215;
 //BA.debugLineNum = 12124215;BA.debugLine="EditTextKoniMesafesi9.Typeface = Typeface.DEFAULT";
mostCurrent._edittextkonimesafesi9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124216;
 //BA.debugLineNum = 12124216;BA.debugLine="EditTextKoniMesafesi9.InputType = EditTextKoniMes";
mostCurrent._edittextkonimesafesi9.setInputType(mostCurrent._edittextkonimesafesi9.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124218;
 //BA.debugLineNum = 12124218;BA.debugLine="EditTextKoniMesafesi10.TextSize = 20";
mostCurrent._edittextkonimesafesi10.setTextSize((float) (20));
RDebugUtils.currentLine=12124219;
 //BA.debugLineNum = 12124219;BA.debugLine="EditTextKoniMesafesi10.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124220;
 //BA.debugLineNum = 12124220;BA.debugLine="EditTextKoniMesafesi10.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124221;
 //BA.debugLineNum = 12124221;BA.debugLine="EditTextKoniMesafesi10.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi10.setInputType(mostCurrent._edittextkonimesafesi10.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124223;
 //BA.debugLineNum = 12124223;BA.debugLine="EditTextKoniMesafesi11.TextSize = 20";
mostCurrent._edittextkonimesafesi11.setTextSize((float) (20));
RDebugUtils.currentLine=12124224;
 //BA.debugLineNum = 12124224;BA.debugLine="EditTextKoniMesafesi11.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124225;
 //BA.debugLineNum = 12124225;BA.debugLine="EditTextKoniMesafesi11.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124226;
 //BA.debugLineNum = 12124226;BA.debugLine="EditTextKoniMesafesi11.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi11.setInputType(mostCurrent._edittextkonimesafesi11.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124228;
 //BA.debugLineNum = 12124228;BA.debugLine="EditTextKoniMesafesi12.TextSize = 20";
mostCurrent._edittextkonimesafesi12.setTextSize((float) (20));
RDebugUtils.currentLine=12124229;
 //BA.debugLineNum = 12124229;BA.debugLine="EditTextKoniMesafesi12.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124230;
 //BA.debugLineNum = 12124230;BA.debugLine="EditTextKoniMesafesi12.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124231;
 //BA.debugLineNum = 12124231;BA.debugLine="EditTextKoniMesafesi12.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi12.setInputType(mostCurrent._edittextkonimesafesi12.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124233;
 //BA.debugLineNum = 12124233;BA.debugLine="EditTextKoniMesafesi13.TextSize = 20";
mostCurrent._edittextkonimesafesi13.setTextSize((float) (20));
RDebugUtils.currentLine=12124234;
 //BA.debugLineNum = 12124234;BA.debugLine="EditTextKoniMesafesi13.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124235;
 //BA.debugLineNum = 12124235;BA.debugLine="EditTextKoniMesafesi13.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124236;
 //BA.debugLineNum = 12124236;BA.debugLine="EditTextKoniMesafesi13.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi13.setInputType(mostCurrent._edittextkonimesafesi13.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124238;
 //BA.debugLineNum = 12124238;BA.debugLine="EditTextKoniMesafesi14.TextSize = 20";
mostCurrent._edittextkonimesafesi14.setTextSize((float) (20));
RDebugUtils.currentLine=12124239;
 //BA.debugLineNum = 12124239;BA.debugLine="EditTextKoniMesafesi14.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124240;
 //BA.debugLineNum = 12124240;BA.debugLine="EditTextKoniMesafesi14.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124241;
 //BA.debugLineNum = 12124241;BA.debugLine="EditTextKoniMesafesi14.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi14.setInputType(mostCurrent._edittextkonimesafesi14.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124243;
 //BA.debugLineNum = 12124243;BA.debugLine="EditTextKoniMesafesi15.TextSize = 20";
mostCurrent._edittextkonimesafesi15.setTextSize((float) (20));
RDebugUtils.currentLine=12124244;
 //BA.debugLineNum = 12124244;BA.debugLine="EditTextKoniMesafesi15.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124245;
 //BA.debugLineNum = 12124245;BA.debugLine="EditTextKoniMesafesi15.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124246;
 //BA.debugLineNum = 12124246;BA.debugLine="EditTextKoniMesafesi15.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi15.setInputType(mostCurrent._edittextkonimesafesi15.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124248;
 //BA.debugLineNum = 12124248;BA.debugLine="EditTextKoniMesafesi16.TextSize = 20";
mostCurrent._edittextkonimesafesi16.setTextSize((float) (20));
RDebugUtils.currentLine=12124249;
 //BA.debugLineNum = 12124249;BA.debugLine="EditTextKoniMesafesi16.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124250;
 //BA.debugLineNum = 12124250;BA.debugLine="EditTextKoniMesafesi16.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124251;
 //BA.debugLineNum = 12124251;BA.debugLine="EditTextKoniMesafesi16.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi16.setInputType(mostCurrent._edittextkonimesafesi16.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124253;
 //BA.debugLineNum = 12124253;BA.debugLine="EditTextKoniMesafesi17.TextSize = 20";
mostCurrent._edittextkonimesafesi17.setTextSize((float) (20));
RDebugUtils.currentLine=12124254;
 //BA.debugLineNum = 12124254;BA.debugLine="EditTextKoniMesafesi17.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124255;
 //BA.debugLineNum = 12124255;BA.debugLine="EditTextKoniMesafesi17.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124256;
 //BA.debugLineNum = 12124256;BA.debugLine="EditTextKoniMesafesi17.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi17.setInputType(mostCurrent._edittextkonimesafesi17.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124258;
 //BA.debugLineNum = 12124258;BA.debugLine="EditTextKoniMesafesi18.TextSize = 20";
mostCurrent._edittextkonimesafesi18.setTextSize((float) (20));
RDebugUtils.currentLine=12124259;
 //BA.debugLineNum = 12124259;BA.debugLine="EditTextKoniMesafesi18.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124260;
 //BA.debugLineNum = 12124260;BA.debugLine="EditTextKoniMesafesi18.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124261;
 //BA.debugLineNum = 12124261;BA.debugLine="EditTextKoniMesafesi18.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi18.setInputType(mostCurrent._edittextkonimesafesi18.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124263;
 //BA.debugLineNum = 12124263;BA.debugLine="EditTextKoniMesafesi19.TextSize = 20";
mostCurrent._edittextkonimesafesi19.setTextSize((float) (20));
RDebugUtils.currentLine=12124264;
 //BA.debugLineNum = 12124264;BA.debugLine="EditTextKoniMesafesi19.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124265;
 //BA.debugLineNum = 12124265;BA.debugLine="EditTextKoniMesafesi19.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124266;
 //BA.debugLineNum = 12124266;BA.debugLine="EditTextKoniMesafesi19.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi19.setInputType(mostCurrent._edittextkonimesafesi19.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124268;
 //BA.debugLineNum = 12124268;BA.debugLine="EditTextKoniMesafesi20.TextSize = 20";
mostCurrent._edittextkonimesafesi20.setTextSize((float) (20));
RDebugUtils.currentLine=12124269;
 //BA.debugLineNum = 12124269;BA.debugLine="EditTextKoniMesafesi20.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124270;
 //BA.debugLineNum = 12124270;BA.debugLine="EditTextKoniMesafesi20.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124271;
 //BA.debugLineNum = 12124271;BA.debugLine="EditTextKoniMesafesi20.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi20.setInputType(mostCurrent._edittextkonimesafesi20.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124273;
 //BA.debugLineNum = 12124273;BA.debugLine="EditTextKoniMesafesi21.TextSize = 20";
mostCurrent._edittextkonimesafesi21.setTextSize((float) (20));
RDebugUtils.currentLine=12124274;
 //BA.debugLineNum = 12124274;BA.debugLine="EditTextKoniMesafesi21.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124275;
 //BA.debugLineNum = 12124275;BA.debugLine="EditTextKoniMesafesi21.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124276;
 //BA.debugLineNum = 12124276;BA.debugLine="EditTextKoniMesafesi21.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi21.setInputType(mostCurrent._edittextkonimesafesi21.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124278;
 //BA.debugLineNum = 12124278;BA.debugLine="EditTextKoniMesafesi22.TextSize = 20";
mostCurrent._edittextkonimesafesi22.setTextSize((float) (20));
RDebugUtils.currentLine=12124279;
 //BA.debugLineNum = 12124279;BA.debugLine="EditTextKoniMesafesi22.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124280;
 //BA.debugLineNum = 12124280;BA.debugLine="EditTextKoniMesafesi22.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124281;
 //BA.debugLineNum = 12124281;BA.debugLine="EditTextKoniMesafesi22.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi22.setInputType(mostCurrent._edittextkonimesafesi22.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124283;
 //BA.debugLineNum = 12124283;BA.debugLine="EditTextKoniMesafesi23.TextSize = 20";
mostCurrent._edittextkonimesafesi23.setTextSize((float) (20));
RDebugUtils.currentLine=12124284;
 //BA.debugLineNum = 12124284;BA.debugLine="EditTextKoniMesafesi23.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124285;
 //BA.debugLineNum = 12124285;BA.debugLine="EditTextKoniMesafesi23.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124286;
 //BA.debugLineNum = 12124286;BA.debugLine="EditTextKoniMesafesi23.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi23.setInputType(mostCurrent._edittextkonimesafesi23.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124288;
 //BA.debugLineNum = 12124288;BA.debugLine="EditTextKoniMesafesi24.TextSize = 20";
mostCurrent._edittextkonimesafesi24.setTextSize((float) (20));
RDebugUtils.currentLine=12124289;
 //BA.debugLineNum = 12124289;BA.debugLine="EditTextKoniMesafesi24.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124290;
 //BA.debugLineNum = 12124290;BA.debugLine="EditTextKoniMesafesi24.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124291;
 //BA.debugLineNum = 12124291;BA.debugLine="EditTextKoniMesafesi24.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi24.setInputType(mostCurrent._edittextkonimesafesi24.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124293;
 //BA.debugLineNum = 12124293;BA.debugLine="EditTextKoniMesafesi25.TextSize = 20";
mostCurrent._edittextkonimesafesi25.setTextSize((float) (20));
RDebugUtils.currentLine=12124294;
 //BA.debugLineNum = 12124294;BA.debugLine="EditTextKoniMesafesi25.TextColor = Colors.White";
mostCurrent._edittextkonimesafesi25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124295;
 //BA.debugLineNum = 12124295;BA.debugLine="EditTextKoniMesafesi25.Typeface = Typeface.DEFAUL";
mostCurrent._edittextkonimesafesi25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124296;
 //BA.debugLineNum = 12124296;BA.debugLine="EditTextKoniMesafesi25.InputType = EditTextKoniMe";
mostCurrent._edittextkonimesafesi25.setInputType(mostCurrent._edittextkonimesafesi25.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124301;
 //BA.debugLineNum = 12124301;BA.debugLine="EditTextDakika1.TextSize = 20";
mostCurrent._edittextdakika1.setTextSize((float) (20));
RDebugUtils.currentLine=12124302;
 //BA.debugLineNum = 12124302;BA.debugLine="EditTextDakika1.TextColor = Colors.White";
mostCurrent._edittextdakika1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124303;
 //BA.debugLineNum = 12124303;BA.debugLine="EditTextDakika1.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124304;
 //BA.debugLineNum = 12124304;BA.debugLine="EditTextDakika1.InputType = EditTextDakika1.INPUT";
mostCurrent._edittextdakika1.setInputType(mostCurrent._edittextdakika1.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124306;
 //BA.debugLineNum = 12124306;BA.debugLine="EditTextDakika2.TextSize = 20";
mostCurrent._edittextdakika2.setTextSize((float) (20));
RDebugUtils.currentLine=12124307;
 //BA.debugLineNum = 12124307;BA.debugLine="EditTextDakika2.TextColor = Colors.White";
mostCurrent._edittextdakika2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124308;
 //BA.debugLineNum = 12124308;BA.debugLine="EditTextDakika2.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124309;
 //BA.debugLineNum = 12124309;BA.debugLine="EditTextDakika2.InputType = EditTextDakika2.INPUT";
mostCurrent._edittextdakika2.setInputType(mostCurrent._edittextdakika2.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124311;
 //BA.debugLineNum = 12124311;BA.debugLine="EditTextDakika3.TextSize = 20";
mostCurrent._edittextdakika3.setTextSize((float) (20));
RDebugUtils.currentLine=12124312;
 //BA.debugLineNum = 12124312;BA.debugLine="EditTextDakika3.TextColor = Colors.White";
mostCurrent._edittextdakika3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124313;
 //BA.debugLineNum = 12124313;BA.debugLine="EditTextDakika3.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124314;
 //BA.debugLineNum = 12124314;BA.debugLine="EditTextDakika3.InputType = EditTextDakika3.INPUT";
mostCurrent._edittextdakika3.setInputType(mostCurrent._edittextdakika3.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124316;
 //BA.debugLineNum = 12124316;BA.debugLine="EditTextDakika4.TextSize = 20";
mostCurrent._edittextdakika4.setTextSize((float) (20));
RDebugUtils.currentLine=12124317;
 //BA.debugLineNum = 12124317;BA.debugLine="EditTextDakika4.TextColor = Colors.White";
mostCurrent._edittextdakika4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124318;
 //BA.debugLineNum = 12124318;BA.debugLine="EditTextDakika4.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124319;
 //BA.debugLineNum = 12124319;BA.debugLine="EditTextDakika4.InputType = EditTextDakika4.INPUT";
mostCurrent._edittextdakika4.setInputType(mostCurrent._edittextdakika4.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124321;
 //BA.debugLineNum = 12124321;BA.debugLine="EditTextDakika5.TextSize = 20";
mostCurrent._edittextdakika5.setTextSize((float) (20));
RDebugUtils.currentLine=12124322;
 //BA.debugLineNum = 12124322;BA.debugLine="EditTextDakika5.TextColor = Colors.White";
mostCurrent._edittextdakika5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124323;
 //BA.debugLineNum = 12124323;BA.debugLine="EditTextDakika5.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124324;
 //BA.debugLineNum = 12124324;BA.debugLine="EditTextDakika5.InputType = EditTextDakika5.INPUT";
mostCurrent._edittextdakika5.setInputType(mostCurrent._edittextdakika5.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124326;
 //BA.debugLineNum = 12124326;BA.debugLine="EditTextDakika6.TextSize = 20";
mostCurrent._edittextdakika6.setTextSize((float) (20));
RDebugUtils.currentLine=12124327;
 //BA.debugLineNum = 12124327;BA.debugLine="EditTextDakika6.TextColor = Colors.White";
mostCurrent._edittextdakika6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124328;
 //BA.debugLineNum = 12124328;BA.debugLine="EditTextDakika6.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124329;
 //BA.debugLineNum = 12124329;BA.debugLine="EditTextDakika6.InputType = EditTextDakika6.INPUT";
mostCurrent._edittextdakika6.setInputType(mostCurrent._edittextdakika6.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124331;
 //BA.debugLineNum = 12124331;BA.debugLine="EditTextDakika7.TextSize = 20";
mostCurrent._edittextdakika7.setTextSize((float) (20));
RDebugUtils.currentLine=12124332;
 //BA.debugLineNum = 12124332;BA.debugLine="EditTextDakika7.TextColor = Colors.White";
mostCurrent._edittextdakika7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124333;
 //BA.debugLineNum = 12124333;BA.debugLine="EditTextDakika7.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124334;
 //BA.debugLineNum = 12124334;BA.debugLine="EditTextDakika7.InputType = EditTextDakika7.INPUT";
mostCurrent._edittextdakika7.setInputType(mostCurrent._edittextdakika7.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124336;
 //BA.debugLineNum = 12124336;BA.debugLine="EditTextDakika8.TextSize = 20";
mostCurrent._edittextdakika8.setTextSize((float) (20));
RDebugUtils.currentLine=12124337;
 //BA.debugLineNum = 12124337;BA.debugLine="EditTextDakika8.TextColor = Colors.White";
mostCurrent._edittextdakika8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124338;
 //BA.debugLineNum = 12124338;BA.debugLine="EditTextDakika8.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124339;
 //BA.debugLineNum = 12124339;BA.debugLine="EditTextDakika8.InputType = EditTextDakika8.INPUT";
mostCurrent._edittextdakika8.setInputType(mostCurrent._edittextdakika8.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124341;
 //BA.debugLineNum = 12124341;BA.debugLine="EditTextDakika9.TextSize = 20";
mostCurrent._edittextdakika9.setTextSize((float) (20));
RDebugUtils.currentLine=12124342;
 //BA.debugLineNum = 12124342;BA.debugLine="EditTextDakika9.TextColor = Colors.White";
mostCurrent._edittextdakika9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124343;
 //BA.debugLineNum = 12124343;BA.debugLine="EditTextDakika9.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124344;
 //BA.debugLineNum = 12124344;BA.debugLine="EditTextDakika9.InputType = EditTextDakika9.INPUT";
mostCurrent._edittextdakika9.setInputType(mostCurrent._edittextdakika9.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124346;
 //BA.debugLineNum = 12124346;BA.debugLine="EditTextDakika10.TextSize = 20";
mostCurrent._edittextdakika10.setTextSize((float) (20));
RDebugUtils.currentLine=12124347;
 //BA.debugLineNum = 12124347;BA.debugLine="EditTextDakika10.TextColor = Colors.White";
mostCurrent._edittextdakika10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124348;
 //BA.debugLineNum = 12124348;BA.debugLine="EditTextDakika10.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124349;
 //BA.debugLineNum = 12124349;BA.debugLine="EditTextDakika10.InputType = EditTextDakika10.INP";
mostCurrent._edittextdakika10.setInputType(mostCurrent._edittextdakika10.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124351;
 //BA.debugLineNum = 12124351;BA.debugLine="EditTextDakika11.TextSize = 20";
mostCurrent._edittextdakika11.setTextSize((float) (20));
RDebugUtils.currentLine=12124352;
 //BA.debugLineNum = 12124352;BA.debugLine="EditTextDakika11.TextColor = Colors.White";
mostCurrent._edittextdakika11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124353;
 //BA.debugLineNum = 12124353;BA.debugLine="EditTextDakika11.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124354;
 //BA.debugLineNum = 12124354;BA.debugLine="EditTextDakika11.InputType = EditTextDakika11.INP";
mostCurrent._edittextdakika11.setInputType(mostCurrent._edittextdakika11.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124356;
 //BA.debugLineNum = 12124356;BA.debugLine="EditTextDakika12.TextSize = 20";
mostCurrent._edittextdakika12.setTextSize((float) (20));
RDebugUtils.currentLine=12124357;
 //BA.debugLineNum = 12124357;BA.debugLine="EditTextDakika12.TextColor = Colors.White";
mostCurrent._edittextdakika12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124358;
 //BA.debugLineNum = 12124358;BA.debugLine="EditTextDakika12.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124359;
 //BA.debugLineNum = 12124359;BA.debugLine="EditTextDakika12.InputType = EditTextDakika12.INP";
mostCurrent._edittextdakika12.setInputType(mostCurrent._edittextdakika12.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124361;
 //BA.debugLineNum = 12124361;BA.debugLine="EditTextDakika13.TextSize = 20";
mostCurrent._edittextdakika13.setTextSize((float) (20));
RDebugUtils.currentLine=12124362;
 //BA.debugLineNum = 12124362;BA.debugLine="EditTextDakika13.TextColor = Colors.White";
mostCurrent._edittextdakika13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124363;
 //BA.debugLineNum = 12124363;BA.debugLine="EditTextDakika13.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124364;
 //BA.debugLineNum = 12124364;BA.debugLine="EditTextDakika13.InputType = EditTextDakika13.INP";
mostCurrent._edittextdakika13.setInputType(mostCurrent._edittextdakika13.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124366;
 //BA.debugLineNum = 12124366;BA.debugLine="EditTextDakika14.TextSize = 20";
mostCurrent._edittextdakika14.setTextSize((float) (20));
RDebugUtils.currentLine=12124367;
 //BA.debugLineNum = 12124367;BA.debugLine="EditTextDakika14.TextColor = Colors.White";
mostCurrent._edittextdakika14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124368;
 //BA.debugLineNum = 12124368;BA.debugLine="EditTextDakika14.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124369;
 //BA.debugLineNum = 12124369;BA.debugLine="EditTextDakika14.InputType = EditTextDakika14.INP";
mostCurrent._edittextdakika14.setInputType(mostCurrent._edittextdakika14.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124371;
 //BA.debugLineNum = 12124371;BA.debugLine="EditTextDakika15.TextSize = 20";
mostCurrent._edittextdakika15.setTextSize((float) (20));
RDebugUtils.currentLine=12124372;
 //BA.debugLineNum = 12124372;BA.debugLine="EditTextDakika15.TextColor = Colors.White";
mostCurrent._edittextdakika15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124373;
 //BA.debugLineNum = 12124373;BA.debugLine="EditTextDakika15.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124374;
 //BA.debugLineNum = 12124374;BA.debugLine="EditTextDakika15.InputType = EditTextDakika15.INP";
mostCurrent._edittextdakika15.setInputType(mostCurrent._edittextdakika15.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124376;
 //BA.debugLineNum = 12124376;BA.debugLine="EditTextDakika16.TextSize = 20";
mostCurrent._edittextdakika16.setTextSize((float) (20));
RDebugUtils.currentLine=12124377;
 //BA.debugLineNum = 12124377;BA.debugLine="EditTextDakika16.TextColor = Colors.White";
mostCurrent._edittextdakika16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124378;
 //BA.debugLineNum = 12124378;BA.debugLine="EditTextDakika16.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124379;
 //BA.debugLineNum = 12124379;BA.debugLine="EditTextDakika16.InputType = EditTextDakika16.INP";
mostCurrent._edittextdakika16.setInputType(mostCurrent._edittextdakika16.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124381;
 //BA.debugLineNum = 12124381;BA.debugLine="EditTextDakika17.TextSize = 20";
mostCurrent._edittextdakika17.setTextSize((float) (20));
RDebugUtils.currentLine=12124382;
 //BA.debugLineNum = 12124382;BA.debugLine="EditTextDakika17.TextColor = Colors.White";
mostCurrent._edittextdakika17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124383;
 //BA.debugLineNum = 12124383;BA.debugLine="EditTextDakika17.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124384;
 //BA.debugLineNum = 12124384;BA.debugLine="EditTextDakika17.InputType = EditTextDakika17.INP";
mostCurrent._edittextdakika17.setInputType(mostCurrent._edittextdakika17.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124386;
 //BA.debugLineNum = 12124386;BA.debugLine="EditTextDakika18.TextSize = 20";
mostCurrent._edittextdakika18.setTextSize((float) (20));
RDebugUtils.currentLine=12124387;
 //BA.debugLineNum = 12124387;BA.debugLine="EditTextDakika18.TextColor = Colors.White";
mostCurrent._edittextdakika18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124388;
 //BA.debugLineNum = 12124388;BA.debugLine="EditTextDakika18.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124389;
 //BA.debugLineNum = 12124389;BA.debugLine="EditTextDakika18.InputType = EditTextDakika18.INP";
mostCurrent._edittextdakika18.setInputType(mostCurrent._edittextdakika18.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124391;
 //BA.debugLineNum = 12124391;BA.debugLine="EditTextDakika19.TextSize = 20";
mostCurrent._edittextdakika19.setTextSize((float) (20));
RDebugUtils.currentLine=12124392;
 //BA.debugLineNum = 12124392;BA.debugLine="EditTextDakika19.TextColor = Colors.White";
mostCurrent._edittextdakika19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124393;
 //BA.debugLineNum = 12124393;BA.debugLine="EditTextDakika19.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124394;
 //BA.debugLineNum = 12124394;BA.debugLine="EditTextDakika19.InputType = EditTextDakika19.INP";
mostCurrent._edittextdakika19.setInputType(mostCurrent._edittextdakika19.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124396;
 //BA.debugLineNum = 12124396;BA.debugLine="EditTextDakika20.TextSize = 20";
mostCurrent._edittextdakika20.setTextSize((float) (20));
RDebugUtils.currentLine=12124397;
 //BA.debugLineNum = 12124397;BA.debugLine="EditTextDakika20.TextColor = Colors.White";
mostCurrent._edittextdakika20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124398;
 //BA.debugLineNum = 12124398;BA.debugLine="EditTextDakika20.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124399;
 //BA.debugLineNum = 12124399;BA.debugLine="EditTextDakika20.InputType = EditTextDakika20.INP";
mostCurrent._edittextdakika20.setInputType(mostCurrent._edittextdakika20.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124401;
 //BA.debugLineNum = 12124401;BA.debugLine="EditTextDakika21.TextSize = 20";
mostCurrent._edittextdakika21.setTextSize((float) (20));
RDebugUtils.currentLine=12124402;
 //BA.debugLineNum = 12124402;BA.debugLine="EditTextDakika21.TextColor = Colors.White";
mostCurrent._edittextdakika21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124403;
 //BA.debugLineNum = 12124403;BA.debugLine="EditTextDakika21.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124404;
 //BA.debugLineNum = 12124404;BA.debugLine="EditTextDakika21.InputType = EditTextDakika21.INP";
mostCurrent._edittextdakika21.setInputType(mostCurrent._edittextdakika21.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124406;
 //BA.debugLineNum = 12124406;BA.debugLine="EditTextDakika22.TextSize = 20";
mostCurrent._edittextdakika22.setTextSize((float) (20));
RDebugUtils.currentLine=12124407;
 //BA.debugLineNum = 12124407;BA.debugLine="EditTextDakika22.TextColor = Colors.White";
mostCurrent._edittextdakika22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124408;
 //BA.debugLineNum = 12124408;BA.debugLine="EditTextDakika22.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124409;
 //BA.debugLineNum = 12124409;BA.debugLine="EditTextDakika22.InputType = EditTextDakika22.INP";
mostCurrent._edittextdakika22.setInputType(mostCurrent._edittextdakika22.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124411;
 //BA.debugLineNum = 12124411;BA.debugLine="EditTextDakika23.TextSize = 20";
mostCurrent._edittextdakika23.setTextSize((float) (20));
RDebugUtils.currentLine=12124412;
 //BA.debugLineNum = 12124412;BA.debugLine="EditTextDakika23.TextColor = Colors.White";
mostCurrent._edittextdakika23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124413;
 //BA.debugLineNum = 12124413;BA.debugLine="EditTextDakika23.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124414;
 //BA.debugLineNum = 12124414;BA.debugLine="EditTextDakika23.InputType = EditTextDakika23.INP";
mostCurrent._edittextdakika23.setInputType(mostCurrent._edittextdakika23.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124416;
 //BA.debugLineNum = 12124416;BA.debugLine="EditTextDakika24.TextSize = 20";
mostCurrent._edittextdakika24.setTextSize((float) (20));
RDebugUtils.currentLine=12124417;
 //BA.debugLineNum = 12124417;BA.debugLine="EditTextDakika24.TextColor = Colors.White";
mostCurrent._edittextdakika24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124418;
 //BA.debugLineNum = 12124418;BA.debugLine="EditTextDakika24.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124419;
 //BA.debugLineNum = 12124419;BA.debugLine="EditTextDakika24.InputType = EditTextDakika24.INP";
mostCurrent._edittextdakika24.setInputType(mostCurrent._edittextdakika24.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124421;
 //BA.debugLineNum = 12124421;BA.debugLine="EditTextDakika25.TextSize = 20";
mostCurrent._edittextdakika25.setTextSize((float) (20));
RDebugUtils.currentLine=12124422;
 //BA.debugLineNum = 12124422;BA.debugLine="EditTextDakika25.TextColor = Colors.White";
mostCurrent._edittextdakika25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124423;
 //BA.debugLineNum = 12124423;BA.debugLine="EditTextDakika25.Typeface = Typeface.DEFAULT";
mostCurrent._edittextdakika25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124424;
 //BA.debugLineNum = 12124424;BA.debugLine="EditTextDakika25.InputType = EditTextDakika25.INP";
mostCurrent._edittextdakika25.setInputType(mostCurrent._edittextdakika25.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124428;
 //BA.debugLineNum = 12124428;BA.debugLine="EditTextSaniye1.TextSize = 20";
mostCurrent._edittextsaniye1.setTextSize((float) (20));
RDebugUtils.currentLine=12124429;
 //BA.debugLineNum = 12124429;BA.debugLine="EditTextSaniye1.TextColor = Colors.White";
mostCurrent._edittextsaniye1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124430;
 //BA.debugLineNum = 12124430;BA.debugLine="EditTextSaniye1.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124431;
 //BA.debugLineNum = 12124431;BA.debugLine="EditTextSaniye1.InputType = EditTextSaniye1.INPUT";
mostCurrent._edittextsaniye1.setInputType(mostCurrent._edittextsaniye1.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124433;
 //BA.debugLineNum = 12124433;BA.debugLine="EditTextSaniye2.TextSize = 20";
mostCurrent._edittextsaniye2.setTextSize((float) (20));
RDebugUtils.currentLine=12124434;
 //BA.debugLineNum = 12124434;BA.debugLine="EditTextSaniye2.TextColor = Colors.White";
mostCurrent._edittextsaniye2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124435;
 //BA.debugLineNum = 12124435;BA.debugLine="EditTextSaniye2.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124436;
 //BA.debugLineNum = 12124436;BA.debugLine="EditTextSaniye2.InputType = EditTextSaniye2.INPUT";
mostCurrent._edittextsaniye2.setInputType(mostCurrent._edittextsaniye2.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124438;
 //BA.debugLineNum = 12124438;BA.debugLine="EditTextSaniye3.TextSize = 20";
mostCurrent._edittextsaniye3.setTextSize((float) (20));
RDebugUtils.currentLine=12124439;
 //BA.debugLineNum = 12124439;BA.debugLine="EditTextSaniye3.TextColor = Colors.White";
mostCurrent._edittextsaniye3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124440;
 //BA.debugLineNum = 12124440;BA.debugLine="EditTextSaniye3.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124441;
 //BA.debugLineNum = 12124441;BA.debugLine="EditTextSaniye3.InputType = EditTextSaniye3.INPUT";
mostCurrent._edittextsaniye3.setInputType(mostCurrent._edittextsaniye3.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124443;
 //BA.debugLineNum = 12124443;BA.debugLine="EditTextSaniye4.TextSize = 20";
mostCurrent._edittextsaniye4.setTextSize((float) (20));
RDebugUtils.currentLine=12124444;
 //BA.debugLineNum = 12124444;BA.debugLine="EditTextSaniye4.TextColor = Colors.White";
mostCurrent._edittextsaniye4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124445;
 //BA.debugLineNum = 12124445;BA.debugLine="EditTextSaniye4.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124446;
 //BA.debugLineNum = 12124446;BA.debugLine="EditTextSaniye4.InputType = EditTextSaniye4.INPUT";
mostCurrent._edittextsaniye4.setInputType(mostCurrent._edittextsaniye4.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124448;
 //BA.debugLineNum = 12124448;BA.debugLine="EditTextSaniye5.TextSize = 20";
mostCurrent._edittextsaniye5.setTextSize((float) (20));
RDebugUtils.currentLine=12124449;
 //BA.debugLineNum = 12124449;BA.debugLine="EditTextSaniye5.TextColor = Colors.White";
mostCurrent._edittextsaniye5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124450;
 //BA.debugLineNum = 12124450;BA.debugLine="EditTextSaniye5.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124451;
 //BA.debugLineNum = 12124451;BA.debugLine="EditTextSaniye5.InputType = EditTextSaniye5.INPUT";
mostCurrent._edittextsaniye5.setInputType(mostCurrent._edittextsaniye5.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124453;
 //BA.debugLineNum = 12124453;BA.debugLine="EditTextSaniye6.TextSize = 20";
mostCurrent._edittextsaniye6.setTextSize((float) (20));
RDebugUtils.currentLine=12124454;
 //BA.debugLineNum = 12124454;BA.debugLine="EditTextSaniye6.TextColor = Colors.White";
mostCurrent._edittextsaniye6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124455;
 //BA.debugLineNum = 12124455;BA.debugLine="EditTextSaniye6.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124456;
 //BA.debugLineNum = 12124456;BA.debugLine="EditTextSaniye6.InputType = EditTextSaniye6.INPUT";
mostCurrent._edittextsaniye6.setInputType(mostCurrent._edittextsaniye6.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124458;
 //BA.debugLineNum = 12124458;BA.debugLine="EditTextSaniye7.TextSize = 20";
mostCurrent._edittextsaniye7.setTextSize((float) (20));
RDebugUtils.currentLine=12124459;
 //BA.debugLineNum = 12124459;BA.debugLine="EditTextSaniye7.TextColor = Colors.White";
mostCurrent._edittextsaniye7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124460;
 //BA.debugLineNum = 12124460;BA.debugLine="EditTextSaniye7.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124461;
 //BA.debugLineNum = 12124461;BA.debugLine="EditTextSaniye7.InputType = EditTextSaniye7.INPUT";
mostCurrent._edittextsaniye7.setInputType(mostCurrent._edittextsaniye7.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124463;
 //BA.debugLineNum = 12124463;BA.debugLine="EditTextSaniye8.TextSize = 20";
mostCurrent._edittextsaniye8.setTextSize((float) (20));
RDebugUtils.currentLine=12124464;
 //BA.debugLineNum = 12124464;BA.debugLine="EditTextSaniye8.TextColor = Colors.White";
mostCurrent._edittextsaniye8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124465;
 //BA.debugLineNum = 12124465;BA.debugLine="EditTextSaniye8.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124466;
 //BA.debugLineNum = 12124466;BA.debugLine="EditTextSaniye8.InputType = EditTextSaniye8.INPUT";
mostCurrent._edittextsaniye8.setInputType(mostCurrent._edittextsaniye8.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124468;
 //BA.debugLineNum = 12124468;BA.debugLine="EditTextSaniye9.TextSize = 20";
mostCurrent._edittextsaniye9.setTextSize((float) (20));
RDebugUtils.currentLine=12124469;
 //BA.debugLineNum = 12124469;BA.debugLine="EditTextSaniye9.TextColor = Colors.White";
mostCurrent._edittextsaniye9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124470;
 //BA.debugLineNum = 12124470;BA.debugLine="EditTextSaniye9.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124471;
 //BA.debugLineNum = 12124471;BA.debugLine="EditTextSaniye9.InputType = EditTextSaniye9.INPUT";
mostCurrent._edittextsaniye9.setInputType(mostCurrent._edittextsaniye9.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124473;
 //BA.debugLineNum = 12124473;BA.debugLine="EditTextSaniye10.TextSize = 20";
mostCurrent._edittextsaniye10.setTextSize((float) (20));
RDebugUtils.currentLine=12124474;
 //BA.debugLineNum = 12124474;BA.debugLine="EditTextSaniye10.TextColor = Colors.White";
mostCurrent._edittextsaniye10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124475;
 //BA.debugLineNum = 12124475;BA.debugLine="EditTextSaniye10.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124476;
 //BA.debugLineNum = 12124476;BA.debugLine="EditTextSaniye10.InputType = EditTextSaniye10.INP";
mostCurrent._edittextsaniye10.setInputType(mostCurrent._edittextsaniye10.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124478;
 //BA.debugLineNum = 12124478;BA.debugLine="EditTextSaniye11.TextSize = 20";
mostCurrent._edittextsaniye11.setTextSize((float) (20));
RDebugUtils.currentLine=12124479;
 //BA.debugLineNum = 12124479;BA.debugLine="EditTextSaniye11.TextColor = Colors.White";
mostCurrent._edittextsaniye11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124480;
 //BA.debugLineNum = 12124480;BA.debugLine="EditTextSaniye11.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124481;
 //BA.debugLineNum = 12124481;BA.debugLine="EditTextSaniye11.InputType = EditTextSaniye11.INP";
mostCurrent._edittextsaniye11.setInputType(mostCurrent._edittextsaniye11.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124483;
 //BA.debugLineNum = 12124483;BA.debugLine="EditTextSaniye12.TextSize = 20";
mostCurrent._edittextsaniye12.setTextSize((float) (20));
RDebugUtils.currentLine=12124484;
 //BA.debugLineNum = 12124484;BA.debugLine="EditTextSaniye12.TextColor = Colors.White";
mostCurrent._edittextsaniye12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124485;
 //BA.debugLineNum = 12124485;BA.debugLine="EditTextSaniye12.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124486;
 //BA.debugLineNum = 12124486;BA.debugLine="EditTextSaniye12.InputType = EditTextSaniye12.INP";
mostCurrent._edittextsaniye12.setInputType(mostCurrent._edittextsaniye12.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124488;
 //BA.debugLineNum = 12124488;BA.debugLine="EditTextSaniye13.TextSize = 20";
mostCurrent._edittextsaniye13.setTextSize((float) (20));
RDebugUtils.currentLine=12124489;
 //BA.debugLineNum = 12124489;BA.debugLine="EditTextSaniye13.TextColor = Colors.White";
mostCurrent._edittextsaniye13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124490;
 //BA.debugLineNum = 12124490;BA.debugLine="EditTextSaniye13.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124491;
 //BA.debugLineNum = 12124491;BA.debugLine="EditTextSaniye13.InputType = EditTextSaniye13.INP";
mostCurrent._edittextsaniye13.setInputType(mostCurrent._edittextsaniye13.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124493;
 //BA.debugLineNum = 12124493;BA.debugLine="EditTextSaniye14.TextSize = 20";
mostCurrent._edittextsaniye14.setTextSize((float) (20));
RDebugUtils.currentLine=12124494;
 //BA.debugLineNum = 12124494;BA.debugLine="EditTextSaniye14.TextColor = Colors.White";
mostCurrent._edittextsaniye14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124495;
 //BA.debugLineNum = 12124495;BA.debugLine="EditTextSaniye14.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124496;
 //BA.debugLineNum = 12124496;BA.debugLine="EditTextSaniye14.InputType = EditTextSaniye14.INP";
mostCurrent._edittextsaniye14.setInputType(mostCurrent._edittextsaniye14.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124498;
 //BA.debugLineNum = 12124498;BA.debugLine="EditTextSaniye15.TextSize = 20";
mostCurrent._edittextsaniye15.setTextSize((float) (20));
RDebugUtils.currentLine=12124499;
 //BA.debugLineNum = 12124499;BA.debugLine="EditTextSaniye15.TextColor = Colors.White";
mostCurrent._edittextsaniye15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124500;
 //BA.debugLineNum = 12124500;BA.debugLine="EditTextSaniye15.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124501;
 //BA.debugLineNum = 12124501;BA.debugLine="EditTextSaniye15.InputType = EditTextSaniye15.INP";
mostCurrent._edittextsaniye15.setInputType(mostCurrent._edittextsaniye15.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124503;
 //BA.debugLineNum = 12124503;BA.debugLine="EditTextSaniye16.TextSize = 20";
mostCurrent._edittextsaniye16.setTextSize((float) (20));
RDebugUtils.currentLine=12124504;
 //BA.debugLineNum = 12124504;BA.debugLine="EditTextSaniye16.TextColor = Colors.White";
mostCurrent._edittextsaniye16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124505;
 //BA.debugLineNum = 12124505;BA.debugLine="EditTextSaniye16.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124506;
 //BA.debugLineNum = 12124506;BA.debugLine="EditTextSaniye16.InputType = EditTextSaniye16.INP";
mostCurrent._edittextsaniye16.setInputType(mostCurrent._edittextsaniye16.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124508;
 //BA.debugLineNum = 12124508;BA.debugLine="EditTextSaniye17.TextSize = 20";
mostCurrent._edittextsaniye17.setTextSize((float) (20));
RDebugUtils.currentLine=12124509;
 //BA.debugLineNum = 12124509;BA.debugLine="EditTextSaniye17.TextColor = Colors.White";
mostCurrent._edittextsaniye17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124510;
 //BA.debugLineNum = 12124510;BA.debugLine="EditTextSaniye17.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124511;
 //BA.debugLineNum = 12124511;BA.debugLine="EditTextSaniye17.InputType = EditTextSaniye17.INP";
mostCurrent._edittextsaniye17.setInputType(mostCurrent._edittextsaniye17.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124513;
 //BA.debugLineNum = 12124513;BA.debugLine="EditTextSaniye18.TextSize = 20";
mostCurrent._edittextsaniye18.setTextSize((float) (20));
RDebugUtils.currentLine=12124514;
 //BA.debugLineNum = 12124514;BA.debugLine="EditTextSaniye18.TextColor = Colors.White";
mostCurrent._edittextsaniye18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124515;
 //BA.debugLineNum = 12124515;BA.debugLine="EditTextSaniye18.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124516;
 //BA.debugLineNum = 12124516;BA.debugLine="EditTextSaniye18.InputType = EditTextSaniye18.INP";
mostCurrent._edittextsaniye18.setInputType(mostCurrent._edittextsaniye18.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124518;
 //BA.debugLineNum = 12124518;BA.debugLine="EditTextSaniye19.TextSize = 20";
mostCurrent._edittextsaniye19.setTextSize((float) (20));
RDebugUtils.currentLine=12124519;
 //BA.debugLineNum = 12124519;BA.debugLine="EditTextSaniye19.TextColor = Colors.White";
mostCurrent._edittextsaniye19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124520;
 //BA.debugLineNum = 12124520;BA.debugLine="EditTextSaniye19.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124521;
 //BA.debugLineNum = 12124521;BA.debugLine="EditTextSaniye19.InputType = EditTextSaniye19.INP";
mostCurrent._edittextsaniye19.setInputType(mostCurrent._edittextsaniye19.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124523;
 //BA.debugLineNum = 12124523;BA.debugLine="EditTextSaniye20.TextSize = 20";
mostCurrent._edittextsaniye20.setTextSize((float) (20));
RDebugUtils.currentLine=12124524;
 //BA.debugLineNum = 12124524;BA.debugLine="EditTextSaniye20.TextColor = Colors.White";
mostCurrent._edittextsaniye20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124525;
 //BA.debugLineNum = 12124525;BA.debugLine="EditTextSaniye20.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124526;
 //BA.debugLineNum = 12124526;BA.debugLine="EditTextSaniye20.InputType = EditTextSaniye20.INP";
mostCurrent._edittextsaniye20.setInputType(mostCurrent._edittextsaniye20.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124528;
 //BA.debugLineNum = 12124528;BA.debugLine="EditTextSaniye21.TextSize = 20";
mostCurrent._edittextsaniye21.setTextSize((float) (20));
RDebugUtils.currentLine=12124529;
 //BA.debugLineNum = 12124529;BA.debugLine="EditTextSaniye21.TextColor = Colors.White";
mostCurrent._edittextsaniye21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124530;
 //BA.debugLineNum = 12124530;BA.debugLine="EditTextSaniye21.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124531;
 //BA.debugLineNum = 12124531;BA.debugLine="EditTextSaniye21.InputType = EditTextSaniye21.INP";
mostCurrent._edittextsaniye21.setInputType(mostCurrent._edittextsaniye21.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124533;
 //BA.debugLineNum = 12124533;BA.debugLine="EditTextSaniye22.TextSize = 20";
mostCurrent._edittextsaniye22.setTextSize((float) (20));
RDebugUtils.currentLine=12124534;
 //BA.debugLineNum = 12124534;BA.debugLine="EditTextSaniye22.TextColor = Colors.White";
mostCurrent._edittextsaniye22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124535;
 //BA.debugLineNum = 12124535;BA.debugLine="EditTextSaniye22.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124536;
 //BA.debugLineNum = 12124536;BA.debugLine="EditTextSaniye22.InputType = EditTextSaniye22.INP";
mostCurrent._edittextsaniye22.setInputType(mostCurrent._edittextsaniye22.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124538;
 //BA.debugLineNum = 12124538;BA.debugLine="EditTextSaniye23.TextSize = 20";
mostCurrent._edittextsaniye23.setTextSize((float) (20));
RDebugUtils.currentLine=12124539;
 //BA.debugLineNum = 12124539;BA.debugLine="EditTextSaniye23.TextColor = Colors.White";
mostCurrent._edittextsaniye23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124540;
 //BA.debugLineNum = 12124540;BA.debugLine="EditTextSaniye23.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124541;
 //BA.debugLineNum = 12124541;BA.debugLine="EditTextSaniye23.InputType = EditTextSaniye23.INP";
mostCurrent._edittextsaniye23.setInputType(mostCurrent._edittextsaniye23.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124543;
 //BA.debugLineNum = 12124543;BA.debugLine="EditTextSaniye24.TextSize = 20";
mostCurrent._edittextsaniye24.setTextSize((float) (20));
RDebugUtils.currentLine=12124544;
 //BA.debugLineNum = 12124544;BA.debugLine="EditTextSaniye24.TextColor = Colors.White";
mostCurrent._edittextsaniye24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124545;
 //BA.debugLineNum = 12124545;BA.debugLine="EditTextSaniye24.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124546;
 //BA.debugLineNum = 12124546;BA.debugLine="EditTextSaniye24.InputType = EditTextSaniye24.INP";
mostCurrent._edittextsaniye24.setInputType(mostCurrent._edittextsaniye24.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124548;
 //BA.debugLineNum = 12124548;BA.debugLine="EditTextSaniye25.TextSize = 20";
mostCurrent._edittextsaniye25.setTextSize((float) (20));
RDebugUtils.currentLine=12124549;
 //BA.debugLineNum = 12124549;BA.debugLine="EditTextSaniye25.TextColor = Colors.White";
mostCurrent._edittextsaniye25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124550;
 //BA.debugLineNum = 12124550;BA.debugLine="EditTextSaniye25.Typeface = Typeface.DEFAULT";
mostCurrent._edittextsaniye25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124551;
 //BA.debugLineNum = 12124551;BA.debugLine="EditTextSaniye25.InputType = EditTextSaniye25.INP";
mostCurrent._edittextsaniye25.setInputType(mostCurrent._edittextsaniye25.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=12124556;
 //BA.debugLineNum = 12124556;BA.debugLine="EditTextHiz1.TextSize = 20";
mostCurrent._edittexthiz1.setTextSize((float) (20));
RDebugUtils.currentLine=12124557;
 //BA.debugLineNum = 12124557;BA.debugLine="EditTextHiz1.TextColor = Colors.White";
mostCurrent._edittexthiz1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124558;
 //BA.debugLineNum = 12124558;BA.debugLine="EditTextHiz1.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124559;
 //BA.debugLineNum = 12124559;BA.debugLine="EditTextHiz1.InputType = EditTextHiz1.INPUT_TYPE_";
mostCurrent._edittexthiz1.setInputType(mostCurrent._edittexthiz1.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124561;
 //BA.debugLineNum = 12124561;BA.debugLine="EditTextHiz2.TextSize = 20";
mostCurrent._edittexthiz2.setTextSize((float) (20));
RDebugUtils.currentLine=12124562;
 //BA.debugLineNum = 12124562;BA.debugLine="EditTextHiz2.TextColor = Colors.White";
mostCurrent._edittexthiz2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124563;
 //BA.debugLineNum = 12124563;BA.debugLine="EditTextHiz2.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124564;
 //BA.debugLineNum = 12124564;BA.debugLine="EditTextHiz2.InputType = EditTextHiz2.INPUT_TYPE_";
mostCurrent._edittexthiz2.setInputType(mostCurrent._edittexthiz2.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124566;
 //BA.debugLineNum = 12124566;BA.debugLine="EditTextHiz3.TextSize = 20";
mostCurrent._edittexthiz3.setTextSize((float) (20));
RDebugUtils.currentLine=12124567;
 //BA.debugLineNum = 12124567;BA.debugLine="EditTextHiz3.TextColor = Colors.White";
mostCurrent._edittexthiz3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124568;
 //BA.debugLineNum = 12124568;BA.debugLine="EditTextHiz3.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124569;
 //BA.debugLineNum = 12124569;BA.debugLine="EditTextHiz3.InputType = EditTextHiz3.INPUT_TYPE_";
mostCurrent._edittexthiz3.setInputType(mostCurrent._edittexthiz3.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124571;
 //BA.debugLineNum = 12124571;BA.debugLine="EditTextHiz4.TextSize = 20";
mostCurrent._edittexthiz4.setTextSize((float) (20));
RDebugUtils.currentLine=12124572;
 //BA.debugLineNum = 12124572;BA.debugLine="EditTextHiz4.TextColor = Colors.White";
mostCurrent._edittexthiz4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124573;
 //BA.debugLineNum = 12124573;BA.debugLine="EditTextHiz4.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124574;
 //BA.debugLineNum = 12124574;BA.debugLine="EditTextHiz4.InputType = EditTextHiz4.INPUT_TYPE_";
mostCurrent._edittexthiz4.setInputType(mostCurrent._edittexthiz4.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124576;
 //BA.debugLineNum = 12124576;BA.debugLine="EditTextHiz5.TextSize = 20";
mostCurrent._edittexthiz5.setTextSize((float) (20));
RDebugUtils.currentLine=12124577;
 //BA.debugLineNum = 12124577;BA.debugLine="EditTextHiz5.TextColor = Colors.White";
mostCurrent._edittexthiz5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124578;
 //BA.debugLineNum = 12124578;BA.debugLine="EditTextHiz5.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124579;
 //BA.debugLineNum = 12124579;BA.debugLine="EditTextHiz5.InputType = EditTextHiz5.INPUT_TYPE_";
mostCurrent._edittexthiz5.setInputType(mostCurrent._edittexthiz5.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124581;
 //BA.debugLineNum = 12124581;BA.debugLine="EditTextHiz6.TextSize = 20";
mostCurrent._edittexthiz6.setTextSize((float) (20));
RDebugUtils.currentLine=12124582;
 //BA.debugLineNum = 12124582;BA.debugLine="EditTextHiz6.TextColor = Colors.White";
mostCurrent._edittexthiz6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124583;
 //BA.debugLineNum = 12124583;BA.debugLine="EditTextHiz6.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124584;
 //BA.debugLineNum = 12124584;BA.debugLine="EditTextHiz6.InputType = EditTextHiz6.INPUT_TYPE_";
mostCurrent._edittexthiz6.setInputType(mostCurrent._edittexthiz6.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124586;
 //BA.debugLineNum = 12124586;BA.debugLine="EditTextHiz7.TextSize = 20";
mostCurrent._edittexthiz7.setTextSize((float) (20));
RDebugUtils.currentLine=12124587;
 //BA.debugLineNum = 12124587;BA.debugLine="EditTextHiz7.TextColor = Colors.White";
mostCurrent._edittexthiz7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124588;
 //BA.debugLineNum = 12124588;BA.debugLine="EditTextHiz7.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124589;
 //BA.debugLineNum = 12124589;BA.debugLine="EditTextHiz7.InputType = EditTextHiz7.INPUT_TYPE_";
mostCurrent._edittexthiz7.setInputType(mostCurrent._edittexthiz7.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124591;
 //BA.debugLineNum = 12124591;BA.debugLine="EditTextHiz8.TextSize = 20";
mostCurrent._edittexthiz8.setTextSize((float) (20));
RDebugUtils.currentLine=12124592;
 //BA.debugLineNum = 12124592;BA.debugLine="EditTextHiz8.TextColor = Colors.White";
mostCurrent._edittexthiz8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124593;
 //BA.debugLineNum = 12124593;BA.debugLine="EditTextHiz8.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124594;
 //BA.debugLineNum = 12124594;BA.debugLine="EditTextHiz8.InputType = EditTextHiz8.INPUT_TYPE_";
mostCurrent._edittexthiz8.setInputType(mostCurrent._edittexthiz8.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124596;
 //BA.debugLineNum = 12124596;BA.debugLine="EditTextHiz9.TextSize = 20";
mostCurrent._edittexthiz9.setTextSize((float) (20));
RDebugUtils.currentLine=12124597;
 //BA.debugLineNum = 12124597;BA.debugLine="EditTextHiz9.TextColor = Colors.White";
mostCurrent._edittexthiz9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124598;
 //BA.debugLineNum = 12124598;BA.debugLine="EditTextHiz9.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124599;
 //BA.debugLineNum = 12124599;BA.debugLine="EditTextHiz9.InputType = EditTextHiz9.INPUT_TYPE_";
mostCurrent._edittexthiz9.setInputType(mostCurrent._edittexthiz9.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124601;
 //BA.debugLineNum = 12124601;BA.debugLine="EditTextHiz10.TextSize = 20";
mostCurrent._edittexthiz10.setTextSize((float) (20));
RDebugUtils.currentLine=12124602;
 //BA.debugLineNum = 12124602;BA.debugLine="EditTextHiz10.TextColor = Colors.White";
mostCurrent._edittexthiz10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124603;
 //BA.debugLineNum = 12124603;BA.debugLine="EditTextHiz10.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124604;
 //BA.debugLineNum = 12124604;BA.debugLine="EditTextHiz10.InputType = EditTextHiz10.INPUT_TYP";
mostCurrent._edittexthiz10.setInputType(mostCurrent._edittexthiz10.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124606;
 //BA.debugLineNum = 12124606;BA.debugLine="EditTextHiz11.TextSize = 20";
mostCurrent._edittexthiz11.setTextSize((float) (20));
RDebugUtils.currentLine=12124607;
 //BA.debugLineNum = 12124607;BA.debugLine="EditTextHiz11.TextColor = Colors.White";
mostCurrent._edittexthiz11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124608;
 //BA.debugLineNum = 12124608;BA.debugLine="EditTextHiz11.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124609;
 //BA.debugLineNum = 12124609;BA.debugLine="EditTextHiz11.InputType = EditTextHiz11.INPUT_TYP";
mostCurrent._edittexthiz11.setInputType(mostCurrent._edittexthiz11.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124611;
 //BA.debugLineNum = 12124611;BA.debugLine="EditTextHiz12.TextSize = 20";
mostCurrent._edittexthiz12.setTextSize((float) (20));
RDebugUtils.currentLine=12124612;
 //BA.debugLineNum = 12124612;BA.debugLine="EditTextHiz12.TextColor = Colors.White";
mostCurrent._edittexthiz12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124613;
 //BA.debugLineNum = 12124613;BA.debugLine="EditTextHiz12.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124614;
 //BA.debugLineNum = 12124614;BA.debugLine="EditTextHiz12.InputType = EditTextHiz12.INPUT_TYP";
mostCurrent._edittexthiz12.setInputType(mostCurrent._edittexthiz12.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124616;
 //BA.debugLineNum = 12124616;BA.debugLine="EditTextHiz13.TextSize = 20";
mostCurrent._edittexthiz13.setTextSize((float) (20));
RDebugUtils.currentLine=12124617;
 //BA.debugLineNum = 12124617;BA.debugLine="EditTextHiz13.TextColor = Colors.White";
mostCurrent._edittexthiz13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124618;
 //BA.debugLineNum = 12124618;BA.debugLine="EditTextHiz13.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124619;
 //BA.debugLineNum = 12124619;BA.debugLine="EditTextHiz13.InputType = EditTextHiz13.INPUT_TYP";
mostCurrent._edittexthiz13.setInputType(mostCurrent._edittexthiz13.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124621;
 //BA.debugLineNum = 12124621;BA.debugLine="EditTextHiz14.TextSize = 20";
mostCurrent._edittexthiz14.setTextSize((float) (20));
RDebugUtils.currentLine=12124622;
 //BA.debugLineNum = 12124622;BA.debugLine="EditTextHiz14.TextColor = Colors.White";
mostCurrent._edittexthiz14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124623;
 //BA.debugLineNum = 12124623;BA.debugLine="EditTextHiz14.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124624;
 //BA.debugLineNum = 12124624;BA.debugLine="EditTextHiz14.InputType = EditTextHiz14.INPUT_TYP";
mostCurrent._edittexthiz14.setInputType(mostCurrent._edittexthiz14.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124626;
 //BA.debugLineNum = 12124626;BA.debugLine="EditTextHiz15.TextSize = 20";
mostCurrent._edittexthiz15.setTextSize((float) (20));
RDebugUtils.currentLine=12124627;
 //BA.debugLineNum = 12124627;BA.debugLine="EditTextHiz15.TextColor = Colors.White";
mostCurrent._edittexthiz15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124628;
 //BA.debugLineNum = 12124628;BA.debugLine="EditTextHiz15.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124629;
 //BA.debugLineNum = 12124629;BA.debugLine="EditTextHiz15.InputType = EditTextHiz15.INPUT_TYP";
mostCurrent._edittexthiz15.setInputType(mostCurrent._edittexthiz15.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124631;
 //BA.debugLineNum = 12124631;BA.debugLine="EditTextHiz16.TextSize = 20";
mostCurrent._edittexthiz16.setTextSize((float) (20));
RDebugUtils.currentLine=12124632;
 //BA.debugLineNum = 12124632;BA.debugLine="EditTextHiz16.TextColor = Colors.White";
mostCurrent._edittexthiz16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124633;
 //BA.debugLineNum = 12124633;BA.debugLine="EditTextHiz16.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124634;
 //BA.debugLineNum = 12124634;BA.debugLine="EditTextHiz16.InputType = EditTextHiz16.INPUT_TYP";
mostCurrent._edittexthiz16.setInputType(mostCurrent._edittexthiz16.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124636;
 //BA.debugLineNum = 12124636;BA.debugLine="EditTextHiz17.TextSize = 20";
mostCurrent._edittexthiz17.setTextSize((float) (20));
RDebugUtils.currentLine=12124637;
 //BA.debugLineNum = 12124637;BA.debugLine="EditTextHiz17.TextColor = Colors.White";
mostCurrent._edittexthiz17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124638;
 //BA.debugLineNum = 12124638;BA.debugLine="EditTextHiz17.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124639;
 //BA.debugLineNum = 12124639;BA.debugLine="EditTextHiz17.InputType = EditTextHiz17.INPUT_TYP";
mostCurrent._edittexthiz17.setInputType(mostCurrent._edittexthiz17.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124641;
 //BA.debugLineNum = 12124641;BA.debugLine="EditTextHiz18.TextSize = 20";
mostCurrent._edittexthiz18.setTextSize((float) (20));
RDebugUtils.currentLine=12124642;
 //BA.debugLineNum = 12124642;BA.debugLine="EditTextHiz18.TextColor = Colors.White";
mostCurrent._edittexthiz18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124643;
 //BA.debugLineNum = 12124643;BA.debugLine="EditTextHiz18.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124644;
 //BA.debugLineNum = 12124644;BA.debugLine="EditTextHiz18.InputType = EditTextHiz18.INPUT_TYP";
mostCurrent._edittexthiz18.setInputType(mostCurrent._edittexthiz18.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124646;
 //BA.debugLineNum = 12124646;BA.debugLine="EditTextHiz19.TextSize = 20";
mostCurrent._edittexthiz19.setTextSize((float) (20));
RDebugUtils.currentLine=12124647;
 //BA.debugLineNum = 12124647;BA.debugLine="EditTextHiz19.TextColor = Colors.White";
mostCurrent._edittexthiz19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124648;
 //BA.debugLineNum = 12124648;BA.debugLine="EditTextHiz19.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124649;
 //BA.debugLineNum = 12124649;BA.debugLine="EditTextHiz19.InputType = EditTextHiz19.INPUT_TYP";
mostCurrent._edittexthiz19.setInputType(mostCurrent._edittexthiz19.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124651;
 //BA.debugLineNum = 12124651;BA.debugLine="EditTextHiz20.TextSize = 20";
mostCurrent._edittexthiz20.setTextSize((float) (20));
RDebugUtils.currentLine=12124652;
 //BA.debugLineNum = 12124652;BA.debugLine="EditTextHiz20.TextColor = Colors.White";
mostCurrent._edittexthiz20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124653;
 //BA.debugLineNum = 12124653;BA.debugLine="EditTextHiz20.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124654;
 //BA.debugLineNum = 12124654;BA.debugLine="EditTextHiz20.InputType = EditTextHiz20.INPUT_TYP";
mostCurrent._edittexthiz20.setInputType(mostCurrent._edittexthiz20.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124656;
 //BA.debugLineNum = 12124656;BA.debugLine="EditTextHiz21.TextSize = 20";
mostCurrent._edittexthiz21.setTextSize((float) (20));
RDebugUtils.currentLine=12124657;
 //BA.debugLineNum = 12124657;BA.debugLine="EditTextHiz21.TextColor = Colors.White";
mostCurrent._edittexthiz21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124658;
 //BA.debugLineNum = 12124658;BA.debugLine="EditTextHiz21.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124659;
 //BA.debugLineNum = 12124659;BA.debugLine="EditTextHiz21.InputType = EditTextHiz21.INPUT_TYP";
mostCurrent._edittexthiz21.setInputType(mostCurrent._edittexthiz21.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124661;
 //BA.debugLineNum = 12124661;BA.debugLine="EditTextHiz22.TextSize = 20";
mostCurrent._edittexthiz22.setTextSize((float) (20));
RDebugUtils.currentLine=12124662;
 //BA.debugLineNum = 12124662;BA.debugLine="EditTextHiz22.TextColor = Colors.White";
mostCurrent._edittexthiz22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124663;
 //BA.debugLineNum = 12124663;BA.debugLine="EditTextHiz22.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124664;
 //BA.debugLineNum = 12124664;BA.debugLine="EditTextHiz22.InputType = EditTextHiz22.INPUT_TYP";
mostCurrent._edittexthiz22.setInputType(mostCurrent._edittexthiz22.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124666;
 //BA.debugLineNum = 12124666;BA.debugLine="EditTextHiz23.TextSize = 20";
mostCurrent._edittexthiz23.setTextSize((float) (20));
RDebugUtils.currentLine=12124667;
 //BA.debugLineNum = 12124667;BA.debugLine="EditTextHiz23.TextColor = Colors.White";
mostCurrent._edittexthiz23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124668;
 //BA.debugLineNum = 12124668;BA.debugLine="EditTextHiz23.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124669;
 //BA.debugLineNum = 12124669;BA.debugLine="EditTextHiz23.InputType = EditTextHiz23.INPUT_TYP";
mostCurrent._edittexthiz23.setInputType(mostCurrent._edittexthiz23.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124671;
 //BA.debugLineNum = 12124671;BA.debugLine="EditTextHiz24.TextSize = 20";
mostCurrent._edittexthiz24.setTextSize((float) (20));
RDebugUtils.currentLine=12124672;
 //BA.debugLineNum = 12124672;BA.debugLine="EditTextHiz24.TextColor = Colors.White";
mostCurrent._edittexthiz24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124673;
 //BA.debugLineNum = 12124673;BA.debugLine="EditTextHiz24.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124674;
 //BA.debugLineNum = 12124674;BA.debugLine="EditTextHiz24.InputType = EditTextHiz24.INPUT_TYP";
mostCurrent._edittexthiz24.setInputType(mostCurrent._edittexthiz24.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124676;
 //BA.debugLineNum = 12124676;BA.debugLine="EditTextHiz25.TextSize = 20";
mostCurrent._edittexthiz25.setTextSize((float) (20));
RDebugUtils.currentLine=12124677;
 //BA.debugLineNum = 12124677;BA.debugLine="EditTextHiz25.TextColor = Colors.White";
mostCurrent._edittexthiz25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124678;
 //BA.debugLineNum = 12124678;BA.debugLine="EditTextHiz25.Typeface = Typeface.DEFAULT";
mostCurrent._edittexthiz25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT);
RDebugUtils.currentLine=12124679;
 //BA.debugLineNum = 12124679;BA.debugLine="EditTextHiz25.InputType = EditTextHiz25.INPUT_TYP";
mostCurrent._edittexthiz25.setInputType(mostCurrent._edittexthiz25.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=12124807;
 //BA.debugLineNum = 12124807;BA.debugLine="LabelSeviyeIsmi1.TextColor = Colors.White";
mostCurrent._labelseviyeismi1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124808;
 //BA.debugLineNum = 12124808;BA.debugLine="LabelSeviyeIsmi1.TextSize = 20";
mostCurrent._labelseviyeismi1.setTextSize((float) (20));
RDebugUtils.currentLine=12124809;
 //BA.debugLineNum = 12124809;BA.debugLine="LabelSeviyeIsmi1.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124811;
 //BA.debugLineNum = 12124811;BA.debugLine="LabelSeviyeIsmi2.TextColor = Colors.White";
mostCurrent._labelseviyeismi2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124812;
 //BA.debugLineNum = 12124812;BA.debugLine="LabelSeviyeIsmi2.TextSize = 20";
mostCurrent._labelseviyeismi2.setTextSize((float) (20));
RDebugUtils.currentLine=12124813;
 //BA.debugLineNum = 12124813;BA.debugLine="LabelSeviyeIsmi2.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124815;
 //BA.debugLineNum = 12124815;BA.debugLine="LabelSeviyeIsmi3.TextColor = Colors.White";
mostCurrent._labelseviyeismi3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124816;
 //BA.debugLineNum = 12124816;BA.debugLine="LabelSeviyeIsmi3.TextSize = 20";
mostCurrent._labelseviyeismi3.setTextSize((float) (20));
RDebugUtils.currentLine=12124817;
 //BA.debugLineNum = 12124817;BA.debugLine="LabelSeviyeIsmi3.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124819;
 //BA.debugLineNum = 12124819;BA.debugLine="LabelSeviyeIsmi4.TextColor = Colors.White";
mostCurrent._labelseviyeismi4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124820;
 //BA.debugLineNum = 12124820;BA.debugLine="LabelSeviyeIsmi4.TextSize = 20";
mostCurrent._labelseviyeismi4.setTextSize((float) (20));
RDebugUtils.currentLine=12124821;
 //BA.debugLineNum = 12124821;BA.debugLine="LabelSeviyeIsmi4.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124823;
 //BA.debugLineNum = 12124823;BA.debugLine="LabelSeviyeIsmi5.TextColor = Colors.White";
mostCurrent._labelseviyeismi5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124824;
 //BA.debugLineNum = 12124824;BA.debugLine="LabelSeviyeIsmi5.TextSize = 20";
mostCurrent._labelseviyeismi5.setTextSize((float) (20));
RDebugUtils.currentLine=12124825;
 //BA.debugLineNum = 12124825;BA.debugLine="LabelSeviyeIsmi5.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124827;
 //BA.debugLineNum = 12124827;BA.debugLine="LabelSeviyeIsmi6.TextColor = Colors.White";
mostCurrent._labelseviyeismi6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124828;
 //BA.debugLineNum = 12124828;BA.debugLine="LabelSeviyeIsmi6.TextSize = 20";
mostCurrent._labelseviyeismi6.setTextSize((float) (20));
RDebugUtils.currentLine=12124829;
 //BA.debugLineNum = 12124829;BA.debugLine="LabelSeviyeIsmi6.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124831;
 //BA.debugLineNum = 12124831;BA.debugLine="LabelSeviyeIsmi7.TextColor = Colors.White";
mostCurrent._labelseviyeismi7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124832;
 //BA.debugLineNum = 12124832;BA.debugLine="LabelSeviyeIsmi7.TextSize = 20";
mostCurrent._labelseviyeismi7.setTextSize((float) (20));
RDebugUtils.currentLine=12124833;
 //BA.debugLineNum = 12124833;BA.debugLine="LabelSeviyeIsmi7.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124835;
 //BA.debugLineNum = 12124835;BA.debugLine="LabelSeviyeIsmi8.TextColor = Colors.White";
mostCurrent._labelseviyeismi8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124836;
 //BA.debugLineNum = 12124836;BA.debugLine="LabelSeviyeIsmi8.TextSize = 20";
mostCurrent._labelseviyeismi8.setTextSize((float) (20));
RDebugUtils.currentLine=12124837;
 //BA.debugLineNum = 12124837;BA.debugLine="LabelSeviyeIsmi8.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124839;
 //BA.debugLineNum = 12124839;BA.debugLine="LabelSeviyeIsmi9.TextColor = Colors.White";
mostCurrent._labelseviyeismi9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124840;
 //BA.debugLineNum = 12124840;BA.debugLine="LabelSeviyeIsmi9.TextSize = 20";
mostCurrent._labelseviyeismi9.setTextSize((float) (20));
RDebugUtils.currentLine=12124841;
 //BA.debugLineNum = 12124841;BA.debugLine="LabelSeviyeIsmi9.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelseviyeismi9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124843;
 //BA.debugLineNum = 12124843;BA.debugLine="LabelSeviyeIsmi10.TextColor = Colors.White";
mostCurrent._labelseviyeismi10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124844;
 //BA.debugLineNum = 12124844;BA.debugLine="LabelSeviyeIsmi10.TextSize = 20";
mostCurrent._labelseviyeismi10.setTextSize((float) (20));
RDebugUtils.currentLine=12124845;
 //BA.debugLineNum = 12124845;BA.debugLine="LabelSeviyeIsmi10.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124847;
 //BA.debugLineNum = 12124847;BA.debugLine="LabelSeviyeIsmi11.TextColor = Colors.White";
mostCurrent._labelseviyeismi11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124848;
 //BA.debugLineNum = 12124848;BA.debugLine="LabelSeviyeIsmi11.TextSize = 20";
mostCurrent._labelseviyeismi11.setTextSize((float) (20));
RDebugUtils.currentLine=12124849;
 //BA.debugLineNum = 12124849;BA.debugLine="LabelSeviyeIsmi11.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124851;
 //BA.debugLineNum = 12124851;BA.debugLine="LabelSeviyeIsmi12.TextColor = Colors.White";
mostCurrent._labelseviyeismi12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124852;
 //BA.debugLineNum = 12124852;BA.debugLine="LabelSeviyeIsmi12.TextSize = 20";
mostCurrent._labelseviyeismi12.setTextSize((float) (20));
RDebugUtils.currentLine=12124853;
 //BA.debugLineNum = 12124853;BA.debugLine="LabelSeviyeIsmi12.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124855;
 //BA.debugLineNum = 12124855;BA.debugLine="LabelSeviyeIsmi13.TextColor = Colors.White";
mostCurrent._labelseviyeismi13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124856;
 //BA.debugLineNum = 12124856;BA.debugLine="LabelSeviyeIsmi13.TextSize = 20";
mostCurrent._labelseviyeismi13.setTextSize((float) (20));
RDebugUtils.currentLine=12124857;
 //BA.debugLineNum = 12124857;BA.debugLine="LabelSeviyeIsmi13.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124859;
 //BA.debugLineNum = 12124859;BA.debugLine="LabelSeviyeIsmi14.TextColor = Colors.White";
mostCurrent._labelseviyeismi14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124860;
 //BA.debugLineNum = 12124860;BA.debugLine="LabelSeviyeIsmi14.TextSize = 20";
mostCurrent._labelseviyeismi14.setTextSize((float) (20));
RDebugUtils.currentLine=12124861;
 //BA.debugLineNum = 12124861;BA.debugLine="LabelSeviyeIsmi14.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124863;
 //BA.debugLineNum = 12124863;BA.debugLine="LabelSeviyeIsmi15.TextColor = Colors.White";
mostCurrent._labelseviyeismi15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124864;
 //BA.debugLineNum = 12124864;BA.debugLine="LabelSeviyeIsmi15.TextSize = 20";
mostCurrent._labelseviyeismi15.setTextSize((float) (20));
RDebugUtils.currentLine=12124865;
 //BA.debugLineNum = 12124865;BA.debugLine="LabelSeviyeIsmi15.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124867;
 //BA.debugLineNum = 12124867;BA.debugLine="LabelSeviyeIsmi16.TextColor = Colors.White";
mostCurrent._labelseviyeismi16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124868;
 //BA.debugLineNum = 12124868;BA.debugLine="LabelSeviyeIsmi16.TextSize = 20";
mostCurrent._labelseviyeismi16.setTextSize((float) (20));
RDebugUtils.currentLine=12124869;
 //BA.debugLineNum = 12124869;BA.debugLine="LabelSeviyeIsmi16.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124871;
 //BA.debugLineNum = 12124871;BA.debugLine="LabelSeviyeIsmi17.TextColor = Colors.White";
mostCurrent._labelseviyeismi17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124872;
 //BA.debugLineNum = 12124872;BA.debugLine="LabelSeviyeIsmi17.TextSize = 20";
mostCurrent._labelseviyeismi17.setTextSize((float) (20));
RDebugUtils.currentLine=12124873;
 //BA.debugLineNum = 12124873;BA.debugLine="LabelSeviyeIsmi17.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124875;
 //BA.debugLineNum = 12124875;BA.debugLine="LabelSeviyeIsmi18.TextColor = Colors.White";
mostCurrent._labelseviyeismi18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124876;
 //BA.debugLineNum = 12124876;BA.debugLine="LabelSeviyeIsmi18.TextSize = 20";
mostCurrent._labelseviyeismi18.setTextSize((float) (20));
RDebugUtils.currentLine=12124877;
 //BA.debugLineNum = 12124877;BA.debugLine="LabelSeviyeIsmi18.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124879;
 //BA.debugLineNum = 12124879;BA.debugLine="LabelSeviyeIsmi19.TextColor = Colors.White";
mostCurrent._labelseviyeismi19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124880;
 //BA.debugLineNum = 12124880;BA.debugLine="LabelSeviyeIsmi19.TextSize = 20";
mostCurrent._labelseviyeismi19.setTextSize((float) (20));
RDebugUtils.currentLine=12124881;
 //BA.debugLineNum = 12124881;BA.debugLine="LabelSeviyeIsmi19.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124883;
 //BA.debugLineNum = 12124883;BA.debugLine="LabelSeviyeIsmi20.TextColor = Colors.White";
mostCurrent._labelseviyeismi20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124884;
 //BA.debugLineNum = 12124884;BA.debugLine="LabelSeviyeIsmi20.TextSize = 20";
mostCurrent._labelseviyeismi20.setTextSize((float) (20));
RDebugUtils.currentLine=12124885;
 //BA.debugLineNum = 12124885;BA.debugLine="LabelSeviyeIsmi20.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124887;
 //BA.debugLineNum = 12124887;BA.debugLine="LabelSeviyeIsmi21.TextColor = Colors.White";
mostCurrent._labelseviyeismi21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124888;
 //BA.debugLineNum = 12124888;BA.debugLine="LabelSeviyeIsmi21.TextSize = 20";
mostCurrent._labelseviyeismi21.setTextSize((float) (20));
RDebugUtils.currentLine=12124889;
 //BA.debugLineNum = 12124889;BA.debugLine="LabelSeviyeIsmi21.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124891;
 //BA.debugLineNum = 12124891;BA.debugLine="LabelSeviyeIsmi22.TextColor = Colors.White";
mostCurrent._labelseviyeismi22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124892;
 //BA.debugLineNum = 12124892;BA.debugLine="LabelSeviyeIsmi22.TextSize = 20";
mostCurrent._labelseviyeismi22.setTextSize((float) (20));
RDebugUtils.currentLine=12124893;
 //BA.debugLineNum = 12124893;BA.debugLine="LabelSeviyeIsmi22.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124895;
 //BA.debugLineNum = 12124895;BA.debugLine="LabelSeviyeIsmi23.TextColor = Colors.White";
mostCurrent._labelseviyeismi23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124896;
 //BA.debugLineNum = 12124896;BA.debugLine="LabelSeviyeIsmi23.TextSize = 20";
mostCurrent._labelseviyeismi23.setTextSize((float) (20));
RDebugUtils.currentLine=12124897;
 //BA.debugLineNum = 12124897;BA.debugLine="LabelSeviyeIsmi23.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124899;
 //BA.debugLineNum = 12124899;BA.debugLine="LabelSeviyeIsmi24.TextColor = Colors.White";
mostCurrent._labelseviyeismi24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124900;
 //BA.debugLineNum = 12124900;BA.debugLine="LabelSeviyeIsmi24.TextSize = 20";
mostCurrent._labelseviyeismi24.setTextSize((float) (20));
RDebugUtils.currentLine=12124901;
 //BA.debugLineNum = 12124901;BA.debugLine="LabelSeviyeIsmi24.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124903;
 //BA.debugLineNum = 12124903;BA.debugLine="LabelSeviyeIsmi25.TextColor = Colors.White";
mostCurrent._labelseviyeismi25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124904;
 //BA.debugLineNum = 12124904;BA.debugLine="LabelSeviyeIsmi25.TextSize = 20";
mostCurrent._labelseviyeismi25.setTextSize((float) (20));
RDebugUtils.currentLine=12124905;
 //BA.debugLineNum = 12124905;BA.debugLine="LabelSeviyeIsmi25.Typeface = Typeface.DEFAULT_BOL";
mostCurrent._labelseviyeismi25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124909;
 //BA.debugLineNum = 12124909;BA.debugLine="LabelHiz1.TextColor = Colors.White";
mostCurrent._labelhiz1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124910;
 //BA.debugLineNum = 12124910;BA.debugLine="LabelHiz1.TextSize = 20";
mostCurrent._labelhiz1.setTextSize((float) (20));
RDebugUtils.currentLine=12124911;
 //BA.debugLineNum = 12124911;BA.debugLine="LabelHiz1.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124913;
 //BA.debugLineNum = 12124913;BA.debugLine="LabelHiz2.TextColor = Colors.White";
mostCurrent._labelhiz2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124914;
 //BA.debugLineNum = 12124914;BA.debugLine="LabelHiz2.TextSize = 20";
mostCurrent._labelhiz2.setTextSize((float) (20));
RDebugUtils.currentLine=12124915;
 //BA.debugLineNum = 12124915;BA.debugLine="LabelHiz2.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124917;
 //BA.debugLineNum = 12124917;BA.debugLine="LabelHiz3.TextColor = Colors.White";
mostCurrent._labelhiz3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124918;
 //BA.debugLineNum = 12124918;BA.debugLine="LabelHiz3.TextSize = 20";
mostCurrent._labelhiz3.setTextSize((float) (20));
RDebugUtils.currentLine=12124919;
 //BA.debugLineNum = 12124919;BA.debugLine="LabelHiz3.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124921;
 //BA.debugLineNum = 12124921;BA.debugLine="LabelHiz4.TextColor = Colors.White";
mostCurrent._labelhiz4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124922;
 //BA.debugLineNum = 12124922;BA.debugLine="LabelHiz4.TextSize = 20";
mostCurrent._labelhiz4.setTextSize((float) (20));
RDebugUtils.currentLine=12124923;
 //BA.debugLineNum = 12124923;BA.debugLine="LabelHiz4.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124925;
 //BA.debugLineNum = 12124925;BA.debugLine="LabelHiz5.TextColor = Colors.White";
mostCurrent._labelhiz5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124926;
 //BA.debugLineNum = 12124926;BA.debugLine="LabelHiz5.TextSize = 20";
mostCurrent._labelhiz5.setTextSize((float) (20));
RDebugUtils.currentLine=12124927;
 //BA.debugLineNum = 12124927;BA.debugLine="LabelHiz5.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124929;
 //BA.debugLineNum = 12124929;BA.debugLine="LabelHiz6.TextColor = Colors.White";
mostCurrent._labelhiz6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124930;
 //BA.debugLineNum = 12124930;BA.debugLine="LabelHiz6.TextSize = 20";
mostCurrent._labelhiz6.setTextSize((float) (20));
RDebugUtils.currentLine=12124931;
 //BA.debugLineNum = 12124931;BA.debugLine="LabelHiz6.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124933;
 //BA.debugLineNum = 12124933;BA.debugLine="LabelHiz7.TextColor = Colors.White";
mostCurrent._labelhiz7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124934;
 //BA.debugLineNum = 12124934;BA.debugLine="LabelHiz7.TextSize = 20";
mostCurrent._labelhiz7.setTextSize((float) (20));
RDebugUtils.currentLine=12124935;
 //BA.debugLineNum = 12124935;BA.debugLine="LabelHiz7.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124937;
 //BA.debugLineNum = 12124937;BA.debugLine="LabelHiz8.TextColor = Colors.White";
mostCurrent._labelhiz8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124938;
 //BA.debugLineNum = 12124938;BA.debugLine="LabelHiz8.TextSize = 20";
mostCurrent._labelhiz8.setTextSize((float) (20));
RDebugUtils.currentLine=12124939;
 //BA.debugLineNum = 12124939;BA.debugLine="LabelHiz8.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124941;
 //BA.debugLineNum = 12124941;BA.debugLine="LabelHiz9.TextColor = Colors.White";
mostCurrent._labelhiz9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124942;
 //BA.debugLineNum = 12124942;BA.debugLine="LabelHiz9.TextSize = 20";
mostCurrent._labelhiz9.setTextSize((float) (20));
RDebugUtils.currentLine=12124943;
 //BA.debugLineNum = 12124943;BA.debugLine="LabelHiz9.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124945;
 //BA.debugLineNum = 12124945;BA.debugLine="LabelHiz10.TextColor = Colors.White";
mostCurrent._labelhiz10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124946;
 //BA.debugLineNum = 12124946;BA.debugLine="LabelHiz10.TextSize = 20";
mostCurrent._labelhiz10.setTextSize((float) (20));
RDebugUtils.currentLine=12124947;
 //BA.debugLineNum = 12124947;BA.debugLine="LabelHiz10.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124949;
 //BA.debugLineNum = 12124949;BA.debugLine="LabelHiz11.TextColor = Colors.White";
mostCurrent._labelhiz11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124950;
 //BA.debugLineNum = 12124950;BA.debugLine="LabelHiz11.TextSize = 20";
mostCurrent._labelhiz11.setTextSize((float) (20));
RDebugUtils.currentLine=12124951;
 //BA.debugLineNum = 12124951;BA.debugLine="LabelHiz11.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124953;
 //BA.debugLineNum = 12124953;BA.debugLine="LabelHiz12.TextColor = Colors.White";
mostCurrent._labelhiz12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124954;
 //BA.debugLineNum = 12124954;BA.debugLine="LabelHiz12.TextSize = 20";
mostCurrent._labelhiz12.setTextSize((float) (20));
RDebugUtils.currentLine=12124955;
 //BA.debugLineNum = 12124955;BA.debugLine="LabelHiz12.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124957;
 //BA.debugLineNum = 12124957;BA.debugLine="LabelHiz13.TextColor = Colors.White";
mostCurrent._labelhiz13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124958;
 //BA.debugLineNum = 12124958;BA.debugLine="LabelHiz13.TextSize = 20";
mostCurrent._labelhiz13.setTextSize((float) (20));
RDebugUtils.currentLine=12124959;
 //BA.debugLineNum = 12124959;BA.debugLine="LabelHiz13.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124961;
 //BA.debugLineNum = 12124961;BA.debugLine="LabelHiz14.TextColor = Colors.White";
mostCurrent._labelhiz14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124962;
 //BA.debugLineNum = 12124962;BA.debugLine="LabelHiz14.TextSize = 20";
mostCurrent._labelhiz14.setTextSize((float) (20));
RDebugUtils.currentLine=12124963;
 //BA.debugLineNum = 12124963;BA.debugLine="LabelHiz14.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124965;
 //BA.debugLineNum = 12124965;BA.debugLine="LabelHiz15.TextColor = Colors.White";
mostCurrent._labelhiz15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124966;
 //BA.debugLineNum = 12124966;BA.debugLine="LabelHiz15.TextSize = 20";
mostCurrent._labelhiz15.setTextSize((float) (20));
RDebugUtils.currentLine=12124967;
 //BA.debugLineNum = 12124967;BA.debugLine="LabelHiz15.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124969;
 //BA.debugLineNum = 12124969;BA.debugLine="LabelHiz16.TextColor = Colors.White";
mostCurrent._labelhiz16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124970;
 //BA.debugLineNum = 12124970;BA.debugLine="LabelHiz16.TextSize = 20";
mostCurrent._labelhiz16.setTextSize((float) (20));
RDebugUtils.currentLine=12124971;
 //BA.debugLineNum = 12124971;BA.debugLine="LabelHiz16.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124973;
 //BA.debugLineNum = 12124973;BA.debugLine="LabelHiz17.TextColor = Colors.White";
mostCurrent._labelhiz17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124974;
 //BA.debugLineNum = 12124974;BA.debugLine="LabelHiz17.TextSize = 20";
mostCurrent._labelhiz17.setTextSize((float) (20));
RDebugUtils.currentLine=12124975;
 //BA.debugLineNum = 12124975;BA.debugLine="LabelHiz17.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124977;
 //BA.debugLineNum = 12124977;BA.debugLine="LabelHiz18.TextColor = Colors.White";
mostCurrent._labelhiz18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124978;
 //BA.debugLineNum = 12124978;BA.debugLine="LabelHiz18.TextSize = 20";
mostCurrent._labelhiz18.setTextSize((float) (20));
RDebugUtils.currentLine=12124979;
 //BA.debugLineNum = 12124979;BA.debugLine="LabelHiz18.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124981;
 //BA.debugLineNum = 12124981;BA.debugLine="LabelHiz19.TextColor = Colors.White";
mostCurrent._labelhiz19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124982;
 //BA.debugLineNum = 12124982;BA.debugLine="LabelHiz19.TextSize = 20";
mostCurrent._labelhiz19.setTextSize((float) (20));
RDebugUtils.currentLine=12124983;
 //BA.debugLineNum = 12124983;BA.debugLine="LabelHiz19.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124985;
 //BA.debugLineNum = 12124985;BA.debugLine="LabelHiz20.TextColor = Colors.White";
mostCurrent._labelhiz20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124986;
 //BA.debugLineNum = 12124986;BA.debugLine="LabelHiz20.TextSize = 20";
mostCurrent._labelhiz20.setTextSize((float) (20));
RDebugUtils.currentLine=12124987;
 //BA.debugLineNum = 12124987;BA.debugLine="LabelHiz20.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124989;
 //BA.debugLineNum = 12124989;BA.debugLine="LabelHiz21.TextColor = Colors.White";
mostCurrent._labelhiz21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124990;
 //BA.debugLineNum = 12124990;BA.debugLine="LabelHiz21.TextSize = 20";
mostCurrent._labelhiz21.setTextSize((float) (20));
RDebugUtils.currentLine=12124991;
 //BA.debugLineNum = 12124991;BA.debugLine="LabelHiz21.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124993;
 //BA.debugLineNum = 12124993;BA.debugLine="LabelHiz22.TextColor = Colors.White";
mostCurrent._labelhiz22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124994;
 //BA.debugLineNum = 12124994;BA.debugLine="LabelHiz22.TextSize = 20";
mostCurrent._labelhiz22.setTextSize((float) (20));
RDebugUtils.currentLine=12124995;
 //BA.debugLineNum = 12124995;BA.debugLine="LabelHiz22.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12124997;
 //BA.debugLineNum = 12124997;BA.debugLine="LabelHiz23.TextColor = Colors.White";
mostCurrent._labelhiz23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12124998;
 //BA.debugLineNum = 12124998;BA.debugLine="LabelHiz23.TextSize = 20";
mostCurrent._labelhiz23.setTextSize((float) (20));
RDebugUtils.currentLine=12124999;
 //BA.debugLineNum = 12124999;BA.debugLine="LabelHiz23.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125001;
 //BA.debugLineNum = 12125001;BA.debugLine="LabelHiz24.TextColor = Colors.White";
mostCurrent._labelhiz24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125002;
 //BA.debugLineNum = 12125002;BA.debugLine="LabelHiz24.TextSize = 20";
mostCurrent._labelhiz24.setTextSize((float) (20));
RDebugUtils.currentLine=12125003;
 //BA.debugLineNum = 12125003;BA.debugLine="LabelHiz24.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125005;
 //BA.debugLineNum = 12125005;BA.debugLine="LabelHiz25.TextColor = Colors.White";
mostCurrent._labelhiz25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125006;
 //BA.debugLineNum = 12125006;BA.debugLine="LabelHiz25.TextSize = 20";
mostCurrent._labelhiz25.setTextSize((float) (20));
RDebugUtils.currentLine=12125007;
 //BA.debugLineNum = 12125007;BA.debugLine="LabelHiz25.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelhiz25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125011;
 //BA.debugLineNum = 12125011;BA.debugLine="LabelDakika1.TextColor = Colors.White";
mostCurrent._labeldakika1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125012;
 //BA.debugLineNum = 12125012;BA.debugLine="LabelDakika1.TextSize = 20";
mostCurrent._labeldakika1.setTextSize((float) (20));
RDebugUtils.currentLine=12125013;
 //BA.debugLineNum = 12125013;BA.debugLine="LabelDakika1.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125015;
 //BA.debugLineNum = 12125015;BA.debugLine="LabelDakika2.TextColor = Colors.White";
mostCurrent._labeldakika2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125016;
 //BA.debugLineNum = 12125016;BA.debugLine="LabelDakika2.TextSize = 20";
mostCurrent._labeldakika2.setTextSize((float) (20));
RDebugUtils.currentLine=12125017;
 //BA.debugLineNum = 12125017;BA.debugLine="LabelDakika2.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125019;
 //BA.debugLineNum = 12125019;BA.debugLine="LabelDakika3.TextColor = Colors.White";
mostCurrent._labeldakika3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125020;
 //BA.debugLineNum = 12125020;BA.debugLine="LabelDakika3.TextSize = 20";
mostCurrent._labeldakika3.setTextSize((float) (20));
RDebugUtils.currentLine=12125021;
 //BA.debugLineNum = 12125021;BA.debugLine="LabelDakika3.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125023;
 //BA.debugLineNum = 12125023;BA.debugLine="LabelDakika4.TextColor = Colors.White";
mostCurrent._labeldakika4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125024;
 //BA.debugLineNum = 12125024;BA.debugLine="LabelDakika4.TextSize = 20";
mostCurrent._labeldakika4.setTextSize((float) (20));
RDebugUtils.currentLine=12125025;
 //BA.debugLineNum = 12125025;BA.debugLine="LabelDakika4.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125027;
 //BA.debugLineNum = 12125027;BA.debugLine="LabelDakika5.TextColor = Colors.White";
mostCurrent._labeldakika5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125028;
 //BA.debugLineNum = 12125028;BA.debugLine="LabelDakika5.TextSize = 20";
mostCurrent._labeldakika5.setTextSize((float) (20));
RDebugUtils.currentLine=12125029;
 //BA.debugLineNum = 12125029;BA.debugLine="LabelDakika5.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125031;
 //BA.debugLineNum = 12125031;BA.debugLine="LabelDakika6.TextColor = Colors.White";
mostCurrent._labeldakika6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125032;
 //BA.debugLineNum = 12125032;BA.debugLine="LabelDakika6.TextSize = 20";
mostCurrent._labeldakika6.setTextSize((float) (20));
RDebugUtils.currentLine=12125033;
 //BA.debugLineNum = 12125033;BA.debugLine="LabelDakika6.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125035;
 //BA.debugLineNum = 12125035;BA.debugLine="LabelDakika7.TextColor = Colors.White";
mostCurrent._labeldakika7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125036;
 //BA.debugLineNum = 12125036;BA.debugLine="LabelDakika7.TextSize = 20";
mostCurrent._labeldakika7.setTextSize((float) (20));
RDebugUtils.currentLine=12125037;
 //BA.debugLineNum = 12125037;BA.debugLine="LabelDakika7.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125039;
 //BA.debugLineNum = 12125039;BA.debugLine="LabelDakika8.TextColor = Colors.White";
mostCurrent._labeldakika8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125040;
 //BA.debugLineNum = 12125040;BA.debugLine="LabelDakika8.TextSize = 20";
mostCurrent._labeldakika8.setTextSize((float) (20));
RDebugUtils.currentLine=12125041;
 //BA.debugLineNum = 12125041;BA.debugLine="LabelDakika8.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125043;
 //BA.debugLineNum = 12125043;BA.debugLine="LabelDakika9.TextColor = Colors.White";
mostCurrent._labeldakika9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125044;
 //BA.debugLineNum = 12125044;BA.debugLine="LabelDakika9.TextSize = 20";
mostCurrent._labeldakika9.setTextSize((float) (20));
RDebugUtils.currentLine=12125045;
 //BA.debugLineNum = 12125045;BA.debugLine="LabelDakika9.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125047;
 //BA.debugLineNum = 12125047;BA.debugLine="LabelDakika10.TextColor = Colors.White";
mostCurrent._labeldakika10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125048;
 //BA.debugLineNum = 12125048;BA.debugLine="LabelDakika10.TextSize = 20";
mostCurrent._labeldakika10.setTextSize((float) (20));
RDebugUtils.currentLine=12125049;
 //BA.debugLineNum = 12125049;BA.debugLine="LabelDakika10.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125051;
 //BA.debugLineNum = 12125051;BA.debugLine="LabelDakika11.TextColor = Colors.White";
mostCurrent._labeldakika11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125052;
 //BA.debugLineNum = 12125052;BA.debugLine="LabelDakika11.TextSize = 20";
mostCurrent._labeldakika11.setTextSize((float) (20));
RDebugUtils.currentLine=12125053;
 //BA.debugLineNum = 12125053;BA.debugLine="LabelDakika11.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125055;
 //BA.debugLineNum = 12125055;BA.debugLine="LabelDakika12.TextColor = Colors.White";
mostCurrent._labeldakika12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125056;
 //BA.debugLineNum = 12125056;BA.debugLine="LabelDakika12.TextSize = 20";
mostCurrent._labeldakika12.setTextSize((float) (20));
RDebugUtils.currentLine=12125057;
 //BA.debugLineNum = 12125057;BA.debugLine="LabelDakika12.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125059;
 //BA.debugLineNum = 12125059;BA.debugLine="LabelDakika13.TextColor = Colors.White";
mostCurrent._labeldakika13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125060;
 //BA.debugLineNum = 12125060;BA.debugLine="LabelDakika13.TextSize = 20";
mostCurrent._labeldakika13.setTextSize((float) (20));
RDebugUtils.currentLine=12125061;
 //BA.debugLineNum = 12125061;BA.debugLine="LabelDakika13.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125063;
 //BA.debugLineNum = 12125063;BA.debugLine="LabelDakika14.TextColor = Colors.White";
mostCurrent._labeldakika14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125064;
 //BA.debugLineNum = 12125064;BA.debugLine="LabelDakika14.TextSize = 20";
mostCurrent._labeldakika14.setTextSize((float) (20));
RDebugUtils.currentLine=12125065;
 //BA.debugLineNum = 12125065;BA.debugLine="LabelDakika14.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125067;
 //BA.debugLineNum = 12125067;BA.debugLine="LabelDakika15.TextColor = Colors.White";
mostCurrent._labeldakika15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125068;
 //BA.debugLineNum = 12125068;BA.debugLine="LabelDakika15.TextSize = 20";
mostCurrent._labeldakika15.setTextSize((float) (20));
RDebugUtils.currentLine=12125069;
 //BA.debugLineNum = 12125069;BA.debugLine="LabelDakika15.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125071;
 //BA.debugLineNum = 12125071;BA.debugLine="LabelDakika16.TextColor = Colors.White";
mostCurrent._labeldakika16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125072;
 //BA.debugLineNum = 12125072;BA.debugLine="LabelDakika16.TextSize = 20";
mostCurrent._labeldakika16.setTextSize((float) (20));
RDebugUtils.currentLine=12125073;
 //BA.debugLineNum = 12125073;BA.debugLine="LabelDakika16.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125075;
 //BA.debugLineNum = 12125075;BA.debugLine="LabelDakika17.TextColor = Colors.White";
mostCurrent._labeldakika17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125076;
 //BA.debugLineNum = 12125076;BA.debugLine="LabelDakika17.TextSize = 20";
mostCurrent._labeldakika17.setTextSize((float) (20));
RDebugUtils.currentLine=12125077;
 //BA.debugLineNum = 12125077;BA.debugLine="LabelDakika17.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125079;
 //BA.debugLineNum = 12125079;BA.debugLine="LabelDakika18.TextColor = Colors.White";
mostCurrent._labeldakika18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125080;
 //BA.debugLineNum = 12125080;BA.debugLine="LabelDakika18.TextSize = 20";
mostCurrent._labeldakika18.setTextSize((float) (20));
RDebugUtils.currentLine=12125081;
 //BA.debugLineNum = 12125081;BA.debugLine="LabelDakika18.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125083;
 //BA.debugLineNum = 12125083;BA.debugLine="LabelDakika19.TextColor = Colors.White";
mostCurrent._labeldakika19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125084;
 //BA.debugLineNum = 12125084;BA.debugLine="LabelDakika19.TextSize = 20";
mostCurrent._labeldakika19.setTextSize((float) (20));
RDebugUtils.currentLine=12125085;
 //BA.debugLineNum = 12125085;BA.debugLine="LabelDakika19.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125087;
 //BA.debugLineNum = 12125087;BA.debugLine="LabelDakika20.TextColor = Colors.White";
mostCurrent._labeldakika20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125088;
 //BA.debugLineNum = 12125088;BA.debugLine="LabelDakika20.TextSize = 20";
mostCurrent._labeldakika20.setTextSize((float) (20));
RDebugUtils.currentLine=12125089;
 //BA.debugLineNum = 12125089;BA.debugLine="LabelDakika20.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125091;
 //BA.debugLineNum = 12125091;BA.debugLine="LabelDakika21.TextColor = Colors.White";
mostCurrent._labeldakika21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125092;
 //BA.debugLineNum = 12125092;BA.debugLine="LabelDakika21.TextSize = 20";
mostCurrent._labeldakika21.setTextSize((float) (20));
RDebugUtils.currentLine=12125093;
 //BA.debugLineNum = 12125093;BA.debugLine="LabelDakika21.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125095;
 //BA.debugLineNum = 12125095;BA.debugLine="LabelDakika22.TextColor = Colors.White";
mostCurrent._labeldakika22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125096;
 //BA.debugLineNum = 12125096;BA.debugLine="LabelDakika22.TextSize = 20";
mostCurrent._labeldakika22.setTextSize((float) (20));
RDebugUtils.currentLine=12125097;
 //BA.debugLineNum = 12125097;BA.debugLine="LabelDakika22.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125099;
 //BA.debugLineNum = 12125099;BA.debugLine="LabelDakika23.TextColor = Colors.White";
mostCurrent._labeldakika23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125100;
 //BA.debugLineNum = 12125100;BA.debugLine="LabelDakika23.TextSize = 20";
mostCurrent._labeldakika23.setTextSize((float) (20));
RDebugUtils.currentLine=12125101;
 //BA.debugLineNum = 12125101;BA.debugLine="LabelDakika23.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125103;
 //BA.debugLineNum = 12125103;BA.debugLine="LabelDakika24.TextColor = Colors.White";
mostCurrent._labeldakika24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125104;
 //BA.debugLineNum = 12125104;BA.debugLine="LabelDakika24.TextSize = 20";
mostCurrent._labeldakika24.setTextSize((float) (20));
RDebugUtils.currentLine=12125105;
 //BA.debugLineNum = 12125105;BA.debugLine="LabelDakika24.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125107;
 //BA.debugLineNum = 12125107;BA.debugLine="LabelDakika25.TextColor = Colors.White";
mostCurrent._labeldakika25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125108;
 //BA.debugLineNum = 12125108;BA.debugLine="LabelDakika25.TextSize = 20";
mostCurrent._labeldakika25.setTextSize((float) (20));
RDebugUtils.currentLine=12125109;
 //BA.debugLineNum = 12125109;BA.debugLine="LabelDakika25.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labeldakika25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125113;
 //BA.debugLineNum = 12125113;BA.debugLine="LabelSaniye1.TextColor = Colors.White";
mostCurrent._labelsaniye1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125114;
 //BA.debugLineNum = 12125114;BA.debugLine="LabelSaniye1.TextSize = 20";
mostCurrent._labelsaniye1.setTextSize((float) (20));
RDebugUtils.currentLine=12125115;
 //BA.debugLineNum = 12125115;BA.debugLine="LabelSaniye1.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125117;
 //BA.debugLineNum = 12125117;BA.debugLine="LabelSaniye2.TextColor = Colors.White";
mostCurrent._labelsaniye2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125118;
 //BA.debugLineNum = 12125118;BA.debugLine="LabelSaniye2.TextSize = 20";
mostCurrent._labelsaniye2.setTextSize((float) (20));
RDebugUtils.currentLine=12125119;
 //BA.debugLineNum = 12125119;BA.debugLine="LabelSaniye2.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125121;
 //BA.debugLineNum = 12125121;BA.debugLine="LabelSaniye3.TextColor = Colors.White";
mostCurrent._labelsaniye3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125122;
 //BA.debugLineNum = 12125122;BA.debugLine="LabelSaniye3.TextSize = 20";
mostCurrent._labelsaniye3.setTextSize((float) (20));
RDebugUtils.currentLine=12125123;
 //BA.debugLineNum = 12125123;BA.debugLine="LabelSaniye3.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125125;
 //BA.debugLineNum = 12125125;BA.debugLine="LabelSaniye4.TextColor = Colors.White";
mostCurrent._labelsaniye4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125126;
 //BA.debugLineNum = 12125126;BA.debugLine="LabelSaniye4.TextSize = 20";
mostCurrent._labelsaniye4.setTextSize((float) (20));
RDebugUtils.currentLine=12125127;
 //BA.debugLineNum = 12125127;BA.debugLine="LabelSaniye4.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125129;
 //BA.debugLineNum = 12125129;BA.debugLine="LabelSaniye5.TextColor = Colors.White";
mostCurrent._labelsaniye5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125130;
 //BA.debugLineNum = 12125130;BA.debugLine="LabelSaniye5.TextSize = 20";
mostCurrent._labelsaniye5.setTextSize((float) (20));
RDebugUtils.currentLine=12125131;
 //BA.debugLineNum = 12125131;BA.debugLine="LabelSaniye5.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125133;
 //BA.debugLineNum = 12125133;BA.debugLine="LabelSaniye6.TextColor = Colors.White";
mostCurrent._labelsaniye6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125134;
 //BA.debugLineNum = 12125134;BA.debugLine="LabelSaniye6.TextSize = 20";
mostCurrent._labelsaniye6.setTextSize((float) (20));
RDebugUtils.currentLine=12125135;
 //BA.debugLineNum = 12125135;BA.debugLine="LabelSaniye6.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125137;
 //BA.debugLineNum = 12125137;BA.debugLine="LabelSaniye7.TextColor = Colors.White";
mostCurrent._labelsaniye7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125138;
 //BA.debugLineNum = 12125138;BA.debugLine="LabelSaniye7.TextSize = 20";
mostCurrent._labelsaniye7.setTextSize((float) (20));
RDebugUtils.currentLine=12125139;
 //BA.debugLineNum = 12125139;BA.debugLine="LabelSaniye7.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125141;
 //BA.debugLineNum = 12125141;BA.debugLine="LabelSaniye8.TextColor = Colors.White";
mostCurrent._labelsaniye8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125142;
 //BA.debugLineNum = 12125142;BA.debugLine="LabelSaniye8.TextSize = 20";
mostCurrent._labelsaniye8.setTextSize((float) (20));
RDebugUtils.currentLine=12125143;
 //BA.debugLineNum = 12125143;BA.debugLine="LabelSaniye8.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125145;
 //BA.debugLineNum = 12125145;BA.debugLine="LabelSaniye9.TextColor = Colors.White";
mostCurrent._labelsaniye9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125146;
 //BA.debugLineNum = 12125146;BA.debugLine="LabelSaniye9.TextSize = 20";
mostCurrent._labelsaniye9.setTextSize((float) (20));
RDebugUtils.currentLine=12125147;
 //BA.debugLineNum = 12125147;BA.debugLine="LabelSaniye9.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125149;
 //BA.debugLineNum = 12125149;BA.debugLine="LabelSaniye10.TextColor = Colors.White";
mostCurrent._labelsaniye10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125150;
 //BA.debugLineNum = 12125150;BA.debugLine="LabelSaniye10.TextSize = 20";
mostCurrent._labelsaniye10.setTextSize((float) (20));
RDebugUtils.currentLine=12125151;
 //BA.debugLineNum = 12125151;BA.debugLine="LabelSaniye10.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125153;
 //BA.debugLineNum = 12125153;BA.debugLine="LabelSaniye11.TextColor = Colors.White";
mostCurrent._labelsaniye11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125154;
 //BA.debugLineNum = 12125154;BA.debugLine="LabelSaniye11.TextSize = 20";
mostCurrent._labelsaniye11.setTextSize((float) (20));
RDebugUtils.currentLine=12125155;
 //BA.debugLineNum = 12125155;BA.debugLine="LabelSaniye11.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125157;
 //BA.debugLineNum = 12125157;BA.debugLine="LabelSaniye12.TextColor = Colors.White";
mostCurrent._labelsaniye12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125158;
 //BA.debugLineNum = 12125158;BA.debugLine="LabelSaniye12.TextSize = 20";
mostCurrent._labelsaniye12.setTextSize((float) (20));
RDebugUtils.currentLine=12125159;
 //BA.debugLineNum = 12125159;BA.debugLine="LabelSaniye12.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125161;
 //BA.debugLineNum = 12125161;BA.debugLine="LabelSaniye13.TextColor = Colors.White";
mostCurrent._labelsaniye13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125162;
 //BA.debugLineNum = 12125162;BA.debugLine="LabelSaniye13.TextSize = 20";
mostCurrent._labelsaniye13.setTextSize((float) (20));
RDebugUtils.currentLine=12125163;
 //BA.debugLineNum = 12125163;BA.debugLine="LabelSaniye13.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125165;
 //BA.debugLineNum = 12125165;BA.debugLine="LabelSaniye14.TextColor = Colors.White";
mostCurrent._labelsaniye14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125166;
 //BA.debugLineNum = 12125166;BA.debugLine="LabelSaniye14.TextSize = 20";
mostCurrent._labelsaniye14.setTextSize((float) (20));
RDebugUtils.currentLine=12125167;
 //BA.debugLineNum = 12125167;BA.debugLine="LabelSaniye14.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125169;
 //BA.debugLineNum = 12125169;BA.debugLine="LabelSaniye15.TextColor = Colors.White";
mostCurrent._labelsaniye15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125170;
 //BA.debugLineNum = 12125170;BA.debugLine="LabelSaniye15.TextSize = 20";
mostCurrent._labelsaniye15.setTextSize((float) (20));
RDebugUtils.currentLine=12125171;
 //BA.debugLineNum = 12125171;BA.debugLine="LabelSaniye15.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125173;
 //BA.debugLineNum = 12125173;BA.debugLine="LabelSaniye16.TextColor = Colors.White";
mostCurrent._labelsaniye16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125174;
 //BA.debugLineNum = 12125174;BA.debugLine="LabelSaniye16.TextSize = 20";
mostCurrent._labelsaniye16.setTextSize((float) (20));
RDebugUtils.currentLine=12125175;
 //BA.debugLineNum = 12125175;BA.debugLine="LabelSaniye16.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125177;
 //BA.debugLineNum = 12125177;BA.debugLine="LabelSaniye17.TextColor = Colors.White";
mostCurrent._labelsaniye17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125178;
 //BA.debugLineNum = 12125178;BA.debugLine="LabelSaniye17.TextSize = 20";
mostCurrent._labelsaniye17.setTextSize((float) (20));
RDebugUtils.currentLine=12125179;
 //BA.debugLineNum = 12125179;BA.debugLine="LabelSaniye17.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125181;
 //BA.debugLineNum = 12125181;BA.debugLine="LabelSaniye18.TextColor = Colors.White";
mostCurrent._labelsaniye18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125182;
 //BA.debugLineNum = 12125182;BA.debugLine="LabelSaniye18.TextSize = 20";
mostCurrent._labelsaniye18.setTextSize((float) (20));
RDebugUtils.currentLine=12125183;
 //BA.debugLineNum = 12125183;BA.debugLine="LabelSaniye18.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125185;
 //BA.debugLineNum = 12125185;BA.debugLine="LabelSaniye19.TextColor = Colors.White";
mostCurrent._labelsaniye19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125186;
 //BA.debugLineNum = 12125186;BA.debugLine="LabelSaniye19.TextSize = 20";
mostCurrent._labelsaniye19.setTextSize((float) (20));
RDebugUtils.currentLine=12125187;
 //BA.debugLineNum = 12125187;BA.debugLine="LabelSaniye19.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125189;
 //BA.debugLineNum = 12125189;BA.debugLine="LabelSaniye20.TextColor = Colors.White";
mostCurrent._labelsaniye20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125190;
 //BA.debugLineNum = 12125190;BA.debugLine="LabelSaniye20.TextSize = 20";
mostCurrent._labelsaniye20.setTextSize((float) (20));
RDebugUtils.currentLine=12125191;
 //BA.debugLineNum = 12125191;BA.debugLine="LabelSaniye20.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125193;
 //BA.debugLineNum = 12125193;BA.debugLine="LabelSaniye21.TextColor = Colors.White";
mostCurrent._labelsaniye21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125194;
 //BA.debugLineNum = 12125194;BA.debugLine="LabelSaniye21.TextSize = 20";
mostCurrent._labelsaniye21.setTextSize((float) (20));
RDebugUtils.currentLine=12125195;
 //BA.debugLineNum = 12125195;BA.debugLine="LabelSaniye21.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125197;
 //BA.debugLineNum = 12125197;BA.debugLine="LabelSaniye22.TextColor = Colors.White";
mostCurrent._labelsaniye22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125198;
 //BA.debugLineNum = 12125198;BA.debugLine="LabelSaniye22.TextSize = 20";
mostCurrent._labelsaniye22.setTextSize((float) (20));
RDebugUtils.currentLine=12125199;
 //BA.debugLineNum = 12125199;BA.debugLine="LabelSaniye22.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125201;
 //BA.debugLineNum = 12125201;BA.debugLine="LabelSaniye23.TextColor = Colors.White";
mostCurrent._labelsaniye23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125202;
 //BA.debugLineNum = 12125202;BA.debugLine="LabelSaniye23.TextSize = 20";
mostCurrent._labelsaniye23.setTextSize((float) (20));
RDebugUtils.currentLine=12125203;
 //BA.debugLineNum = 12125203;BA.debugLine="LabelSaniye23.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125205;
 //BA.debugLineNum = 12125205;BA.debugLine="LabelSaniye24.TextColor = Colors.White";
mostCurrent._labelsaniye24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125206;
 //BA.debugLineNum = 12125206;BA.debugLine="LabelSaniye24.TextSize = 20";
mostCurrent._labelsaniye24.setTextSize((float) (20));
RDebugUtils.currentLine=12125207;
 //BA.debugLineNum = 12125207;BA.debugLine="LabelSaniye24.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125209;
 //BA.debugLineNum = 12125209;BA.debugLine="LabelSaniye25.TextColor = Colors.White";
mostCurrent._labelsaniye25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125210;
 //BA.debugLineNum = 12125210;BA.debugLine="LabelSaniye25.TextSize = 20";
mostCurrent._labelsaniye25.setTextSize((float) (20));
RDebugUtils.currentLine=12125211;
 //BA.debugLineNum = 12125211;BA.debugLine="LabelSaniye25.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._labelsaniye25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125214;
 //BA.debugLineNum = 12125214;BA.debugLine="LabelKoniMesafesi1.TextColor = Colors.White";
mostCurrent._labelkonimesafesi1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125215;
 //BA.debugLineNum = 12125215;BA.debugLine="LabelKoniMesafesi1.TextSize = 20";
mostCurrent._labelkonimesafesi1.setTextSize((float) (20));
RDebugUtils.currentLine=12125216;
 //BA.debugLineNum = 12125216;BA.debugLine="LabelKoniMesafesi1.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125218;
 //BA.debugLineNum = 12125218;BA.debugLine="LabelKoniMesafesi2.TextColor = Colors.White";
mostCurrent._labelkonimesafesi2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125219;
 //BA.debugLineNum = 12125219;BA.debugLine="LabelKoniMesafesi2.TextSize = 20";
mostCurrent._labelkonimesafesi2.setTextSize((float) (20));
RDebugUtils.currentLine=12125220;
 //BA.debugLineNum = 12125220;BA.debugLine="LabelKoniMesafesi2.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125222;
 //BA.debugLineNum = 12125222;BA.debugLine="LabelKoniMesafesi3.TextColor = Colors.White";
mostCurrent._labelkonimesafesi3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125223;
 //BA.debugLineNum = 12125223;BA.debugLine="LabelKoniMesafesi3.TextSize = 20";
mostCurrent._labelkonimesafesi3.setTextSize((float) (20));
RDebugUtils.currentLine=12125224;
 //BA.debugLineNum = 12125224;BA.debugLine="LabelKoniMesafesi3.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi3.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125226;
 //BA.debugLineNum = 12125226;BA.debugLine="LabelKoniMesafesi4.TextColor = Colors.White";
mostCurrent._labelkonimesafesi4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125227;
 //BA.debugLineNum = 12125227;BA.debugLine="LabelKoniMesafesi4.TextSize = 20";
mostCurrent._labelkonimesafesi4.setTextSize((float) (20));
RDebugUtils.currentLine=12125228;
 //BA.debugLineNum = 12125228;BA.debugLine="LabelKoniMesafesi4.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi4.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125230;
 //BA.debugLineNum = 12125230;BA.debugLine="LabelKoniMesafesi5.TextColor = Colors.White";
mostCurrent._labelkonimesafesi5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125231;
 //BA.debugLineNum = 12125231;BA.debugLine="LabelKoniMesafesi5.TextSize = 20";
mostCurrent._labelkonimesafesi5.setTextSize((float) (20));
RDebugUtils.currentLine=12125232;
 //BA.debugLineNum = 12125232;BA.debugLine="LabelKoniMesafesi5.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125234;
 //BA.debugLineNum = 12125234;BA.debugLine="LabelKoniMesafesi6.TextColor = Colors.White";
mostCurrent._labelkonimesafesi6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125235;
 //BA.debugLineNum = 12125235;BA.debugLine="LabelKoniMesafesi6.TextSize = 20";
mostCurrent._labelkonimesafesi6.setTextSize((float) (20));
RDebugUtils.currentLine=12125236;
 //BA.debugLineNum = 12125236;BA.debugLine="LabelKoniMesafesi6.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi6.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125238;
 //BA.debugLineNum = 12125238;BA.debugLine="LabelKoniMesafesi7.TextColor = Colors.White";
mostCurrent._labelkonimesafesi7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125239;
 //BA.debugLineNum = 12125239;BA.debugLine="LabelKoniMesafesi7.TextSize = 20";
mostCurrent._labelkonimesafesi7.setTextSize((float) (20));
RDebugUtils.currentLine=12125240;
 //BA.debugLineNum = 12125240;BA.debugLine="LabelKoniMesafesi7.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125242;
 //BA.debugLineNum = 12125242;BA.debugLine="LabelKoniMesafesi8.TextColor = Colors.White";
mostCurrent._labelkonimesafesi8.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125243;
 //BA.debugLineNum = 12125243;BA.debugLine="LabelKoniMesafesi8.TextSize = 20";
mostCurrent._labelkonimesafesi8.setTextSize((float) (20));
RDebugUtils.currentLine=12125244;
 //BA.debugLineNum = 12125244;BA.debugLine="LabelKoniMesafesi8.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi8.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125246;
 //BA.debugLineNum = 12125246;BA.debugLine="LabelKoniMesafesi9.TextColor = Colors.White";
mostCurrent._labelkonimesafesi9.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125247;
 //BA.debugLineNum = 12125247;BA.debugLine="LabelKoniMesafesi9.TextSize = 20";
mostCurrent._labelkonimesafesi9.setTextSize((float) (20));
RDebugUtils.currentLine=12125248;
 //BA.debugLineNum = 12125248;BA.debugLine="LabelKoniMesafesi9.Typeface = Typeface.DEFAULT_BO";
mostCurrent._labelkonimesafesi9.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125250;
 //BA.debugLineNum = 12125250;BA.debugLine="LabelKoniMesafesi10.TextColor = Colors.White";
mostCurrent._labelkonimesafesi10.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125251;
 //BA.debugLineNum = 12125251;BA.debugLine="LabelKoniMesafesi10.TextSize = 20";
mostCurrent._labelkonimesafesi10.setTextSize((float) (20));
RDebugUtils.currentLine=12125252;
 //BA.debugLineNum = 12125252;BA.debugLine="LabelKoniMesafesi10.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi10.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125254;
 //BA.debugLineNum = 12125254;BA.debugLine="LabelKoniMesafesi11.TextColor = Colors.White";
mostCurrent._labelkonimesafesi11.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125255;
 //BA.debugLineNum = 12125255;BA.debugLine="LabelKoniMesafesi11.TextSize = 20";
mostCurrent._labelkonimesafesi11.setTextSize((float) (20));
RDebugUtils.currentLine=12125256;
 //BA.debugLineNum = 12125256;BA.debugLine="LabelKoniMesafesi11.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi11.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125258;
 //BA.debugLineNum = 12125258;BA.debugLine="LabelKoniMesafesi12.TextColor = Colors.White";
mostCurrent._labelkonimesafesi12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125259;
 //BA.debugLineNum = 12125259;BA.debugLine="LabelKoniMesafesi12.TextSize = 20";
mostCurrent._labelkonimesafesi12.setTextSize((float) (20));
RDebugUtils.currentLine=12125260;
 //BA.debugLineNum = 12125260;BA.debugLine="LabelKoniMesafesi12.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi12.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125262;
 //BA.debugLineNum = 12125262;BA.debugLine="LabelKoniMesafesi13.TextColor = Colors.White";
mostCurrent._labelkonimesafesi13.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125263;
 //BA.debugLineNum = 12125263;BA.debugLine="LabelKoniMesafesi13.TextSize = 20";
mostCurrent._labelkonimesafesi13.setTextSize((float) (20));
RDebugUtils.currentLine=12125264;
 //BA.debugLineNum = 12125264;BA.debugLine="LabelKoniMesafesi13.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi13.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125266;
 //BA.debugLineNum = 12125266;BA.debugLine="LabelKoniMesafesi14.TextColor = Colors.White";
mostCurrent._labelkonimesafesi14.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125267;
 //BA.debugLineNum = 12125267;BA.debugLine="LabelKoniMesafesi14.TextSize = 20";
mostCurrent._labelkonimesafesi14.setTextSize((float) (20));
RDebugUtils.currentLine=12125268;
 //BA.debugLineNum = 12125268;BA.debugLine="LabelKoniMesafesi14.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi14.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125270;
 //BA.debugLineNum = 12125270;BA.debugLine="LabelKoniMesafesi15.TextColor = Colors.White";
mostCurrent._labelkonimesafesi15.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125271;
 //BA.debugLineNum = 12125271;BA.debugLine="LabelKoniMesafesi15.TextSize = 20";
mostCurrent._labelkonimesafesi15.setTextSize((float) (20));
RDebugUtils.currentLine=12125272;
 //BA.debugLineNum = 12125272;BA.debugLine="LabelKoniMesafesi15.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi15.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125274;
 //BA.debugLineNum = 12125274;BA.debugLine="LabelKoniMesafesi16.TextColor = Colors.White";
mostCurrent._labelkonimesafesi16.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125275;
 //BA.debugLineNum = 12125275;BA.debugLine="LabelKoniMesafesi16.TextSize = 20";
mostCurrent._labelkonimesafesi16.setTextSize((float) (20));
RDebugUtils.currentLine=12125276;
 //BA.debugLineNum = 12125276;BA.debugLine="LabelKoniMesafesi16.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi16.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125278;
 //BA.debugLineNum = 12125278;BA.debugLine="LabelKoniMesafesi17.TextColor = Colors.White";
mostCurrent._labelkonimesafesi17.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125279;
 //BA.debugLineNum = 12125279;BA.debugLine="LabelKoniMesafesi17.TextSize = 20";
mostCurrent._labelkonimesafesi17.setTextSize((float) (20));
RDebugUtils.currentLine=12125280;
 //BA.debugLineNum = 12125280;BA.debugLine="LabelKoniMesafesi17.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi17.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125282;
 //BA.debugLineNum = 12125282;BA.debugLine="LabelKoniMesafesi18.TextColor = Colors.White";
mostCurrent._labelkonimesafesi18.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125283;
 //BA.debugLineNum = 12125283;BA.debugLine="LabelKoniMesafesi18.TextSize = 20";
mostCurrent._labelkonimesafesi18.setTextSize((float) (20));
RDebugUtils.currentLine=12125284;
 //BA.debugLineNum = 12125284;BA.debugLine="LabelKoniMesafesi18.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi18.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125286;
 //BA.debugLineNum = 12125286;BA.debugLine="LabelKoniMesafesi19.TextColor = Colors.White";
mostCurrent._labelkonimesafesi19.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125287;
 //BA.debugLineNum = 12125287;BA.debugLine="LabelKoniMesafesi19.TextSize = 20";
mostCurrent._labelkonimesafesi19.setTextSize((float) (20));
RDebugUtils.currentLine=12125288;
 //BA.debugLineNum = 12125288;BA.debugLine="LabelKoniMesafesi19.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi19.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125290;
 //BA.debugLineNum = 12125290;BA.debugLine="LabelKoniMesafesi20.TextColor = Colors.White";
mostCurrent._labelkonimesafesi20.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125291;
 //BA.debugLineNum = 12125291;BA.debugLine="LabelKoniMesafesi20.TextSize = 20";
mostCurrent._labelkonimesafesi20.setTextSize((float) (20));
RDebugUtils.currentLine=12125292;
 //BA.debugLineNum = 12125292;BA.debugLine="LabelKoniMesafesi20.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi20.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125294;
 //BA.debugLineNum = 12125294;BA.debugLine="LabelKoniMesafesi21.TextColor = Colors.White";
mostCurrent._labelkonimesafesi21.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125295;
 //BA.debugLineNum = 12125295;BA.debugLine="LabelKoniMesafesi21.TextSize = 20";
mostCurrent._labelkonimesafesi21.setTextSize((float) (20));
RDebugUtils.currentLine=12125296;
 //BA.debugLineNum = 12125296;BA.debugLine="LabelKoniMesafesi21.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi21.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125298;
 //BA.debugLineNum = 12125298;BA.debugLine="LabelKoniMesafesi22.TextColor = Colors.White";
mostCurrent._labelkonimesafesi22.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125299;
 //BA.debugLineNum = 12125299;BA.debugLine="LabelKoniMesafesi22.TextSize = 20";
mostCurrent._labelkonimesafesi22.setTextSize((float) (20));
RDebugUtils.currentLine=12125300;
 //BA.debugLineNum = 12125300;BA.debugLine="LabelKoniMesafesi22.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi22.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125302;
 //BA.debugLineNum = 12125302;BA.debugLine="LabelKoniMesafesi23.TextColor = Colors.White";
mostCurrent._labelkonimesafesi23.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125303;
 //BA.debugLineNum = 12125303;BA.debugLine="LabelKoniMesafesi23.TextSize = 20";
mostCurrent._labelkonimesafesi23.setTextSize((float) (20));
RDebugUtils.currentLine=12125304;
 //BA.debugLineNum = 12125304;BA.debugLine="LabelKoniMesafesi23.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi23.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125306;
 //BA.debugLineNum = 12125306;BA.debugLine="LabelKoniMesafesi24.TextColor = Colors.White";
mostCurrent._labelkonimesafesi24.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125307;
 //BA.debugLineNum = 12125307;BA.debugLine="LabelKoniMesafesi24.TextSize = 20";
mostCurrent._labelkonimesafesi24.setTextSize((float) (20));
RDebugUtils.currentLine=12125308;
 //BA.debugLineNum = 12125308;BA.debugLine="LabelKoniMesafesi24.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi24.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125310;
 //BA.debugLineNum = 12125310;BA.debugLine="LabelKoniMesafesi25.TextColor = Colors.White";
mostCurrent._labelkonimesafesi25.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=12125311;
 //BA.debugLineNum = 12125311;BA.debugLine="LabelKoniMesafesi25.TextSize = 20";
mostCurrent._labelkonimesafesi25.setTextSize((float) (20));
RDebugUtils.currentLine=12125312;
 //BA.debugLineNum = 12125312;BA.debugLine="LabelKoniMesafesi25.Typeface = Typeface.DEFAULT_B";
mostCurrent._labelkonimesafesi25.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=12125317;
 //BA.debugLineNum = 12125317;BA.debugLine="End Sub";
return "";
}
public static String  _levelpanelgoster() throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "levelpanelgoster", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "levelpanelgoster", null));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub levelPanelGoster";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="PanelKapat";
_panelkapat();
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="If ProgramAyar.secilenLevel >= 1 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=1) { 
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="If ProgramAyar.secilenLevel >= 2 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=2) { 
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="Panel2.Visible = True";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="If ProgramAyar.secilenLevel >=3 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=3) { 
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Panel3.Visible = True";
mostCurrent._panel3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="If ProgramAyar.secilenLevel >= 4 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=4) { 
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="Panel4.Visible = True";
mostCurrent._panel4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="If ProgramAyar.secilenLevel >= 5 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=5) { 
RDebugUtils.currentLine=12386315;
 //BA.debugLineNum = 12386315;BA.debugLine="Panel5.Visible = True";
mostCurrent._panel5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386316;
 //BA.debugLineNum = 12386316;BA.debugLine="If ProgramAyar.secilenLevel >= 6 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=6) { 
RDebugUtils.currentLine=12386317;
 //BA.debugLineNum = 12386317;BA.debugLine="Panel6.Visible = True";
mostCurrent._panel6.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386318;
 //BA.debugLineNum = 12386318;BA.debugLine="If ProgramAyar.secilenLevel >= 7 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=7) { 
RDebugUtils.currentLine=12386319;
 //BA.debugLineNum = 12386319;BA.debugLine="Panel7.Visible = True";
mostCurrent._panel7.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386320;
 //BA.debugLineNum = 12386320;BA.debugLine="If ProgramAyar.secilenLevel >= 8 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=8) { 
RDebugUtils.currentLine=12386321;
 //BA.debugLineNum = 12386321;BA.debugLine="Panel8.Visible = True";
mostCurrent._panel8.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386322;
 //BA.debugLineNum = 12386322;BA.debugLine="If ProgramAyar.secilenLevel >= 9 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=9) { 
RDebugUtils.currentLine=12386323;
 //BA.debugLineNum = 12386323;BA.debugLine="Panel9.Visible = True";
mostCurrent._panel9.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386324;
 //BA.debugLineNum = 12386324;BA.debugLine="If ProgramAyar.secilenLevel >= 10 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=10) { 
RDebugUtils.currentLine=12386325;
 //BA.debugLineNum = 12386325;BA.debugLine="Panel10.Visible = True";
mostCurrent._panel10.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386326;
 //BA.debugLineNum = 12386326;BA.debugLine="If ProgramAyar.secilenLevel >= 11 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=11) { 
RDebugUtils.currentLine=12386327;
 //BA.debugLineNum = 12386327;BA.debugLine="Panel11.Visible = True";
mostCurrent._panel11.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386328;
 //BA.debugLineNum = 12386328;BA.debugLine="If ProgramAyar.secilenLevel >= 12 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=12) { 
RDebugUtils.currentLine=12386329;
 //BA.debugLineNum = 12386329;BA.debugLine="Panel12.Visible = True";
mostCurrent._panel12.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386330;
 //BA.debugLineNum = 12386330;BA.debugLine="If ProgramAyar.secilenLevel >= 13 The";
if (mostCurrent._programayar._secilenlevel /*int*/ >=13) { 
RDebugUtils.currentLine=12386331;
 //BA.debugLineNum = 12386331;BA.debugLine="Panel13.Visible = True";
mostCurrent._panel13.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386332;
 //BA.debugLineNum = 12386332;BA.debugLine="If ProgramAyar.secilenLevel >= 14 Th";
if (mostCurrent._programayar._secilenlevel /*int*/ >=14) { 
RDebugUtils.currentLine=12386333;
 //BA.debugLineNum = 12386333;BA.debugLine="Panel14.Visible = True";
mostCurrent._panel14.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386334;
 //BA.debugLineNum = 12386334;BA.debugLine="If ProgramAyar.secilenLevel >= 15 T";
if (mostCurrent._programayar._secilenlevel /*int*/ >=15) { 
RDebugUtils.currentLine=12386335;
 //BA.debugLineNum = 12386335;BA.debugLine="Panel15.Visible = True";
mostCurrent._panel15.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386336;
 //BA.debugLineNum = 12386336;BA.debugLine="If ProgramAyar.secilenLevel >= 16";
if (mostCurrent._programayar._secilenlevel /*int*/ >=16) { 
RDebugUtils.currentLine=12386337;
 //BA.debugLineNum = 12386337;BA.debugLine="Panel16. Visible = True";
mostCurrent._panel16.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386338;
 //BA.debugLineNum = 12386338;BA.debugLine="If ProgramAyar.secilenLevel >= 17";
if (mostCurrent._programayar._secilenlevel /*int*/ >=17) { 
RDebugUtils.currentLine=12386339;
 //BA.debugLineNum = 12386339;BA.debugLine="Panel17.Visible = True";
mostCurrent._panel17.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386340;
 //BA.debugLineNum = 12386340;BA.debugLine="If ProgramAyar.secilenLevel >= 1";
if (mostCurrent._programayar._secilenlevel /*int*/ >=18) { 
RDebugUtils.currentLine=12386341;
 //BA.debugLineNum = 12386341;BA.debugLine="Panel18.Visible = True";
mostCurrent._panel18.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386342;
 //BA.debugLineNum = 12386342;BA.debugLine="If ProgramAyar.secilenLevel >=";
if (mostCurrent._programayar._secilenlevel /*int*/ >=19) { 
RDebugUtils.currentLine=12386343;
 //BA.debugLineNum = 12386343;BA.debugLine="Panel19.Visible = True";
mostCurrent._panel19.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386344;
 //BA.debugLineNum = 12386344;BA.debugLine="If ProgramAyar.secilenLevel >=";
if (mostCurrent._programayar._secilenlevel /*int*/ >=20) { 
RDebugUtils.currentLine=12386345;
 //BA.debugLineNum = 12386345;BA.debugLine="Panel20.Visible = True";
mostCurrent._panel20.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386346;
 //BA.debugLineNum = 12386346;BA.debugLine="If ProgramAyar.secilenLevel >";
if (mostCurrent._programayar._secilenlevel /*int*/ >=21) { 
RDebugUtils.currentLine=12386347;
 //BA.debugLineNum = 12386347;BA.debugLine="Panel21.Visible = True";
mostCurrent._panel21.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386348;
 //BA.debugLineNum = 12386348;BA.debugLine="If ProgramAyar.secilenLevel";
if (mostCurrent._programayar._secilenlevel /*int*/ >=22) { 
RDebugUtils.currentLine=12386349;
 //BA.debugLineNum = 12386349;BA.debugLine="Panel22.Visible = True";
mostCurrent._panel22.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386350;
 //BA.debugLineNum = 12386350;BA.debugLine="If ProgramAyar.secilenLevel";
if (mostCurrent._programayar._secilenlevel /*int*/ >=23) { 
RDebugUtils.currentLine=12386351;
 //BA.debugLineNum = 12386351;BA.debugLine="Panel23.Visible = True";
mostCurrent._panel23.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386352;
 //BA.debugLineNum = 12386352;BA.debugLine="If ProgramAyar.secilenLeve";
if (mostCurrent._programayar._secilenlevel /*int*/ >=24) { 
RDebugUtils.currentLine=12386353;
 //BA.debugLineNum = 12386353;BA.debugLine="Panel24.Visible = True";
mostCurrent._panel24.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12386354;
 //BA.debugLineNum = 12386354;BA.debugLine="If ProgramAyar.secilenLev";
if (mostCurrent._programayar._secilenlevel /*int*/ ==25) { 
RDebugUtils.currentLine=12386355;
 //BA.debugLineNum = 12386355;BA.debugLine="Panel25.Visible = True";
mostCurrent._panel25.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
RDebugUtils.currentLine=12386382;
 //BA.debugLineNum = 12386382;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="programveri";
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="End Sub";
return "";
}
public static String  _buttonok_click() throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonok_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonok_click", null));}
int _result = 0;
long _now = 0L;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub ButtonOK_Click";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="VeriAl";
_verial();
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="result = Msgbox2(\"Programı eklemek istiyor musunu";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Programı eklemek istiyor musunuz?:"),BA.ObjectToCharSequence("Onay Mesajı"),"Evet","","Hayır",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="If result= DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="Dim now As Long = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="Log(DateTime.Date(now))";
anywheresoftware.b4a.keywords.Common.LogImpl("212582919",anywheresoftware.b4a.keywords.Common.DateTime.Date(_now),0);
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="secilenTarih = DateTime.Date(now)";
mostCurrent._secilentarih = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="Log(DateTime.Time(now))";
anywheresoftware.b4a.keywords.Common.LogImpl("212582921",anywheresoftware.b4a.keywords.Common.DateTime.Time(_now),0);
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="secilenSaat = DateTime.Time(now)";
mostCurrent._secilensaat = anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="ID";
_id();
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="Main.sql.ExecNonQuery2(\"INSERT INTO Dayaniklilik";
mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO DayaniklilikTestProgram VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_programid),(Object)(mostCurrent._programayar._programadi /*String*/ ),(Object)(mostCurrent._secilentarih),(Object)(mostCurrent._secilensaat),(Object)(mostCurrent._programayar._secilenlevel /*int*/ ),(Object)(mostCurrent._programayar._secilentestturu /*String*/ ),(Object)(_konimesafesi1),(Object)(_hiz1),(Object)(_dakika1),(Object)(_saniye1),(Object)(_konimesafesi2),(Object)(_hiz2),(Object)(_dakika2),(Object)(_saniye2),(Object)(_konimesafesi3),(Object)(_hiz3),(Object)(_dakika3),(Object)(_saniye3),(Object)(_konimesafesi4),(Object)(_hiz4),(Object)(_dakika4),(Object)(_saniye4),(Object)(_konimesafesi5),(Object)(_hiz5),(Object)(_dakika5),(Object)(_saniye5),(Object)(_konimesafesi6),(Object)(_hiz6),(Object)(_dakika6),(Object)(_saniye6),(Object)(_konimesafesi7),(Object)(_hiz7),(Object)(_dakika7),(Object)(_saniye7),(Object)(_konimesafesi8),(Object)(_hiz8),(Object)(_dakika8),(Object)(_saniye8),(Object)(_konimesafesi9),(Object)(_hiz9),(Object)(_dakika9),(Object)(_saniye9),(Object)(_konimesafesi10),(Object)(_hiz10),(Object)(_dakika10),(Object)(_saniye10),(Object)(_konimesafesi11),(Object)(_hiz11),(Object)(_dakika11),(Object)(_saniye11),(Object)(_konimesafesi12),(Object)(_hiz12),(Object)(_dakika12),(Object)(_saniye12),(Object)(_konimesafesi13),(Object)(_hiz13),(Object)(_dakika13),(Object)(_saniye13),(Object)(_konimesafesi14),(Object)(_hiz14),(Object)(_dakika14),(Object)(_saniye14),(Object)(_konimesafesi15),(Object)(_hiz15),(Object)(_dakika15),(Object)(_saniye15),(Object)(_konimesafesi16),(Object)(_hiz16),(Object)(_dakika16),(Object)(_saniye16),(Object)(_konimesafesi17),(Object)(_hiz17),(Object)(_dakika17),(Object)(_saniye17),(Object)(_konimesafesi18),(Object)(_hiz18),(Object)(_dakika18),(Object)(_saniye18),(Object)(_konimesafesi19),(Object)(_hiz19),(Object)(_dakika19),(Object)(_saniye19),(Object)(_konimesafesi20),(Object)(_hiz20),(Object)(_dakika20),(Object)(_saniye20),(Object)(_konimesafesi21),(Object)(_hiz21),(Object)(_dakika21),(Object)(_saniye21),(Object)(_konimesafesi22),(Object)(_hiz22),(Object)(_dakika22),(Object)(_saniye22),(Object)(_konimesafesi23),(Object)(_hiz23),(Object)(_dakika23),(Object)(_saniye23),(Object)(_konimesafesi24),(Object)(_hiz24),(Object)(_dakika24),(Object)(_saniye24),(Object)(_konimesafesi25),(Object)(_hiz25),(Object)(_dakika25),(Object)(_saniye25)}));
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="StartActivity(ProgramListele)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._programlistele.getObject()));
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="Else If result= DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="ToastMessageShow(\"Yönlendiriliyorsunuz...\",False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Yönlendiriliyorsunuz..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="End Sub";
return "";
}
public static String  _verial() throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "verial", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "verial", null));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Sub VeriAl";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="If ProgramAyar.secilenLevel >= 1 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=1) { 
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="EditTextKoniMesafesi1_TextChanged(\"0\",EditTextKo";
_edittextkonimesafesi1_textchanged("0",mostCurrent._edittextkonimesafesi1.getText());
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="EditTextHiz1_TextChanged(\"0\",EditTextHiz1.Text)";
_edittexthiz1_textchanged("0",mostCurrent._edittexthiz1.getText());
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="EditTextDakika1_TextChanged(\"0\", EditTextDakika1";
_edittextdakika1_textchanged("0",mostCurrent._edittextdakika1.getText());
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="EditTextSaniye1_TextChanged(\"0\", EditTextSaniye1";
_edittextsaniye1_textchanged("0",mostCurrent._edittextsaniye1.getText());
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="If ProgramAyar.secilenLevel >= 2 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=2) { 
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="EditTextKoniMesafesi2_TextChanged(\"0\",EditTextK";
_edittextkonimesafesi2_textchanged("0",mostCurrent._edittextkonimesafesi2.getText());
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="EditTextHiz2_TextChanged(\"0\",EditTextHiz2.Text)";
_edittexthiz2_textchanged("0",mostCurrent._edittexthiz2.getText());
RDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="EditTextDakika2_TextChanged(\"0\",EditTextDakika2";
_edittextdakika2_textchanged("0",mostCurrent._edittextdakika2.getText());
RDebugUtils.currentLine=12517386;
 //BA.debugLineNum = 12517386;BA.debugLine="EditTextSaniye2_TextChanged(\"0\", EditTextSaniye";
_edittextsaniye2_textchanged("0",mostCurrent._edittextsaniye2.getText());
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="If ProgramAyar.secilenLevel >=3 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=3) { 
RDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="EditTextKoniMesafesi3_TextChanged(\"0\",EditText";
_edittextkonimesafesi3_textchanged("0",mostCurrent._edittextkonimesafesi3.getText());
RDebugUtils.currentLine=12517389;
 //BA.debugLineNum = 12517389;BA.debugLine="EditTextHiz3_TextChanged(\"0\",  EditTextHiz3.Te";
_edittexthiz3_textchanged("0",mostCurrent._edittexthiz3.getText());
RDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="EditTextDakika3_TextChanged(\"0\", EditTextDakik";
_edittextdakika3_textchanged("0",mostCurrent._edittextdakika3.getText());
RDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="EditTextSaniye3_TextChanged(\"0\", EditTextSaniy";
_edittextsaniye3_textchanged("0",mostCurrent._edittextsaniye3.getText());
RDebugUtils.currentLine=12517392;
 //BA.debugLineNum = 12517392;BA.debugLine="If ProgramAyar.secilenLevel >= 4 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=4) { 
RDebugUtils.currentLine=12517393;
 //BA.debugLineNum = 12517393;BA.debugLine="EditTextKoniMesafesi4_TextChanged(\"0\",EditTex";
_edittextkonimesafesi4_textchanged("0",mostCurrent._edittextkonimesafesi4.getText());
RDebugUtils.currentLine=12517394;
 //BA.debugLineNum = 12517394;BA.debugLine="EditTextHiz4_TextChanged(\"0\",  EditTextHiz4.T";
_edittexthiz4_textchanged("0",mostCurrent._edittexthiz4.getText());
RDebugUtils.currentLine=12517395;
 //BA.debugLineNum = 12517395;BA.debugLine="EditTextDakika4_TextChanged(\"0\", EditTextDaki";
_edittextdakika4_textchanged("0",mostCurrent._edittextdakika4.getText());
RDebugUtils.currentLine=12517396;
 //BA.debugLineNum = 12517396;BA.debugLine="EditTextSaniye4_TextChanged(\"0\", EditTextSani";
_edittextsaniye4_textchanged("0",mostCurrent._edittextsaniye4.getText());
RDebugUtils.currentLine=12517397;
 //BA.debugLineNum = 12517397;BA.debugLine="If ProgramAyar.secilenLevel >= 5 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=5) { 
RDebugUtils.currentLine=12517398;
 //BA.debugLineNum = 12517398;BA.debugLine="EditTextKoniMesafesi5_TextChanged(\"0\",EditTe";
_edittextkonimesafesi5_textchanged("0",mostCurrent._edittextkonimesafesi5.getText());
RDebugUtils.currentLine=12517399;
 //BA.debugLineNum = 12517399;BA.debugLine="EditTextHiz5_TextChanged(\"0\",  EditTextHiz5.";
_edittexthiz5_textchanged("0",mostCurrent._edittexthiz5.getText());
RDebugUtils.currentLine=12517400;
 //BA.debugLineNum = 12517400;BA.debugLine="EditTextDakika5_TextChanged(\"0\", EditTextDak";
_edittextdakika5_textchanged("0",mostCurrent._edittextdakika5.getText());
RDebugUtils.currentLine=12517401;
 //BA.debugLineNum = 12517401;BA.debugLine="EditTextSaniye5_TextChanged(\"0\", EditTextSan";
_edittextsaniye5_textchanged("0",mostCurrent._edittextsaniye5.getText());
RDebugUtils.currentLine=12517402;
 //BA.debugLineNum = 12517402;BA.debugLine="If ProgramAyar.secilenLevel >= 6 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=6) { 
RDebugUtils.currentLine=12517403;
 //BA.debugLineNum = 12517403;BA.debugLine="EditTextKoniMesafesi6_TextChanged(\"0\",EditT";
_edittextkonimesafesi6_textchanged("0",mostCurrent._edittextkonimesafesi6.getText());
RDebugUtils.currentLine=12517404;
 //BA.debugLineNum = 12517404;BA.debugLine="EditTextHiz6_TextChanged(\"0\",  EditTextHiz6";
_edittexthiz6_textchanged("0",mostCurrent._edittexthiz6.getText());
RDebugUtils.currentLine=12517405;
 //BA.debugLineNum = 12517405;BA.debugLine="EditTextDakika6_TextChanged(\"0\", EditTextDa";
_edittextdakika6_textchanged("0",mostCurrent._edittextdakika6.getText());
RDebugUtils.currentLine=12517406;
 //BA.debugLineNum = 12517406;BA.debugLine="EditTextSaniye6_TextChanged(\"0\", EditTextSa";
_edittextsaniye6_textchanged("0",mostCurrent._edittextsaniye6.getText());
RDebugUtils.currentLine=12517407;
 //BA.debugLineNum = 12517407;BA.debugLine="If ProgramAyar.secilenLevel >= 7 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=7) { 
RDebugUtils.currentLine=12517408;
 //BA.debugLineNum = 12517408;BA.debugLine="EditTextKoniMesafesi7_TextChanged(\"0\",Edit";
_edittextkonimesafesi7_textchanged("0",mostCurrent._edittextkonimesafesi7.getText());
RDebugUtils.currentLine=12517409;
 //BA.debugLineNum = 12517409;BA.debugLine="EditTextHiz7_TextChanged(\"0\",  EditTextHiz";
_edittexthiz7_textchanged("0",mostCurrent._edittexthiz7.getText());
RDebugUtils.currentLine=12517410;
 //BA.debugLineNum = 12517410;BA.debugLine="EditTextDakika7_TextChanged(\"0\", EditTextD";
_edittextdakika7_textchanged("0",mostCurrent._edittextdakika7.getText());
RDebugUtils.currentLine=12517411;
 //BA.debugLineNum = 12517411;BA.debugLine="EditTextSaniye7_TextChanged(\"0\", EditTextS";
_edittextsaniye7_textchanged("0",mostCurrent._edittextsaniye7.getText());
RDebugUtils.currentLine=12517412;
 //BA.debugLineNum = 12517412;BA.debugLine="If ProgramAyar.secilenLevel >= 8 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=8) { 
RDebugUtils.currentLine=12517413;
 //BA.debugLineNum = 12517413;BA.debugLine="EditTextKoniMesafesi8_TextChanged(\"0\",Edi";
_edittextkonimesafesi8_textchanged("0",mostCurrent._edittextkonimesafesi8.getText());
RDebugUtils.currentLine=12517414;
 //BA.debugLineNum = 12517414;BA.debugLine="EditTextHiz8_TextChanged(\"0\",  EditTextHi";
_edittexthiz8_textchanged("0",mostCurrent._edittexthiz8.getText());
RDebugUtils.currentLine=12517415;
 //BA.debugLineNum = 12517415;BA.debugLine="EditTextDakika8_TextChanged(\"0\", EditText";
_edittextdakika8_textchanged("0",mostCurrent._edittextdakika8.getText());
RDebugUtils.currentLine=12517416;
 //BA.debugLineNum = 12517416;BA.debugLine="EditTextSaniye8_TextChanged(\"0\", EditText";
_edittextsaniye8_textchanged("0",mostCurrent._edittextsaniye8.getText());
RDebugUtils.currentLine=12517417;
 //BA.debugLineNum = 12517417;BA.debugLine="If ProgramAyar.secilenLevel >= 9 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=9) { 
RDebugUtils.currentLine=12517418;
 //BA.debugLineNum = 12517418;BA.debugLine="EditTextKoniMesafesi9_TextChanged(\"0\",Ed";
_edittextkonimesafesi9_textchanged("0",mostCurrent._edittextkonimesafesi9.getText());
RDebugUtils.currentLine=12517419;
 //BA.debugLineNum = 12517419;BA.debugLine="EditTextHiz9_TextChanged(\"0\",  EditTextH";
_edittexthiz9_textchanged("0",mostCurrent._edittexthiz9.getText());
RDebugUtils.currentLine=12517420;
 //BA.debugLineNum = 12517420;BA.debugLine="EditTextDakika9_TextChanged(\"0\", EditTex";
_edittextdakika9_textchanged("0",mostCurrent._edittextdakika9.getText());
RDebugUtils.currentLine=12517421;
 //BA.debugLineNum = 12517421;BA.debugLine="EditTextSaniye9_TextChanged(\"0\", EditTex";
_edittextsaniye9_textchanged("0",mostCurrent._edittextsaniye9.getText());
RDebugUtils.currentLine=12517422;
 //BA.debugLineNum = 12517422;BA.debugLine="If ProgramAyar.secilenLevel >= 10 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=10) { 
RDebugUtils.currentLine=12517423;
 //BA.debugLineNum = 12517423;BA.debugLine="EditTextKoniMesafesi10_TextChanged(\"0\",";
_edittextkonimesafesi10_textchanged("0",mostCurrent._edittextkonimesafesi10.getText());
RDebugUtils.currentLine=12517424;
 //BA.debugLineNum = 12517424;BA.debugLine="EditTextHiz10_TextChanged(\"0\",  EditTex";
_edittexthiz10_textchanged("0",mostCurrent._edittexthiz10.getText());
RDebugUtils.currentLine=12517425;
 //BA.debugLineNum = 12517425;BA.debugLine="EditTextDakika10_TextChanged(\"0\", EditT";
_edittextdakika10_textchanged("0",mostCurrent._edittextdakika10.getText());
RDebugUtils.currentLine=12517426;
 //BA.debugLineNum = 12517426;BA.debugLine="EditTextSaniye10_TextChanged(\"0\", EditT";
_edittextsaniye10_textchanged("0",mostCurrent._edittextsaniye10.getText());
RDebugUtils.currentLine=12517427;
 //BA.debugLineNum = 12517427;BA.debugLine="If ProgramAyar.secilenLevel >= 11 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=11) { 
RDebugUtils.currentLine=12517428;
 //BA.debugLineNum = 12517428;BA.debugLine="EditTextKoniMesafesi11_TextChanged(\"0\"";
_edittextkonimesafesi11_textchanged("0",mostCurrent._edittextkonimesafesi11.getText());
RDebugUtils.currentLine=12517429;
 //BA.debugLineNum = 12517429;BA.debugLine="EditTextHiz11_TextChanged(\"0\",  EditTe";
_edittexthiz11_textchanged("0",mostCurrent._edittexthiz11.getText());
RDebugUtils.currentLine=12517430;
 //BA.debugLineNum = 12517430;BA.debugLine="EditTextDakika11_TextChanged(\"0\", Edit";
_edittextdakika11_textchanged("0",mostCurrent._edittextdakika11.getText());
RDebugUtils.currentLine=12517431;
 //BA.debugLineNum = 12517431;BA.debugLine="EditTextSaniye11_TextChanged(\"0\", Edit";
_edittextsaniye11_textchanged("0",mostCurrent._edittextsaniye11.getText());
RDebugUtils.currentLine=12517432;
 //BA.debugLineNum = 12517432;BA.debugLine="If ProgramAyar.secilenLevel >= 12 Then";
if (mostCurrent._programayar._secilenlevel /*int*/ >=12) { 
RDebugUtils.currentLine=12517433;
 //BA.debugLineNum = 12517433;BA.debugLine="EditTextKoniMesafesi12_TextChanged(\"0";
_edittextkonimesafesi12_textchanged("0",mostCurrent._edittextkonimesafesi12.getText());
RDebugUtils.currentLine=12517434;
 //BA.debugLineNum = 12517434;BA.debugLine="EditTextHiz12_TextChanged(\"0\",  EditT";
_edittexthiz12_textchanged("0",mostCurrent._edittexthiz12.getText());
RDebugUtils.currentLine=12517435;
 //BA.debugLineNum = 12517435;BA.debugLine="EditTextDakika12_TextChanged(\"0\", Edi";
_edittextdakika12_textchanged("0",mostCurrent._edittextdakika12.getText());
RDebugUtils.currentLine=12517436;
 //BA.debugLineNum = 12517436;BA.debugLine="EditTextSaniye12_TextChanged(\"0\", Edi";
_edittextsaniye12_textchanged("0",mostCurrent._edittextsaniye12.getText());
RDebugUtils.currentLine=12517437;
 //BA.debugLineNum = 12517437;BA.debugLine="If ProgramAyar.secilenLevel >= 13 The";
if (mostCurrent._programayar._secilenlevel /*int*/ >=13) { 
RDebugUtils.currentLine=12517438;
 //BA.debugLineNum = 12517438;BA.debugLine="EditTextKoniMesafesi13_TextChanged(\"";
_edittextkonimesafesi13_textchanged("0",mostCurrent._edittextkonimesafesi13.getText());
RDebugUtils.currentLine=12517439;
 //BA.debugLineNum = 12517439;BA.debugLine="EditTextHiz13_TextChanged(\"0\",  Edit";
_edittexthiz13_textchanged("0",mostCurrent._edittexthiz13.getText());
RDebugUtils.currentLine=12517440;
 //BA.debugLineNum = 12517440;BA.debugLine="EditTextDakika13_TextChanged(\"0\", Ed";
_edittextdakika13_textchanged("0",mostCurrent._edittextdakika13.getText());
RDebugUtils.currentLine=12517441;
 //BA.debugLineNum = 12517441;BA.debugLine="EditTextSaniye13_TextChanged(\"0\", Ed";
_edittextsaniye13_textchanged("0",mostCurrent._edittextsaniye13.getText());
RDebugUtils.currentLine=12517442;
 //BA.debugLineNum = 12517442;BA.debugLine="If ProgramAyar.secilenLevel >= 14 Th";
if (mostCurrent._programayar._secilenlevel /*int*/ >=14) { 
RDebugUtils.currentLine=12517443;
 //BA.debugLineNum = 12517443;BA.debugLine="EditTextKoniMesafesi14_TextChanged(";
_edittextkonimesafesi14_textchanged("0",mostCurrent._edittextkonimesafesi14.getText());
RDebugUtils.currentLine=12517444;
 //BA.debugLineNum = 12517444;BA.debugLine="EditTextHiz14_TextChanged(\"0\",  Edi";
_edittexthiz14_textchanged("0",mostCurrent._edittexthiz14.getText());
RDebugUtils.currentLine=12517445;
 //BA.debugLineNum = 12517445;BA.debugLine="EditTextDakika14_TextChanged(\"0\", E";
_edittextdakika14_textchanged("0",mostCurrent._edittextdakika14.getText());
RDebugUtils.currentLine=12517446;
 //BA.debugLineNum = 12517446;BA.debugLine="EditTextSaniye14_TextChanged(\"0\", E";
_edittextsaniye14_textchanged("0",mostCurrent._edittextsaniye14.getText());
RDebugUtils.currentLine=12517447;
 //BA.debugLineNum = 12517447;BA.debugLine="If ProgramAyar.secilenLevel >= 15 T";
if (mostCurrent._programayar._secilenlevel /*int*/ >=15) { 
RDebugUtils.currentLine=12517448;
 //BA.debugLineNum = 12517448;BA.debugLine="EditTextKoniMesafesi15_TextChanged";
_edittextkonimesafesi15_textchanged("0",mostCurrent._edittextkonimesafesi15.getText());
RDebugUtils.currentLine=12517449;
 //BA.debugLineNum = 12517449;BA.debugLine="EditTextHiz15_TextChanged(\"0\",  Ed";
_edittexthiz15_textchanged("0",mostCurrent._edittexthiz15.getText());
RDebugUtils.currentLine=12517450;
 //BA.debugLineNum = 12517450;BA.debugLine="EditTextDakika15_TextChanged(\"0\",";
_edittextdakika15_textchanged("0",mostCurrent._edittextdakika15.getText());
RDebugUtils.currentLine=12517451;
 //BA.debugLineNum = 12517451;BA.debugLine="EditTextSaniye15_TextChanged(\"0\",";
_edittextsaniye15_textchanged("0",mostCurrent._edittextsaniye15.getText());
RDebugUtils.currentLine=12517452;
 //BA.debugLineNum = 12517452;BA.debugLine="If ProgramAyar.secilenLevel >= 16";
if (mostCurrent._programayar._secilenlevel /*int*/ >=16) { 
RDebugUtils.currentLine=12517453;
 //BA.debugLineNum = 12517453;BA.debugLine="EditTextKoniMesafesi16_TextChange";
_edittextkonimesafesi16_textchanged("0",mostCurrent._edittextkonimesafesi16.getText());
RDebugUtils.currentLine=12517454;
 //BA.debugLineNum = 12517454;BA.debugLine="EditTextHiz16_TextChanged(\"0\",  E";
_edittexthiz16_textchanged("0",mostCurrent._edittexthiz16.getText());
RDebugUtils.currentLine=12517455;
 //BA.debugLineNum = 12517455;BA.debugLine="EditTextDakika16_TextChanged(\"0\",";
_edittextdakika16_textchanged("0",mostCurrent._edittextdakika16.getText());
RDebugUtils.currentLine=12517456;
 //BA.debugLineNum = 12517456;BA.debugLine="EditTextSaniye16_TextChanged(\"0\",";
_edittextsaniye16_textchanged("0",mostCurrent._edittextsaniye16.getText());
RDebugUtils.currentLine=12517457;
 //BA.debugLineNum = 12517457;BA.debugLine="If ProgramAyar.secilenLevel >= 17";
if (mostCurrent._programayar._secilenlevel /*int*/ >=17) { 
RDebugUtils.currentLine=12517458;
 //BA.debugLineNum = 12517458;BA.debugLine="EditTextKoniMesafesi17_TextChang";
_edittextkonimesafesi17_textchanged("0",mostCurrent._edittextkonimesafesi17.getText());
RDebugUtils.currentLine=12517459;
 //BA.debugLineNum = 12517459;BA.debugLine="EditTextHiz17_TextChanged(\"0\",";
_edittexthiz17_textchanged("0",mostCurrent._edittexthiz17.getText());
RDebugUtils.currentLine=12517460;
 //BA.debugLineNum = 12517460;BA.debugLine="EditTextDakika17_TextChanged(\"0\"";
_edittextdakika17_textchanged("0",mostCurrent._edittextdakika17.getText());
RDebugUtils.currentLine=12517461;
 //BA.debugLineNum = 12517461;BA.debugLine="EditTextSaniye17_TextChanged(\"0\"";
_edittextsaniye17_textchanged("0",mostCurrent._edittextsaniye17.getText());
RDebugUtils.currentLine=12517462;
 //BA.debugLineNum = 12517462;BA.debugLine="If ProgramAyar.secilenLevel >= 1";
if (mostCurrent._programayar._secilenlevel /*int*/ >=18) { 
RDebugUtils.currentLine=12517463;
 //BA.debugLineNum = 12517463;BA.debugLine="EditTextKoniMesafesi18_TextChan";
_edittextkonimesafesi18_textchanged("0",mostCurrent._edittextkonimesafesi18.getText());
RDebugUtils.currentLine=12517464;
 //BA.debugLineNum = 12517464;BA.debugLine="EditTextHiz18_TextChanged(\"0\",";
_edittexthiz18_textchanged("0",mostCurrent._edittexthiz18.getText());
RDebugUtils.currentLine=12517465;
 //BA.debugLineNum = 12517465;BA.debugLine="EditTextDakika18_TextChanged(\"0";
_edittextdakika18_textchanged("0",mostCurrent._edittextdakika18.getText());
RDebugUtils.currentLine=12517466;
 //BA.debugLineNum = 12517466;BA.debugLine="EditTextSaniye18_TextChanged(\"0";
_edittextsaniye18_textchanged("0",mostCurrent._edittextsaniye18.getText());
RDebugUtils.currentLine=12517467;
 //BA.debugLineNum = 12517467;BA.debugLine="If ProgramAyar.secilenLevel >=";
if (mostCurrent._programayar._secilenlevel /*int*/ >=19) { 
RDebugUtils.currentLine=12517468;
 //BA.debugLineNum = 12517468;BA.debugLine="EditTextKoniMesafesi19_TextCha";
_edittextkonimesafesi19_textchanged("0",mostCurrent._edittextkonimesafesi19.getText());
RDebugUtils.currentLine=12517469;
 //BA.debugLineNum = 12517469;BA.debugLine="EditTextHiz19_TextChanged(\"0\",";
_edittexthiz19_textchanged("0",mostCurrent._edittexthiz19.getText());
RDebugUtils.currentLine=12517470;
 //BA.debugLineNum = 12517470;BA.debugLine="EditTextDakika19_TextChanged(\"";
_edittextdakika19_textchanged("0",mostCurrent._edittextdakika19.getText());
RDebugUtils.currentLine=12517471;
 //BA.debugLineNum = 12517471;BA.debugLine="EditTextSaniye19_TextChanged(\"";
_edittextsaniye19_textchanged("0",mostCurrent._edittextsaniye19.getText());
RDebugUtils.currentLine=12517472;
 //BA.debugLineNum = 12517472;BA.debugLine="If ProgramAyar.secilenLevel >=";
if (mostCurrent._programayar._secilenlevel /*int*/ >=20) { 
RDebugUtils.currentLine=12517473;
 //BA.debugLineNum = 12517473;BA.debugLine="EditTextKoniMesafesi20_TextCh";
_edittextkonimesafesi20_textchanged("0",mostCurrent._edittextkonimesafesi20.getText());
RDebugUtils.currentLine=12517474;
 //BA.debugLineNum = 12517474;BA.debugLine="EditTextHiz20_TextChanged(\"0\"";
_edittexthiz20_textchanged("0",mostCurrent._edittexthiz20.getText());
RDebugUtils.currentLine=12517475;
 //BA.debugLineNum = 12517475;BA.debugLine="EditTextDakika20_TextChanged(";
_edittextdakika20_textchanged("0",mostCurrent._edittextdakika20.getText());
RDebugUtils.currentLine=12517476;
 //BA.debugLineNum = 12517476;BA.debugLine="EditTextSaniye20_TextChanged(";
_edittextsaniye20_textchanged("0",mostCurrent._edittextsaniye20.getText());
RDebugUtils.currentLine=12517477;
 //BA.debugLineNum = 12517477;BA.debugLine="If ProgramAyar.secilenLevel >";
if (mostCurrent._programayar._secilenlevel /*int*/ >=21) { 
RDebugUtils.currentLine=12517478;
 //BA.debugLineNum = 12517478;BA.debugLine="EditTextKoniMesafesi21_TextC";
_edittextkonimesafesi21_textchanged("0",mostCurrent._edittextkonimesafesi21.getText());
RDebugUtils.currentLine=12517479;
 //BA.debugLineNum = 12517479;BA.debugLine="EditTextHiz21_TextChanged(\"0";
_edittexthiz21_textchanged("0",mostCurrent._edittexthiz21.getText());
RDebugUtils.currentLine=12517480;
 //BA.debugLineNum = 12517480;BA.debugLine="EditTextDakika21_TextChanged";
_edittextdakika21_textchanged("0",mostCurrent._edittextdakika21.getText());
RDebugUtils.currentLine=12517481;
 //BA.debugLineNum = 12517481;BA.debugLine="EditTextSaniye21_TextChanged";
_edittextsaniye21_textchanged("0",mostCurrent._edittextsaniye21.getText());
RDebugUtils.currentLine=12517482;
 //BA.debugLineNum = 12517482;BA.debugLine="If ProgramAyar.secilenLevel";
if (mostCurrent._programayar._secilenlevel /*int*/ >=22) { 
RDebugUtils.currentLine=12517483;
 //BA.debugLineNum = 12517483;BA.debugLine="EditTextKoniMesafesi22_Text";
_edittextkonimesafesi22_textchanged("0",mostCurrent._edittextkonimesafesi22.getText());
RDebugUtils.currentLine=12517484;
 //BA.debugLineNum = 12517484;BA.debugLine="EditTextHiz22_TextChanged(\"";
_edittexthiz22_textchanged("0",mostCurrent._edittexthiz22.getText());
RDebugUtils.currentLine=12517485;
 //BA.debugLineNum = 12517485;BA.debugLine="EditTextDakika22_TextChange";
_edittextdakika22_textchanged("0",mostCurrent._edittextdakika22.getText());
RDebugUtils.currentLine=12517486;
 //BA.debugLineNum = 12517486;BA.debugLine="EditTextSaniye22_TextChange";
_edittextsaniye22_textchanged("0",mostCurrent._edittextsaniye22.getText());
RDebugUtils.currentLine=12517487;
 //BA.debugLineNum = 12517487;BA.debugLine="If ProgramAyar.secilenLevel";
if (mostCurrent._programayar._secilenlevel /*int*/ >=23) { 
RDebugUtils.currentLine=12517488;
 //BA.debugLineNum = 12517488;BA.debugLine="EditTextKoniMesafesi23_Tex";
_edittextkonimesafesi23_textchanged("0",mostCurrent._edittextkonimesafesi23.getText());
RDebugUtils.currentLine=12517489;
 //BA.debugLineNum = 12517489;BA.debugLine="EditTextHiz23_TextChanged(";
_edittexthiz23_textchanged("0",mostCurrent._edittexthiz23.getText());
RDebugUtils.currentLine=12517490;
 //BA.debugLineNum = 12517490;BA.debugLine="EditTextDakika23_TextChang";
_edittextdakika23_textchanged("0",mostCurrent._edittextdakika23.getText());
RDebugUtils.currentLine=12517491;
 //BA.debugLineNum = 12517491;BA.debugLine="EditTextSaniye23_TextChang";
_edittextsaniye23_textchanged("0",mostCurrent._edittextsaniye23.getText());
RDebugUtils.currentLine=12517492;
 //BA.debugLineNum = 12517492;BA.debugLine="If ProgramAyar.secilenLeve";
if (mostCurrent._programayar._secilenlevel /*int*/ >=24) { 
RDebugUtils.currentLine=12517493;
 //BA.debugLineNum = 12517493;BA.debugLine="EditTextKoniMesafesi24_Te";
_edittextkonimesafesi24_textchanged("0",mostCurrent._edittextkonimesafesi24.getText());
RDebugUtils.currentLine=12517494;
 //BA.debugLineNum = 12517494;BA.debugLine="EditTextHiz24_TextChanged";
_edittexthiz24_textchanged("0",mostCurrent._edittexthiz24.getText());
RDebugUtils.currentLine=12517495;
 //BA.debugLineNum = 12517495;BA.debugLine="EditTextDakika24_TextChan";
_edittextdakika24_textchanged("0",mostCurrent._edittextdakika24.getText());
RDebugUtils.currentLine=12517496;
 //BA.debugLineNum = 12517496;BA.debugLine="EditTextSaniye24_TextChan";
_edittextsaniye24_textchanged("0",mostCurrent._edittextsaniye24.getText());
RDebugUtils.currentLine=12517497;
 //BA.debugLineNum = 12517497;BA.debugLine="If ProgramAyar.secilenLev";
if (mostCurrent._programayar._secilenlevel /*int*/ ==25) { 
RDebugUtils.currentLine=12517498;
 //BA.debugLineNum = 12517498;BA.debugLine="EditTextKoniMesafesi25_T";
_edittextkonimesafesi25_textchanged("0",mostCurrent._edittextkonimesafesi25.getText());
RDebugUtils.currentLine=12517499;
 //BA.debugLineNum = 12517499;BA.debugLine="EditTextHiz25_TextChange";
_edittexthiz25_textchanged("0",mostCurrent._edittexthiz25.getText());
RDebugUtils.currentLine=12517500;
 //BA.debugLineNum = 12517500;BA.debugLine="EditTextDakika25_TextCha";
_edittextdakika25_textchanged("0",mostCurrent._edittextdakika25.getText());
RDebugUtils.currentLine=12517501;
 //BA.debugLineNum = 12517501;BA.debugLine="EditTextSaniye25_TextCha";
_edittextsaniye25_textchanged("0",mostCurrent._edittextsaniye25.getText());
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
 };
RDebugUtils.currentLine=12517527;
 //BA.debugLineNum = 12517527;BA.debugLine="End Sub";
return "";
}
public static String  _id() throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "id", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "id", null));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub ID";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="sf.initialize";
_sf._initialize(processBA);
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="rs= Main.sql.ExecQuery(\"SELECT * FROM Dayaniklili";
mostCurrent._rs.setObject((android.database.Cursor)(mostCurrent._main._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC")));
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="If rs.RowCount>0 Then";
if (mostCurrent._rs.getRowCount()>0) { 
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="rs.Position=0";
mostCurrent._rs.setPosition((int) (0));
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="ProgramID = sf.Right(\"00\" &sf.Trim(sf.Val(sf.Rig";
_programid = (int)(Double.parseDouble(_sf._vvvvv7("00"+_sf._vvvvvvv4(BA.NumberToString(_sf._vvvvvvv6(_sf._vvvvv7(mostCurrent._rs.GetString("program_id"),(long) (3)))+1)),(long) (3))));
 }else {
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="ProgramID=\"001\"";
_programid = (int)(Double.parseDouble("001"));
 };
RDebugUtils.currentLine=12451851;
 //BA.debugLineNum = 12451851;BA.debugLine="rs.Close";
mostCurrent._rs.Close();
RDebugUtils.currentLine=12451852;
 //BA.debugLineNum = 12451852;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub EditTextDakika1_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="If EditTextDakika1.Text.Length == 0 Then";
if (mostCurrent._edittextdakika1.getText().length()==0) { 
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="dakika1 = Old";
_dakika1 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="dakika1 = New";
_dakika1 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika10_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika10_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika10_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub EditTextDakika10_TextChanged (Old As String, N";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="If EditTextDakika10.Text.Length == 0 Then";
if (mostCurrent._edittextdakika10.getText().length()==0) { 
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="dakika10 = Old";
_dakika10 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="dakika10 = New";
_dakika10 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika11_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika11_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika11_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub EditTextDakika11_TextChanged (Old As String, N";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="If EditTextDakika11.Text.Length == 0 Then";
if (mostCurrent._edittextdakika11.getText().length()==0) { 
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="dakika11 = Old";
_dakika11 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="dakika11 = New";
_dakika11 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika12_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika12_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika12_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Sub EditTextDakika12_TextChanged (Old As String, N";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="If EditTextDakika12.Text.Length == 0 Then";
if (mostCurrent._edittextdakika12.getText().length()==0) { 
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="dakika12 = Old";
_dakika12 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="dakika12 = New";
_dakika12 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika13_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika13_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika13_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Sub EditTextDakika13_TextChanged (Old As String, N";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="If EditTextDakika13.Text.Length == 0 Then";
if (mostCurrent._edittextdakika13.getText().length()==0) { 
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="dakika13 = Old";
_dakika13 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="dakika13 = New";
_dakika13 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika14_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika14_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika14_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Sub EditTextDakika14_TextChanged (Old As String, N";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="If EditTextDakika14.Text.Length == 0 Then";
if (mostCurrent._edittextdakika14.getText().length()==0) { 
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="dakika14 = Old";
_dakika14 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="dakika14 = New";
_dakika14 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika15_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika15_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika15_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub EditTextDakika15_TextChanged (Old As String, N";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="If EditTextDakika15.Text.Length == 0 Then";
if (mostCurrent._edittextdakika15.getText().length()==0) { 
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="dakika15 = Old";
_dakika15 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="dakika15 = New";
_dakika15 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika16_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika16_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika16_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub EditTextDakika16_TextChanged (Old As String, N";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If EditTextDakika16.Text.Length == 0 Then";
if (mostCurrent._edittextdakika16.getText().length()==0) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="dakika16 = Old";
_dakika16 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="dakika16 = New";
_dakika16 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika17_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika17_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika17_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub EditTextDakika17_TextChanged (Old As String, N";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="If EditTextDakika17.Text.Length == 0 Then";
if (mostCurrent._edittextdakika17.getText().length()==0) { 
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="dakika17 = Old";
_dakika17 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="dakika17 = New";
_dakika17 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika18_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika18_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika18_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Sub EditTextDakika18_TextChanged (Old As String, N";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="If EditTextDakika18.Text.Length == 0 Then";
if (mostCurrent._edittextdakika18.getText().length()==0) { 
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="dakika18 = Old";
_dakika18 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="dakika18 = New";
_dakika18 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika19_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika19_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika19_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Sub EditTextDakika19_TextChanged (Old As String, N";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="If EditTextDakika19.Text.Length == 0 Then";
if (mostCurrent._edittextdakika19.getText().length()==0) { 
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="dakika19 = Old";
_dakika19 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="dakika19 = New";
_dakika19 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17498118;
 //BA.debugLineNum = 17498118;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika2_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika2_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika2_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub EditTextDakika2_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="If EditTextDakika2.Text.Length == 0 Then";
if (mostCurrent._edittextdakika2.getText().length()==0) { 
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="dakika2 = Old";
_dakika2 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="dakika2 = New";
_dakika2 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika20_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika20_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika20_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Sub EditTextDakika20_TextChanged (Old As String, N";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="If EditTextDakika20.Text.Length == 0 Then";
if (mostCurrent._edittextdakika20.getText().length()==0) { 
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="dakika20 = Old";
_dakika20 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="dakika20 = New";
_dakika20 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika21_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika21_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika21_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub EditTextDakika21_TextChanged (Old As String, N";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="If EditTextDakika21.Text.Length == 0 Then";
if (mostCurrent._edittextdakika21.getText().length()==0) { 
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="dakika21 = Old";
_dakika21 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="dakika21 = New";
_dakika21 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika22_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika22_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika22_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Sub EditTextDakika22_TextChanged (Old As String, N";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="If EditTextDakika22.Text.Length == 0 Then";
if (mostCurrent._edittextdakika22.getText().length()==0) { 
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="dakika22 = Old";
_dakika22 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="dakika22 = New";
_dakika22 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika23_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika23_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika23_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub EditTextDakika23_TextChanged (Old As String, N";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="If EditTextDakika23.Text.Length == 0 Then";
if (mostCurrent._edittextdakika23.getText().length()==0) { 
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="dakika23 = Old";
_dakika23 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="dakika23 = New";
_dakika23 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18481158;
 //BA.debugLineNum = 18481158;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika24_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika24_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika24_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub EditTextDakika24_TextChanged (Old As String, N";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="If EditTextDakika24.Text.Length == 0 Then";
if (mostCurrent._edittextdakika24.getText().length()==0) { 
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="dakika24 = Old";
_dakika24 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="dakika24 = New";
_dakika24 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika25_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika25_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika25_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Sub EditTextDakika25_TextChanged (Old As String, N";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="If EditTextDakika25.Text.Length == 0 Then";
if (mostCurrent._edittextdakika25.getText().length()==0) { 
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="dakika25 = Old";
_dakika25 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="dakika25 = New";
_dakika25 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika3_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika3_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub EditTextDakika3_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="If EditTextDakika3.Text.Length == 0 Then";
if (mostCurrent._edittextdakika3.getText().length()==0) { 
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="dakika3 = Old";
_dakika3 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="dakika3 = New";
_dakika3 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika4_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika4_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika4_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub EditTextDakika4_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="If EditTextDakika4.Text.Length == 0 Then";
if (mostCurrent._edittextdakika4.getText().length()==0) { 
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="dakika4 = Old";
_dakika4 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="dakika4 = New";
_dakika4 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika5_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika5_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika5_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub EditTextDakika5_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="If EditTextDakika5.Text.Length == 0 Then";
if (mostCurrent._edittextdakika5.getText().length()==0) { 
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="dakika5 = Old";
_dakika5 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="dakika5 = New";
_dakika5 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika6_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika6_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika6_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub EditTextDakika6_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="If EditTextDakika6.Text.Length == 0 Then";
if (mostCurrent._edittextdakika6.getText().length()==0) { 
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="dakika6 = Old";
_dakika6 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="dakika6 = New";
_dakika6 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika7_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika7_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika7_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub EditTextDakika7_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="If EditTextDakika7.Text.Length == 0 Then";
if (mostCurrent._edittextdakika7.getText().length()==0) { 
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="dakika7 = Old";
_dakika7 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="dakika7 = New";
_dakika7 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika8_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika8_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika8_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub EditTextDakika8_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="If EditTextDakika8.Text.Length == 0 Then";
if (mostCurrent._edittextdakika8.getText().length()==0) { 
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="dakika8 = Old";
_dakika8 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="dakika8 = New";
_dakika8 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="End Sub";
return "";
}
public static String  _edittextdakika9_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextdakika9_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextdakika9_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Sub EditTextDakika9_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="If EditTextDakika9.Text.Length == 0 Then";
if (mostCurrent._edittextdakika9.getText().length()==0) { 
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="dakika9 = Old";
_dakika9 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="dakika9 = New";
_dakika9 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub EditTextHiz1_TextChanged (Old As String, New A";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="If EditTextHiz1.Text.Length == 0 Then";
if (mostCurrent._edittexthiz1.getText().length()==0) { 
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="hiz1 = Old";
_hiz1 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="hiz1 = New";
_hiz1 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz10_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz10_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz10_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub EditTextHiz10_TextChanged (Old As String, New";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="If EditTextHiz10.Text.Length == 0 Then";
if (mostCurrent._edittexthiz10.getText().length()==0) { 
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="hiz10 = Old";
_hiz10 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="hiz10 = New";
_hiz10 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz11_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz11_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz11_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Sub EditTextHiz11_TextChanged (Old As String, New";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="If EditTextHiz11.Text.Length == 0 Then";
if (mostCurrent._edittexthiz11.getText().length()==0) { 
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="hiz11 = Old";
_hiz11 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="hiz11 = New";
_hiz11 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz12_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz12_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz12_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Sub EditTextHiz12_TextChanged (Old As String, New";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="If EditTextHiz12.Text.Length == 0 Then";
if (mostCurrent._edittexthiz12.getText().length()==0) { 
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="hiz12 = Old";
_hiz12 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="hiz12 = New";
_hiz12 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz13_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz13_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz13_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Sub EditTextHiz13_TextChanged (Old As String, New";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="If EditTextHiz13.Text.Length == 0 Then";
if (mostCurrent._edittexthiz13.getText().length()==0) { 
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="hiz13 = Old";
_hiz13 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="hiz13 = New";
_hiz13 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz14_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz14_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz14_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub EditTextHiz14_TextChanged (Old As String, New";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="If EditTextHiz14.Text.Length == 0 Then";
if (mostCurrent._edittexthiz14.getText().length()==0) { 
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="hiz14 = Old";
_hiz14 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="hiz14 = New";
_hiz14 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz15_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz15_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz15_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub EditTextHiz15_TextChanged (Old As String, New";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="If EditTextHiz15.Text.Length == 0 Then";
if (mostCurrent._edittexthiz15.getText().length()==0) { 
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="hiz15 = Old";
_hiz15 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="hiz15 = New";
_hiz15 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz16_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz16_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz16_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub EditTextHiz16_TextChanged (Old As String, New";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="If EditTextHiz16.Text.Length == 0 Then";
if (mostCurrent._edittexthiz16.getText().length()==0) { 
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="hiz16 = Old";
_hiz16 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="hiz16 = New";
_hiz16 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz17_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz17_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz17_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Sub EditTextHiz17_TextChanged (Old As String, New";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="If EditTextHiz17.Text.Length == 0 Then";
if (mostCurrent._edittexthiz17.getText().length()==0) { 
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="hiz17 = Old";
_hiz17 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="hiz17 = New";
_hiz17 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz18_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz18_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz18_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub EditTextHiz18_TextChanged (Old As String, New";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="If EditTextHiz18.Text.Length == 0 Then";
if (mostCurrent._edittexthiz18.getText().length()==0) { 
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="hiz18 = Old";
_hiz18 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="hiz18 = New";
_hiz18 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz19_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz19_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz19_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Sub EditTextHiz19_TextChanged (Old As String, New";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="If EditTextHiz19.Text.Length == 0 Then";
if (mostCurrent._edittexthiz19.getText().length()==0) { 
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="hiz19 = Old";
_hiz19 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="hiz19 = New";
_hiz19 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz2_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz2_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz2_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub EditTextHiz2_TextChanged (Old As String, New A";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="If EditTextHiz2.Text.Length == 0 Then";
if (mostCurrent._edittexthiz2.getText().length()==0) { 
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="hiz2 = Old";
_hiz2 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="hiz2 = New";
_hiz2 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz20_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz20_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz20_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Sub EditTextHiz20_TextChanged (Old As String, New";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="If EditTextHiz20.Text.Length == 0 Then";
if (mostCurrent._edittexthiz20.getText().length()==0) { 
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="hiz20 = Old";
_hiz20 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="hiz20 = New";
_hiz20 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz21_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz21_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz21_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub EditTextHiz21_TextChanged (Old As String, New";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="If EditTextHiz21.Text.Length == 0 Then";
if (mostCurrent._edittexthiz21.getText().length()==0) { 
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="hiz21 = Old";
_hiz21 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="hiz21 = New";
_hiz21 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz22_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz22_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz22_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Sub EditTextHiz22_TextChanged (Old As String, New";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="If EditTextHiz22.Text.Length == 0 Then";
if (mostCurrent._edittexthiz22.getText().length()==0) { 
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="hiz22 = Old";
_hiz22 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="hiz22 = New";
_hiz22 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz23_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz23_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz23_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub EditTextHiz23_TextChanged (Old As String, New";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="If EditTextHiz23.Text.Length == 0 Then";
if (mostCurrent._edittexthiz23.getText().length()==0) { 
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="hiz23 = Old";
_hiz23 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="hiz23 = New";
_hiz23 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18546694;
 //BA.debugLineNum = 18546694;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz24_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz24_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz24_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Sub EditTextHiz24_TextChanged (Old As String, New";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="If EditTextHiz24.Text.Length == 0 Then";
if (mostCurrent._edittexthiz24.getText().length()==0) { 
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="hiz24 = Old";
_hiz24 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="hiz24 = New";
_hiz24 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz25_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz25_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz25_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Sub EditTextHiz25_TextChanged (Old As String, New";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="If EditTextHiz25.Text.Length == 0 Then";
if (mostCurrent._edittexthiz25.getText().length()==0) { 
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="hiz25 = Old";
_hiz25 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="hiz25 = New";
_hiz25 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz3_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz3_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub EditTextHiz3_TextChanged (Old As String, New A";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="If EditTextHiz3.Text.Length == 0 Then";
if (mostCurrent._edittexthiz3.getText().length()==0) { 
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="hiz3 = Old";
_hiz3 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="hiz3 = New";
_hiz3 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz4_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz4_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz4_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub EditTextHiz4_TextChanged (Old As String, New A";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="If EditTextHiz4.Text.Length == 0 Then";
if (mostCurrent._edittexthiz4.getText().length()==0) { 
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="hiz4 = Old";
_hiz4 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="hiz4 = New";
_hiz4 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz5_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz5_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz5_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub EditTextHiz5_TextChanged (Old As String, New A";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="If EditTextHiz5.Text.Length == 0 Then";
if (mostCurrent._edittexthiz5.getText().length()==0) { 
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="hiz5 = Old";
_hiz5 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="hiz5 = New";
_hiz5 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz6_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz6_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz6_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub EditTextHiz6_TextChanged (Old As String, New A";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="If EditTextHiz6.Text.Length == 0 Then";
if (mostCurrent._edittexthiz6.getText().length()==0) { 
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="hiz6 = Old";
_hiz6 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="hiz6 = New";
_hiz6 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz7_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz7_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz7_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub EditTextHiz7_TextChanged (Old As String, New A";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="If EditTextHiz7.Text.Length == 0 Then";
if (mostCurrent._edittexthiz7.getText().length()==0) { 
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="hiz7 = Old";
_hiz7 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="hiz7 = New";
_hiz7 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz8_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz8_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz8_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub EditTextHiz8_TextChanged (Old As String, New A";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="If EditTextHiz8.Text.Length == 0 Then";
if (mostCurrent._edittexthiz8.getText().length()==0) { 
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="hiz8 = Old";
_hiz8 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="hiz8 = New";
_hiz8 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="End Sub";
return "";
}
public static String  _edittexthiz9_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittexthiz9_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittexthiz9_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub EditTextHiz9_TextChanged (Old As String, New A";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="If EditTextHiz9.Text.Length == 0 Then";
if (mostCurrent._edittexthiz9.getText().length()==0) { 
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="hiz9 = Old";
_hiz9 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="hiz9 = New";
_hiz9 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub EditTextKoniMesafesi1_TextChanged (Old As Stri";
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="If New.Length <> 0 Then";
if (_new.length()!=0) { 
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="koniMesafesi1 = New";
_konimesafesi1 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=12648459;
 //BA.debugLineNum = 12648459;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi10_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi10_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi10_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub EditTextKoniMesafesi10_TextChanged (Old As Str";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="If EditTextKoniMesafesi10.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi10.getText().length()==0) { 
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="koniMesafesi10 = Old";
_konimesafesi10 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="koniMesafesi10 = New";
_konimesafesi10 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi11_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi11_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi11_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub EditTextKoniMesafesi11_TextChanged (Old As Str";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="If EditTextKoniMesafesi11.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi11.getText().length()==0) { 
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="koniMesafesi11 = Old";
_konimesafesi11 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="koniMesafesi11 = New";
_konimesafesi11 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi12_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi12_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi12_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Sub EditTextKoniMesafesi12_TextChanged (Old As Str";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="If EditTextKoniMesafesi12.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi12.getText().length()==0) { 
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="koniMesafesi12 = Old";
_konimesafesi12 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="koniMesafesi12 = New";
_konimesafesi12 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi13_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi13_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi13_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Sub EditTextKoniMesafesi13_TextChanged (Old As Str";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="If EditTextKoniMesafesi13.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi13.getText().length()==0) { 
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="koniMesafesi13 = Old";
_konimesafesi13 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="koniMesafesi13 = New";
_konimesafesi13 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi14_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi14_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi14_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Sub EditTextKoniMesafesi14_TextChanged (Old As Str";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="If EditTextKoniMesafesi14.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi14.getText().length()==0) { 
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="koniMesafesi14 = Old";
_konimesafesi14 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="koniMesafesi14 = New";
_konimesafesi14 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi15_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi15_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi15_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Sub EditTextKoniMesafesi15_TextChanged (Old As Str";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="If EditTextKoniMesafesi15.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi15.getText().length()==0) { 
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="koniMesafesi15 = Old";
_konimesafesi15 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="koniMesafesi15 = New";
_konimesafesi15 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi16_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi16_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi16_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub EditTextKoniMesafesi16_TextChanged (Old As Str";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="If EditTextKoniMesafesi16.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi16.getText().length()==0) { 
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="koniMesafesi16 = Old";
_konimesafesi16 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="koniMesafesi16 = New";
_konimesafesi16 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi17_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi17_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi17_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub EditTextKoniMesafesi17_TextChanged (Old As Str";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="If EditTextKoniMesafesi17.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi17.getText().length()==0) { 
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="koniMesafesi17 = Old";
_konimesafesi17 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="koniMesafesi17 = New";
_konimesafesi17 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi18_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi18_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi18_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Sub EditTextKoniMesafesi18_TextChanged (Old As Str";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="If EditTextKoniMesafesi18.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi18.getText().length()==0) { 
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="koniMesafesi18 = Old";
_konimesafesi18 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="koniMesafesi18 = New";
_konimesafesi18 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi19_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi19_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi19_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Sub EditTextKoniMesafesi19_TextChanged (Old As Str";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="If EditTextKoniMesafesi19.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi19.getText().length()==0) { 
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="koniMesafesi19 = Old";
_konimesafesi19 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="koniMesafesi19 = New";
_konimesafesi19 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi2_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi2_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi2_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub EditTextKoniMesafesi2_TextChanged (Old As Stri";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="If EditTextKoniMesafesi2.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi2.getText().length()==0) { 
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="koniMesafesi2 = Old";
_konimesafesi2 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="koniMesafesi2 = New";
_konimesafesi2 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi20_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi20_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi20_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Sub EditTextKoniMesafesi20_TextChanged (Old As Str";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="If EditTextKoniMesafesi20.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi20.getText().length()==0) { 
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="koniMesafesi20 = Old";
_konimesafesi20 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="koniMesafesi20 = New";
_konimesafesi20 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi21_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi21_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi21_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub EditTextKoniMesafesi21_TextChanged (Old As Str";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="If EditTextKoniMesafesi21.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi21.getText().length()==0) { 
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="koniMesafesi21 = Old";
_konimesafesi21 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="koniMesafesi21 = New";
_konimesafesi21 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi22_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi22_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi22_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Sub EditTextKoniMesafesi22_TextChanged (Old As Str";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="If EditTextKoniMesafesi22.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi22.getText().length()==0) { 
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="koniMesafesi22 = Old";
_konimesafesi22 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="koniMesafesi22 = New";
_konimesafesi22 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi23_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi23_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi23_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Sub EditTextKoniMesafesi23_TextChanged (Old As Str";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="If EditTextKoniMesafesi23.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi23.getText().length()==0) { 
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="koniMesafesi23 = Old";
_konimesafesi23 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="koniMesafesi23 = New";
_konimesafesi23 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi24_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi24_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi24_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Sub EditTextKoniMesafesi24_TextChanged (Old As Str";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="If EditTextKoniMesafesi24.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi24.getText().length()==0) { 
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="koniMesafesi24 = Old";
_konimesafesi24 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="koniMesafesi24 = New";
_konimesafesi24 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi25_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi25_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi25_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Sub EditTextKoniMesafesi25_TextChanged (Old As Str";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="If EditTextKoniMesafesi25.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi25.getText().length()==0) { 
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="koniMesafesi25 = Old";
_konimesafesi25 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="koniMesafesi25 = New";
_konimesafesi25 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=19136518;
 //BA.debugLineNum = 19136518;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi3_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi3_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub EditTextKoniMesafesi3_TextChanged (Old As Stri";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="If EditTextKoniMesafesi3.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi3.getText().length()==0) { 
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="koniMesafesi3 = Old";
_konimesafesi3 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="koniMesafesi3 = New";
_konimesafesi3 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi4_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi4_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi4_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub EditTextKoniMesafesi4_TextChanged (Old As Stri";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If EditTextKoniMesafesi4.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi4.getText().length()==0) { 
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="koniMesafesi4 = Old";
_konimesafesi4 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="koniMesafesi4 = New";
_konimesafesi4 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi5_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi5_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi5_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub EditTextKoniMesafesi5_TextChanged (Old As Stri";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="If EditTextKoniMesafesi5.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi5.getText().length()==0) { 
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="koniMesafesi5 = Old";
_konimesafesi5 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="koniMesafesi5 = New";
_konimesafesi5 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi6_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi6_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi6_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub EditTextKoniMesafesi6_TextChanged (Old As Stri";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="If EditTextKoniMesafesi6.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi6.getText().length()==0) { 
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="koniMesafesi6 = Old";
_konimesafesi6 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="koniMesafesi6 = New";
_konimesafesi6 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi7_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi7_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi7_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub EditTextKoniMesafesi7_TextChanged (Old As Stri";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="If EditTextKoniMesafesi7.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi7.getText().length()==0) { 
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="koniMesafesi7 = Old";
_konimesafesi7 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="koniMesafesi7 = New";
_konimesafesi7 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi8_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi8_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi8_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Sub EditTextKoniMesafesi8_TextChanged (Old As Stri";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="If EditTextKoniMesafesi8.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi8.getText().length()==0) { 
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="koniMesafesi8 = Old";
_konimesafesi8 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="koniMesafesi8 = New";
_konimesafesi8 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="End Sub";
return "";
}
public static String  _edittextkonimesafesi9_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextkonimesafesi9_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextkonimesafesi9_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub EditTextKoniMesafesi9_TextChanged (Old As Stri";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="If EditTextKoniMesafesi9.Text.Length == 0 Then";
if (mostCurrent._edittextkonimesafesi9.getText().length()==0) { 
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="koniMesafesi9 = Old";
_konimesafesi9 = (float)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="koniMesafesi9 = New";
_konimesafesi9 = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye1_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye1_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye1_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Sub EditTextSaniye1_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="If EditTextSaniye1.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye1.getText().length()==0) { 
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="saniye1 = Old";
_saniye1 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="saniye1 = New";
_saniye1 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye10_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye10_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye10_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub EditTextSaniye10_TextChanged (Old As String, N";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="If EditTextSaniye10.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye10.getText().length()==0) { 
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="saniye10 = Old";
_saniye10 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="saniye10 = New";
_saniye10 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye11_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye11_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye11_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub EditTextSaniye11_TextChanged (Old As String, N";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="If EditTextSaniye11.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye11.getText().length()==0) { 
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="saniye11 = Old";
_saniye11 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="saniye11 = New";
_saniye11 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye12_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye12_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye12_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Sub EditTextSaniye12_TextChanged (Old As String, N";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="If EditTextSaniye12.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye12.getText().length()==0) { 
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="saniye12 = Old";
_saniye12 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="saniye12 = New";
_saniye12 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye13_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye13_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye13_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub EditTextSaniye13_TextChanged (Old As String, N";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="If EditTextSaniye13.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye13.getText().length()==0) { 
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="saniye13 = Old";
_saniye13 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="saniye13 = New";
_saniye13 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye14_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye14_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye14_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Sub EditTextSaniye14_TextChanged (Old As String, N";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="If EditTextSaniye14.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye14.getText().length()==0) { 
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="saniye14 = Old";
_saniye14 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="saniye14 = New";
_saniye14 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16252934;
 //BA.debugLineNum = 16252934;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye15_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye15_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye15_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub EditTextSaniye15_TextChanged (Old As String, N";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="If EditTextSaniye15.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye15.getText().length()==0) { 
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="saniye15 = Old";
_saniye15 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="saniye15 = New";
_saniye15 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye16_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye16_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye16_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub EditTextSaniye16_TextChanged (Old As String, N";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="If EditTextSaniye16.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye16.getText().length()==0) { 
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="saniye16 = Old";
_saniye16 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="saniye16 = New";
_saniye16 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye17_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye17_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye17_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub EditTextSaniye17_TextChanged (Old As String, N";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If EditTextSaniye17.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye17.getText().length()==0) { 
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="saniye17 = Old";
_saniye17 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="saniye17 = New";
_saniye17 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye18_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye18_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye18_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub EditTextSaniye18_TextChanged (Old As String, N";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="If EditTextSaniye18.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye18.getText().length()==0) { 
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="saniye18 = Old";
_saniye18 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="saniye18 = New";
_saniye18 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye19_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye19_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye19_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Sub EditTextSaniye19_TextChanged (Old As String, N";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="If EditTextSaniye19.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye19.getText().length()==0) { 
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="saniye19 = Old";
_saniye19 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="saniye19 = New";
_saniye19 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye2_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye2_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye2_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub EditTextSaniye2_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="If EditTextSaniye2.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye2.getText().length()==0) { 
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="saniye2 = Old";
_saniye2 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="saniye2 = New";
_saniye2 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye20_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye20_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye20_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub EditTextSaniye20_TextChanged (Old As String, N";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="If EditTextSaniye20.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye20.getText().length()==0) { 
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="saniye20 = Old";
_saniye20 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="saniye20 = New";
_saniye20 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye21_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye21_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye21_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub EditTextSaniye21_TextChanged (Old As String, N";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="If EditTextSaniye21.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye21.getText().length()==0) { 
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="saniye21 = Old";
_saniye21 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="saniye21 = New";
_saniye21 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye22_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye22_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye22_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Sub EditTextSaniye22_TextChanged (Old As String, N";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="If EditTextSaniye22.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye22.getText().length()==0) { 
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="saniye22 = Old";
_saniye22 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="saniye22 = New";
_saniye22 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye23_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye23_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye23_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Sub EditTextSaniye23_TextChanged (Old As String, N";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="If EditTextSaniye23.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye23.getText().length()==0) { 
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="saniye23 = Old";
_saniye23 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="saniye23 = New";
_saniye23 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18415622;
 //BA.debugLineNum = 18415622;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye24_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye24_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye24_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Sub EditTextSaniye24_TextChanged (Old As String, N";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="If EditTextSaniye24.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye24.getText().length()==0) { 
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="saniye24 = Old";
_saniye24 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="saniye24 = New";
_saniye24 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye25_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye25_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye25_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Sub EditTextSaniye25_TextChanged (Old As String, N";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="If EditTextSaniye25.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye25.getText().length()==0) { 
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="saniye25 = Old";
_saniye25 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="saniye25 = New";
_saniye25 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye3_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye3_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye3_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub EditTextSaniye3_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="If EditTextSaniye3.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye3.getText().length()==0) { 
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="saniye3 = Old";
_saniye3 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="saniye3 = New";
_saniye3 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye4_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye4_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye4_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub EditTextSaniye4_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="If EditTextSaniye4.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye4.getText().length()==0) { 
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="saniye4 = Old";
_saniye4 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="saniye4 = New";
_saniye4 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye5_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye5_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye5_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub EditTextSaniye5_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="If EditTextSaniye5.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye5.getText().length()==0) { 
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="saniye5 = Old";
_saniye5 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="saniye5 = New";
_saniye5 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye6_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye6_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye6_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub EditTextSaniye6_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="If EditTextSaniye6.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye6.getText().length()==0) { 
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="saniye6 = Old";
_saniye6 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="saniye6 = New";
_saniye6 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye7_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye7_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye7_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub EditTextSaniye7_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="If EditTextSaniye7.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye7.getText().length()==0) { 
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="saniye7 = Old";
_saniye7 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="saniye7 = New";
_saniye7 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye8_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye8_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye8_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Sub EditTextSaniye8_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="If EditTextSaniye8.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye8.getText().length()==0) { 
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="saniye8 = Old";
_saniye8 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="saniye8 = New";
_saniye8 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="End Sub";
return "";
}
public static String  _edittextsaniye9_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittextsaniye9_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittextsaniye9_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub EditTextSaniye9_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="If EditTextSaniye9.Text.Length == 0 Then";
if (mostCurrent._edittextsaniye9.getText().length()==0) { 
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="saniye9 = Old";
_saniye9 = (int)(Double.parseDouble(_old));
 }else {
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="saniye9 = New";
_saniye9 = (int)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="End Sub";
return "";
}
public static String  _panelkapat() throws Exception{
RDebugUtils.currentModule="programveri";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelkapat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelkapat", null));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub PanelKapat";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Panel2.Visible = False";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="Panel3.Visible = False";
mostCurrent._panel3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Panel4.Visible = False";
mostCurrent._panel4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Panel5.Visible = False";
mostCurrent._panel5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Panel6.Visible = False";
mostCurrent._panel6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="Panel7.Visible = False";
mostCurrent._panel7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="Panel8.Visible = False";
mostCurrent._panel8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="Panel9.Visible = False";
mostCurrent._panel9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="Panel10.Visible = False";
mostCurrent._panel10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="Panel11.Visible = False";
mostCurrent._panel11.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="Panel12.Visible = False";
mostCurrent._panel12.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320781;
 //BA.debugLineNum = 12320781;BA.debugLine="Panel13.Visible = False";
mostCurrent._panel13.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="Panel14.Visible = False";
mostCurrent._panel14.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320783;
 //BA.debugLineNum = 12320783;BA.debugLine="Panel15.Visible = False";
mostCurrent._panel15.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320784;
 //BA.debugLineNum = 12320784;BA.debugLine="Panel16.Visible = False";
mostCurrent._panel16.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="Panel17.Visible = False";
mostCurrent._panel17.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320786;
 //BA.debugLineNum = 12320786;BA.debugLine="Panel18.Visible = False";
mostCurrent._panel18.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320787;
 //BA.debugLineNum = 12320787;BA.debugLine="Panel19.Visible = False";
mostCurrent._panel19.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320788;
 //BA.debugLineNum = 12320788;BA.debugLine="Panel20.Visible = False";
mostCurrent._panel20.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320789;
 //BA.debugLineNum = 12320789;BA.debugLine="Panel21.Visible = False";
mostCurrent._panel21.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320790;
 //BA.debugLineNum = 12320790;BA.debugLine="Panel22.Visible = False";
mostCurrent._panel22.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320791;
 //BA.debugLineNum = 12320791;BA.debugLine="Panel23.Visible = False";
mostCurrent._panel23.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320792;
 //BA.debugLineNum = 12320792;BA.debugLine="Panel24.Visible = False";
mostCurrent._panel24.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320793;
 //BA.debugLineNum = 12320793;BA.debugLine="Panel25.Visible = False";
mostCurrent._panel25.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12320794;
 //BA.debugLineNum = 12320794;BA.debugLine="End Sub";
return "";
}
}