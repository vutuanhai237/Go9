package travel.uittrser.go9.go9.View.TrangChu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import travel.uittrser.go9.go9.R;

public class PrizeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.prize_fragment_layout,container,false);
        Button btn = (Button) view.findViewById(R.id.chi_tiet_phan_thuong);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), chitietphanthuong.class);
                startActivity(in);
            }
        });
        return view;
    }
}
