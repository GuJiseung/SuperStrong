.class public final Lv4/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lv4/k;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/v;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv4/h;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public final f:Lm3/j;

.field public final g:Ljava/net/ProxySelector;

.field public final h:Lv4/j$a;

.field public final i:Ljavax/net/SocketFactory;

.field public j:Ljavax/net/ssl/SSLSocketFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public k:Landroidx/activity/result/c;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public l:Ljavax/net/ssl/HostnameVerifier;

.field public final m:Lv4/f;

.field public final n:Landroidx/fragment/app/x0;

.field public final o:Landroidx/fragment/app/x0;

.field public final p:Ld/s;

.field public final q:La2/d;

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:I

.field public final v:I

.field public final w:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv4/u$b;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lv4/u$b;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lv4/k;

    .line 19
    .line 20
    invoke-direct {v0}, Lv4/k;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lv4/u$b;->a:Lv4/k;

    .line 24
    .line 25
    sget-object v0, Lv4/u;->x:Ljava/util/List;

    .line 26
    .line 27
    iput-object v0, p0, Lv4/u$b;->b:Ljava/util/List;

    .line 28
    .line 29
    sget-object v0, Lv4/u;->y:Ljava/util/List;

    .line 30
    .line 31
    iput-object v0, p0, Lv4/u$b;->c:Ljava/util/List;

    .line 32
    .line 33
    sget-object v0, Lv4/m;->a:Lv4/m$a;

    .line 34
    .line 35
    new-instance v1, Lm3/j;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-direct {v1, v2, v0}, Lm3/j;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lv4/u$b;->f:Lm3/j;

    .line 42
    .line 43
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lv4/u$b;->g:Ljava/net/ProxySelector;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    new-instance v0, Ld5/a;

    .line 52
    .line 53
    invoke-direct {v0}, Ld5/a;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lv4/u$b;->g:Ljava/net/ProxySelector;

    .line 57
    .line 58
    :cond_0
    sget-object v0, Lv4/j;->a:Lv4/j$a;

    .line 59
    .line 60
    iput-object v0, p0, Lv4/u$b;->h:Lv4/j$a;

    .line 61
    .line 62
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lv4/u$b;->i:Ljavax/net/SocketFactory;

    .line 67
    .line 68
    sget-object v0, Le5/c;->a:Le5/c;

    .line 69
    .line 70
    iput-object v0, p0, Lv4/u$b;->l:Ljavax/net/ssl/HostnameVerifier;

    .line 71
    .line 72
    sget-object v0, Lv4/f;->c:Lv4/f;

    .line 73
    .line 74
    iput-object v0, p0, Lv4/u$b;->m:Lv4/f;

    .line 75
    .line 76
    sget-object v0, Lv4/b;->a:Landroidx/fragment/app/x0;

    .line 77
    .line 78
    iput-object v0, p0, Lv4/u$b;->n:Landroidx/fragment/app/x0;

    .line 79
    .line 80
    iput-object v0, p0, Lv4/u$b;->o:Landroidx/fragment/app/x0;

    .line 81
    .line 82
    new-instance v0, Ld/s;

    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    invoke-direct {v0, v1}, Ld/s;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lv4/u$b;->p:Ld/s;

    .line 89
    .line 90
    sget-object v0, Lv4/l;->a:La2/d;

    .line 91
    .line 92
    iput-object v0, p0, Lv4/u$b;->q:La2/d;

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    iput-boolean v0, p0, Lv4/u$b;->r:Z

    .line 96
    .line 97
    iput-boolean v0, p0, Lv4/u$b;->s:Z

    .line 98
    .line 99
    iput-boolean v0, p0, Lv4/u$b;->t:Z

    .line 100
    .line 101
    const/16 v0, 0x2710

    .line 102
    .line 103
    iput v0, p0, Lv4/u$b;->u:I

    .line 104
    .line 105
    iput v0, p0, Lv4/u$b;->v:I

    .line 106
    .line 107
    iput v0, p0, Lv4/u$b;->w:I

    .line 108
    .line 109
    return-void
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
