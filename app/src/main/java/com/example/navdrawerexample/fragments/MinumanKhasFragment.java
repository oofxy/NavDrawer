package com.example.navdrawerexample.fragments;
// MakananKhasFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawerexample.Model;
import com.example.navdrawerexample.R;
import com.example.navdrawerexample.adapter.Adapter;

import java.util.ArrayList;

public class MinumanKhasFragment extends Fragment {
    ArrayList<Model> models = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_minuman_khas, container,false);
        RecyclerView rvMinumanKhas= rootView.findViewById(R.id.rvMinumanKhas);

        models.add(new Model("Teh Sere"
        ,"https://cdn.yummy.co.id/content-images/images/20211016/I2gAt68mNnoy3Nn1fV5ATVaG3FKmSusr-31363334333737353938d41d8cd98f00b204e9800998ecf8427e.jpg?x-oss-process=image/resize,w_388,h_388,m_fixed,x-oss-process=image/format,webp"));

        models.add(new Model("Es Palu Butung"
        ,"https://cdn.yummy.co.id/content-images/images/20210414/J25DFy3WWVEeog6OXETRxs8wVqFOEIuJ-31363138333939303734d41d8cd98f00b204e9800998ecf8427e.jpg?x-oss-process=image/resize,w_388,h_388,m_fixed,x-oss-process=image/format,webp"));

        models.add(new Model("Sarabba"
        ,"https://i0.wp.com/resepkoki.id/wp-content/uploads/2017/11/Resep-Sarabba.jpg?fit=1664%2C1664&ssl=1"));

        models.add(new Model("Sekoteng"
        ,"https://awsimages.detik.net.id/community/media/visual/2018/03/24/7dd03db5-0e50-4a79-9f3a-59799fafa8ea.jpeg?w=600&q=90"));

        models.add(new Model("Jus Palu Butung"
        ,"https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhl2-sAwrTWl4FfdZTmbP5wM9-uv6b-JB2Re-k-vV4G8nBrQE1zE27zR6Hk7SQhyIQon97hrrQlBEst4Uxzd7UKp2ZRCAD923UKKvY6zEV6BWWdVegAGKQdyTJLnoLoqiyqTc6w4_UTRhQ/s1600/Resep+Es+Palu+Butung+nitalanaf+1.JPG"));

        models.add(new Model("Markisa"
        ,"https://down-id.img.susercontent.com/file/sg-11134201-22120-behqoirwljkvdb"));

        models.add(new Model("Bandrek"
        ,"https://www.tehsariwangi.com/uploads/ar/recipe/86/887f57c89ad6a3a1c06977a49ddb314d.png"));

        models.add(new Model("Wedang Jahe"
        ,"https://cdn.yummy.co.id/content-images/images/20220320/iaHdAhSJioKYsXzCZMCFgrBLBlmfWVvL-31363437373832323031d41d8cd98f00b204e9800998ecf8427e.jpg?x-oss-process=image/resize,w_388,h_388,m_fixed,x-oss-process=image/format,webp"));

        models.add(new Model("Es Kacang Merah"
        ,"https://www.sasa.co.id/medias/page_medias/16233298141600757214530386.png"));

        models.add(new Model("Es Puter Kacang"
        ,"https://img-global.cpcdn.com/recipes/1507160247fd7168/400x400cq70/photo.jpg"));


        rvMinumanKhas.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter adapter = new Adapter(getContext(), models);
        rvMinumanKhas.setAdapter(adapter);

        return rootView;
    }
}
