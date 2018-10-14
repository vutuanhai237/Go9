package travel.uittrser.go9.go9.View.TrangChu.ListMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import travel.uittrser.go9.go9.R;

public class ListMenuAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ListMenu> listMenuList;

    public ListMenuAdapter(Context context, int layout, List<ListMenu> listMenuList) {
        this.context = context;
        this.layout = layout;
        this.listMenuList = listMenuList;
    }

    @Override
    public int getCount() {
        return listMenuList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);

        //ánh xạ.
        TextView txtTen = (TextView) convertView.findViewById(R.id.textViewTen);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageViewIconMenuList);

        //gán giá trị.
        ListMenu listMenu = listMenuList.get(position);

        txtTen.setText(listMenu.getTen());
        imgHinh.setImageResource(listMenu.getHinh());

        return convertView;
    }
}
