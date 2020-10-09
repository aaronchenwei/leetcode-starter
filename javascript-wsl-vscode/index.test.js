const solution = require('./');

it('case 1', () => {
  const answer = solution([3, 2, 4], 6);
  expect(answer).toStrictEqual([1, 2]);
});

it('case 2', () => {
  const answer = solution([1, 3, 2, 4], 4);
  expect(answer).toStrictEqual([0, 1]);
});
