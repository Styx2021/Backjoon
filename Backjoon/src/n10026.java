import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10026 {

	static int N;
	static char[][] RGB;
	static char[][] RB;
	static boolean[][] visit;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		RGB = new char[N][N];
		RB = new char[N][N];
		visit = new boolean[N][N];

		int rgbCnt = 0;
		int rbCnt = 0;

		for (int i = 0; i < N; ++i) {

			String temp = br.readLine();

			for (int j = 0; j < N; ++j) {

				if (temp.charAt(j) == 'G') {
					RB[i][j] = 'R';
					RGB[i][j] = temp.charAt(j);
				} else {
					RGB[i][j] = temp.charAt(j);
					RB[i][j] = temp.charAt(j);
				}

			}
		}

		for (int i = 0; i < N; ++i) {

			for (int j = 0; j < N; ++j) {

				if (!visit[i][j]) {
					rgbCnt++;
					RGB_DFS(i, j, RGB[i][j]);
				}

			}

		}

		visit = new boolean[N][N];

		for (int i = 0; i < N; ++i) {

			for (int j = 0; j < N; ++j) {

				if (!visit[i][j]) {
					rbCnt++;
					RB_DFS(i, j, RB[i][j]);
				}

			}
		}

		System.out.println(rgbCnt + " " + rbCnt);

	}

	static void RGB_DFS(int x, int y, char color) {

		if (x < 0 || y < 0 || x >= N || y >= N || visit[x][y] == true)
			return;
		if ((color == 'R' && RGB[x][y] == 'R') || (color == 'G' && RGB[x][y] == 'G')
				|| (color == 'B' && RGB[x][y] == 'B')) {

			visit[x][y] = true;

			for (int i = 0; i < 4; ++i) {

				RGB_DFS(x + dx[i], y + dy[i], RGB[x][y]);

			}

		}
	}

	static void RB_DFS(int x, int y, char color) {

		if (x < 0 || y < 0 || x >= N || y >= N || visit[x][y] == true)
			return;
		if ((color == 'R' && RB[x][y] == 'R') || (color == 'B' && RB[x][y] == 'B')) {

			visit[x][y] = true;

			for (int i = 0; i < 4; ++i) {

				RB_DFS(x + dx[i], y + dy[i], RB[x][y]);

			}

		}
	}

}
