function solution(num1, num2) {
    var answer = (num1 / num2) * 1000;
    answer = answer - (answer % 1)
    return answer;
}