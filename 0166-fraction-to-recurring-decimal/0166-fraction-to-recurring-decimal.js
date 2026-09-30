var fractionToDecimal = function(numerator, denominator) {
    if (numerator === 0) return "0";

    let n = BigInt(numerator);
    let d = BigInt(denominator);

    let res = "";
    if ((n < 0n) !== (d < 0n)) res += "-";

    if (n < 0n) n = -n;
    if (d < 0n) d = -d;

    res += (n / d).toString();
    let rem = n % d;
    if (rem === 0n) return res;

    res += ".";
    const seen = new Map();

    while (rem !== 0n) {
        if (seen.has(rem)) {
            const pos = seen.get(rem);
            res = res.slice(0, pos) + "(" + res.slice(pos) + ")";
            break;
        }
        seen.set(rem, res.length);
        rem *= 10n;
        res += (rem / d).toString();
        rem = rem % d;
    }
    return res;
};