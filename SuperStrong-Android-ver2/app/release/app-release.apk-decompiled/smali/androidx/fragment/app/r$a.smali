.class public final Landroidx/fragment/app/r$a;
.super Landroidx/fragment/app/w;
.source "SourceFile"

# interfaces
.implements Lw/b;
.implements Lw/c;
.implements Lv/l;
.implements Lv/m;
.implements Landroidx/lifecycle/l0;
.implements Landroidx/activity/i;
.implements Landroidx/activity/result/f;
.implements Lx0/d;
.implements Landroidx/fragment/app/e0;
.implements Lf0/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/fragment/app/w<",
        "Landroidx/fragment/app/r;",
        ">;",
        "Lw/b;",
        "Lw/c;",
        "Lv/l;",
        "Lv/m;",
        "Landroidx/lifecycle/l0;",
        "Landroidx/activity/i;",
        "Landroidx/activity/result/f;",
        "Lx0/d;",
        "Landroidx/fragment/app/e0;",
        "Lf0/n;"
    }
.end annotation


# instance fields
.field public final synthetic g:Landroidx/fragment/app/r;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-direct {p0, p1}, Landroidx/fragment/app/w;-><init>(Landroidx/fragment/app/r;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    const-string v2, "  "

    invoke-virtual {v1, v2, v0, p1, p2}, Landroidx/fragment/app/r;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final B()Landroidx/fragment/app/r;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    return-object v0
.end method

.method public final C()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public final D()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public final a()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    iget-object v0, v0, Landroidx/activity/ComponentActivity;->i:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public final b()Lx0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->f:Lx0/c;

    .line 4
    .line 5
    iget-object v0, v0, Lx0/c;->b:Lx0/b;

    .line 6
    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final c(Landroidx/fragment/app/a0$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->c(Landroidx/fragment/app/a0$c;)V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final f(Landroidx/fragment/app/q;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->f(Landroidx/fragment/app/q;)V

    return-void
.end method

.method public final h(Landroidx/fragment/app/q;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->h(Landroidx/fragment/app/q;)V

    return-void
.end method

.method public final i(Landroidx/fragment/app/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->i(Landroidx/fragment/app/z;)V

    return-void
.end method

.method public final l(Landroidx/fragment/app/a0$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->l(Landroidx/fragment/app/a0$c;)V

    return-void
.end method

.method public final m(Landroidx/fragment/app/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->m(Landroidx/fragment/app/z;)V

    return-void
.end method

.method public final n(Landroidx/activity/g;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->n(Landroidx/activity/g;)V

    return-void
.end method

.method public final o(Landroidx/fragment/app/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->o(Landroidx/fragment/app/z;)V

    return-void
.end method

.method public final q()Landroidx/activity/result/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    iget-object v0, v0, Landroidx/activity/ComponentActivity;->j:Landroidx/activity/ComponentActivity$b;

    return-object v0
.end method

.method public final r(Landroidx/activity/g;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->r(Landroidx/activity/g;)V

    return-void
.end method

.method public final s(Landroidx/fragment/app/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->s(Landroidx/fragment/app/z;)V

    return-void
.end method

.method public final t()Landroidx/lifecycle/k0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->t()Landroidx/lifecycle/k0;

    move-result-object v0

    return-object v0
.end method

.method public final u(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final v()Landroidx/lifecycle/p;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    iget-object v0, v0, Landroidx/fragment/app/r;->s:Landroidx/lifecycle/p;

    return-object v0
.end method

.method public final y()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r$a;->g:Landroidx/fragment/app/r;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
