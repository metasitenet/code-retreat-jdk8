package net.metasite.coderetreat;

public class Code {
    final int coveredLines;
    final int totalLines;

    public Code(int coveredLines, int totalLines) {
        this.coveredLines = coveredLines;
        this.totalLines = totalLines;
    }

    public int coverage() {
        return 100 * coveredLines / totalLines;
    }
}
