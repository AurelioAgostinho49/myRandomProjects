function getAverage(scores) {
    let sum = 0;
  
    for (const score of scores) {
      sum += score;
    }
  
    return sum / scores.length;
  }

  function getAverage(scores) {
    const totalValue = scores.length;
    let sum = 0;

    for (let i = 0; i < totalValue; i++) {
        sum += scores[i];
    }

    const average = sum / totalValue;

    return average;
}