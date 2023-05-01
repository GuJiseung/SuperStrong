.class public final Lg0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final e:Lg0/f$a;

.field public static final f:Lg0/f$a;

.field public static final g:Lg0/f$a;

.field public static final h:Lg0/f$a;

.field public static final i:Lg0/f$a;

.field public static final j:Lg0/f$a;

.field public static final k:Lg0/f$a;

.field public static final l:Lg0/f$a;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lg0/j$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lg0/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 21

    new-instance v0, Lg0/f$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lg0/f$a;-><init>(I)V

    sput-object v0, Lg0/f$a;->e:Lg0/f$a;

    new-instance v0, Lg0/f$a;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x40

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x80

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x100

    const-class v3, Lg0/j$b;

    invoke-direct {v0, v2, v3}, Lg0/f$a;-><init>(ILjava/lang/Class;)V

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x200

    invoke-direct {v0, v2, v3}, Lg0/f$a;-><init>(ILjava/lang/Class;)V

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x400

    const-class v3, Lg0/j$c;

    invoke-direct {v0, v2, v3}, Lg0/f$a;-><init>(ILjava/lang/Class;)V

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x800

    invoke-direct {v0, v2, v3}, Lg0/f$a;-><init>(ILjava/lang/Class;)V

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x1000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    sput-object v0, Lg0/f$a;->f:Lg0/f$a;

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x2000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    sput-object v0, Lg0/f$a;->g:Lg0/f$a;

    new-instance v0, Lg0/f$a;

    const/16 v2, 0x4000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const v2, 0x8000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/high16 v2, 0x10000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    new-instance v0, Lg0/f$a;

    const/high16 v2, 0x20000

    const-class v3, Lg0/j$g;

    invoke-direct {v0, v2, v3}, Lg0/f$a;-><init>(ILjava/lang/Class;)V

    new-instance v0, Lg0/f$a;

    const/high16 v2, 0x40000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    sput-object v0, Lg0/f$a;->h:Lg0/f$a;

    new-instance v0, Lg0/f$a;

    const/high16 v2, 0x80000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    sput-object v0, Lg0/f$a;->i:Lg0/f$a;

    new-instance v0, Lg0/f$a;

    const/high16 v2, 0x100000

    invoke-direct {v0, v2}, Lg0/f$a;-><init>(I)V

    sput-object v0, Lg0/f$a;->j:Lg0/f$a;

    new-instance v0, Lg0/f$a;

    const/high16 v2, 0x200000

    const-class v3, Lg0/j$h;

    invoke-direct {v0, v2, v3}, Lg0/f$a;-><init>(ILjava/lang/Class;)V

    new-instance v4, Lg0/f$a;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v5, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SHOW_ON_SCREEN:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v6, 0x1020036

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v10, Lg0/f$a;

    sget-object v11, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_TO_POSITION:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v12, 0x1020037

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-class v15, Lg0/j$e;

    invoke-direct/range {v10 .. v15}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v8, Lg0/f$a;

    sget-object v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_UP:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v4, 0x1020038

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    sput-object v8, Lg0/f$a;->k:Lg0/f$a;

    new-instance v9, Lg0/f$a;

    sget-object v10, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_LEFT:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v11, 0x1020039

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v8, Lg0/f$a;

    sget-object v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_DOWN:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v4, 0x102003a

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    sput-object v8, Lg0/f$a;->l:Lg0/f$a;

    new-instance v9, Lg0/f$a;

    sget-object v10, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_RIGHT:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v11, 0x102003b

    invoke-direct/range {v9 .. v14}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v2, Lg0/f$a;

    const/4 v8, 0x0

    const/16 v9, 0x1d

    if-lt v0, v9, :cond_0

    invoke-static {}, La1/z;->c()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v8

    :goto_0
    const v4, 0x1020046

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v10, Lg0/f$a;

    if-lt v0, v9, :cond_1

    invoke-static {}, Landroidx/appcompat/widget/y0;->c()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v2

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object v11, v8

    :goto_1
    const v12, 0x1020047

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v2, Lg0/f$a;

    if-lt v0, v9, :cond_2

    invoke-static {}, La1/b0;->b()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v8

    :goto_2
    const v4, 0x1020048

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v10, Lg0/f$a;

    if-lt v0, v9, :cond_3

    invoke-static {}, La1/s;->c()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v2

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object v11, v8

    :goto_3
    const v12, 0x1020049

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v2, Lg0/f$a;

    sget-object v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_CONTEXT_CLICK:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v4, 0x102003c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v9, Lg0/f$a;

    sget-object v10, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SET_PROGRESS:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v11, 0x102003d

    const/4 v12, 0x0

    const-class v14, Lg0/j$f;

    invoke-direct/range {v9 .. v14}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v2, Lg0/f$a;

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_4

    invoke-static {}, Ld0/e;->d()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    goto :goto_4

    :cond_4
    move-object v3, v8

    :goto_4
    const v4, 0x1020042

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-class v7, Lg0/j$d;

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v9, Lg0/f$a;

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_5

    invoke-static {}, Ld0/f;->c()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    move-object v10, v3

    goto :goto_5

    :cond_5
    move-object v10, v8

    :goto_5
    const v11, 0x1020044

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v15, Lg0/f$a;

    if-lt v0, v2, :cond_6

    invoke-static {}, Ld0/g;->f()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_6

    :cond_6
    move-object/from16 v16, v8

    :goto_6
    const v17, 0x1020045

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v20}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v2, Lg0/f$a;

    const/16 v9, 0x1e

    if-lt v0, v9, :cond_7

    invoke-static {}, Lf0/z0;->b()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    goto :goto_7

    :cond_7
    move-object v3, v8

    :goto_7
    const v4, 0x102004a

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v10, Lg0/f$a;

    if-lt v0, v9, :cond_8

    invoke-static {}, Lf0/a1;->c()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v2

    move-object v11, v2

    goto :goto_8

    :cond_8
    move-object v11, v8

    :goto_8
    const v12, 0x1020054

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v2, Lg0/f$a;

    if-lt v0, v1, :cond_9

    sget-object v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_DRAG_START:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    goto :goto_9

    :cond_9
    move-object v3, v8

    :goto_9
    const v4, 0x1020055

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v9, Lg0/f$a;

    if-lt v0, v1, :cond_a

    sget-object v2, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_DRAG_DROP:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-object v10, v2

    goto :goto_a

    :cond_a
    move-object v10, v8

    :goto_a
    const v11, 0x1020056

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v2, Lg0/f$a;

    if-lt v0, v1, :cond_b

    sget-object v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_DRAG_CANCEL:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-object v3, v1

    goto :goto_b

    :cond_b
    move-object v3, v8

    :goto_b
    const v4, 0x1020057

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    new-instance v9, Lg0/f$a;

    const/16 v1, 0x21

    if-lt v0, v1, :cond_c

    sget-object v8, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SHOW_TEXT_SUGGESTIONS:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    :cond_c
    move-object v10, v8

    const v11, 0x1020058

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 6

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    invoke-direct/range {v0 .. v5}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lg0/f$a;-><init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILjava/lang/String;Lg0/j;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg0/f$a;->b:I

    iput-object p4, p0, Lg0/f$a;->d:Lg0/j;

    if-nez p1, :cond_0

    new-instance p1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-direct {p1, p2, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    :cond_0
    iput-object p1, p0, Lg0/f$a;->a:Ljava/lang/Object;

    iput-object p5, p0, Lg0/f$a;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lg0/f$a;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    move-result v0

    return v0
.end method

.method public final b()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lg0/f$a;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getLabel()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg0/f$a;

    if-nez v1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lg0/f$a;

    iget-object p1, p1, Lg0/f$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lg0/f$a;->a:Ljava/lang/Object;

    if-nez v1, :cond_2

    if-eqz p1, :cond_3

    return v0

    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lg0/f$a;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
