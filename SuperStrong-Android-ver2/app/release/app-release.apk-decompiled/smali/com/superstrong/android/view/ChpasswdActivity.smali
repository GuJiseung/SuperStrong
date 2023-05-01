.class public final Lcom/superstrong/android/view/ChpasswdActivity;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public x:Lz3/a;

.field public y:Lb4/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/r;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget v0, Lz3/a;->r:I

    .line 9
    .line 10
    sget-object v0, Landroidx/databinding/c;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 11
    .line 12
    const v0, 0x7f0c001d

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Landroidx/databinding/ViewDataBinding;->s(Landroid/view/LayoutInflater;I)Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lz3/a;

    .line 20
    .line 21
    const-string v0, "inflate(layoutInflater)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/superstrong/android/view/ChpasswdActivity;->x:Lz3/a;

    .line 27
    .line 28
    iget-object p1, p1, Landroidx/databinding/ViewDataBinding;->h:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroidx/lifecycle/i0;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/l0;)V

    .line 36
    .line 37
    .line 38
    const-class v0, Lb4/e;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lb4/e;

    .line 45
    .line 46
    const-string v0, "<set-?>"

    .line 47
    .line 48
    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/superstrong/android/view/ChpasswdActivity;->y:Lb4/e;

    .line 52
    .line 53
    iget-object p1, p0, Lcom/superstrong/android/view/ChpasswdActivity;->x:Lz3/a;

    .line 54
    .line 55
    const-string v0, "binding"

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Lz3/a;->x()V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/superstrong/android/view/ChpasswdActivity;->x:Lz3/a;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    new-instance v0, Lf3/a;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    invoke-direct {v0, v2, p0}, Lf3/a;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p1, Lz3/a;->q:Landroid/widget/ImageView;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/superstrong/android/view/ChpasswdActivity;->y:Lb4/e;

    .line 79
    .line 80
    const-string v0, "viewModel"

    .line 81
    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    iget-object p1, p1, Lb4/e;->f:Landroidx/lifecycle/s;

    .line 85
    .line 86
    new-instance v2, Lm3/j;

    .line 87
    .line 88
    const/4 v3, 0x2

    .line 89
    invoke-direct {v2, v3, p0}, Lm3/j;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p0, v2}, Landroidx/lifecycle/LiveData;->e(Landroidx/lifecycle/o;Landroidx/lifecycle/t;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lcom/superstrong/android/view/ChpasswdActivity;->y:Lb4/e;

    .line 96
    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    iget-object p1, p1, Lb4/e;->h:Landroidx/lifecycle/s;

    .line 100
    .line 101
    new-instance v0, La4/h;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-direct {v0, v1, p0}, La4/h;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/LiveData;->e(Landroidx/lifecycle/o;Landroidx/lifecycle/t;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_0
    invoke-static {v0}, Ll4/f;->k(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v1

    .line 115
    :cond_1
    invoke-static {v0}, Ll4/f;->k(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v1

    .line 119
    :cond_2
    invoke-static {v0}, Ll4/f;->k(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v1

    .line 123
    :cond_3
    invoke-static {v0}, Ll4/f;->k(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v1
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
