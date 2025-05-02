function solution(angle) {
    let answer = 0;
    if (0 < angle && angle < 90) {
        // 0보다 크고 90보다 작으면 예각
        answer = 1;
    } else if (angle === 90) {
        // 90이면 직각
        answer = 2;
    } else if (90 < angle && angle < 180) {
        // 90보다 크고 180보다 작으면 둔각
        answer = 3;
    } else if (angle === 180) {
        // 180이면 평각
        answer = 4;
    }

    
    return answer;
}