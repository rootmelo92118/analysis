package com.p051vm.shadowsocks.sockhome;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p034v4.content.ContextCompat;
import android.support.p037v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.p051vm.constants.Constants;
import com.p051vm.p052a.C2505a;
import com.p051vm.p052a.C2508c;
import com.p051vm.p052a.C2510e;
import com.p051vm.p052a.C2511f;
import com.p051vm.p055c.C2514a;
import com.p051vm.p056d.C2515a;
import com.p051vm.p057e.C2516a;
import com.p051vm.p059g.C2523a;
import com.p051vm.p062vo.invite.ActivateCouponResp;
import com.p051vm.rest.MachineClient;
import com.p051vm.shadowsocks.core.AppProxyManager;
import com.p051vm.shadowsocks.core.LocalVpnService;
import com.p051vm.shadowsocks.p061ui.AppManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.vm.shadowsocks.sockhome.HomeActivity */
public class HomeActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, RewardedVideoAdListener, LocalVpnService.onStatusChangedListener {
    private static final String CONFIG_URL_KEY = "CONFIG_URL_KEY";
    private static String GL_HISTORY_LOGS = null;
    private static final int START_VPN_SERVICE_REQUEST_CODE = 1985;
    private static final String TAG = "HomeActivity";
    /* access modifiers changed from: private */
    public static boolean isReconnect = false;
    private final int STATE_CONNECTED = 2;
    private final int STATE_CONNECTING = 1;
    private final int STATE_CONNECT_FAIL = 4;
    private final int STATE_DISCONNECT = 0;
    private final int STATE_INIT_CONFIG = -1;
    private Button about;
    private LinearLayout appSettings;
    /* access modifiers changed from: private */
    public Button connect;
    /* access modifiers changed from: private */
    public int connectState = -1;
    Handler handler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    int unused = HomeActivity.this.connectState = 0;
                    HomeActivity.this.connect.setBackgroundDrawable(ContextCompat.getDrawable(HomeActivity.this, C2545R.C2546drawable.btn_disconnect));
                    HomeActivity.this.connect.setText(C2545R.string.connect);
                    break;
                case 2:
                    MachineClient.ProxyInfoResp unused2 = HomeActivity.this.proxyInfoResp = (MachineClient.ProxyInfoResp) message.obj;
                    break;
                case 3:
                    MachineClient.ProxyInfoResp unused3 = HomeActivity.this.proxyInfoResp = (MachineClient.ProxyInfoResp) message.obj;
                    if (HomeActivity.this.proxyInfoResp != null) {
                        if (!HomeActivity.this.proxyInfoResp.isForceUpate()) {
                            HomeActivity.this.connectToServer(HomeActivity.this.proxyInfoResp.getProxyInfos().get(0).getProxyURL());
                            break;
                        } else {
                            C2516a.m11827a((Activity) HomeActivity.this);
                            break;
                        }
                    } else {
                        Toast.makeText(HomeActivity.this, C2545R.string.excption_config_machine, 1).show();
                        HomeActivity.this.changeToConnectStateFail();
                        break;
                    }
                case 4:
                    HomeActivity.this.changeToConnectState();
                    break;
                case 5:
                    HomeActivity.this.changeToConnectStateFail();
                    break;
                case 6:
                    ActivateCouponResp activateCouponResp = (ActivateCouponResp) message.obj;
                    if (!activateCouponResp.isSuccess().booleanValue()) {
                        Toast.makeText(HomeActivity.this, activateCouponResp.getMsg(), 1).show();
                        break;
                    } else {
                        Toast.makeText(HomeActivity.this, C2545R.string.invitecode_activate_tip, 1).show();
                        break;
                    }
                case 7:
                    C2511f.C2512a aVar = (C2511f.C2512a) message.obj;
                    if (!(aVar == null || aVar.mo15478a() == null)) {
                        HomeActivity.this.memberGrade.setText(aVar.mo15478a().intValue());
                        break;
                    }
                case 9:
                    MachineClient.ProxyInfoResp unused4 = HomeActivity.this.proxyInfoResp = (MachineClient.ProxyInfoResp) message.obj;
                    if (HomeActivity.this.proxyInfoResp != null && !HomeActivity.this.proxyInfoResp.isForceUpate() && HomeActivity.this.connectState == 2) {
                        boolean unused5 = HomeActivity.isReconnect = true;
                        HomeActivity.this.disConnectToServer();
                        break;
                    }
            }
            super.handleMessage(message);
        }
    };
    private LinearLayout helpFriend;
    private ImageView invitationCodeIcon;
    private AdView mAdView;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    private RewardedVideoAd mRewardedVideoAd;
    private AtomicBoolean machineIsReady = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public TextView memberGrade;
    /* access modifiers changed from: private */
    public MachineClient.ProxyInfoResp proxyInfoResp;
    private LinearLayout speedUp;
    private TextView textViewProxyApp;
    private TextView textViewProxyUrl;

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    public void onLogReceived(String str) {
    }

    public void onRewardedVideoAdClosed() {
    }

    public void onRewardedVideoAdFailedToLoad(int i) {
    }

    public void onRewardedVideoAdOpened() {
    }

    public void onRewardedVideoStarted() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2545R.layout.activity_home);
        this.memberGrade = (TextView) findViewById(C2545R.C2547id.expire_date);
        this.connect = (Button) findViewById(C2545R.C2547id.btn_connect);
        this.speedUp = (LinearLayout) findViewById(C2545R.C2547id.speed_up);
        this.helpFriend = (LinearLayout) findViewById(C2545R.C2547id.help_friend);
        this.appSettings = (LinearLayout) findViewById(C2545R.C2547id.app_settings);
        this.invitationCodeIcon = (ImageView) findViewById(C2545R.C2547id.invitation_code_icon);
        this.about = (Button) findViewById(C2545R.C2547id.btn_about);
        if (C2508c.m11798a(this).mo15464a() != null) {
            this.connectState = 1;
            this.connect.setBackgroundDrawable(ContextCompat.getDrawable(this, C2545R.C2546drawable.btn_disconnect));
            this.connect.setText(C2545R.string.connect);
        }
        this.connect.setOnClickListener(this);
        this.speedUp.setOnClickListener(this);
        this.helpFriend.setOnClickListener(this);
        this.appSettings.setOnClickListener(this);
        this.about.setOnClickListener(this);
        LocalVpnService.addOnStatusChangedListener(this);
        if (AppProxyManager.isLollipopOrAbove) {
            AppProxyManager.getInstance(this);
        }
        C2515a.m11824a().mo15488a((Context) this);
        C2523a.m11852a(this, this.handler, 1);
        C2523a.m11850a(this);
        C2523a.m11854a((Context) this, this.handler, 7, false);
        C2510e.m11806a(this).mo15470a();
        if (!C2514a.m11822a(this)) {
            C2514a.m11823b(this);
        } else {
            C2510e.m11806a(this).mo15471b();
            C2505a.m11786a((Context) this).mo15457c();
            if (C2516a.m11828a((Context) this)) {
                C2516a.m11829b(this);
            } else if (C2505a.m11786a((Context) this).mo15456b()) {
                AdView adView = new AdView(this);
                adView.setAdSize(AdSize.BANNER);
                adView.setAdUnitId("ca-app-pub-5458417846516586/4092812582");
                this.mAdView = (AdView) findViewById(C2545R.C2547id.adView);
                this.mAdView.loadAd(new AdRequest.Builder().build());
                MobileAds.initialize(getApplication(), "ca-app-pub-5458417846516586~5345474065");
                this.mInterstitialAd = new InterstitialAd(this);
                this.mInterstitialAd.setAdUnitId("ca-app-pub-5458417846516586/3621328852");
                this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
                this.mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        HomeActivity.this.mInterstitialAd.show();
                    }

                    public void onAdClosed() {
                        super.onAdClosed();
                    }
                });
            }
        }
        C2523a.m11857c(this, this.handler, 9);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2545R.C2547id.app_settings /*2131230752*/:
                if (!AppProxyManager.isLollipopOrAbove) {
                    Toast.makeText(this, C2545R.string.app_setting_warn, 1).show();
                    return;
                } else {
                    startActivity(new Intent(this, AppManager.class));
                    return;
                }
            case C2545R.C2547id.btn_about /*2131230760*/:
                Intent intent = new Intent();
                intent.setClass(this, PolicyActivity.class);
                startActivity(intent);
                return;
            case C2545R.C2547id.btn_connect /*2131230761*/:
                changeConnectState();
                return;
            case C2545R.C2547id.help_friend /*2131230790*/:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(C2545R.string.help_friend_title);
                View inflate = LayoutInflater.from(this).inflate(C2545R.layout.dialog_help_friend, (ViewGroup) null);
                builder.setView(inflate);
                final EditText editText = (EditText) inflate.findViewById(C2545R.C2547id.edit_invitation_code);
                builder.setPositiveButton(C2545R.string.invite, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        editText.getText().toString();
                        String obj = editText.getText().toString();
                        if (obj == null || "".equals(obj)) {
                            Toast.makeText(HomeActivity.this, C2545R.string.excption_invitecode_null, 1).show();
                        } else if (obj.length() != Constants.INVITE_COUPON_DIGITS) {
                            Toast.makeText(HomeActivity.this, C2545R.string.excption_invitecode_bit, 1).show();
                        } else {
                            C2523a.m11853a((Context) HomeActivity.this, HomeActivity.this.handler, 6, obj);
                        }
                    }
                });
                builder.setNegativeButton(C2545R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();
                return;
            case C2545R.C2547id.speed_up /*2131230858*/:
                Intent intent2 = new Intent();
                intent2.setClass(this, InviteActivity.class);
                startActivity(intent2);
                return;
            default:
                return;
        }
    }

    private void changeConnectState() {
        int i = this.connectState;
        if (i != 4) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    LocalVpnService.IsRunning.set(false);
                    C2523a.m11855a((Context) this, this.handler, false, 3);
                    return;
                case 2:
                    this.connectState = 1;
                    this.connectState = 1;
                    Drawable drawable = ContextCompat.getDrawable(this, C2545R.C2546drawable.btn_connecting);
                    this.connect.setText(C2545R.string.disconnecting);
                    this.connect.setBackgroundDrawable(drawable);
                    disConnectToServer();
                    return;
                default:
                    return;
            }
        }
        this.connectState = 1;
        this.connect.setBackgroundDrawable(ContextCompat.getDrawable(this, C2545R.C2546drawable.btn_connecting));
        this.connect.setText(C2545R.string.connecting);
        C2523a.m11855a((Context) this, this.handler, false, 3);
    }

    /* access modifiers changed from: private */
    public void connectToServer(String str) {
        Intent prepare = LocalVpnService.prepare(this);
        if (prepare == null) {
            LocalVpnService.IsRunning.set(true);
            startVPNService(str);
            return;
        }
        startActivityForResult(prepare, START_VPN_SERVICE_REQUEST_CODE);
    }

    /* access modifiers changed from: private */
    public void disConnectToServer() {
        LocalVpnService.IsRunning.set(false);
        this.connectState = 0;
        this.connect.setBackgroundDrawable(ContextCompat.getDrawable(this, C2545R.C2546drawable.btn_disconnect));
        this.connect.setText(C2545R.string.connect);
    }

    public void onStatusChanged(String str, Boolean bool) {
        if (Constants.VPN_LIFE_STARTUP.equals(str)) {
            C2523a.m11851a(this, this.handler);
        }
        if (Constants.VPN_KEEP_TIME_OVER_SHUTDOWN.equals(str)) {
            disConnectToServer();
            if (isReconnect) {
                connectToServer(this.proxyInfoResp.getProxyInfos().get(0).getProxyURL());
                isReconnect = false;
            }
        }
    }

    private void startVPNService(String str) {
        LocalVpnService.ProxyUrl = str;
        startService(new Intent(this, LocalVpnService.class));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: private */
    public void changeToConnectState() {
        this.connectState = 2;
        this.connect.setBackgroundDrawable(ContextCompat.getDrawable(this, C2545R.C2546drawable.btn_connected));
        this.connect.setText(C2545R.string.disconnect);
    }

    /* access modifiers changed from: private */
    public void changeToConnectStateFail() {
        this.connectState = 4;
        this.connect.setBackgroundDrawable(ContextCompat.getDrawable(this, C2545R.C2546drawable.btn_connect_fail));
        this.connect.setText(C2545R.string.connect_fail);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != START_VPN_SERVICE_REQUEST_CODE) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            startVPNService(this.proxyInfoResp.getProxyInfos().get(0).getProxyURL());
        } else {
            disConnectToServer();
            Toast.makeText(this, C2545R.string.vpn_confirm_button_tip, 1).show();
        }
    }

    public void onRewarded(RewardItem rewardItem) {
        Toast.makeText(this, "onRewarded! currency: " + rewardItem.getType() + "  amount: " + rewardItem.getAmount(), 0).show();
    }

    public void onRewardedVideoAdLeftApplication() {
        Toast.makeText(this, "onRewardedVideoAdLeftApplication", 0).show();
    }

    public void onRewardedVideoAdLoaded() {
        this.mRewardedVideoAd.show();
    }

    public void onRewardedVideoCompleted() {
        Toast.makeText(this, "onRewardedVideoCompleted", 0).show();
    }
}
