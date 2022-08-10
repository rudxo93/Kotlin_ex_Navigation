package com.duran.navigationex

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation

// 첫번째 방법 Fragment 5에서 backButton 눌렀을 때 Fragment1로 이동

// navigation의 Attributes에서 4 -> 5넘어 가는 부분에서 popUpTo를 1로 설정하여
// 5 -> 1 이동이 되고 back버튼을 한번 더 클릭했을때 빠져나오고 다시 앱에 들어오게되면 1부터 5까지 이동이 구현됨
// 즉 1 -> 5 까지 이동 후 5에서 backButton이 클릭된다면 4번으로 돌아가는데 이때 4 -> 5로 이동하는 곳에 popUpTo가 1번으로
// 이동이 되어 있다면 5 -> 4가 아니라 5 -> 1로 이동하게 된다.
class BlankFragment5 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

/*        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.d("BlankFragment5", "pressed")
                // 5 -> 1 이동이 구현됨 하지만 back버튼을 더 누르게 되면 5 -> 1 -> 5 -> 1 이 반복되는 문제가 발생
                // 5 -> 1 이동이 되었으면 다시 1 -> 2 -> 3 -> 4 -> 5가 되도록 하고싶다
                view?.let {
                    Navigation.findNavController(it).navigate(R.id.action_blankFragment5_to_blankFragment1)
                }
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(this, callback)*/
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank5, container, false)


        return view
    }

}