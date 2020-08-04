package pramod.com.recycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[] images;
    private String[] movies, actors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();
        View recyclerView = findViewById(R.id.recyclerview);
        RvAdapter rva = new RvAdapter(this);
        recyclerView.setAdapter(rva);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initData() {
        images = new int[]{R.drawable.aarya, R.drawable.billa, R.drawable.careofkancharapalem,
                R.drawable.darling, R.drawable.gabbar, R.drawable.hello, R.drawable.inception};

        movies = new String[]{"Aarya", "Billa", "Care Of Kancharapalem", "Darling", "Gabbar Singh", "Hello", "Inception"};
        actors = new String[]{"Allu Arjun", "Prabhas", "Karthik", "Prabhas", "Pavan Kalyan", "Akhil", "Leonardo"};

    }

    class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {

        Context context;

        public RvAdapter(Context context) {
            this.context = context;
        }

        @NonNull
        @Override
        public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(context).inflate(R.layout.one_row_layout, false);
            return new RvViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
            holder.poster.setImageResource(images[position]);
            holder.mn.setText(movies[position]);
            holder.an.setText(actors[position]);

        }


        @Override
        public int getItemCount() {
            return images.length;
        }


        public class RvViewHolder extends RecyclerView.ViewHolder {
            TextView mn, an;
            ImageView poster;

            public RvViewHolder(@NonNull View itemView) {
                super(itemView);
                mn = itemView.findViewById(R.id.name);
                an = itemView.findViewById(R.id.actor);
                poster = itemView.findViewById(R.id.movie_posters);
            }
        }
    }
}