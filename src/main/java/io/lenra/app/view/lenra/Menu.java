package io.lenra.app.view.lenra;

import java.util.List;

import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Container;
import io.lenra.app.components.Flex;
import io.lenra.app.components.Flex.CrossAxisAlignment;
import io.lenra.app.components.Flex.MainAxisAlignment;
import io.lenra.app.components.Flexible;
import io.lenra.app.components.Image;
import io.lenra.app.components.LenraComponent;
import io.lenra.app.components.Text;
import io.lenra.app.components.Text.TextAlign;
import io.lenra.app.components.styles.BoxConstraints;
import io.lenra.app.components.styles.BoxDecoration;
import io.lenra.app.components.styles.BoxShadow;
import io.lenra.app.components.styles.Offset;
import io.lenra.app.components.styles.Padding;
import io.lenra.app.components.styles.TextStyle;
import io.lenra.app.components.styles.TextStyle.FontWeight;

public class Menu {
	@AppView(prefix = "lenra.")
	public static LenraComponent menu() {
		return new Container()
				.child(new Flex(List.of(
						new Container()
								.child(new Image("logo.png"))
								.constraints(new BoxConstraints()
										.minWidth(32d)
										.maxWidth(32d)
										.minHeight(32d)
										.maxHeight(32d)),
						new Flexible(
								new Container()
										.child(
												new Text("Hello World")
														.textAlign(TextAlign.CENTER)
														.style(new TextStyle()
																.fontWeight(FontWeight.BOLD)
																.fontSize(24d))))))
						.mainAxisAlignment(MainAxisAlignment.SPACE_BETWEEN)
						.crossAxisAlignment(CrossAxisAlignment.CENTER)
						.padding(new Padding().right(32d)))
				.decoration(new BoxDecoration()
						.color(0xFFFFFFFF)
						.boxShadow(new BoxShadow()
								.blurRadius(8d)
								.color(0x1A000000)
								.offset(new Offset(0d, 1d))))
				.padding(new Padding()
						.top(16d)
						.bottom(16d)
						.left(32d)
						.right(32d));
	}
}
