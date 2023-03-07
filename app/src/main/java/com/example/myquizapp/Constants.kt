package com.example.myquizapp

object Constants {

    const val  USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1,
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2,
        )

        questionList.add(que2)

        val que3 = Question(
            3, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Australia",
            "Armenia",
            "Belgium",
            4,
        )

        questionList.add(que3)

        val que4 = Question(
            4, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Belgium",
            "Brazil",
            "Austria",
            3,
        )

        questionList.add(que4)

        val que5 = Question(
            5, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Brazil",
            "Australia",
            "Austria",
            1,
        )

        questionList.add(que5)

        val que6 = Question(
            6, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Belgium",
            "Australia",
            "Brazil",
            "Fiji",
            4,
        )

        questionList.add(que6)

        val que7 = Question(
            7, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "India",
            "Germany",
            "Armenia",
            "Denmark",
            2,
        )

        questionList.add(que7)

        val que8 = Question(
            8, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Fiji",
            "Belgium",
            "India",
            "Austria",
            3,
        )

        questionList.add(que8)

        val que9 = Question(
            9, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "India",
            "Argentina",
            "Australia",
            1,
        )

        questionList.add(que9)

        val que10 = Question(
            10, "What Country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Belgium",
            "Kuwait",
            "Armenia",
            "New Zealand",
            4,
        )

        questionList.add(que10)

        return questionList
    }
}