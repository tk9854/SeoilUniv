Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim 키, 몸무게, 표준체중, 비만도 As Integer

        키 = TextBox1.Text
        몸무게 = TextBox2.Text

        If 몸무게 >= 60 Then
            표준체중 = (키 - 100) * 0.9
            비만도 = ((몸무게 - 표준체중) / 표준체중) * 100

            TextBox3.Text = 표준체중
            TextBox4.Text = 비만도
        End If
    End Sub
End Class
