package travel.uittrser.go9.go9.View.TrangChu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import travel.uittrser.go9.go9.R;

public class HomeFragment extends Fragment {

    public HomeFragment()
    {

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout,container,false);
        Button btn = (Button) view.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), chitietdiadiem.class);
                startActivity(in);
            }
        });
        Button btn2 = (Button) view.findViewById(R.id.themht);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), chitiethanhtrinh.class);
                startActivity(in);
            }
        });
        return view;
    }


    private ViewPager Vpaper;






}

