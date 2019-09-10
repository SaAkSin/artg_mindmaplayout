package kr.co.artgrammer.mindmaplayout

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

open class Mindmaplayout : View {

    init {

    }

    // 코드에서 뷰를 생성할 때
    constructor(context: Context): super(context) {

    }

    // XML로부터 뷰를 인플레이트할 때
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

    }



    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }

    // ViewGroup 의 경우 invalidate 시 호출
    override fun dispatchDraw(canvas: Canvas?) {



        super.dispatchDraw(canvas)
    }
}