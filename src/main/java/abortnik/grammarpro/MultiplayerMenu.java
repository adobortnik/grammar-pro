package abortnik.grammarpro;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MultiplayerMenu extends Fragment {


    public MultiplayerMenu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiplayer_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FrameLayout create_room = (FrameLayout) view.findViewById(R.id.create_room);
        FrameLayout join_room = (FrameLayout) view.findViewById(R.id.join_room);
        create_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((HomeActivity) getActivity()).switchFrag(iHomeActivity.FRAG_CREATE_ROOM);
            }
        });
        join_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((HomeActivity) getActivity()).switchFrag(iHomeActivity.FRAG_JOIN_ROOM);
            }
        });
    }
}
