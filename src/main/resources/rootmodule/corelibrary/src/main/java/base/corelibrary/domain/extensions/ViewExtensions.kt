package base.corelibrary.domain.extensions

fun View.showKeyboard() {
    inputMethodManager.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
}

fun View.hideKeyboard() {
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}

fun View.animatedShow(duration: Long = 200L) {
    isVisible = true
    animate().scaleX(1f).scaleY(1f).setDuration(duration).doOnEnd { isVisible = true }
}

fun View.animatedHide(duration: Long = 200L) {
    animate().scaleX(0f).scaleY(0f).setDuration(duration).doOnEnd { isGone = true }
}

fun View.animatedToggleVisibility(isShown: Boolean, duration: Long = 200L) {
    if (isShown) animatedShow(duration)
    else animatedHide(duration)
}

fun View.animatedChangeAlpha(newAlpha: Float, duration: Long = 200L) {
    animate().alpha(newAlpha).duration = duration
}
