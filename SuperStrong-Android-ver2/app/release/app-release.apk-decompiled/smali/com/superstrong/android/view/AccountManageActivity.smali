.class public final Lcom/superstrong/android/view/AccountManageActivity;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Landroidx/fragment/app/r;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c001c

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    const p1, 0x7f09013b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superstrong/android/view/ChpasswdActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v2, 0x7f09013d

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v4, 0x7f09013c

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0x7f09017a

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v6, "findViewById(R.id.navigationView)"

    invoke-static {v1, v6}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    new-instance v6, La4/l;

    invoke-direct {v6, p0}, La4/l;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v6}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setOnNavigationItemSelectedListener(Lcom/google/android/material/bottomnavigation/BottomNavigationView$b;)V

    new-instance v1, La4/a;

    invoke-direct {v1, p0, v0}, La4/a;-><init>(Lcom/superstrong/android/view/AccountManageActivity;Landroid/content/Intent;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, La4/b;

    invoke-direct {p1, p0, v3}, La4/b;-><init>(Lcom/superstrong/android/view/AccountManageActivity;Landroid/content/Intent;)V

    invoke-virtual {v2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, La4/c;

    invoke-direct {p1, p0, v5}, La4/c;-><init>(Lcom/superstrong/android/view/AccountManageActivity;Landroid/content/Intent;)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
