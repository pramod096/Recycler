package pramod.com.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int[] images;
    private String[] movies,actors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {
        images = new int[]{R.drawable.aarya,R.drawable.billa, R.drawable.careofkancharapalem,
                R.drawable.darling, R.drawable.gabbar, R.drawable.hello, R.drawable.inception};

        movies = new String[]{"Aarya", "Billa", "Care Of Kancharapalem", "Darling", "Gabbar Singh", "Hello", "Inception" };
        actors = new String[]{"Allu Arjun", "Prabhas", "Karthik", "Prabhas", "Pavan Kalyan", "Akhil", "Leonardo"};

    }

    class RvAdapter extends RecyclerView.Adapter<RvViewHolder> {

    }
}