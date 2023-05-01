.class public final Lcom/superstrong/android/view/SignupActivity;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public x:Lz3/h;

.field public y:Lb4/r;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final C()Lb4/r;
    .locals 1

    iget-object v0, p0, Lcom/superstrong/android/view/SignupActivity;->y:Lb4/r;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "viewModel"

    invoke-static {v0}, Ll4/f;->k(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

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
    sget v0, Lz3/h;->r:I

    .line 9
    .line 10
    sget-object v0, Landroidx/databinding/c;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 11
    .line 12
    const v0, 0x7f0c0025

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Landroidx/databinding/ViewDataBinding;->s(Landroid/view/LayoutInflater;I)Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lz3/h;

    .line 20
    .line 21
    const-string v0, "inflate(layoutInflater)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/superstrong/android/view/SignupActivity;->x:Lz3/h;

    .line 27
    .line 28
    new-instance p1, La4/j;

    .line 29
    .line 30
    invoke-direct {p1, p0}, La4/j;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/superstrong/android/view/SignupActivity;->x:Lz3/h;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const-string v2, "binding"

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, v0, Landroidx/databinding/ViewDataBinding;->h:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Landroidx/lifecycle/i0;

    .line 46
    .line 47
    invoke-direct {v0, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/l0;)V

    .line 48
    .line 49
    .line 50
    const-class v3, Lb4/r;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lb4/r;

    .line 57
    .line 58
    const-string v3, "<set-?>"

    .line 59
    .line 60
    invoke-static {v0, v3}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/superstrong/android/view/SignupActivity;->y:Lb4/r;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/superstrong/android/view/SignupActivity;->x:Lz3/h;

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/superstrong/android/view/SignupActivity;->C()Lb4/r;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lz3/h;->x()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/superstrong/android/view/SignupActivity;->C()Lb4/r;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v0, v0, Lb4/r;->d:Landroidx/lifecycle/s;

    .line 80
    .line 81
    new-instance v3, Lm3/j;

    .line 82
    .line 83
    const/4 v4, 0x4

    .line 84
    invoke-direct {v3, v4, p0}, Lm3/j;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p0, v3}, Landroidx/lifecycle/LiveData;->e(Landroidx/lifecycle/o;Landroidx/lifecycle/t;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/superstrong/android/view/SignupActivity;->C()Lb4/r;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v0, v0, Lb4/r;->e:Landroidx/lifecycle/s;

    .line 95
    .line 96
    new-instance v3, La4/h;

    .line 97
    .line 98
    const/4 v5, 0x2

    .line 99
    invoke-direct {v3, v5, p0}, La4/h;-><init>(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p0, v3}, Landroidx/lifecycle/LiveData;->e(Landroidx/lifecycle/o;Landroidx/lifecycle/t;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/superstrong/android/view/SignupActivity;->C()Lb4/r;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v0, v0, Lb4/r;->h:Landroidx/lifecycle/s;

    .line 110
    .line 111
    new-instance v3, Li0/d;

    .line 112
    .line 113
    invoke-direct {v3, v4, p1}, Li0/d;-><init>(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p0, v3}, Landroidx/lifecycle/LiveData;->e(Landroidx/lifecycle/o;Landroidx/lifecycle/t;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/superstrong/android/view/SignupActivity;->x:Lz3/h;

    .line 120
    .line 121
    if-eqz p1, :cond_0

    .line 122
    .line 123
    new-instance v0, La4/e;

    .line 124
    .line 125
    const/4 v1, 0x6

    .line 126
    invoke-direct {v0, v1, p0}, La4/e;-><init>(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p1, Lz3/h;->q:Landroid/widget/ImageView;

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_0
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1

    .line 139
    :cond_1
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :cond_2
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v1
    .line 147
    .line 148
    .line 149
    .line 150
.end method
