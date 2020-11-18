package tdtu.l.music;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class casiAdapter extends BaseAdapter {
    private List<casi> list;

    public casiAdapter(List<casi> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class viewHolder{
    TextView name;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        viewHolder holder = new viewHolder();
        if (view == null){
            view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dong_casi,viewGroup,false);

            holder.name = view.findViewById(R.id.name);

            view.setTag(holder);
        }
        else{
            holder = (viewHolder) view.getTag();
        }

        casi casi =list.get(i);
        holder.name.setText(casi.getName());
        return view;
    }
}
