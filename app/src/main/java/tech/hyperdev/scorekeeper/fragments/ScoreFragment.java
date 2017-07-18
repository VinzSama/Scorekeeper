package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment implements View.OnClickListener {

    String team_name;
    private int totalScore=0;
    private TextView tvTeamName;
    private TextView tvScore;
    private ImageButton btnPlus;
    private ImageButton btnMinus;

    public ScoreFragment() {
        // Required empty public constructor
    }

    public static ScoreFragment newInstance(String team){

        Bundle bundle = new Bundle();
        bundle.putString("team_name", team);

        ScoreFragment fragment = new ScoreFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    public void readBundle(Bundle bundle){
        if(bundle != null){
            team_name = bundle.getString("team_name");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_score, container, false);

        tvScore = (TextView) view.findViewById(R.id.textView2);
        tvTeamName = (TextView) view.findViewById(R.id.tvTeamName);
        btnPlus = (ImageButton) view.findViewById(R.id.btnPlus);
        btnMinus = (ImageButton) view.findViewById(R.id.btnMinus);

        readBundle(getArguments());
        tvTeamName.setText(team_name);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);

        return view;
    }

    @Override
     public void onClick(View view) {
                switch (view.getId()) {
                        case R.id.btnPlus:
                                totalScore++;
                                tvScore.setText(totalScore+"");
                                break;
                       case R.id.btnMinus:
                                totalScore--;
                                tvScore.setText(""+totalScore);
                                break;
                    }
           }
}
