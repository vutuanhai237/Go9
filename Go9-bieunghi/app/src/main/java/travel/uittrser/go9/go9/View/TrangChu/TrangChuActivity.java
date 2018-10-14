package travel.uittrser.go9.go9.View.TrangChu;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import travel.uittrser.go9.go9.R;

public class TrangChuActivity extends AppCompatActivity{

    private BottomNavigationView mNavMenu;
    private FrameLayout mFraLayout;
    private HomeFragment homeFragment;
    private JourneyFragment journeyFragment;
    private PrizeFragment prizeFragment;
    private MenuFragment menuFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.trangchu_layout);

        AnhXa();

        mNavMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        SetFragment(homeFragment);
                        break;
                    case R.id.nav_journey:
                        SetFragment(journeyFragment);
                        break;
                    case R.id.nav_prize:
                        SetFragment(prizeFragment);
                        break;
                    case R.id.nav_menu:
                        SetFragment(menuFragment);
                        break;
                }
                return true;
            }
        });

    }



    private void SetFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameContent,fragment);
        fragmentTransaction.commit();
    }

    private void AnhXa() {
        mNavMenu = (BottomNavigationView)findViewById(R.id.navMenu);
        mFraLayout = (FrameLayout)findViewById(R.id.frameContent);
        homeFragment = new HomeFragment();
        journeyFragment = new JourneyFragment();
        prizeFragment = new PrizeFragment();
        menuFragment = new MenuFragment();
        SetFragment(homeFragment);
    }

    @Override
    public void onBackPressed() {
// if your using fragment then you can do this way
            int fragments = getSupportFragmentManager().getBackStackEntryCount();
            if (1 == 1 /*fragments==1*/) {
                new AlertDialog.Builder(this)
                        .setMessage("Bạn có muốn thoát khỏi ứng dụng ?")
                        .setCancelable(false)
                        .setPositiveButton("Thoát", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        })
                        .setNegativeButton("Không", null)
                        .show();


            } else {
                if (getFragmentManager().getBackStackEntryCount() > 1) {
                    getFragmentManager().popBackStack();
                } else {

                    super.onBackPressed();
                }
            }
    }

}
